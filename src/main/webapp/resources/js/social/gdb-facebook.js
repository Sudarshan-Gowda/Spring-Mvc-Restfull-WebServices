function statusChangeCallback(response) {
	console.log('statusChangeCallback');
	console.log(response);

	if (response.status === 'connected') {
		login();
	} else {

	}
}

function checkLoginState() {
	FB.getLoginStatus(function(response) {
		statusChangeCallback(response);
	});
}

window.fbAsyncInit = function() {
	FB.init({
		appId : '113985509315127',
		cookie : true, // enable cookies to allow the server to access
		// the session
		xfbml : true, // parse social plugins on this page
		version : 'v2.8' // use graph api version 2.8
	});

	FB.getLoginStatus(function(response) {
		statusChangeCallback(response);
	});

};

// Load the SDK asynchronously
(function(d, s, id) {
	var js, fjs = d.getElementsByTagName(s)[0];
	if (d.getElementById(id))
		return;
	js = d.createElement(s);
	js.id = id;
	js.src = "https://connect.facebook.net/en_US/sdk.js";
	fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));

function testAPI() {
	console.log('Welcome!  Fetching your information.... ');
	FB.api('/me', {
		locale : 'en_US',
		fields : 'id,first_name,last_name,email,link,gender,locale,picture'
	}, function(response) {
		console.log('Successful login for: ' + response.name);
		document.getElementById('status').innerHTML = 'Thanks for logging in, '
				+ response.name + '!';
	});
}

function login() {
	FB
			.login(
					function(response) {
						if (response.authResponse) {
							console
									.log('Welcome!  Fetching your information.... ');
							FB
									.api(
											'/me',
											{
												locale : 'en_US',
												fields : 'id,name, first_name,last_name,email,link,gender,locale,picture'
											},
											function(response) {

												var status = "";

												$
														.ajax({
															url : '/facebook-integration/star/facebook',
															contentType : "application/json; charset=utf-8",
															data : {
																'firstname' : response.first_name,
																'lastname' : response.last_name,
																'email' : response.email
															},
															type : 'GET',
															cache : false,
															success : function(
																	result) {
																$("body").html(
																		result);
															}
														});

											});
						} else {
							console
									.log('User cancelled login or did not fully authorize.');
						}
						FB.logout();
					}, {
						scope : 'email'
					});
}

function fbLogoutUser() {
	// alert('adfsd');
	FB.getLoginStatus(function(response) {
		if (response && response.status === 'connected') {
			FB.logout(function(response) {
				document.location.reload();
			});
		}
	});
}