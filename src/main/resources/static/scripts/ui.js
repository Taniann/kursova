// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

    getTechcardById(1, function( response ) {
        console.log(response);
        $('body').text(response);
    })


    getAllTechcard(function( response ) {
        console.log(response);
        $('body').text(response);
    });

    getAllTechcardByInfoProVydannia(1,function( response ) {
        console.log(response);
        $('body').text(response);
    });

    getSposibDrukuById(1, function( response ) {
        console.log(response);
        $('body').text(response);
    });


    getAllSposibDruku(function( response ) {
        console.log(response);
        $('body').text(response);
    })

});

