<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="entity.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>PetShop</title>
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
        <style>
            *{
                font-family: cursive;
            }
        </style>
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
                        <li class="nav-item active"><a href="index.jsp" class="nav-link"><fmt:message key="home.textfied.home"/></a></li>

                        <li class="nav-item dropdown" ><a href="aboutus.jsp" class="nav-link  dropdown-toggle" data-toggle="dropdown"><fmt:message key="home.textfied.product"/></a>
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
                                     <li><a href="${context}/Cusfeedback/Feedback">  <fmt:message key="home.textfied.feedbacks"/></a></li>
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
                                <li><a href="${context}?locale=en">English</a></li>
                                <li><a href="${context}?locale=vi">Vietnamese</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- END nav -->
        <div class="hero-wrap js-fullheight" style="background-image: url('${context}/petsitting/images/bg_1.jpg');" data-stellar-background-ratio="0.5">
            <div class="overlay"></div>
            <div class="container">
                <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
                    <div class="col-md-11 ftco-animate text-center">
                        <h1 class="mb-4"> <fmt:message key="home.textfied.highesqualiti"/>  </h1>
                        <p><a href="#" class="btn btn-primary mr-md-4 py-3 px-4"><fmt:message key="home.button.learnmore"/><span class="ion-ios-arrow-forward"></span></a></p>
                    </div>
                </div>
            </div>
        </div>

        <section class="ftco-section bg-light ftco-no-pt ftco-intro">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 d-flex align-self-stretch px-4 ftco-animate">
                        <div class="d-block services active text-center">
                            <div class="icon d-flex align-items-center justify-content-center">
                                <span class="flaticon-blind"></span>
                            </div>
                            <div class="media-body">
                                <h3 class="heading" style="margin-top: 20px"><fmt:message key="home.cricle.pet"/> </h3>
                                <p><fmt:message key="home.cricle.textfied.pet"/></p>
                                <a href="#" class="btn-custom d-flex align-items-center justify-content-center"><span class="fa fa-chevron-right"></span><i class="sr-only">Read more</i></a>
                            </div>
                        </div>      
                    </div>
                    <div class="col-md-4 d-flex align-self-stretch px-4 ftco-animate">
                        <div class="d-block services text-center">
                            <div class="icon d-flex align-items-center justify-content-center">
                                <span class="flaticon-dog-eating"></span>
                            </div>
                            <div class="media-body">
                                <h3 class="heading" style="margin-top: 20px"><fmt:message key="home.cricle.food"/></h3>
                                <p><fmt:message key="home.cricle.textfied.food"/></p>
                                <a href="#" class="btn-custom d-flex align-items-center justify-content-center"><span class="fa fa-chevron-right"></span><i class="sr-only">Read more</i></a>
                            </div>
                        </div>    
                    </div>
                    <div class="col-md-4 d-flex align-self-stretch px-4 ftco-animate">
                        <div class="d-block services text-center">
                            <div class="icon d-flex align-items-center justify-content-center">
                                <span class="flaticon-grooming"></span>
                            </div>
                            <div class="media-body">
                                <h3 class="heading" style="margin-top: 20px"><fmt:message key="home.cricle.accessories"/></h3>
                                <p><fmt:message key="home.cricle.textfied.accessories"/></p>
                                <a href="#" class="btn-custom d-flex align-items-center justify-content-center"><span class="fa fa-chevron-right"></span><i class="sr-only">Read more</i></a>
                            </div>
                        </div>      
                    </div>
                </div>
            </div>
        </section>

        <section class="ftco-section ftco-no-pt ftco-no-pb">
            <div class="container">
                <div class="row d-flex no-gutters">
                    <div class="col-md-5 d-flex">
                        <div class="img img-video d-flex align-self-stretch align-items-center justify-content-center justify-content-md-center mb-4 mb-sm-0" style="background-image:url(petsitting/images/about-1.jpg);">
                        </div>
                    </div>
                    <div class="col-md-7 pl-md-5 py-md-5">
                        <div class="heading-section pt-md-5">
                            <h2 class="mb-4"><fmt:message key="home.textfied.whychooseus"/></h2>
                        </div>
                        <div class="row">
                            <div class="col-md-6 services-2 w-100 d-flex">
                                <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-stethoscope"></span></div>
                                <div class="text pl-3">
                                    <h4><fmt:message key="home.cricle.textfied.careadvices"/></h4>
                                    <p>Far far away, behind the word mountains, far from the countries.</p>
                                </div>
                            </div>
                            <div class="col-md-6 services-2 w-100 d-flex">
                                <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-customer-service"></span></div>
                                <div class="text pl-3">
                                    <h4><fmt:message key="home.cricle.textfied.customerSupp"/></h4>
                                    <p>Far far away, behind the word mountains, far from the countries.</p>
                                </div>
                            </div>
                            <div class="col-md-6 services-2 w-100 d-flex">
                                <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-emergency-call"></span></div>
                                <div class="text pl-3">
                                    <h4><fmt:message key="home.cricle.textfied.emergency"/></h4>
                                    <p>Far far away, behind the word mountains, far from the countries.</p>
                                </div>
                            </div>
                            <div class="col-md-6 services-2 w-100 d-flex">
                                <div class="icon d-flex align-items-center justify-content-center"><span class="flaticon-veterinarian"></span></div>
                                <div class="text pl-3">
                                    <h4><fmt:message key="home.cricle.textfied.veterinary"/></h4>
                                    <p>Far far away, behind the word mountains, far from the countries.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

       

<section class="ftco-section bg-light">
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.news"/></h2>
                    </div>
                </div>
                <div class="row d-flex">
                    <c:if test="${petList == null}">
                        Nguyen Hoang Bao
                    </c:if>
                    <c:if test="${petList != null}">
                        <c:forEach var="i" items="${petList}">
                            <div class="col-md-3 d-flex ftco-animate">
                                <div class="blog-entry align-self-stretch">
                                    <a href="${context}/PetProduct/Detail?id=${i.PId}" class="block-20 rounded" style="background-image: url('${context}/ImageItems/${i.image}');">
                                    </a>
                                    <div class="text p-4">
                                        <div class="meta mb-2">
                                            <div><a href="#">April 07, 2020</a></div>
                                            <div><a href="#">${i.PName}</a></div>
                                            <div><a href="#" class="meta-chat"><span class="fa fa-comment"></span> 3</a></div>
                                        </div>
                                        <h3 class="heading"><a href="#">${i.description}</a></h3>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:if>
                </div>
                <div style="position: absolute;right: 13%;">
                    <button style="padding: 4px 10px; border: dashed; border-radius: 5px; background-color: green; color: white">
                        <a href="${context}/PetProduct/All" style="color: white">View More</a>
                    </button>
                </div>
            </div>
        </section>

        <section class="ftco-section bg-light">
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.news"/></h2>
                    </div>
                </div>
                <div class="row d-flex">
                    <c:if test="${foodList == null}">
                        Nguyen Hoang Bao
                    </c:if>
                    <c:if test="${foodList != null}">
                        <c:forEach var="i" items="${foodList}">
                            <div class="col-md-3 d-flex ftco-animate">
                                <div class="blog-entry align-self-stretch">
                                    <a href="${context}/FoodProduct/Detail?id=${i.FId}" class="block-20 rounded" style="background-image: url('${context}/ImageItems/${i.image}');">
                                    </a>
                                    <div class="text p-4">
                                        <div class="meta mb-2">
                                            <div><a href="#">April 07, 2020</a></div>
                                            <div><a href="#">${i.name}</a></div>
                                            <div><a href="#" class="meta-chat"><span class="fa fa-comment"></span> 3</a></div>
                                        </div>
                                        <h3 class="heading"><a href="#">${i.description}</a></h3>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:if>
                </div>
                <div style="position: absolute;right: 13%;">
                    <button style="padding: 4px 10px; border: dashed; border-radius: 5px; background-color: green; color: white">
                        <a href="${context}/FoodProduct/All" style="color: white">View More</a>
                    </button>
                </div>
            </div>
        </section>

        <section class="ftco-section bg-light">
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.news"/></h2>
                    </div>
                </div>
                <div class="row d-flex">
                    <c:if test="${accList == null}">
                        Nguyen Hoang Bao
                    </c:if>
                    <c:if test="${accList != null}">
                        <c:forEach var="i" items="${accList}">
                            <div class="col-md-3 d-flex ftco-animate">
                                <div class="blog-entry align-self-stretch">
                                    <a href="${context}/AccessoriesProduct/Detail?id=${i.ESId}" class="block-20 rounded" style="background-image: url('${context}/ImageItems/${i.image}');">
                                    </a>
                                    <div class="text p-4">
                                        <div class="meta mb-2">
                                            <div><a href="#">April 07, 2020</a></div>
                                            <div><a href="#">${i.name}</a></div>
                                            <div><a href="#" class="meta-chat"><span class="fa fa-comment"></span> 3</a></div>
                                        </div>
                                        <h3 class="heading"><a href="#">${i.description}</a></h3>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:if>
                </div>
                <div style="position: absolute;right: 13%;">
                    <button style="padding: 4px 10px; border: dashed; border-radius: 5px; background-color: green; color: white">
                        <a href="${context}/AccessoriesProduct/All" style="color: white">View More</a>
                    </button>
                </div>
            </div>
        </section>
<!---->
        <section class="ftco-section testimony-section" style="background-image: url('${context}/petsitting/images/bg_2.jpg');">
            <div class="overlay"></div>
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.hc&fb"/></h2>
                    </div>
                </div>
                <div class="row ftco-animate">
                    <div class="col-md-12">
                        <div class="carousel-testimony owl-carousel ftco-owl">
                            <div class="item">
                                <div class="testimony-wrap py-4">
                                    <div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></span></div>
                                    <div class="text">
                                        <p class="mb-4">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                                        <div class="d-flex align-items-center">
                                            <div class="user-img" style="background-image: url(${context}/petsitting/images/person_1.jpg)"></div>
                                            <div class="pl-3">
                                                <p class="name">Roger Scott</p>
                                                <span class="position">Marketing Manager</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="testimony-wrap py-4">
                                    <div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></span></div>
                                    <div class="text">
                                        <p class="mb-4">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                                        <div class="d-flex align-items-center">
                                            <div class="user-img" style="background-image: url(${context}/petsitting/images/person_2.jpg)"></div>
                                            <div class="pl-3">
                                                <p class="name">Roger Scott</p>
                                                <span class="position">Marketing Manager</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="testimony-wrap py-4">
                                    <div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></span></div>
                                    <div class="text">
                                        <p class="mb-4">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                                        <div class="d-flex align-items-center">
                                            <div class="user-img" style="background-image: url(${context}/petsitting/images/person_3.jpg)"></div>
                                            <div class="pl-3">
                                                <p class="name">Roger Scott</p>
                                                <span class="position">Marketing Manager</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="testimony-wrap py-4">
                                    <div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></span></div>
                                    <div class="text">
                                        <p class="mb-4">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                                        <div class="d-flex align-items-center">
                                            <div class="user-img" style="background-image: url(${context}/petsitting/images/person_1.jpg)"></div>
                                            <div class="pl-3">
                                                <p class="name">Roger Scott</p>
                                                <span class="position">Marketing Manager</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="testimony-wrap py-4">
                                    <div class="icon d-flex align-items-center justify-content-center"><span class="fa fa-quote-left"></span></div>
                                    <div class="text">
                                        <p class="mb-4">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
                                        <div class="d-flex align-items-center">
                                            <div class="user-img" style="background-image: url(${context}/petsitting/images/person_2.jpg)"></div>
                                            <div class="pl-3">
                                                <p class="name">Roger Scott</p>
                                                <span class="position">Marketing Manager</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="ftco-section bg-light">
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.AffordablePackages"/></h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 ftco-animate">
                        <div class="block-7">
                            <div class="img" style="background-image: url(${context}/petsitting/images/pricing-1.jpg);"></div>
                            <div class="text-center p-4">
                                <span class="excerpt d-block">Personal</span>
                                <span class="price"><sup>$</sup> <span class="number">49</span> <sub>/mos</sub></span>

                                <ul class="pricing-text mb-5">
                                    <li><span class="fa fa-check mr-2"></span>5 Dog Walk</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Vet Visit</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Pet Spa</li>
                                    <li><span class="fa fa-check mr-2"></span>Free Supports</li>
                                </ul>

                                <a href="#" class="btn btn-primary d-block px-2 py-3">Get Started</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="block-7">
                            <div class="img" style="background-image: url(${context}/petsitting/images/pricing-2.jpg);"></div>
                            <div class="text-center p-4">
                                <span class="excerpt d-block">Business</span>
                                <span class="price"><sup>$</sup> <span class="number">79</span> <sub>/mos</sub></span>

                                <ul class="pricing-text mb-5">
                                    <li><span class="fa fa-check mr-2"></span>5 Dog Walk</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Vet Visit</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Pet Spa</li>
                                    <li><span class="fa fa-check mr-2"></span>Free Supports</li>
                                </ul>

                                <a href="#" class="btn btn-primary d-block px-2 py-3">Get Started</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="block-7">
                            <div class="img" style="background-image: url(${context}/petsitting/images/pricing-3.jpg);"></div>
                            <div class="text-center p-4">
                                <span class="excerpt d-block">Ultimate</span>
                                <span class="price"><sup>$</sup> <span class="number">109</span> <sub>/mos</sub></span>

                                <ul class="pricing-text mb-5">
                                    <li><span class="fa fa-check mr-2"></span>5 Dog Walk</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Vet Visit</li>
                                    <li><span class="fa fa-check mr-2"></span>3 Pet Spa</li>
                                    <li><span class="fa fa-check mr-2"></span>Free Supports</li>
                                </ul>

                                <a href="#" class="btn btn-primary d-block px-2 py-3">Get Started</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="ftco-section">
            <div class="container">
                <div class="row justify-content-center pb-5 mb-3">
                    <div class="col-md-7 heading-section text-center ftco-animate">
                        <h2><fmt:message key="home.textfied.PetsGallery"/></h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-1.jpg);">
                            <a href="${context}/petsitting/images/gallery-1.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Cat</span>
                                    <h2><a href="work-single.html">Persian Cat</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-2.jpg);">
                            <a href="${context}/petsitting/images/gallery-2.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Dog</span>
                                    <h2><a href="work-single.html">Pomeranian</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-3.jpg);">
                            <a href="${context}/petsitting/images/gallery-3.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Cat</span>
                                    <h2><a href="work-single.html">Sphynx Cat</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-4.jpg);">
                            <a href="${context}/petsitting/images/gallery-4.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Cat</span>
                                    <h2><a href="work-single.html">British Shorthair</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-5.jpg);">
                            <a href="${context}/petsitting/images/gallery-5.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Dog</span>
                                    <h2><a href="work-single.html">Beagle</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 ftco-animate">
                        <div class="work mb-4 img d-flex align-items-end" style="background-image: url(${context}/petsitting/images/gallery-6.jpg);">
                            <a href="${context}/petsitting/images/gallery-6.jpg" class="icon image-popup d-flex justify-content-center align-items-center">
                                <span class="fa fa-expand"></span>
                            </a>
                            <div class="desc w-100 px-4">
                                <div class="text w-100 mb-3">
                                    <span>Dog</span>
                                    <h2><a href="work-single.html">Pug</a></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        

        <div class="row justify-content-center pb-5 mb-3">
            <div class="col-md-7 heading-section text-center ftco-animate">
                <h2><fmt:message key="home.textfied.ourstore"/></h2>
            </div>
        </div>
        <section class="ftco-appointment ftco-section ftco-no-pt ftco-no-pb img" style="background-image: url(${context}/petsitting/images/bg_3.jpg);">
            <div class="overlay"></div>
            <div class="container" >
                <div class="row d-md-flex justify-content-end">

                    <div class="col-md-12 col-lg-6 half p-3 py-5 pl-lg-5 ftco-animate" id="googleMap">                     
                        <script>
                            function myMap() {
                                var mapProp = {
                                    center: new google.maps.LatLng(51.508742, -0.120850),
                                    zoom:5p;
                                };
                                var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
                            }
                        </script>
                        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC5AmezZ2ReRoypvpYKsPQ8612AojH8h24&callback=myMap"></script>
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.535611105015!2d106.67292031462247!3d10.770228392325723!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752edf949244a9%3A0xcc76335a7312de7b!2zNDIgVHLhuqduIE1pbmggUXV54buBbiwgUGjGsOG7nW5nIDExLCBRdeG6rW4gMTAsIEjhu5MgQ2jDrSBNaW5oLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1591859038893!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>

                    </div>
                </div>
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
                            <a class="img mr-4 rounded" style="background-image: url(${context}/petsitting/images/image_1.jpg);"></a>
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
                            <a class="img mr-4 rounded" style="background-image: url(${context}/petsitting/images/image_2.jpg);"></a>
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