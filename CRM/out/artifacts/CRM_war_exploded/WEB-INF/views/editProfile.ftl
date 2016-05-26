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
                        <li><a href="/user/editprofile">Редактровать личную информацию</a><i class="icon-angle-right"></i></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2 col-sm-10 col-sm-offset-1 col-xs-12 col-xs-offset-0">
                <div id="res"></div>
                <br>
                <form method="post" action="/user/editprofile" role="form">
                    <h4 style="text-align: center">Личная информаця</h4>
                    <br>
                    <table style="width: 70%">
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="firstName">Имя:</label></td>
                            <td style="width: 40%">
                                <input type="text" name="firstName" id="firstName" class="form-control" value="${user.firstName}" style="margin: 1px 0px 7px 0px" required autofocus/>
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="lastName">Фамилия:</label></td>
                            <td style="width: 40%">
                                <input type="text" name="lastName" id="lastName" class="form-control" value="${user.lastName}" style="margin: 1px 0px 7px 0px" required />
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="email">Email:</label></td>
                            <td style="width: 40%">
                                <input type="text" name="email" id="email" class="form-control" value="${user.email}" style="margin: 1px 0px 7px 0px" required />
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="phoneNumber">Телефон:</label></td>
                            <td style="width: 40%">
                            <#if user.phoneNumber?? && user.phoneNumber?has_content>
                                <input type="text" name="phoneNumber" id="phoneNumber" class="form-control" style="margin: 1px 0px 7px 0px" value="${user.phoneNumber}" />
                            <#else>
                                <input type="text" name="phoneNumber" id="phoneNumber" class="form-control" style="margin: 1px 0px 7px 0px"/>
                            </#if>
                            </td>
                        </tr>

                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="creditCardNumber">Номер карты:</label></td>
                            <#--<td><div id="wrongCreditCardNumber" style="color: red"></div></td>-->
                            <td style="width: 40%">
                            <#if user.creditCardNumber?? && user.creditCardNumber?has_content>
                                <#--oninput="creditCardNumber()"-->
                                <input type="text" name="creditCardNumber" id="creditCardNumber" class="form-control" style="margin: 1px 0px 7px 0px" value="${user.creditCardNumber}"/>
                            <#else>
                                <input type="text" name="creditCardNumber" id="creditCardNumber" class="form-control" style="margin: 1px 0px 7px 0px"/>
                            </#if>
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="postcode">Почтовый индекс:</label></td>
                            <#--<div id="wrPostcode" style="color: red"></div>-->
                            <td style="width: 40%">
                            <#if user.postcode?? && user.postcode?has_content>
                                <input type="text" name="postcode" id="postcode" class="form-control" style="margin: 1px 0px 7px 0px" value="${user.postcode}"/>
                            <#else>
                                <input type="text" name="postcode" id="postcode" class="form-control" style="margin: 1px 0px 7px 0px"/>
                            </#if>
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="passportID">Серия и номер паспорта:</label></td>
                            <td style="width: 40%">
                            <#if user.passportID?? && user.passportID?has_content>
                                <input type="text" name="passportID" id="passportID" class="form-control" style="margin: 1px 0px 7px 0px" value="${user.passportID}"/>
                            <#else>
                                <input type="text" name="passportID" id="passportID" class="form-control" style="margin: 1px 0px 7px 0px"/>
                            </#if>
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="address">Адрес:</label></td>
                            <td style="width: 40%">
                            <#if user.address?? && user.address?has_content>
                                <input type="text" name="address" id="address" class="form-control" style="margin: 1px 0px 7px 0px" value="${user.address}"/>
                            <#else>
                                <input type="text" name="address" id="address" class="form-control" style="margin: 1px 0px 7px 0px"/>
                            </#if>
                            </td>
                        </tr>
                        <tr>
                            <td style="width: 30%; text-align: right; padding-right: 20px"><label for="information">Информация:</label></td>
                            <td style="width: 40%">
                            <#if user.information?? && user.information?has_content>
                                <textarea name="information" id="information" rows="3" class="form-control" style="margin: 1px 0px 7px 0px">${user.information}</textarea>
                            <#else>
                                <textarea name="information" id="information" rows="3" class="form-control" style="margin: 1px 0px 7px 0px"></textarea>
                            </#if>
                            </td>
                        </tr>
                    </table>
                    <div style="margin-top: 5px; text-align: center">
                        <input type="submit" class="btn btn-success" style="margin: 1px 0px 7px 0px" value="Сохранить"/>
                        <a href="/user/profile" class="btn btn-primary" style="margin: 1px 0px 7px 0px">Отмена</a>
                    </div>
                </form>
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
<script src="/js/check.js"></script>
</body>
</html>