// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

 getAllRahunok(function (response) {
             console.log("filling table with data..." + JSON.stringify(response))
             $("#tableRahunok").DataTable( {
                 responsive: true,
                 "processing": true,
                 "bAutoWidth" : false,
                 "aaData": response,
                 "columns" : [ {
                     "data" : "idRahunku"
                 },{
                     "data" : {
                      _:    "techcard.idTechCarty"
                      }
                 }, {
                     "data" : "dataVypysky"
                 }, {
                     "data" : "vsohoDoSplaty"
                 }, {
                     "data" : "zamovnyk"
                 }, {
                     "data" : "dataSplaty"
                 }, {
                     "data" : "platizhneDoruchennia"
                 }, {
                     "data" : "vartistPosluh"
                 },{
                     "data" : "vartistMaterialiv"
                 } ]
             } );
         });

});