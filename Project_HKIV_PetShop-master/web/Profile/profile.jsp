<%-- 
    Document   : profile
    Created on : Jun 9, 2020, 1:33:43 PM
    Author     : Nhan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="entity.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <style>
        input.hidden {
            position: absolute;
            left: -9999px;
        }
        .error-msg {
            font-size: 90%;
            font-style: italic;
            color: red;
        }
        #profile-image1 {
            cursor: pointer;

            width: 100px;
            height: 100px;
            border:2px solid #03b1ce ;}
        .tital{ font-size:16px; font-weight:500;}
        .bot-border{ border-bottom:1px #f8f8f8 solid;  margin:5px 0  5px 0}	
        
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <fmt:setBundle basename="app"/>
        <c:import url="setLocale.jsp"/>
             <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js"></script>   
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/0644aaed0c.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- add icon link -->
        <link rel = "icon" href ="https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg" type = "image/x-icon">
        <link rel="stylesheet" href="${context}/petsitting/css/animate.css">

        <link rel="stylesheet" href="${context}/petsitting/css/owl.carousel.min.css">
        <link rel="stylesheet" href="${context}/petsitting/css/owl.theme.default.min.css">
        <link rel="stylesheet" href="${context}/petsitting/css/magnific-popup.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="${context}/petsitting/css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="${context}/petsitting/css/jquery.timepicker.css">

        <link rel="stylesheet" href="${context}/petsitting/css/flaticon.css">
        <link rel="stylesheet" href="${context}/petsitting/css/style.css">
        
    </head>

    <body>
        <div class="wrap">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 d-flex align-items-center">
                        <p class="mb-0 phone pl-md-2">
                            <a href="#" class="mr-2"><span class="fa fa-phone mr-1"></span> +00 1234 567</a> 
                            <a href="#"><span class="fa fa-paper-plane mr-1"></span> youremail@email.com</a>
                        </p>
                    </div>
                    <div class="col-md-6 d-flex justify-content-md-end">
                        <div class="social-media">
                            <p class="mb-0 d-flex">

                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><span class="flaticon-pawprint-1 mr-2"></span>Pet Shop</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="fa fa-bars"></span> Menu
                </button>
                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active"><a href="${context}/index.jsp" class="nav-link"><fmt:message key="home.textfied.home"/></a></li>

                        <li class="nav-item dropdown" ><a href="#" class="nav-link  dropdown-toggle" data-toggle="dropdown"><fmt:message key="home.textfied.product"/></a>
                            <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                <li><a href="${context}/PetProduct/All"><fmt:message key="home.textfied.product.pet"/></a></li>
                                <li><a href="${context}/FoodProduct/All"><fmt:message key="home.textfied.product.food"/></a></li>
                                <li><a href="${context}/AccessoriesProduct/All"><fmt:message key="home.textfied.product.Accessories"/></a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a href="${context}/Customer/petHotel/colorlib-regform-3/index.jsp" class="nav-link"><fmt:message key="home.textfied.pethotel"/></a></li>
                        <li class="nav-item"><a href="${context}/aboutus.jsp" class="nav-link"><fmt:message key="home.textfied.about"/></a></li>
                        <li class="nav-item"><a href="${context}/Order/View" class="nav-link"><i class="fas fa-shopping-cart"><sub><span class="badge">
                                            <c:if test="${sessionScope.order != null}">
                                                ${sessionScope.order.odersDetailsCollection.size()}
                                            </c:if>    
                                            <c:if test="${sessionScope.order == null}">
                                                0
                                            </c:if>    
                                        </span></sub></i> </a></li>
                                        <c:if test="${sessionScope.username != null}">
                            <li class="nav-item dropdown" >
                                <a href="about.html" class="nav-link  dropdown-toggle" data-toggle="dropdown">
                                    <c:out value="${sessionScope.username.name}" />
                                </a>
                                <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                    <li><a href="${context}/Member/ListProfile?id=${username.getMId()}"> <fmt:message key="home.textfied.profile"/></a></li>
                                    <li><a href="${context}/Cusfeedback/Feedback"> <fmt:message key="home.textfied.feedbacks"/></a></li>
                                    <li><a href="${context}/Customers/Logout?logout=ok"> <fmt:message key="home.textfied.logout"/></a></li>
                                </ul>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.username == null}">
                            <li class="nav-item" >
                                <a href="${context}/Customers/Login" class="nav-link">
                                    <fmt:message key="home.textfied.login"/>  
                                </a>
                            </li>
                        </c:if>
                        <li class="nav-item dropdown" ><a href="about.html" class="nav-link  dropdown-toggle" data-toggle="dropdown"><fmt:message key="home.textfied.language"/></a>
                            <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                <li><a href="?locale=en">English</a></li>
                                <li><a href="?locale=vi">Vietnamese</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END nav -->

        <div class="container" >
            <div class="row">


                <div class="col-md-7 ">

                    <div class="panel panel-default">

                        <div class="panel-heading">  <h4 >User Profile</h4></div>
                        <div class="panel-body" >

                            <div class="box box-info">

                                <div class="box-body" ng-app="myApp" ng-controller="myCtrl">
                                    <div class="col-sm-6">
                                        <div  align="center"> 

                                            <input id="profile-image-upload" class="hidden" type="file">
                                            <!--Upload Image Js And Css-->
                                        </div>

                                        <br>

                                        <!-- /input-group -->
                                    </div>

                                    <div class="col-sm-6">
                                        <h4 style="color:#00b1b1;">${list.name}</h4></span>
                                        <span><p>Member</p></span>            
                                    </div>
                                    <div class="clearfix"></div>
                                    <hr style="margin:5px 0 5px 0;">

                                    <form action="${context}/Member/updateProfile" method="post" name="myForm" ng-submit="checkOnSubmit($event)">
                                        <div style="display: none" class="col-sm-5 col-xs-6 tital">Member ID</div>
                                        <div style="display: none" class="col-sm-7 col-xs-6 ">
                                            <input type="text" value="${list.MId}" name="id"/>
                                        </div>
                                        <div class="col-sm-5 col-xs-6 tital " >Member Name:</div><div class="col-sm-7 col-xs-6 ">
                                            <input type="text" value="${list.name}" name="name" required=""  maxlength="20" minlength="5" />
                                            
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>

                                        <div class="col-sm-5 col-xs-6 tital " >Member Email:</div><div class="col-sm-7">
                                            <input type="email" value="${list.mail}" ng-model="txtMail" name="mail" required=""/>
                                         
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>

                                        <div class="col-sm-5 col-xs-6 tital " >Member Phone:</div><div class="col-sm-7">
                                            <input type="text" value="${list.phone}" name="phone" required="" maxlength="12" minlength="10" />
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>

                                        <div class="col-sm-5 col-xs-6 tital " >Address:</div><div class="col-sm-7">
                                            <input type="text" value="${list.address}" name="address" required=""/>
                                        </div>         

                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>

                                        <div class="col-sm-5 col-xs-6 tital " >Password:</div><div class="col-sm-7">
                                            <input type="password" id="exampleInputPassword" value="${list.password}" name="password" required="" maxlength="10" minlength="5"  />
                                        </div>   
                                        <div class="col-sm-5 col-xs-6 tital " >Re-Password:</div><div class="col-sm-7">
                                            <input type="password" id="exampleRepeatPassword"name="repassword" required="" maxlength="10" minlength="5"  />
                                        </div>   
                                        <!-- /.box-body -->
                                        <div class="clearfix"></div>
                                        <div class="bot-border"></div>
                                        <div class="col-sm-7">
                                            <input name="action" value="Update" type="submit" onclick="return Validate()"/>
                                        </div>
                                    </form>
                                </div>
                                <!-- /.box -->

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
                    $(function() {
                        $('#profile-image1').on('click', function() {
                            $('#profile-image-upload').click();
                        });
                    });
                </script> 
            </div>
        </div>

        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading"><fmt:message key="home.footer.Petsitting"/></h2>
                        <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>
                        <ul class="ftco-footer-social p-0">
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Twitter"><span class="fa fa-twitter"></span></a></li>
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Facebook"><span class="fa fa-facebook"></span></a></li>
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Instagram"><span class="fa fa-instagram"></span></a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading"><fmt:message key="home.footer.LatestNews"/></h2>
                        <div class="block-21 mb-4 d-flex">
                            <a class="img mr-4 rounded" style="background-image: url(petsitting/images/image_1.jpg);"></a>
                            <div class="text">
                                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                                <div class="meta">
                                    <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                                </div>
                            </div>
                        </div>
                        <div class="block-21 mb-4 d-flex">
                            <a class="img mr-4 rounded" style="background-image: url(petsitting/images/image_2.jpg);"></a>
                            <div class="text">
                                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                                <div class="meta">
                                    <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0">
                        <h2 class="footer-heading"><fmt:message key="home.footer.QuickLinks"/></h2>
                        <ul class="list-unstyled">
                            <li><a href="index.jsp" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied1"/></a></li>
                            <li><a href="aboutus.jsp" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied2"/></a></li>
                            <li><a href="#" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied3"/></a></li>
                            <li><a href="#" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied4"/></a></li>
                            <li><a href="#" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied5"/></a></li>
                            <li><a href="#" class="py-2 d-block"><fmt:message key="home.footer.QuickLinks.textfied6"/></a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading"><fmt:message key="home.footer.HaveaQuestions"/></h2>
                        <div class="block-23 mb-3">
                            <ul>
                                <li><span class="icon fa fa-map"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                                <li><a href="#"><span class="icon fa fa-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                                <li><a href="#"><span class="icon fa fa-paper-plane"></span><span class="text">info@yourdomain.com</span></a></li>s
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row mt-5">
                    <div class="col-md-12 text-center">

                        <p class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib.com</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
            </div>
        </footer>

     



        <!-- loader -->
        <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


        <script src="${context}/petsitting/js/jquery.min.js"></script>
        <script src="${context}/petsitting/js/jquery-migrate-3.0.1.min.js"></script>
        <script src="${context}/petsitting/js/popper.min.js"></script>
        <script src="${context}/petsitting/js/bootstrap.min.js"></script>
        <script src="${context}/petsitting/js/jquery.easing.1.3.js"></script>
        <script src="${context}/petsitting/js/jquery.waypoints.min.js"></script>
        <script src="${context}/petsitting/js/jquery.stellar.min.js"></script>
        <script src="${context}/petsitting/js/jquery.animateNumber.min.js"></script>
        <script src="${context}/petsitting/js/bootstrap-datepicker.js"></script>
        <script src="${context}/petsitting/js/jquery.timepicker.min.js"></script>
        <script src="${context}/petsitting/js/owl.carousel.min.js"></script>
        <script src="${context}/petsitting/js/jquery.magnific-popup.min.js"></script>
        <script src="${context}/petsitting/js/scrollax.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
        <script src="${context}/petsitting/js/google-map.js"></script>
        <script src="${context}/petsitting/js/main.js"></script>
       

    </body>
</html>
