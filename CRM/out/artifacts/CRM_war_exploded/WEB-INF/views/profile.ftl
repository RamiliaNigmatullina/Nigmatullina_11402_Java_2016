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
                        <li><a href="/user/profile">Моя страница</a><i class="icon-angle-right"></i></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div id="res"></div>
                <div class="row">
                    <h2 style="text-align: center">Моя страница</h2>
                </div>
            <#if user?? && user?has_content>
                <h3><b>${user.firstName} ${user.lastName}</b></h3>
                <hr>
                <div class="row">
                    <div class="col-xs-9">
                        <p style="padding: 5px;"><b>Личная информация</b></p>
                        <#if user.email?? && user.email?has_content>
                            <p style="padding-left: 5px"><b>Email</b>: ${user.email}</p>
                        </#if>
                        <#if user.phoneNumber?? && user.phoneNumber?has_content>
                            <p style="padding-left: 5px"><b>Телефон</b>: ${user.phoneNumber}</p>
                        </#if>
                        <#if user.creditCardNumber?? && user.creditCardNumber?has_content>
                            <p style="padding-left: 5px"><b>Номер карты:</b>: ${user.creditCardNumber}</p>
                        </#if>
                        <#if user.postcode?? && user.postcode?has_content>
                            <p style="padding-left: 5px"><b>Почтовый индекс</b>: ${user.postcode}</p>
                        </#if>
                        <#if user.passportID?? && user.passportID?has_content>
                            <p style="padding-left: 5px"><b>Серия и номер паспорта</b>: ${user.passportID}</p>
                        </#if>
                        <#if user.address?? && user.address?has_content>
                            <p style="padding-left: 5px"><b>Адрес</b>: ${user.address}</p>
                        </#if>
                        <#if user.information?? && user.information?has_content>
                            <p style="padding-left: 5px"><b>Информация</b>: ${user.information}</p>
                        </#if>
                        <br><br>
                    </div>
                    <a href="/user/editprofile" class="btn btn-md btn-link">Редактировать</a>
                </div>
            </#if>
            <@security.authorize ifAnyGranted="ROLE_USER">
                <p>Если вы работаете в магазине, то вы можете подать заявку на то, чтобы вас добавили в менеджеры.</p>
                <#if user.wantBeManager >
                    <a href="/user/inotmanager" class="btn btn-md btn-link">Отменить заявку</a>
                <#else>
                    <a href="/user/imanager" class="btn btn-md btn-link">Подать заявку</a>
                </#if>
            </@security.authorize>

            </div>
        </div>
    </div>
    <#include "footer.ftl">
</div>
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