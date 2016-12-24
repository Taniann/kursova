// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

     getAllSposibDruku(function (response) {
                console.log("filling table with data..." + JSON.stringify(response))
                $("#tableSposibDruku").DataTable( {
                    responsive: true,
                    "processing": true,
                    "bAutoWidth" : false,
                    "aaData": response,
                    "columns" : [ {
                        "data" : "idSposobuDruku"
                    }, {
                        "data" : "nazvaSposobuDruku"
                    } ]
                } );
            });
});