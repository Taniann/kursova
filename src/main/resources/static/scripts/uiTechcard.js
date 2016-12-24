
/* Custom filtering function which will search data in column four between two values */
$.fn.dataTable.ext.search.push(
    function( settings, data, dataIndex ) {
        var min = Date.parse( $('#min3').val());
        var max = Date.parse( $('#max3').val());
        var age = Date.parse( data[3] ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && age <= max ) ||
            ( min <= age   && isNaN( max ) ) ||
            ( min <= age   && age <= max ) )
        {
            return true;
        }
        return false;
    }
);
$.fn.dataTable.ext.search.push(
    function( settings, data, dataIndex ) {
        var min = Date.parse( $('#min4').val());
        var max = Date.parse( $('#max4').val());
        var age = Date.parse( data[4] ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && age <= max ) ||
            ( min <= age   && isNaN( max ) ) ||
            ( min <= age   && age <= max ) )
        {
            return true;
        }
        return false;
    }
);
$.fn.dataTable.ext.search.push(
    function( settings, data, dataIndex ) {
        var min = Date.parse( $('#min5').val());
        var max = Date.parse( $('#max5').val());
        var age = Date.parse( data[5] ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && age <= max ) ||
            ( min <= age   && isNaN( max ) ) ||
            ( min <= age   && age <= max ) )
        {
            return true;
        }
        return false;
    }
);
$.fn.dataTable.ext.search.push(
    function( settings, data, dataIndex ) {
        var min = Date.parse( $('#min6').val());
        var max = Date.parse( $('#max6').val());
        var age = Date.parse( data[6] ) || 0; // use data for the age column

        if ( ( isNaN( min ) && isNaN( max ) ) ||
            ( isNaN( min ) && age <= max ) ||
            ( min <= age   && isNaN( max ) ) ||
            ( min <= age   && age <= max ) )
        {
            return true;
        }
        return false;
    }
);
// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");
    var table;

    getAllTechcard(function (response) {
        console.log("filling table with data..." + JSON.stringify(response))
        table = $("#tableTechcard").DataTable( {
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
                "data" : "vartistRoboty"
            } , {
                "data" : "vartistDruku"
            } , {
                "data" : "sumVartist"
            } , {
                "data" : {
                    _:    "VydRoboty.nazvaVyduRoboty"
                }
            }]
        } );

    });



    // Event listener to the two range filtering inputs to redraw on input
    $('#min3, #max3').keyup( function() {
        table.draw();
    } );

    $('#min4, #max4').keyup( function() {
        table.draw();
    } );

    $('#min5, #max5').keyup( function() {
        table.draw();
    } );

    $('#min6, #max6').keyup( function() {
        table.draw();
    } );





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

