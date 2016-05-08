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
                        <li class="active">Каталог</li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <section id="content">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="portfolio-categ filter">
                        <li class="all active"><a href="#">Все</a></li>
                        <li class="base_cabinets"><a href="#" title="">Напольные шкафы</a></li>
                        <li class="cabinets_for_built_in_appliances"><a href="#" title="">Шкафы для встраиваемой техники</a></li>
                        <li class="doors"><a href="#" title="">Двери</a></li>
                        <li class="drawer_fronts"><a href="#" title="">Фронтальные панели</a></li>
                        <li class="high_cabinets"><a href="#" title="">Высокие шкафы</a></li>
                        <li class="wall_cabinets"><a href="#" title="">Навесные шкафы</a></li>
                        <li class="legs"><a href="#" title="">Ножки</a></li>
                    </ul>
                    <div class="clearfix">
                    </div>
                    <div class="row">
                        <section id="projects">
                            <ul id="thumbs" class="portfolio">
                                <#if base_cabinets?? && base_cabinets?has_content>
                                    <#list base_cabinets as base_cabinet>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="base_cabinets">
                                            <#assign path = "/img/items/base_cabinets/" + base_cabinet.id + ".jpg" >
                                            <#assign url = "/catalog/base_cabinets/" + base_cabinet.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${base_cabinet.description}">
                                            <a href="${url}"><h3>${base_cabinet.name}</h3></a>
                                            <p>${base_cabinet.description}</p>
                                            <h5>${base_cabinet.price}.-/ ${base_cabinet.priceFor}</h5>
                                        </li>
                                    </#list>
                                </#if>
                                <#if cabinets_for_built_in_appliances?? && cabinets_for_built_in_appliances?has_content>
                                    <#list cabinets_for_built_in_appliances as cabinet_for_built_in_appliances>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="cabinets_for_built_in_appliances">
                                            <#assign path = "/img/items/cabinets_for_built_in_appliances/" + cabinet_for_built_in_appliances.id + ".jpg" >
                                            <#assign url = "/catalog/cabinets_for_built_in_appliances/" + cabinet_for_built_in_appliances.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${cabinet_for_built_in_appliances.description}">
                                            <a href="${url}"><h3>${cabinet_for_built_in_appliances.name}</h3></a>
                                            <p>${cabinet_for_built_in_appliances.description}</p>
                                            <h4>${cabinet_for_built_in_appliances.price}.-/ ${cabinet_for_built_in_appliances.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                                <#if doors?? && doors?has_content>
                                    <#list doors as door>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="doors">
                                            <#assign path = "/img/items/doors/" + door.id + ".jpg" >
                                            <#assign url = "/catalog/doors/" + door.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${door.description}">
                                            <a href="${url}"><h3>${door.name}</h3></a>
                                            <p>${door.description}</p>
                                            <h4>${door.price}.-/ ${door.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                                <#if drawer_fronts?? && drawer_fronts?has_content>
                                    <#list drawer_fronts as drawer_front>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="drawer_fronts">
                                            <#assign path = "/img/items/drawer_fronts/" + drawer_front.id + ".jpg" >
                                            <#assign url = "/catalog/drawer_fronts/" + drawer_front.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${drawer_front.description}">
                                            <a href="${url}"><h3>${drawer_front.name}</h3></a>
                                            <p>${drawer_front.description}</p>
                                            <h4>${drawer_front.price}.-/ ${drawer_front.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                                <#if high_cabinets?? && high_cabinets?has_content>
                                    <#list high_cabinets as high_cabinet>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="high_cabinets">
                                            <#assign path = "/img/items/high_cabinets/" + high_cabinet.id + ".jpg" >
                                            <#assign url = "/catalog/high_cabinets/" + high_cabinet.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${high_cabinet.description}">
                                            <a href="${url}"><h3>${high_cabinet.name}</h3></a>
                                            <p>${high_cabinet.description}</p>
                                            <h4>${high_cabinet.price}.-/ ${high_cabinet.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                                <#if wall_cabinets?? && wall_cabinets?has_content>
                                    <#list wall_cabinets as wall_cabinet>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="wall_cabinets">
                                            <#assign path = "/img/items/wall_cabinets/" + wall_cabinet.id + ".jpg" >
                                            <#assign url = "/catalog/wall_cabinets/" + wall_cabinet.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${wall_cabinet.description}">
                                            <a href="${url}"><h3>${wall_cabinet.name}</h3></a>
                                            <p>${wall_cabinet.description}</p>
                                            <h4>${wall_cabinet.price}.-/ ${wall_cabinet.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                                <#if legs?? && legs?has_content>
                                    <#list legs as leg>
                                        <li class="item-thumbs col-lg-3 design" data-id="id-0" data-type="legs">
                                            <#assign path = "/img/items/legs/" + leg.id + ".jpg" >
                                            <#assign url = "/catalog/legs/" + leg.id>
                                            <div data-fancybox-group="gallery"></div>
                                            <img src="${path?j_string}" alt="${leg.description}">
                                            <a href="${url}"><h3>${leg.name}</h3></a>
                                            <p>${leg.description}</p>
                                            <h4>${leg.price}.-/ ${leg.priceFor}</h4>
                                        </li>
                                    </#list>
                                </#if>
                            </ul>
                        </section>
                    </div>
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