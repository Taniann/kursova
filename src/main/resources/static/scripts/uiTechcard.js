var editorCreate;
var editorEdit;
var editorDelete;
var trToRemove;

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

            initComplete: function () {
                this.api().columns().every( function () {
                    var column = this;
                    var select = $('<select><option value=""></option></select>')
                        .appendTo( $(column.footer()).empty() )
                        .on( 'change', function () {
                            var val = $.fn.dataTable.util.escapeRegex(
                                $(this).val()
                            );

                            column
                                .search( val ? '^'+val+'$' : '', true, false )
                                .draw();
                        } );

                    column.data().unique().sort().each( function ( d, j ) {
                        select.append( '<option value="'+d+'">'+d+'</option>' )
                    } );
                } );
            },
            responsive: true,
            "processing": true,
            "bAutoWidth" : false,
            "aaData": response,
            "columns" : [ {
                "data" : "idTechCarty"
            }, {
                "data" : {
                    _:    "infoProVydannia.korotkaNazva"
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
                    _:    "vydRoboty.nazvaVyduRoboty"
                }
            } , {
                data: null,
                defaultContent: '<a href="#" class="remove">Delete</a>',
                orderable: false
            }],
            select: true,
            buttons: [
                { extend: "create", editor: editorCreate },
                { extend: "edit",   editor: editorEdit },
                { extend: "remove", editor: editorDelete }
            ]
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


    editorCreate = new $.fn.dataTable.Editor( {
        ajax: {
            url: "http://localhost:8080/techcards/add",
            type: 'POST',
            contentType: 'application/json',
            'data':  function ( d ) {
                return JSON.stringify(d.data[Object.keys(d.data)[0]]);
            }
            //processData: false, // important so the raw data makes it to the beforeSend handler
            //beforeSend:function(  jqXHR,  settings )
            //{
            //    /// <summary>
            //    /// Converts to json for transmission and adds any extra data desired.
            //    /// </summary>
            //    /// <param name="jqXHR">The jqXHR object.</param>
            //    /// <param name="settings">The settings object.</param>
            //    /// <param name="data">The data that will be sent to the server.</param>
            //
            //    var data = settings.data;
            //
            //    // I postponed the serialization as long as possible, so this is the
            //    // last chance to attach extra data to send along
            //    //data.extraData = extraData;
            //
            //
            //    settings.data = JSON.stringify({ WebMethodParameterName: data });
            //    console.log("Going to send: " + settings.data);
            //}
        },
        table: "#tableTechcard",
        idSrc: "idTechCarty",
        fields: [ {
            label: "№ Техкартки:",
            name: "idTechCarty"
        }, {
            label: "№ Видання:",
            name: "infoProVydannia.korotkaNazva",
            type: "select",
            options:getAllInfoProVydanniaNames()
        }, {
            label: "Виконавець:",
            name: "osobystaInfoVykonavtsia.pib",
            type: "select",
            options: getAllOsobystaInfoVykonavtsiaNames()
        }, {
            label: "Термін початку:",
            name: "terminPochatku",
            type: "datetime"
        }, {
            label: "Термін закінчення:",
            name: "terminZakinchennia",
            type: "datetime"
        }, {
            label: "Фактичний початок:",
            name: "factychnyiPochatok",
            type: "datetime"
        }, {
            label: "Фактичний кінець:",
            name: "factychnyiKinec",
            type: "datetime"
        },{
            label: "Вартість роботи:",
            name: "vartistRoboty"
        },{
            label: "Вартість друку:",
            name: "vartistDruku"
        },{
            label: "Сумарна вартість:",
            name: "sumVartist"
        },{
            label: "Вид роботи:",
            name: "vydRoboty.nazvaVyduRoboty",
            type: "select",
            options: getAllVydRobotyNames()
        }
        ],
        formOptions: {
            bubble: {
                title: 'Edit',
                buttons: false,
                submit: 'allIfChanged'
            },
            submit: 'allIfChanged'
        }
    } );

    editorEdit = new $.fn.dataTable.Editor( {
        ajax: {
            url: "http://localhost:8080/techcards/edit",
            type: 'POST',
            contentType: 'application/json',
            'data':  function ( d ) {
                return JSON.stringify(d.data[Object.keys(d.data)[0]]);
            }
            //processData: false, // important so the raw data makes it to the beforeSend handler
            //beforeSend:function(  jqXHR,  settings )
            //{
            //    /// <summary>
            //    /// Converts to json for transmission and adds any extra data desired.
            //    /// </summary>
            //    /// <param name="jqXHR">The jqXHR object.</param>
            //    /// <param name="settings">The settings object.</param>
            //    /// <param name="data">The data that will be sent to the server.</param>
            //
            //    var data = settings.data;
            //
            //    // I postponed the serialization as long as possible, so this is the
            //    // last chance to attach extra data to send along
            //    //data.extraData = extraData;
            //
            //
            //    settings.data = JSON.stringify({ WebMethodParameterName: data });
            //    console.log("Going to send: " + settings.data);
            //}
        },
        table: "#tableTechcard",
        idSrc: "idTechCarty",
        fields: [ {
            label: "№ Техкартки:",
            name: "idTechCarty"
        }, {
            label: "Last name:",
            name: "infoProVydannia.korotkaNazva"
        }, {
            label: "Position:",
            name: "osobystaInfoVykonavtsia.pib"
        }, {
            label: "Office:",
            name: "terminPochatku",
            type: "datetime"
        }, {
            label: "Extension:",
            name: "terminZakinchennia",
            type: "datetime"
        }, {
            label: "Start date:",
            name: "factychnyiPochatok",
            type: "datetime"
        }, {
            label: "Start date:",
            name: "factychnyiKinec",
            type: "datetime"
        },{
            label: "Salary:",
            name: "vartistRoboty"
        },{
            label: "Salary:",
            name: "vartistDruku"
        },{
            label: "Salary:",
            name: "sumVartist"
        },{
            label: "Salary:",
            name: "vydRoboty.nazvaVyduRoboty"
        }
        ],
        formOptions: {
            bubble: {
                title: 'Edit',
                buttons: false,
                submit: 'allIfChanged'
            },
            submit: 'allIfChanged'
        }
    } );

    editorDelete = new $.fn.dataTable.Editor( {
        ajax: {
            url: "http://localhost:8080/techcards/delete",
            type: 'POST',
            contentType: 'application/json',
            'data':  function ( d ) {
                return JSON.stringify(d.data[Object.keys(d.data)[0]]);
            }
            //processData: false, // important so the raw data makes it to the beforeSend handler
            //beforeSend:function(  jqXHR,  settings )
            //{
            //    /// <summary>
            //    /// Converts to json for transmission and adds any extra data desired.
            //    /// </summary>
            //    /// <param name="jqXHR">The jqXHR object.</param>
            //    /// <param name="settings">The settings object.</param>
            //    /// <param name="data">The data that will be sent to the server.</param>
            //
            //    var data = settings.data;
            //
            //    // I postponed the serialization as long as possible, so this is the
            //    // last chance to attach extra data to send along
            //    //data.extraData = extraData;
            //
            //
            //    settings.data = JSON.stringify({ WebMethodParameterName: data });
            //    console.log("Going to send: " + settings.data);
            //}
        },
        table: "#tableTechcard",
        idSrc: "idTechCarty",
        fields: [ {
            label: "№ Техкартки:",
            name: "idTechCarty"
        }, {
            label: "Last name:",
            name: "infoProVydannia.korotkaNazva"
        }, {
            label: "Position:",
            name: "osobystaInfoVykonavtsia.pib"
        }, {
            label: "Office:",
            name: "terminPochatku",
            type: "datetime"
        }, {
            label: "Extension:",
            name: "terminZakinchennia",
            type: "datetime"
        }, {
            label: "Start date:",
            name: "factychnyiPochatok",
            type: "datetime"
        }, {
            label: "Start date:",
            name: "factychnyiKinec",
            type: "datetime"
        },{
            label: "Salary:",
            name: "vartistRoboty"
        },{
            label: "Salary:",
            name: "vartistDruku"
        },{
            label: "Salary:",
            name: "sumVartist"
        },{
            label: "Salary:",
            name: "vydRoboty.nazvaVyduRoboty"
        }
        ]
    } );


    $('button.new').on( 'click', function () {
        editorCreate
            .title( 'Create new row' )
            .buttons( { "label": "Add", "fn": function () { editorCreate.submit() } } )
            .create();
    } );

    $('#tableTechcard').on( 'click', 'tbody td', function (e) {
        if ( $(this).index() < 12 ) {
            editorEdit.bubble( this );
        }
    } );

    $('#tableTechcard').on( 'click', 'a.remove', function (e) {
        trToRemove = $(this).closest('tr:has(*[role])').find('td:first').text();
        editorDelete
            .title( 'Delete row' )
            .message( 'Are you sure you wish to delete this row?' )
            .buttons( { "label": "Delete", "fn": function () { editorDelete.submit() } } )
            .remove( $(this).closest('tr') );
    } );

    //$('#tableTechcard').DataTable( {
    //    ajax: "../php/staff.php",
    //    columns: [
    //        { data: "first_name" },
    //        { data: "last_name" },
    //        { data: "position" },
    //        { data: "office" },
    //        { data: "start_date" },
    //        { data: "salary", render: $.fn.dataTable.render.number( ',', '.', 0, '$' ) },
    //        {
    //            data: null,
    //            defaultContent: '<a href="#" class="remove">Delete</a>',
    //            orderable: false
    //        },
    //    ]
    //} );



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

