<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Zetta - фабрика кухни</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta name="description" content="" />
    <meta name="author" content="http://bootstraptaste.com" />
    <!-- css -->
    <link href="/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="css/jcarousel.css" rel="stylesheet" />
    <link href="/css/flexslider.css" rel="stylesheet" />
    <link href="/css/style.css" rel="stylesheet" />


    <!-- Theme skin -->
    <link href="/skins/default.css" rel="stylesheet" />

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<div id="wrapper">
    <!-- start header -->
    <header>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/home"><span>Z</span>etta</a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="/catalog">Каталог</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">О компании<b class=" icon-angle-down"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="/company/info">Информация</a></li>
                                <li><a href="/company/career">Карьера</a></li>
                                <li><a href="/company/guarantee">Гарантия</a></li>
                                <li><a href="/company/mission">Миссия</a></li>
                                <li><a href="/company/advantages">Преимущества</a></li>
                                <li><a href="/company/manufacture">Производство</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle " data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Клиентам<b class=" icon-angle-down"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="/forclients/callgager">Клиентам</a></li>
                            </ul>
                        </li>
                        <li><a href="/signin">Вход</a></li>
                        <li><a href="/join">Регистрация</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- end header -->

    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="breadcrumb">
                        <li><a href="/home"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
                        <li><a href="/catalog">Каталог</a><i class="icon-angle-right"></i></li>
                        <li>${name}</li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <section id="content">
        <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    <#assign path = "/img/items/" + category + "/" + item.id + ".jpg" >
                    <img src="${path}" alt="" />
                </div>
                <div class="col-lg-4">
                    <aside class="right-sidebar">
                        <div class="widget">
                            <#if item?? && item?has_content>
                                <h2>${item.name}</h2>
                                <p>${item.description}</p>
                                <h3>${item.price}.- /${item.priceFor}</h3>
                                <p>Артикул: ${item.articleNumber}</p>
                                <h4>Главные черты</h4>
                                <p>${item.keyFeatures}</p>
                            <p>
                                <b>Параметры:</b><br>
                                <#if item.width?? && item.width?has_content>
                                    Ширина: ${item.width} см.<br>
                                </#if>
                                <#if item.height?? && item.height?has_content>
                                    Высота: ${item.height} см.<br>
                                </#if>
                                <#if item.depth?? && item.depth?has_content>
                                    Глубина: ${item.depth} см.<br>
                                </#if>
                                <#if item.thickness?? && item.thickness?has_content>
                                    Толщина: ${item.thickness} см.<br>
                                </#if>
                                <#if item.weight?? && item.weight?has_content>
                                    Вес: ${item.weight} кг.<br>
                                </#if>
                                <#if item.maxLoadLeg?? && item.maxLoadLeg?has_content>
                                    Максимальная нагрузка/ножка: ${item.maxLoadLeg} кг.<br>
                                </#if>
                                <#if item.minHeight?? && item.minHeight?has_content>
                                    Минимальная высота: ${item.minHeight} см.<br>
                                </#if>
                                <#if item.maxHeight?? && item.maxHeight?has_content>
                                    Максимальная высота: ${item.maxHeight} см.<br>
                                </#if>
                                </p>
                            </#if>
                        </div>
                    </aside>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">О компании</h5>
                        <ul class="link-list">
                            <li><a href="/company/info">Информация</a></li>
                            <li><a href="/company/career">Карьера</a></li>
                            <li><a href="/company/guarantee">Гарантия</a></li>
                            <li><a href="/company/mission">Миссия</a></li>
                            <li><a href="/company/advantages">Преимущества</a></li>
                            <li><a href="/company/manufacture">Производство</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">Каталог</h5>
                        <ul class="link-list">
                            <li><a href="#">Шкафы</a></li>
                            <li><a href="#">Столы</a></li>
                            <li><a href="#">Стулья</a></li>
                            <li><a href="#">Ножки</a></li>
                            <li><a href="#">Кухни</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">Клиентам</h5>
                        <ul class="link-list">
                            <li><a href="#">Вызов замерщика</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="widget">
                        <h5 class="widgetheading">Свяжитесь с нами</h5>
                        <p>Email: zetta@gmail.com</p>
                        <p>Телефон: 8 (495) 133-95-50</p>
                    </div>
                </div>
            </div>
        </div>
        <div id="sub-footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="copyright">
                            <p>
                                <span>&copy; Copyright © 2016 Zetta. All rights reserved. </span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/js/jquery.js"></script>
<script src="/js/jquery.easing.1.3.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery.fancybox.pack.js"></script>
<script src="/js/jquery.fancybox-media.js"></script>
<script src="/js/google-code-prettify/prettify.js"></script>
<script src="/js/portfolio/jquery.quicksand.js"></script>
<script src="/js/portfolio/setting.js"></script>
<script src="/js/jquery.flexslider.js"></script>
<script src="/js/animate.js"></script>
<script src="/js/custom.js"></script>
</body>
</html>