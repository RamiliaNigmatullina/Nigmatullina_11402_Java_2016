function check_password() {
    var regex = /([A-Z]+[0-9A-Z]*[a-z]+[A-Za-z]*[0-9]+|[a-z]+[A-Za-z]*[0-9]+[a-z0-9]*[A-Z]+|[0-9]+[A-Z0-9]*[a-z]+[0-9a-z]*[A-Z]+|[0-9]+[a-z0-9]*[A-Z]+[A-Z0-9]*[a-z]+|[A-Z]+[a-zA-Z]*[0-9]+[A-Z0-9]*[a-z]+|[a-z]+[a-z0-9]*[A-Z]+[A-Za-z]*[0-9]+)/;
    var reg = document.getElementById("reg");
    if ($("#password").val().length > 0) {
        if (!$("#password").val().match(regex) || $("#password").val().length < 6) {
            $.ajax({
                success: function (resp) {
                    $("#wrongPassword").text("Ваш пароль должен содержать заглавные и маленькие буквы. Длина пароля должны быть не менее шести символов.")
                    reg.disabled = true;
                }
            });
        } else {
            $("#wrongPassword").text("")
            reg.disabled = false;
        }
    } else {
        $("#wrongPassword").text("Введите пароль.")
        reg.disabled = true;
    }
}

function check_postcode() {
    var regex = /([0-9]+)/;
    var reg = document.getElementById("wrPostcode");
    if ($("#postcode").val().length > 0) {
        if (!$("#postcode").val().match(regex)) {
            $.ajax({
                success: function (resp) {
                    $("#wrongPostcode").text("Почтовый индекс должен содержать только цифры.")
                    reg.disabled = true;
                }
            });
        } else {
            $("#wrongPostcode").text("")
            reg.disabled = false;
        }
    }
}


function check_login(request, response) {
    var reg = document.getElementById("reg");
    if ($("#username").val().length > 0)
        $.ajax({
            url: "/check_login",
            data: {"q": $("#username").val()},
            dataType: "json",
            success: function (resp) {
                if (resp.results.length > 0) {
                    $("#loginExists").text("Логин уже занят.");
                    reg.disabled = true;
                } else {
                    $("#loginExists").text("");
                    reg.disabled = false;
                }
            }
        });
    else {
        $("#loginExists").text("");
        reg.disabled = false;
    }
}

function vk_link() {
    var regex = /^(http:[/][/])?vk.com[/].+/;

    if ($("#vk").val().length > 0) {
        if (!$("#vk").val().match(regex)) {
            $.ajax({
                success: function (resp) {
                    $("#brokenLink").text("Вставьте ссылку на страницу ВКонтакте.")
                }
            });
        } else {
            $("#brokenLink").text("")
        }
    } else {
        $("#brokenLink").text("")
    }
}