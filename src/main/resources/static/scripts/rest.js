var hostName = "http://localhost:8080";
errorFunc = function( jqXHR, textStatus, errorThrown ){
    console.log("jqXHR = "+jqXHR+ "; textStatus = "+textStatus+"; errorThrown = "+errorThrown)
};

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
    jQuery.ajax( {
        url: hostName +'/sposobyDruku',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}