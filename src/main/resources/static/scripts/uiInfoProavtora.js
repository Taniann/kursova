// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

   getAllInfoProAvtora(function (response) {
             console.log("filling table with data..." + JSON.stringify(response))
             $("#dataTables-example").DataTable( {
                 responsive: true,
                 "processing": true,
                 "bAutoWidth" : false,
                 "aaData": response,
                 "columns" : [ {
                     "data" : "idAvtora"
                 }, {
                     "data" : "prizvyshche"
                 }, {
                     "data" : "imiia"
                 },{
                     "data" : "pobatkovi"
                 }, {
                     "data" : "adresa"
                 } , {
                     "data" : "telephone"
                 } , {
                     "data" : "prymitky"
                 }]
             } );
         });
});