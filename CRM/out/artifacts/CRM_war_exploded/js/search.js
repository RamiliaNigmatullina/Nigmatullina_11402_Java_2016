function f(request, response) {
    if ($("#s").val().length > 0)
        $.ajax({
            url: "/search",
            data: {"q": $("#s").val()},
            dataType: "json",
            success: function (resp) {
                if (resp.results.length > 0) {
                    $("#res").html("<h4>Результаты поиска:</h4>");
                    for (var i = 0; i < resp.results.length; i = i + 2) {
                        $("#res").append("<li><a tabindex='-1' href='" + resp.results[i + 1] + "'>" + resp.results[i] + "</a></li>");
                    }
                } else {
                    $("#res").html("<h4>Результаты не найдены.</h4>");
                }
            }
        });
    else
        $("#res").text("");
}