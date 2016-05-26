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
                        <li class="active">Вход</li>
                    </ul>
                </div>
            </div>
        </div>
    </section>

    <div class="container">
        <div class="row">
            <br><br><br>
            <div class="col-lg-4 col-lg-offset-4 col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1">
                <div id="res"></div>
                <div id="accordion" class="panel-group">
                    <div class="panel panel-default" style="vertical-align: middle;">
                        <div class="panel-heading">
                            <h2 class="panel-title" style="text-align: center;">
                                <b>Вход</b>
                            </h2>
                        </div>
                        <div class="panel-collapse collapse in">
                            <div class="panel-body">
                                <form method="post" action="/login/process">
                                    <fieldset>
                                    <#if error??>
                                        <p style='color: red'>Неверный логин или пароль</p>
                                    </#if>
                                        <label for='login'>Логин:</label><br>
                                        <input type="text" class="form-control" name="username" id="username" style="margin: 1px 0px 7px 0px" required autofocus/>
                                        <label for='password' style="margin-top: 5px">Пароль:</label><br>
                                        <input type="password" name="password" id="password" class="form-control" style="margin: 1px 0px 7px 0px" required/>
                                        <input type="checkbox" name="remember-me" id="remember-me" style="margin: 1px 0px 7px 0px" checked/>
                                        <label for="remember-me">Запомнить меня</label><br>
                                        <div style="text-align: center; margin-top: 5px">
                                            <input type="submit" id='reg' class="btn btn-theme" style="margin: 1px 0px 7px 0px" value="Войти"/>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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
<script src="/js/validate.js"></script>
</body>
</html>