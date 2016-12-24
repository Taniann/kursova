var hostName = "http://localhost:8080";
errorFunc = function( jqXHR, textStatus, errorThrown ){
    console.log("jqXHR = "+jqXHR+ "; textStatus = "+textStatus+"; errorThrown = "+errorThrown)
};

//////////////
///Techcard///
//////////////

function getTechcardById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/techcards/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addTechcard(techcard) {
    jQuery.ajax({
        url: hostName + '/techcards/add',
        type: 'Post',
        data: techcard,
        success: console.log("addTechcard successfully completed"),
        error: errorFunc
    });
}


function deleteTechcard(id) {
    jQuery.ajax({
        url: hostName + '/techcards/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteTechcard successfully completed"),
        error: errorFunc
    });
}

function editTechcard(techcard) {
    jQuery.ajax({
        url: hostName + '/techcards/edit',
        type: 'Post',
        data: techcard,
        success: console.log("editTechcard successfully completed"),
        error: errorFunc
    });
}

function getAllTechcard( successFunc) {
    jQuery.ajax( {
        url: hostName +'/techcards',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}


function getAllTechcardByInfoProVydannia(idVydannia, successFunc) {
    jQuery.ajax( {
        url: hostName +'/techcards/idVydannia/'+idVydannia,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

/////////////////////
///SposibDruku///////
/////////////////////
function getSposibDrukuById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/sposobyDruku/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addSposibDruku(sposibDruku) {
    jQuery.ajax({
        url: hostName + '/sposobyDruku/add',
        type: 'Post',
        data: sposibDruku,
        success: console.log("addSposibDruku successfully completed"),
        error: errorFunc
    });
}


function deleteSposibDruku(id) {
    jQuery.ajax({
        url: hostName + '/sposobyDruku/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteSposibDruku successfully completed"),
        error: errorFunc
    });
}

function editSposibDruku(sposibDruku) {
    jQuery.ajax({
        url: hostName + '/sposobyDruku/edit',
        type: 'Post',
        data: sposibDruku,
        success: console.log("editSposibDruku successfully completed"),
        error: errorFunc
    });
}

function getAllSposibDruku( successFunc) {
    jQuery.ajax({
        url: hostName + '/sposobyDruku',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    });

}

function getOneSposibDrukuByNazvaSposobuDruku(nazvaSposobuDruku, successFunc) {
    jQuery.ajax( {
        url: hostName +'/sposobyDruku/nazvaSposobuDruku/' + nazvaSposobuDruku,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}
///////////////////
///VydObkladynky///
///////////////////

function getVydObkladynkyById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyObkladynky/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addVydObkladynky(vydObkladynky) {
    jQuery.ajax({
        url: hostName + '/vydyObkladynky/add',
        type: 'Post',
        data: vydObkladynky,
        success: console.log("addVydObkladynky successfully completed"),
        error: errorFunc
    });
}


function deleteVydObkladynky(id) {
    jQuery.ajax({
        url: hostName + '/vydyObkladynky/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteVydObkladynky successfully completed"),
        error: errorFunc
    });
}

function editVydObkladynky(vydObkladynky) {
    jQuery.ajax({
        url: hostName + '/vydyObkladynky/edit',
        type: 'Post',
        data: vydObkladynky,
        success: console.log("editVydObkladynky successfully completed"),
        error: errorFunc
    });
}

function getAllVydObkladynky( successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyObkladynky',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

///////////////////
///VydRoboty///////
///////////////////

function getVydRobotyById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyRoboty/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addVydRoboty(vydRoboty) {
    jQuery.ajax({
        url: hostName + '/vydyRoboty/add',
        type: 'Post',
        data: vydRoboty,
        success: console.log("addVydRoboty successfully completed"),
        error: errorFunc
    });
}


function deleteVydRoboty(id) {
    jQuery.ajax({
        url: hostName + '/vydyRoboty/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteVydRoboty successfully completed"),
        error: errorFunc
    });
}

function editVydRoboty(vydRoboty) {
    jQuery.ajax({
        url: hostName + '/vydyRoboty/edit',
        type: 'Post',
        data: vydRoboty,
        success: console.log("editVydRoboty successfully completed"),
        error: errorFunc
    });
}

function getAllVydRoboty( successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyRoboty',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

///////////////////
///VydVydannia/////
///////////////////

function getVydVydanniaById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyVydannia/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addVydVydannia(vydVydannia) {
    jQuery.ajax({
        url: hostName + '/vydyVydannia/add',
        type: 'Post',
        data: vydVydannia,
        success: console.log("addVydVydannia successfully completed"),
        error: errorFunc
    });
}


function deleteVydVydannia(id) {
    jQuery.ajax({
        url: hostName + '/vydyVydannia/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteVydVydannia successfully completed"),
        error: errorFunc
    });
}

function editVydVydannia(vydVydannia) {
    jQuery.ajax({
        url: hostName + '/vydyVydannia/edit',
        type: 'Post',
        data: vydVydannia,
        success: console.log("editVydVydannia successfully completed"),
        error: errorFunc
    });
}

function getAllVydVydannia( successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyVydannia',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}