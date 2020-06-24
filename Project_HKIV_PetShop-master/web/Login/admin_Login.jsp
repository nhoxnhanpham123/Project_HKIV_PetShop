<!DOCTYPE html>
<html lang="en">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Login</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>
        <!-- Custom fonts for this template-->
        <link href="${context}/Admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <!--Custom multilanguage  -->

        <!-- Custom styles for this template-->
        <link href="${context}/Admin/css/sb-admin-2.min.css" rel="stylesheet">

    </head>

    <body class="bg-gradient-primary">


        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row">
                                <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                                <div class="col-lg-6">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4"><fmt:message key="login.form.title"/></h1>
                                        </div>
                                        <%
                                            Cookie[] listCookie = request.getCookies();
                                            String user = "";
                                            String pass = "";
                                            int co = 0;
                                            if (listCookie != null) {
                                                while (co < listCookie.length) {
                                                    if (listCookie[co].getName().equals("user")) {
                                                        user = listCookie[co].getValue();
                                                    }
                                                    if (listCookie[co].getName().equals("pass")) {
                                                        pass = listCookie[co].getValue();
                                                    }
                                                    co++;
                                                }

                                            }
                                        %>
                                        ${error}
                                        <form class="user" action="${context}/Admins/Check" method="post">
                                            <div class="form-group">
                                                <input type="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" name="txtMail" value="<%out.print(user);%>" placeholder="<fmt:message key="login.textfield.mail"/>">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user" id="exampleInputPassword" name="txtPassword" value="<%out.print(pass);%>"  placeholder="<fmt:message key="login.textfield.password"/>">
                                            </div>
                                            <div class="form-group">
                                                <div class="custom-control custom-checkbox small">
                                                    <input type="checkbox" class="custom-control-input" id="customCheck" name="chkRemember">
                                                    <label class="custom-control-label" for="customCheck"><fmt:message key="login.textfield.checkbox"/></label>
                                                </div>
                                            </div>
                                            <input type="submit" class="btn btn-primary btn-user btn-block" value="<fmt:message key="login.button.submit"/>"/>
                                        </form>
                                        <hr>
                                        <div class="text-center">
                                            <a class="small" href="forgot-password.jsp">Forgot Password?</a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small" href="${context}/Admins/Create">Create an Account!</a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small" href="?locale=en">
                                                English |
                                            </a>
                                            <a class="small" href="?locale=vi">
                                                Vietnamese
                                            </a>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <!-- Bootstrap core JavaScript-->
        <script src="${context}/Admin/vendor/jquery/jquery.min.js"></script>
        <script src="${context}/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="${context}/Admin/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="${context}/Admin/js/sb-admin-2.min.js"></script>

    </body>

</html>
