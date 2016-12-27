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
        url: hostName +'/sposobyDruku/nazvaSposobuDruku/?nazvaSposobuDruku=' + nazvaSposobuDruku,
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

function getOneVydObkladynkyByNazvaVyduObkladynky(nazvaVyduObkladynky, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyObkladynky/nazvaVyduObkladynky/?nazvaVyduObkladynky=' + nazvaVyduObkladynky,
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

function getAllVydRobotyNames() {
    var response;
    jQuery.ajax( {
        url: hostName +'/vydyRoboty/names',
        async: false,
        type: 'GET',
        success: function(r) {
            response = r;
        },
        error: errorFunc
    } );
    return response;
}

function getAllOsobystaInfoVykonavtsiaNames() {
    var response;
    jQuery.ajax( {
        url: hostName +'/osobystaInfoVykonavtsia/names',
        async: false,
        type: 'GET',
        success: function(r) {
            response = r;
        },
        error: errorFunc
    } );
    return response;
}

function getAllInfoProVydanniaNames() {
    var response;
    jQuery.ajax( {
        url: hostName +'/infoProVydannia/names',
        async: false,
        type: 'GET',
        success: function(r) {
            response = r;
        },
        error: errorFunc
    } );
    return response;
}

function getOneVydyRobotyByNazvaVyduRoboty(nazvaVyduRoboty, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyRoboty/nazvaVyduRoboty/?nazvaVyduRoboty=' + nazvaVyduRoboty,
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
function getOneVydVydanniaByNazvaVyduVydannia(nazvaVyduVydannia, successFunc) {
    jQuery.ajax( {
        url: hostName +'/vydyVydannia/nazvaVyduVydannia/?nazvaVyduVydannia=' + nazvaVyduVydannia,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

//////////////
///Format///
//////////////
function getFormatById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/formaty/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addFormat(format) {
    jQuery.ajax({
        url: hostName + '/formaty/add',
        type: 'Post',
        data: format,
        success: console.log("addFormat successfully completed"),
        error: errorFunc
    });
}


function deleteFormat(id) {
    jQuery.ajax({
        url: hostName + '/formaty/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteFormat successfully completed"),
        error: errorFunc
    });
}

function editFormat(format) {
    jQuery.ajax({
        url: hostName + '/formaty/edit',
        type: 'Post',
        data: format,
        success: console.log("editFormat successfully completed"),
        error: errorFunc
    });
}

function getAllFormat( successFunc) {
    jQuery.ajax( {
        url: hostName +'/formaty',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneFormatByNazvaFormatu(nazvaFormatu, successFunc) {
    jQuery.ajax( {
        url: hostName +'/formaty/nazvaFormatu/?nazvaFormatu=' + nazvaFormatu,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

//////////////
///InfoProAvtora///
//////////////
function getInfoProAvtoraById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProAvtora/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addInfoProAvtora(infoProAvtora) {
    jQuery.ajax({
        url: hostName + '/infoProAvtora/add',
        type: 'Post',
        data: infoProAvtora,
        success: console.log("addInfoProAvtora successfully completed"),
        error: errorFunc
    });
}


function deleteInfoProAvtora(id) {
    jQuery.ajax({
        url: hostName + '/infoProAvtora/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteInfoProAvtora successfully completed"),
        error: errorFunc
    });
}

function editInfoProAvtora(infoProAvtora) {
    jQuery.ajax({
        url: hostName + '/infoProAvtora/edit',
        type: 'Post',
        data: infoProAvtora,
        success: console.log("editInfoProAvtora successfully completed"),
        error: errorFunc
    });
}

function getAllInfoProAvtora( successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProAvtora',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneInfoProAvtoraByPrizvyshche(prizvyshche, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProAvtora/prizvyshche/?prizvyshche=' + prizvyshche,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneInfoProAvtoraByImiia(imiia, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProAvtora/imiia/?imiia=' + imiia,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

//////////////
///InfoProVydannia///
//////////////

function getInfoProVydanniaById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProVydannia/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addInfoProVydannia(infoProVydannia) {
    jQuery.ajax({
        url: hostName + '/infoProVydannia/add',
        type: 'Post',
        data: infoProVydannia,
        success: console.log("addInfoProVydannia successfully completed"),
        error: errorFunc
    });
}


function deleteInfoProVydannia(id) {
    jQuery.ajax({
        url: hostName + '/infoProVydannia/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteInfoProVydannia successfully completed"),
        error: errorFunc
    });
}

function editInfoProVydannia(infoProVydannia) {
    jQuery.ajax({
        url: hostName + '/infoProVydannia/edit',
        type: 'Post',
        data: infoProVydannia,
        success: console.log("editInfoProVydannia successfully completed"),
        error: errorFunc
    });
}

function getAllInfoProVydannia( successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProVydannia',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneInfoProVydanniaByPovnaNazva(povnaNazva, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProVydannia/povnaNazva/?povnaNazva=' + povnaNazva,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneInfoProVydanniaByKorotkaNazva(korotkaNazva, successFunc) {
    jQuery.ajax( {
        url: hostName +'/infoProVydannia/korotkaNazva/?korotkaNazva=' + korotkaNazva,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

//////////////
///OsobystaInfoVykonavtsia///
//////////////

function getOsobystaInfoVykonavtsiaById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/osobystaInfoVykonavtsia/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia) {
    jQuery.ajax({
        url: hostName + '/osobystaInfoVykonavtsia/add',
        type: 'Post',
        data: osobystaInfoVykonavtsia,
        success: console.log("addOsobystaInfoVykonavtsia successfully completed"),
        error: errorFunc
    });
}


function deleteOsobystaInfoVykonavtsia(id) {
    jQuery.ajax({
        url: hostName + '/osobystaInfoVykonavtsia/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteOsobystaInfoVykonavtsia successfully completed"),
        error: errorFunc
    });
}

function editOsobystaInfoVykonavtsia(infoProAvtora) {
    jQuery.ajax({
        url: hostName + '/osobystaInfoVykonavtsia/edit',
        type: 'Post',
        data: infoProAvtora,
        success: console.log("editOsobystaInfoVykonavtsia successfully completed"),
        error: errorFunc
    });
}

function getAllOsobystaInfoVykonavtsia( successFunc) {
    jQuery.ajax( {
        url: hostName +'/osobystaInfoVykonavtsia',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneOsobystaInfoVykonavtsiaByPib(pib, successFunc) {
    jQuery.ajax( {
        url: hostName +'/osobystaInfoVykonavtsia/pib/?pib=' + pib,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

//////////////
///rahunok///
//////////////
function getRahunokById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/rahunky/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addRahunok(rahunok) {
    jQuery.ajax({
        url: hostName + '/rahunky/add',
        type: 'Post',
        data: pidrozdil,
        success: console.log("addRahunok successfully completed"),
        error: errorFunc
    });
}


function deleteRahunok(id) {
    jQuery.ajax({
        url: hostName + '/rahunky/delete/'+ id,
        type: 'DELETE',
        success: console.log("deleteRahunok successfully completed"),
        error: errorFunc
    });
}

function editPidrozdil(pidrozdil) {
    jQuery.ajax({
        url: hostName + '/rahunky/edit',
        type: 'Post',
        data: pidrozdil,
        success: console.log("editRahunok successfully completed"),
        error: errorFunc
    });
}

function getAllRahunok( successFunc) {
    jQuery.ajax( {
        url: hostName +'/rahunky',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOneRahunokByZamovnyk(zamovnyk, successFunc) {
    jQuery.ajax( {
        url: hostName +'/rahunky/zamovnyk/?zamovnyk=' + zamovnyk,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getAllTechcardNames() {
    var response;
    jQuery.ajax( {
        url: hostName +'/techcards/names',
        async: false,
        type: 'GET',
        success: function(r) {
            response = r;
        },
        error: errorFunc
    } );
    return response;
}

//////////////
///pidrozdil///
//////////////
function getPidrozdilById(id, successFunc) {
    jQuery.ajax( {
        url: hostName +'/pidrozdil/' + id,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function addPidrozdil(pidrozdil) {
    jQuery.ajax({
        url: hostName + '/pidrozdil/add',
        type: 'Post',
        data: pidrozdil,
        success: console.log("addPidrozdil successfully completed"),
        error: errorFunc
    });
}


function deletePidrozdil(id) {
    jQuery.ajax({
        url: hostName + '/pidrozdil/delete/'+ id,
        type: 'DELETE',
        success: console.log("deletePidrozdil successfully completed"),
        error: errorFunc
    });
}

function editPidrozdil(pidrozdil) {
    jQuery.ajax({
        url: hostName + '/pidrozdil/edit',
        type: 'Post',
        data: pidrozdil,
        success: console.log("editPidrozdil successfully completed"),
        error: errorFunc
    });
}

function getAllPidrozdil( successFunc) {
    jQuery.ajax( {
        url: hostName +'/pidrozdil',
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}

function getOnePidrozdilByNazvaPidrozdilu(nazvaPidrozdilu, successFunc) {
    jQuery.ajax( {
        url: hostName +'/pidrozdil/nazvaPidrozdilu/?nazvaPidrozdilu=' + nazvaPidrozdilu,
        type: 'GET',
        success: successFunc,
        error: errorFunc
    } );
}



