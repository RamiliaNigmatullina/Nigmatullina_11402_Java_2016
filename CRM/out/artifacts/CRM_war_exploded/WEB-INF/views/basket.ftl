<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Moderna - Bootstrap 3 flat corporate template</title>
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
                        <li><a href="/basket">Корзина</a><i class="icon-angle-right"></i></li>
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
                    <h2 style="text-align: center">Моя корзина</h2>
                    <h3 style="text-align: center">Товары</h3>
                </div>
                <table style="border-collapse: collapse; border: 1px solid black;">
					<tr">
						<td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">Наименование</td>
						<td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">Артикул</td>
						<td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">Описание</td>
						<td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">Кол-во</td>
						<td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">Цена (руб)</td>
					</tr>

                <#list allItemsView as itemView>
                    <tr style="margin: 1px; border: 1px solid black">
                    <#list itemView as inf>

                        <#if inf == "style_centre">
                            <td align="center" style="padding: 3px; margin: 1px; border: 1px solid black">${inf}${inf}</td>
                        <#else>
                            <td style="padding: 3px; margin: 1px; border: 1px solid black">${inf}</td>
                        </#if>
                    </#list>
                        <#--<#assign delete_item="/basket/delete_item/" + user_id + "/" +/>-->
                        <#--<td style="padding: 3px; margin: 1px; border: 1px solid black"><a href="${url}">Удалить</a></td>-->
                    </tr>
                </#list>
				</table>
            </div>
        </div>
    </div>
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