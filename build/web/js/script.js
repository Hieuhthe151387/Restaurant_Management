




function toggleMenu(){
			let toggle = document.querySelector('.toggle');
			let navigation = document.querySelector('.navigation');
			let main = document.querySelector('.main');
			toggle.classList.toggle('active');
			navigation.classList.toggle('active');
			main.classList.toggle('active');
		}

		// --------------------------------------------------------------------------
		let emdata=document.getElementsByClassName('emdata');
		for(let i = 0; i<emdata.length;i++){
			emdata[i].addEventListener('click',viewdetail);
		}
		function viewdetail(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return false;
			}
                        let f = document.femployee;
			f.action="employee?req=v&id="+this.id;
                        f.submit();
		}
		function closeCard(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return false;
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
			e = document.getElementsByTagName('select')[0];
                        e.removeAttribute('disabled');
			element.removeAttribute('readonly');
			console.log('hadclick'+(remeber.length));
			remeber[remeber.length] = element;
			updatef.removeAttribute('disabled');
			cancelf.removeAttribute('disabled');
			checkedit=true;
		};
//                function updateem(){
//                    document.employeedetails.submit();
//                }
                function deleteem(id){
                    if(confirm("Bạn muốn tiếp tục xoá bản ghi này? Thao tác này có thế gây mất dữ liệu!")){
                    let f = document.femployee;
                    let req = document.getElementById('req');
                    req.value='r';
                    f.action="employee?req=r&id="+id;
                    f.submit();
                }
                };
		function cancelupdate(){
			let updatef = document.getElementById('update');
			let cancelf = document.getElementById('cancel');
			for(let i = 0; i<remeber.length;i++){
				if(remeber[i].id=='gender'){
					remeber[i].setAttribute('disabled',true);
				} else{
					remeber[i].setAttribute('readonly',true);
				}	
			}
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
                        let f = document.femployee;
                        f.action="create?req=c";
                        f.submit();
//			let createpanel = document.querySelector('.newemployee');
//			createpanel.classList.toggle('create');
		}
		function cancelcreate(){
			document.addemployee.reset();
			let createpanel = document.querySelector('.newemployee');
			createpanel.classList.toggle('create');
			console.log('canceled create!');
		}
