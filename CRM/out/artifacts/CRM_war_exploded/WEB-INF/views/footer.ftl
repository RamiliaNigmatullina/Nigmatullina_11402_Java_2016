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
                        <li><a href="/catalog">Напольные шкафы</a></li>
                        <li><a href="/catalog">Шкафы для встраиваемой техники</a></li>
                        <li><a href="/catalog">Фронтальные панели</a></li>
                        <li><a href="/catalog">Высокие шкафы</a></li>
                        <li><a href="/catalog">Навесные шкафы</a></li>
                        <li><a href="/catalog">Ножки</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3">
                <div class="widget">
                    <h5 class="widgetheading">Клиентам</h5>
                    <ul class="link-list">
                    <@security.authorize ifAnyGranted="ROLE_USER">
                        <li><a href="/user/callgager">Вызов замерщика</a></li>
                    </@security.authorize>
                        <li><a href="/company/info">Информация</a></li>
                        <li><a href="/company/career">Карьера</a></li>
                        <li><a href="/company/guarantee">Гарантия</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3">
                <div class="widget">
                    <h5 class="widgetheading">Свяжитесь с нами</h5>
                    <p>Email: zetta@gmail.com</p>
                    <p>Телефон: 8 (495) 133-95-50</p>
                    <a href="generate/pdf.htm" target="_blank">Скачать информацию</a>
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
                            <span>&copy; Copyright © 2016 Zetta. All rights reserved. </span> <a href="http://bootstraptaste.com/">Bootstrap Themes</a> by BootstrapTaste
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>