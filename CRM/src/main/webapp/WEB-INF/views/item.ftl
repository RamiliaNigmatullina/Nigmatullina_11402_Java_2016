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
    <#include "header.ftl">
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
                <div class="col-lg-7">
                    <#assign path = "/img/items/" + category + "/" + item.id + ".jpg" >
                    <img src="${path}" alt="" />
                </div>
                <div class="col-lg-5">
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
                            <@security.authorize access="isAuthenticated()">
                                <#if success?? && success?has_content>
                                    <div>
                                        <p style="color: #3f8d15">${success}</p>
                                    </div>
                                </#if>
                                <#assign path_to_add_item = "/basket/add/" + category + "/" + item.id >
                            <div class="col-lg-6">
                                <form method="post" action="${path_to_add_item}">
                                    <fieldset>
                                        <label for='amount'>Количество:</label>
                                        <input type="text" class="form-control" name="amount" id="amount" style="margin: 1px 0px 7px 0px" value="1" required/>
                                        <div style="text-align: center; margin-top: 5px">
                                            <input type="submit" id='reg' class="btn btn-theme" style="margin: 1px 0px 7px 0px" value="Добавить в корзину"/>
                                        </div>
                                    </fieldset>
                                </form>
                                </div>
                            </@security.authorize>
                        </div>
                    </aside>
                </div>
            </div>
        </div>
    </section>
    <#include "footer.ftl">
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