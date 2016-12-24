// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

    getAllTechcard(function (response) {
        console.log("filling table with data..." + JSON.stringify(response))
        $("#dataTables-example").DataTable( {
            responsive: true,
            "processing": true,
            "bAutoWidth" : false,
            "aaData": response,
            "columns" : [ {
                "data" : "idTechCarty"
            }, {
                "data" : {
                    _:    "infoProVydannia.idVydannia"
                }
            }, {
                "data" : {
                    _:    "osobystaInfoVykonavtsia.pib"
                }
            }, {
                "data" : "terminPochatku"
            }, {
                "data" : "terminZakinchennia"
            } , {
                "data" : "factychnyiPochatok"
            } , {
                "data" : "factychnyiKinec"
            } , {
                "data" : "terminPochatku"
            } , {
                "data" : "vartistRoboty"
            } , {
                "data" : "vartistDruku"
            } , {
                "data" : "sumVartist"
            } , {
                "data" : "vydRoboty"
            }  ]
        } );

    });




//    getTechcardById(1, function( response ) {
//        console.log(response);
//        $('body').text(response);
//    })
//
//
//    getAllTechcard(function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//    getAllTechcardByInfoProVydannia(1,function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
///////////////////////
/////SposibDruku///////
///////////////////////
//
//    getSposibDrukuById(1, function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
//    getAllSposibDruku(function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//    getOneSposibDrukuByNazvaSposobuDruku("Цифровая печать", function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//    ///////////////////
//    ///Format//////////
//    ///////////////////
//
//     getFormatById(1, function( response ) {
//            console.log(response);
//            $('body').text(response);
//        });
//
//
//     getAllFormat(function( response ) {
//            console.log(response);
//            $('body').text(response);
//        });
//
//     //////////////////////////////
//     ///InfoProAvtora///
//     ////////////////////////////
//
//     getInfoProAvtoraById(1, function( response ) {
//             console.log(response);
//             $('body').text(response);
//        });
//
//
//     getAllInfoProAvtora(function( response ) {
//             console.log(response);
//             $('body').text(response);
//         });
//
//
//      //////////////////////////////
//     ///InfoProVydannia///
//     ////////////////////////////
//
//     getInfoProVydanniaById(1, function( response ) {
//              console.log(response);
//              $('body').text(response);
//         });
//
//
//      getAllInfoProVydannia(function( response ) {
//               console.log(response);
//                $('body').text(response);
//          });
//
//
//     ///////////////////
//    ///Pidrozdil///////
//    ///////////////////
//
//     getPidrozdilById(1, function( response ) {
//             console.log(response);
//             $('body').text(response);
//         });
//
//
//      getAllPidrozdil(function( response ) {
//              console.log(response);
//              $('body').text(response);
//         });
//
//     //////////////////////////////
//     ///OsobystaInfoVykonavtsia///
//     ////////////////////////////
//
//     getOsobystaInfoVykonavtsiaById(1, function( response ) {
//              console.log(response);
//              $('body').text(response);
//         });
//
//
//     getAllOsobystaInfoVykonavtsia(function( response ) {
//              console.log(response);
//              $('body').text(response);
//         });
//
//
//
/////////////////////
/////VydObkladynky///
/////////////////////
//    getVydObkladynkyById(1, function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
//    getAllVydObkladynky(function( response ) {
//        console.log(response);
//        $('body').text(response);
//    })
//
//    getOneVydObkladynkyByNazvaVyduObkladynky("твердая", function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
//
/////////////////////
/////VydRoboty///////
/////////////////////
//
//    getVydRobotyById(1, function( response ) {
//    console.log(response);
//    $('body').text(response);
//});
//
//
//getAllVydRoboty(function( response ) {
//    console.log(response);
//    $('body').text(response);
//});
//
//    getOneVydyRobotyByNazvaVyduRoboty("редактирование", function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
/////////////////////
/////VydVydannia/////
/////////////////////
//
//    getVydVydanniaById(1, function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
//    getAllVydVydannia(function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });
//
//
//    getOneVydVydanniaByNazvaVyduVydannia("журнал", function( response ) {
//        console.log(response);
//        $('body').text(response);
//    });


});

