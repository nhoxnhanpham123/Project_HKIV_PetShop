<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <!-- Title Page-->
        <title>Register</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js"></script> 
        <!-- Icons font CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/css/main.css" rel="stylesheet" media="all">
        <style>
            .error-msg {
                font-size: 90%;
                font-style: italic;
                color: red;
            }
        </style>
    </head>

    <body>
        <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
            <div class="wrapper wrapper--w960">
                <div class="card card-2">
                    <div class="card-heading"></div>
                    <div class="card-body" ng-app="myApp" ng-controller="myCtrl">
                        <h2 class="title"><fmt:message key="login.form.titleRe"/></h2>
                        <form action="${context}/Customers/Store" method="post" name="myForm" ng-submit="checkOnSubmit($event)">
                            <div class="input-group" >
                                <input class="input--style-3" type="text" id="exampleFirstName" name="regis_name" placeholder="<fmt:message key="login.textfield.name"/>" ng-required="true"
                                       ng-model="username" ng-minlength= "5" ng-maxlength= "20">
                                <br/>
                                <span ng-show="myForm.regis_name.$invalid && myForm.regis_name.$dirty" class="error-msg">
                                    Name must be(5-20)!
                                </span>
                                <br/>

                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-3" type="password" id="exampleInputPassword" name="regis_pass" placeholder="<fmt:message key="login.textfield.password"/>" ng-model="password"
                                               ng-minlength= "5" ng-maxlength= "10" ng-required="true">
                                        
                                        <span ng-show="myForm.regis_pass.$invalid && myForm.regis_pass.$dirty" class="error-msg">
                                            Password must be(5-10)!
                                        </span>
                                        
                                    </div>
                                </div>
                                               
                                <div class="col-2">
                                    <div class="input-group">
                                        <div class="rs-select2 js-select-simple select--no-search">
                                              <input class="input--style-3" type="password" id="exampleRepeatPassword" name="regis_pass" placeholder="<fmt:message key="login.textfield.rePassword"/>" ng-required="true">
                                           
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <input class="input--style-3" type="email" ng-model="txtMail" id="exampleInputEmail" name="regis_mail" placeholder="<fmt:message key="login.textfield.mail"/>" ng-required="true">
                                    <br/>
                                    <span  ng-show="myForm.regis_mail.$invalid && myForm.regis_mail.$dirty" class="error-msg">
                                        mail must be (name@gmail.com)!
                                    </span>
                                    <br/>
                                </div>
                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-3" type="text" id="address" name="regis_address" placeholder="<fmt:message key="login.textfield.address"/>" ng-required="true">
                                    </div>
                                </div>
                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                       <input class="input--style-3" type="text" id="mobile" name="regis_phone" placeholder="<fmt:message key="login.textfield.phone"/>" ng-required="true"
                                                   ng-model="phone" ng-pattern="/((09|03|07|08|05|06|04|02|01\00)+([0-9]{8,10})\b)/g">
                                            <br/>
                                            <span ng-show="myForm.regis_phone.$invalid && myForm.regis_phone.$dirty" class="error-msg">
                                                must be in correct format and (10 to 12) Number!

                                            </span>
                                            <br/>
                                    </div>
                                </div>
                            </div>
                                    
                                    
                            <div class="p-t-30">
                                <button class="btn btn--radius btn--green checkmobile"  type="submit" onclick="return Validate()"><fmt:message key="login.textfield.Register"/></button>
                            </div>
                            <div class="p-t-30">
                                <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/Project_HKIV_PetShop/loginGoogle&response_type=code
                                   &client_id=520939530095-juad1qmkst71lhl963fqck8mibnocbhu.apps.googleusercontent.com&approval_prompt=force" style="color: #007bff;">
                                    <fmt:message key="login.button.submitGoogle"/>
                                </a>
                            </div>
                            <div class="p-t-30">
                                <a class="small" href="${context}/Login/loginCustomer/Login_v11/index.jsp"> <fmt:message key="login.button.alhaveaccount"/> </a>
                            </div>
                            <div class="p-t-30">
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
        </div>
        <script type="text/javascript">
            function Validate() {
                var password = document.getElementById("exampleInputPassword").value;
                var confirmPassword = document.getElementById("exampleRepeatPassword").value;
                if (password != confirmPassword) {
                    alert("Passwords do not match.");
                    return false;
                }
                return true;
            }
        </script>
        <script>
            var app = angular.module("myApp", []);

            app.controller("myCtrl", function($scope) {

                $scope.password = "";
                $scope.username = "";
                $scope.phone = "";
                // Show more error infos.
                function printErrorInfo() {
                    console.log($scope.myForm.$error);
                    if ($scope.myForm.$error.minlength) {
                        console.log('$error.minlength? ' + $scope.myForm.$error.minlength[0].$invalid);
                    }
                    if ($scope.myForm.$error.maxlength) {
                        console.log('$error.maxlength? ' + $scope.myForm.$error.maxlength[0].$invalid);
                    }

                }

                $scope.checkOnSubmit = function(event) {
                    if ($scope.myForm.$invalid) {
                        alert("Something invalid!");

                        printErrorInfo();

                        // Cancel submit
                        event.preventDefault();
                        return false;
                    }

                    return true;
                }

            });

        </script>

        <!-- Jquery JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/jquery/jquery.min.js"></script>
        <!-- Vendor JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.js"></script>
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/moment.min.js"></script>
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.js"></script>

        <!-- Main JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/js/global.js"></script>

    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->