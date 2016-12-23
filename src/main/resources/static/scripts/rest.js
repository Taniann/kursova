var hostName = "http://localhost:8080"

function getTechcardById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/techcards/' + id,
        type: 'GET',
        success: successFunc
    } );
}

function addTechcard(techcard) {
    jQuery.ajax({
        url: hostName + '/techcards/add',
        type: 'Post',
        data: techcard,
        success: console.log("addTechcard successfully completed")
    });
}


function deleteTechcard(id) {
    jQuery.ajax({
        url: hostName + '/techcards/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteTechcard successfully completed")
    });
}

function editTechcard(techcard) {
    jQuery.ajax({
        url: hostName + '/techcards/edit',
        type: 'Post',
        data: techcard,
        success: console.log("editTechcard successfully completed")
    });
}

function getAllTechcard( successFunc) {
    jQuery.ajax( {
        url: hostName +'/techcards',
        type: 'GET',
        success: successFunc
    } );
}