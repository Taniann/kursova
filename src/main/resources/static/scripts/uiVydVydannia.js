// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

     getAllVydVydannia(function (response) {
                console.log("filling table with data..." + JSON.stringify(response))
                $("#tableVydVydannia").DataTable( {
                    responsive: true,
                    "processing": true,
                    "bAutoWidth" : false,
                    "aaData": response,
                    "columns" : [ {
                        "data" : "idVydVydannia"
                    }, {
                        "data" : "nazvaVyduVydannia"
                    } ]
                } );
            });
});