// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

       getAllOsobystaInfoVykonavtsia(function (response) {
             console.log("filling table with data..." + JSON.stringify(response))
             $("#tableOsobystaInfoVykonavtsia").DataTable( {
                 responsive: true,
                 "processing": true,
                 "bAutoWidth" : false,
                 "aaData": response,
                 "columns" : [ {
                     "data" : "idVykonavcia"
                 },{
                     "data" : "identyfKod"
                 }, {
                     "data" : "pib"
                 }, {
                     "data" : "pasport"
                 }, {
                     "data" : "adresa"
                 }, {
                     "data" : "telephone"
                 }, {
                     "data" : "dataNarodzhenia"
                 },{
                     "data" : "dataPryiomuNaRobotu"
                 },{
                     "data" : "zarPlata"
                 } ]
             } );
         });

});