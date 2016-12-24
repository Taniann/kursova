// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

   getAllFormat(function (response) {
            console.log("filling table with data..." + JSON.stringify(response))
            $("#tableFormat").DataTable( {
                responsive: true,
                "processing": true,
                "bAutoWidth" : false,
                "aaData": response,
                "columns" : [ {
                    "data" : "idFormatu"
                }, {
                    "data" : "nazvaFormatu"
                }, {
                    "data" : "vartistFormatu"
                } ]
            } );
        });

});