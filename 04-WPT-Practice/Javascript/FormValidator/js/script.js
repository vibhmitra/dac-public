function validate() {
    let username = document.getElementById('uname').value;
    let email = document.getElementById('email').value;
    // let gender = document.getElementById('name').value;
    let password = document.getElementById('pwd').value;
    let repassword = document.getElementById('repwd').value;
    let mobile = document.getElementById('mobile').value;
    let zip = document.getElementById('zipcode').value;
    let country = document.getElementById('countryname').value;

    var filter = /[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}/igm;

    /* Validate Username */
    if (username == '') {
        alert('Name must be Entered');
        document.myForm.name.focus();
        document.myForm.name.style.backgroundColor = "red";
        return false;
    }

    if (username.length < 6) {
        alert("User Name Must Be Greater than 6 Chars");
    }

    // Email Validation
    if(!filter.test(email)) {
        alert('Please Enter Valid Mail ID');
        email.focus();
        return false;
    }


    /* Validate gender */
    if ((myForm.gender[0].checked == false) && (myForm.gender[1].checked == false)) {
        alert("Please Select Gender");
        return false;
    }

    /* Validate Country*/
    if (country == -1) {
        alert("Bruh! Select Country! 🤔");
    }
}