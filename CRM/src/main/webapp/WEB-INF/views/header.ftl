<#assign security=JspTaglibs["http://www.springframework.org/security/tags"]/>
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
                    <li><a href="/catalog">Каталог</a></li>
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
                <@security.authorize ifAnyGranted="ROLE_USER">
                    <li><a href="/basket">Корзина</a></li>
                    <li><a href="/user/profile">Моя страница</a></li>
                </@security.authorize>
                <@security.authorize ifAnyGranted="ROLE_ANONYMOUS">
                    <li><a href="/login">Вход</a></li>
                    <li><a href="/join">Регистрация</a></li>
                </@security.authorize>
                <@security.authorize access="isAuthenticated()">
                    <li><a href="/logout">Выход</a></li>
                </@security.authorize>
                </ul>
            </div>
        </div>
    </div>
</header>
<!-- end header -->