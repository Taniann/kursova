// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

     getAllVydObkladynky(function (response) {
                console.log("filling table with data..." + JSON.stringify(response))
                $("#tableVydObkladynky").DataTable( {
                    responsive: true,
                    "processing": true,
                    "bAutoWidth" : false,
                    "aaData": response,
                    "columns" : [ {
                        "data" : "idVydObkladynky"
                    }, {
                        "data" : "nazvaVyduObkladynky"
                    } ]
                } );
            });
});