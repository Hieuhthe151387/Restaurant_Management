/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function toggleMenu(){
    let toggle = document.querySelector('.toggle');
    let navigation = document.querySelector('.navigation');
    let main = document.querySelector('.main');
    toggle.classList.toggle('active');
    navigation.classList.toggle('active');
    main.classList.toggle('active');
}

let emdata=document.getElementsByClassName('emdata');
    for(let i = 0; i<emdata.length;i++){
	emdata[i].addEventListener('click',viewdetail);
    }
    function viewdetail(){
	closeCard();
	console.log(this);
    }
    function closeCard(){
	if (checkedit) {
            if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
	}
        let close = document.querySelector('.close');
        let session = document.querySelector('.session');
        let empty = document.querySelector('.empty');
        close.classList.toggle('hidden');
        session.classList.toggle('hidden');
        empty.classList.toggle('hidden');
    }
// variable of employee page
    let updatef = document.getElementById('update');
    let cancelf = document.getElementById('cancel');
    let editspan = document.getElementsByClassName('icon');
    for(let i = 0; i<editspan.length;i++){
	editspan[i].addEventListener('click',editemployee);
    }
    const remeber=[];
    let checkedit = false;
function editemployee() {
    let element = document.getElementById(this.id);
    if(this.id == 'gender'){
	element = document.getElementsByTagName('select')[0];
        element.removeAttribute('disabled');
	}
	else{
            element.removeAttribute('readonly');
	}
	console.log('hadclick'+(remeber.length));
	remeber[remeber.length] = element;
	updatef.removeAttribute('disabled');
	cancelf.removeAttribute('disabled');
	checkedit=true;
}
function cancelupdate(){
    let updatef = document.getElementById('update');
    let cancelf = document.getElementById('cancel');
    for(let i = 0; i<remeber.length;i++){
        if(remeber.id==='gender'){
            remeber.remoneAttribute('disabled');
        } else{
            remeber.remoneAttribute('readonly');
        }	
    }
    checkedit=false;
    document.employeedetails.reset();
    updatef.setAttribute('disabled',true);
    cancelf.setAttribute('disabled',true);
}
// --------------------------------- js for add form-------------
function createemployee(){
    if (checkedit) {
        if(!confirm("Some changed in updating form with be discard? You want redirect to create new employee")){return;}
        else cancelupdate();
    }
    let createpanel = document.querySelector('.newemployee');
    createpanel.classList.toggle('create');
}
function cancelcreate(){
    document.addemployee.reset();
    let createpanel = document.querySelector('.newemployee');
    createpanel.classList.toggle('create');
    console.log('canceled create!');
}