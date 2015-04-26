$(document).ready(function() {

    $('#submit').click( function() {
        $.ajax({
            url: 'http://localhost:8080/greeting',
            dataType: 'json',
            data: $('form#formoid').serialize()
        }).then(function(data) {
            $('.greeting-id').text(data.id);
            $('.greeting-content').text(data.content);
        });
    });
});
