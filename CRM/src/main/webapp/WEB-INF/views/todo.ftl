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
                        <li class="active"><a href="/admin/addtomanager">Заявки пользователей</a><i class="icon-angle-right"></i></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <br>
    <div style="text-align: center">
        <a href="/worker/done" class="btn btn-theme">Выполненные заявки</a>
    </div>
    <#if todo?? && todo?has_content>

    <section id="content">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h2 class="panel-title" style="text-align: center;">
                        <b>Заявки пользователей</b>
                    </h2>
                <table>
                    <tr>
                        <td style="padding: 5px">Имя</td>
                        <td style="padding: 5px">Фамилия</td>
                        <td style="padding: 5px">Телефон</td>
                        <td style="padding: 5px">Адрес</td>
                        <td style="padding: 5px"></td>
                    </tr>
                <#list todo as todo_one>
                    <tr>
                        <td style="padding: 5px">${todo_one.firstName}</td>
                        <td style="padding: 5px">${todo_one.lastName}</td>
                        <td style="padding: 5px">${todo_one.phoneNumber}</td>
                        <td style="padding: 5px">${todo_one.address}</td>
                        <#assign path="/worker/setdone/" + todo_one.id/>
                        <td style="padding: 5px"><a href="${path}">Выполнено</a></td>
                    </tr>
                </#list>
                </table>
                </div>
            </div>
        </div>
    </section>
    <#else>
    <br>
    <br>
        <p style="text-align: center">Заявок нет</p>
    </#if>
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