<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Register</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>

        <!-- Custom fonts for this template-->
        <link href="${context}/Admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="${context}/Admin/css/sb-admin-2.min.css" rel="stylesheet">

    </head>

    <body class="bg-gradient-primary">

        <div class="container">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4"><fmt:message key="login.form.titleRe"/></h1>
                                </div>
                                <form class="user" action="${context}/Admins/Store" method="post">
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control form-control-user" id="exampleFirstName" name="admins_mail" placeholder="Emal">
                                        </div>
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="password" class="form-control form-control-user" id="exampleInputPassword" name="admins_pass" placeholder="Password" >
                                        </div>
                                        
                                    </div>
                                    <input type="submit" name="action" class="btn btn-primary btn-user btn-block" value="<fmt:message key="login.textfield.Register"/>"/>


                                    <hr>
                                    <a href="index.html" class="btn btn-google btn-user btn-block">
                                        <i class="fab fa-google fa-fw"></i>  <fmt:message key="login.button.submitGoogle"/>
                                    </a>
                                    <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                        <i class="fab fa-facebook-f fa-fw"></i>  <fmt:message key="login.button.submitFacebook"/>
                                    </a>
                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="forgot-password.html"> <fmt:message key="login.button.fogot"/></a>
                                </div>
                                <div class="text-center">
                                    <a class="small" href="login.html"> <fmt:message key="login.button.alhaveaccount"/> </a>
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

        <!-- Bootstrap core JavaScript-->
        <script src="${context}/Admin/vendor/jquery/jquery.min.js"></script>
        <script src="${context}/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="${context}/Admin/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="${context}/Admin/js/sb-admin-2.min.js"></script>

    </body>

</html>
