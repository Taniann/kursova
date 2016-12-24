// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

getAllInfoProVydannia(function (response) {
        console.log("filling table with data..." + JSON.stringify(response))
        $("#tableInfoProVydannia").DataTable( {
            responsive: true,
            //"processing": true,
            //"bAutoWidth" : false,
            "aaData": response,
            "columns" : [ {
                "data" : "idVydannia"
            }, {
                "data" : "povnaNazva"
            }, {
                "data" : "korotkaNazva"
            },{
                "data" : {
                    _:    "vydVydannia.idVydVydannia"
                }
            }, {
                "data" : "kilkistStorinok"
               }, {
                "data" : {
                    _:    "vydObkladynky.idVydObkladynky"
                }
            }, {
                "data" : "tyrazh"
            }, {
                "data" : "format"
            } , {
                "data" : "sposibDruku"
            } , {
                "data" : "infoProAvtora1"
            } , {
                "data" : "infoProAvtora2"
            } , {
                "data" : "infoProAvtora3"
            }  ]
        } );
    console.log("Filled!")
    });

});