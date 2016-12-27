// A $( document ).ready() block.




////***************************/////////////////////////////
var editorCreate;
var editorEdit;
var editorDelete;
var trToRemove;

/* Custom filtering function which will search data in column four between two values */

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

// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");
    var table;

    getAllRahunok(function (response) {
        console.log("filling table with data..." + JSON.stringify(response))
        table = $("#tableRahunok").DataTable( {

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
            },{
                data: null,
                defaultContent: '<a href="#" class="remove">Delete</a>',
                orderable: false
            } ],
            select: true,
            buttons: [
                { extend: "create", editor: editorCreate },
                { extend: "edit",   editor: editorEdit },
                { extend: "remove", editor: editorDelete }
            ]
        } );

    });

    // Event listener to the two range filtering inputs to redraw on input


    $('#min5, #max5').keyup( function() {
        table.draw();
    } );




    editorCreate = new $.fn.dataTable.Editor( {
        ajax: {
            url: "http://localhost:8080/rahunky/add",
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
        table: "#tableRahunok",
        idSrc: "idRahunku",
        fields: [{
            label: "№ Техкартки:",
            name: "techcard.idTechCarty",
            type: "select",
            options: getAllTechcardNames()
        }, {
            label: "Дата виписки:",
            name: "dataVypysky",
            type: "datetime"
        }, {
            label: "Всього до сплати:",
            name: "vsohoDoSplaty"
        }, {
            label: "Замовник:",
            name: "zamovnyk"
        }, {
            label: "Дата сплати:",
            name: "dataSplaty",
            type: "datetime"
        }, {
            label: "Платіжне доручення:",
            name: "platizhneDoruchennia"
        }, {
            label: "Вартість послуг:",
            name: "vartistPosluh"
        },{
            label: "Вартість матеріалів:",
            name: "vartistMaterialiv"
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
            url: "http://localhost:8080/rahunky/edit",
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
        table: "#tableRahunok",
        idSrc: "idRahunku",
        fields: [ {
            label: "№ Рахунку:",
            name: "idRahunku"
        }, {
            label: "№ Техкартки:",
            name: "techcard.idTechCarty"
        }, {
            label: "Дата виписки:",
            name: "dataVypysky",
            type: "datetime"
        }, {
            label: "Всього до сплати:",
            name: "vsohoDoSplaty"
        }, {
            label: "Замовник:",
            name: "zamovnyk"
        }, {
            label: "Дата сплати:",
            name: "dataSplaty",
            type: "datetime"
        }, {
            label: "Платіжне доручення:",
            name: "platizhneDoruchennia"
        }, {
            label: "Вартість послуг:",
            name: "vartistPosluh"
        },{
            label: "Вартість матеріалів:",
            name: "vartistMaterialiv"
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
            url: "http://localhost:8080/rahunky/delete",
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
        table: "#tableRahunok",
        idSrc: "idRahunku",
        fields: [ {
            label: "№ Рахунку:",
            name: "idRahunku"
        }, {
            label: "№ Техкартки:",
            name: "techcard.idTechCarty"
        }, {
            label: "Дата виписки:",
            name: "dataVypysky",
            type: "datetime"
        }, {
            label: "Всього до сплати:",
            name: "vsohoDoSplaty"
        }, {
            label: "Замовник:",
            name: "zamovnyk"
        }, {
            label: "Дата сплати:",
            name: "dataSplaty",
            type: "datetime"
        }, {
            label: "Платіжне доручення:",
            name: "platizhneDoruchennia"
        }, {
            label: "Вартість послуг:",
            name: "vartistPosluh"
        },{
            label: "Вартість матеріалів:",
            name: "vartistMaterialiv"
        }
        ]
    } );


    $('button.new').on( 'click', function () {
        editorCreate
            .title( 'Create new row' )
            .buttons( { "label": "Add", "fn": function () { editorCreate.submit() } } )
            .create();
    } );

    $('#tableRahunok').on( 'click', 'tbody td', function (e) {
        if ( $(this).index() < 12 ) {
            editorEdit.bubble( this );
        }
    } );

    $('#tableRahunok').on( 'click', 'a.remove', function (e) {
        trToRemove = $(this).closest('tr:has(*[role])').find('td:first').text();
        editorDelete
            .title( 'Видалити рядок' )
            .message( 'Ви впевнені що хочете видалити цей рядок?' )
            .buttons( { "label": "Видалити", "fn": function () { editorDelete.submit() } } )
            .remove( $(this).closest('tr') );
    } );

});