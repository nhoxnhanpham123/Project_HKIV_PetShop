<%-- 
    Document   : index
    Created on : Jun 15, 2020, 7:55:05 PM
    Author     : DUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="${context}/Login/loginCustomer/Login_v11/images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/css/util.css">
        <link rel="stylesheet" type="text/css" href="${context}/Login/loginCustomer/Login_v11/css/main.css">
        <style>
            *{
                font-family: cursive;
            }
        </style>
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
                    <%
                        Cookie[] listCookie = request.getCookies();
                        String user = "";
                        String pass = "";
                        boolean checked = false;
                        int co = 0;
                        if (listCookie != null) {
                            while (co < listCookie.length) {
                                if (listCookie[co].getName().equals("user")) {
                                    user = listCookie[co].getValue();
                                    checked = true;
                                }
                                if (listCookie[co].getName().equals("pass")) {
                                    pass = listCookie[co].getValue();
                                    checked = true;
                                }
                                co++;
                            }

                        }
                    %>
                    ${error}
                    <form class="login100-form validate-form" action="${context}/Customers/Check" method="post">
                        <span class="login100-form-title p-b-55">
                            <fmt:message key="login.form.title"/>
                        </span>

                        <div class="wrap-input100 validate-input m-b-16" data-validate = "Valid email is required: ex@abc.xyz" >
                            <input class="input100" type="text" name="txtMail" value="<%out.print(user);%>" placeholder="<fmt:message key="login.textfield.mail"/>">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <span class="lnr lnr-envelope"></span>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
                            <input class="input100" type="password" name="txtPassword" value="<%out.print(pass);%>"  placeholder="<fmt:message key="login.textfield.password"/>">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <span class="lnr lnr-lock"></span>
                            </span>
                        </div>

                        <div class="contact100-form-checkbox m-l-4">
                            <% 
                            if (checked== true){                                                        
                            %>
                            <input class="input-checkbox100" value="ON" checked="true" type="checkbox" id="customCheck" name="chkRemember">
                            <label class="label-checkbox100" for="customCheck"><fmt:message key="login.textfield.checkbox"/>
                                <%
                            }else{
                                %>
                                 <input class="input-checkbox100" value="ON" type="checkbox" id="customCheck" name="chkRemember">
                            <label class="label-checkbox100" for="customCheck"><fmt:message key="login.textfield.checkbox"/>
                                <%
                            }
                            %>
                            </label>
                        </div>

                        <div class="container-login100-form-btn p-t-25">
                            <button class="login100-form-btn" type="submit" value="">
                                <fmt:message key="login.button.submit"/>
                            </button>
                        </div>
                        <div class="text-center w-full p-t-42 p-b-22">
                            <span class="txt1">
                                <a class="small" href="${context}/Login/registerCustomer/colorlib-regform-2/index.jsp"><fmt:message key="login.textfield.Register"/></a>
                            </span><br/>
                            <span class="txt1">
                                <a class="small" href="forgot-password.jsp"><fmt:message key="login.button.fogot"/></a>
                            </span>
                        </div>

                        <a href="../Admin/index.html" class="btn-face m-b-10">
                            <i class="fa fa-facebook-official"></i>
                            Facebook
                        </a>

                        <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/Project_HKIV_PetShop/loginGoogle&response_type=code
                           &client_id=520939530095-juad1qmkst71lhl963fqck8mibnocbhu.apps.googleusercontent.com&approval_prompt=force" class="btn-google m-b-10">
                            <img src="${context}/Login/loginCustomer/Login_v11/images/icons/icon-google.png" alt="GOOGLE"><fmt:message key="login.button.submitGoogle"/>

                        </a>
                        <div class="text-center w-full p-t-42 p-b-22">
                            <a class="small" href="?locale=en">
                                English |
                            </a>
                            <a class="small" href="?locale=vi">
                                Vietnamese
                            </a>

                        </div>

                    </form>
                </div>
            </div>
        </div>




        <!--===============================================================================================-->	
        <script src="${context}/Login/loginCustomer/Login_v11/vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="${context}/Login/loginCustomer/Login_v11/vendor/bootstrap/js/popper.js"></script>
        <script src="${context}/Login/loginCustomer/Login_v11/vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="${context}/Login/loginCustomer/Login_v11/vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="${context}/Login/loginCustomer/Login_v11/js/main.js"></script>

    </body>
</html>
