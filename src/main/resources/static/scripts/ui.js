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

/////////////////////
///SposibDruku///////
/////////////////////

    getSposibDrukuById(1, function( response ) {
        console.log(response);
        $('body').text(response);
    });


    getAllSposibDruku(function( response ) {
        console.log(response);
        $('body').text(response);
    })

    getSposibDrukuById("журнал", function( response ) {
        console.log(response);
        $('body').text(response);
    });

///////////////////
///VydObkladynky///
///////////////////
    getVydObkladynkyById(1, function( response ) {
        console.log(response);
        $('body').text(response);
    });


    getAllVydObkladynky(function( response ) {
        console.log(response);
        $('body').text(response);
    })


///////////////////
///VydRoboty///////
///////////////////

    getVydRobotyById(1, function( response ) {
    console.log(response);
    $('body').text(response);
});


getAllVydRoboty(function( response ) {
    console.log(response);
    $('body').text(response);
});

///////////////////
///VydVydannia/////
///////////////////

    getVydVydanniaById(1, function( response ) {
        console.log(response);
        $('body').text(response);
    });


    getAllVydVydannia(function( response ) {
        console.log(response);
        $('body').text(response);
    });


});

