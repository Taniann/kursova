// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

     getAllPidrozdil(function (response) {
                console.log("filling table with data..." + JSON.stringify(response))
                $("#dataTables-example").DataTable( {
                    responsive: true,
                    "processing": true,
                    "bAutoWidth" : false,
                    "aaData": response,
                    "columns" : [ {
                        "data" : "idPidrozdilu"
                    }, {
                        "data" : "nazvaPidrozdilu"
                    } ]
                } );
            });


});