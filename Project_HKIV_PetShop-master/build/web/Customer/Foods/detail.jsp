<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="entity.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Detail Food</title>
        <fmt:setBundle basename="app"/>
        <c:import url="setLocale.jsp"/>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"/>

        <style>
            *{
                font-family: cursive;
            }
        </style>

        <style>
            img {
                image-rendering: pixelated;
            }
            /* CSS c?n id pagination ra gi?a màn hình */
            #pagination {
                display: flex;
                display: -webkit-flex; /* Safari 8 */
                flex-wrap: wrap;
                -webkit-flex-wrap: wrap; /* Safari 8 */
                justify-content: center;
                -webkit-justify-content: center;
            }
            .ftco-navbar-light .navbar-nav > .nav-item > .nav-link{
                font-size: 13px !important;
            }
            .quantity {
                display: inline-block; }

            .quantity .input-text.qty {
                width: 35px;
                height: 39px;
                padding: 0 5px;
                text-align: center;
                background-color: transparent;
                border: 1px solid #efefef;
            }

            .quantity.buttons_added {
                text-align: left;
                position: relative;
                white-space: nowrap;
                vertical-align: top; }

            .quantity.buttons_added input {
                display: inline-block;
                margin: 0;
                vertical-align: top;
                box-shadow: none;
            }

            .quantity.buttons_added .minus,
            .quantity.buttons_added .plus {
                padding: 7px 10px 8px;
                height: 41px;
                background-color: #ffffff;
                border: 1px solid #efefef;
                cursor:pointer;}

            .quantity.buttons_added .minus {
                border-right: 0; }

            .quantity.buttons_added .plus {
                border-left: 0; }

            .quantity.buttons_added .minus:hover,
            .quantity.buttons_added .plus:hover {
                background: #eeeeee; }

            .quantity input::-webkit-outer-spin-button,
            .quantity input::-webkit-inner-spin-button {
                -webkit-appearance: none;
                -moz-appearance: none;
                margin: 0; }

            .quantity.buttons_added .minus:focus,
            .quantity.buttons_added .plus:focus {
                outline: none; }
            </style>
            <script>
                function wcqib_refresh_quantity_increments() {
                    jQuery("div.quantity:not(.buttons_added), td.quantity:not(.buttons_added)").each(function(a, b) {
                        var c = jQuery(b);
                        c.addClass("buttons_added"), c.children().first().before('<input type="button" value="-" class="minus" />'), c.children().last().after('<input type="button" value="+" class="plus" />')
                    })
                }
                String.prototype.getDecimals || (String.prototype.getDecimals = function() {
                    var a = this,
                            b = ("" + a).match(/(?:\.(\d+))?(?:[eE]([+-]?\d+))?$/);
                    return b ? Math.max(0, (b[1] ? b[1].length : 0) - (b[2] ? +b[2] : 0)) : 0
                }), jQuery(document).ready(function() {
                    wcqib_refresh_quantity_increments()
                }), jQuery(document).on("updated_wc_div", function() {
                    wcqib_refresh_quantity_increments()
                }), jQuery(document).on("click", ".plus, .minus", function() {
                    var a = jQuery(this).closest(".quantity").find(".qty"),
                            b = parseFloat(a.val()),
                            c = parseFloat(a.attr("max")),
                            d = parseFloat(a.attr("min")),
                            e = a.attr("step");
                    b && "" !== b && "NaN" !== b || (b = 0), "" !== c && "NaN" !== c || (c = ""), "" !== d && "NaN" !== d || (d = 0), "any" !== e && "" !== e && void 0 !== e && "NaN" !== parseFloat(e) || (e = 1), jQuery(this).is(".plus") ? c && b >= c ? a.val(c) : a.val((b + parseFloat(e)).toFixed(e.getDecimals())) : d && b <= d ? a.val(d) : b > 0 && a.val((b - parseFloat(e)).toFixed(e.getDecimals())), a.trigger("change")
                });
            </script>
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
                <a class="navbar-brand" href="index.jsp" style="color: black"><span class="flaticon-pawprint-1 mr-2"></span>Pet Shop</a>
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
                                     <li><a href="${context}/Cusfeedback/Feedback"><fmt:message key="home.textfied.feedbacks"/></a></li>
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


        <section class="ftco-section">
            <div class="container">
                <div class="row d-flex">
                    <div class="col-sm-8">
                        <div class="row">
                            <div class="col-sm-6">
                                <img src="${context}/ImageItems/${food.image}" width="313" height="330"/>
                                ${food.description}

                            </div>
                            <div class="col-sm-6">
                                <ul style="list-style-type: none">
                                    <li><h1 style="font-family: initial">${food.name}</h1></li>
                                    <li>${food.price} $</li>
                                    <li><hr/></li>
                                    <li>
                                        <div class="quantity buttons_added" style="margin-top:30px; margin-bottom: 20px;">
                                            <form action="${context}/Order/Store" method="Get">
                                                <input type="text" name="FId" value="${food.FId}" style="display: none"/>
                                                <input type="button" value="-" class="minus">
                                                <input type="number" step="1" min="1" max="" name="quantityFood" value="1" title="Qty" class="input-text qty text" size="4" pattern="" inputmode="">
                                                <input type="button" value="+" class="plus">
                                                <br/>
                                                <br/>
                                                <button style="border: none; background-color: #00bd56; width: 100px;
                                                        border-radius: 10px; padding: 4px  12px; color: whitesmoke">Add Cart
                                                </button>
                                            </form>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4" style="background-color: #FAFAFA; height: 100%;">
                        <div style="border: 0 solid #ccc; padding: 15px; font-family: cursive">
                            <h4><fmt:message key="product.textfied.productlist"/></h4>
                            <form action="${context}/FoodProduct/Search" method="post" id="myForm">
                                <input style="padding: 2px 5px; border-radius: 5px; border:3px;" id="myInput" name="txtName" type="text" placeholder="<fmt:message key="product.textfied.search"/>">
                                <button type="submit" style="border: none; background-color: #FAFAFA"><i class="fas fa-search" aria-hidden="true"></i></button>
                            </form>
                            <hr/>
                            <h6 style="margin-top: 10px"><fmt:message key="product.textfied.breeds"/></h6>
                            <ul>
                                <c:forEach var="b" items="${breed}">
                                    <li style="list-style-type: none;"><a style="color: black" href="${context}/PetProduct/ShowByBreed?id=${b.CPId}">${b.name}<sub><span class="badge">${b.petsCollection.size()}</span></a></li>
                                                </c:forEach>
                            </ul>
                            <hr/>
                            <h6 style="margin-top: 10px"><fmt:message key="product.textfied.foods"/></h6>
                            <ul>
                                <c:forEach var="f" items="${forAnimals}">
                                    <li style="list-style-type: none;"><a style="color: black" href="${context}/FoodProduct/ShowByAnimals?id=${f.CFId}">${f.name}<sub><span class="badge">${f.foodsCollection.size()}</span></a></li>
                                                </c:forEach>
                            </ul>
                            <hr/>
                            <h6 style="margin-top: 10px"><fmt:message key="product.textfied.accessories"/></h6>
                            <ul>
                                <c:forEach var="a" items="${forAnimals}">
                                    <li style="list-style-type: none;"><a style="color: black" href="${context}/AccessoriesProduct/ShowByAnimals?id=${a.CFId}">${a.name}<sub><span class="badge">${a.accessoriesCollection.size()}</span></a></li>
                                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
                <h4 style="margin-top: 50px"><fmt:message key="product.textfied.detail.interested"/></h4>
                <hr/>
                <div class="row">
                    <c:forEach var="i" items="${list}">
                        <c:if test="${i.getFId() != food.getFId()}">
                            <div class="col-sm-3 d-flex ftco-animate">
                                <div class="blog-entry align-self-stretch contentPage">
                                    <a href="${context}/FoodProduct/Detail?id=${i.FId}" class="block-20 rounded" style="background-image: url('${context}/ImageItems/${i.image}');">
                                    </a>
                                    <div class="text p-4">
                                        <div class="meta mb-2">
                                            <div><a href="#">${i.name}</a></div><br/>
                                            <div><a href="#">${i.CFId.name}</a></div>
                                            <div><a href="#" class="meta-chat"><i class="far fa-heart"></i></span> 3</a></div>
                                        </div>
                                        <div class="row">
                                            <button style="border: none; background-color: #00bd56; width: 90px;
                                                    border-radius: 10px; padding: 4px  10px; color: whitesmoke">
                                                <a style="color: white" href="${context}/FoodProduct/Compare?id_1=${food.getFId()}&id_2=${i.getFId()}">Compare</a>
                                            </button>
                                            <div class="col-sm-3">
                                                <span style="color: #00bd56">${i.price}$</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:if>
                    </c:forEach>
                </div>
                <!-- Hiên th? nút b?m -->
                <ul id="pagination"></ul>
            </div>
        </section>
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

        <script src="https://code.jquery.com/jquery-3.2.1.js" ></script>
        <!-- JS t?o nút b?m di chuy?n trang start -->
        <script src="http://1892.yn.lt/blogger/JQuery/Pagging/js/jquery.twbsPagination.js" type="text/javascript"></script>
        <!-- JS t?o nút b?m di chuy?n trang end -->

    </body>
</html>