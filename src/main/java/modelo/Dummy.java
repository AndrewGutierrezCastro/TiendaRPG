package modelo;

public interface Dummy {
	public String response = "<body> \r\n" + 
			" <div class=\"left-menu\"> \r\n" + 
			"  <div class=\"content-logo\"> <span>WishsterApp Doc</span> \r\n" + 
			"  </div> \r\n" + 
			"  <div class=\"content-menu\"> \r\n" + 
			"   <ul> \r\n" + 
			"    <li class=\"scroll-to-link active\" data-target=\"register\"> <a>Register</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"verify-otp\"> <a>Verify OTP</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"register-set-pwd\"> <a>Register Set Password</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"social-login\"> <a>Social Login</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"save-security-question\"> <a>Save Security Question</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"login\"> <a>Login</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"profile\"> <a>Profile</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"update-profile\"> <a>Update Profile</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"update-profile-img\"> <a>Update Profile Image</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"change-password\"> <a>Change Password</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"security-question\"> <a>Security Question</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"forget-password\"> <a>Forget Password</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"reset-password\"> <a>Reset Password</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"all-users-list\"> <a>All Users List</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"requests-users-list\"> <a>Requests Users List</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"blocked-users-list\"> <a>Blocked Users List</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"friend-request\"> <a>Friend Request</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"accept-friend-request\"> <a>Accept Friend Request</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"reject-friend-request\"> <a>Reject Friend Request</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"unfriend\"> <a>Unfriend</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"block-friend\"> <a>Block Friend</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"unblock-friend\"> <a>Unblock Friend</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"get-products\"> <a>Scan to Get Products</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"save-wishlist\"> <a>Save to Wishlist</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"get-wishlist\"> <a>Get Wishlist</a> </li> \r\n" + 
			"    <li class=\"scroll-to-link\" data-target=\"delete-wishlist\"> <a>Delete from Wishlist</a> </li> \r\n" + 
			"   </ul> \r\n" + 
			"  </div> \r\n" + 
			" </div> \r\n" + 
			" <div class=\"content-page\"> \r\n" + 
			"  <div class=\"content-code\"></div> \r\n" + 
			"  <div class=\"content\"> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-register\"> \r\n" + 
			"    <h1 id=\"register\">Register</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/register<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"type\": \"email\",\r\n" + 
			"                \"email_mobile\": \"ripan.pal@exnovation.in\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"OTP successfully sent to your email\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-verify-otp\"> \r\n" + 
			"    <h1 id=\"verify-otp\">Verify OTP</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/verify_otp<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                \"otp\": your_otp\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"OTP matched\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-register-set-pwd\"> \r\n" + 
			"    <h1 id=\"register-set-pwd\">Register Set Password</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/register_set_pwd<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"type\": \"email\",\r\n" + 
			"                \"email_mobile\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                \"name\": \"Ripan Pal\",\r\n" + 
			"                \"birthday\": \"01-31-1990\",\r\n" + 
			"                \"password\": \"Test@123\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                HEADER:\r\n" + 
			"                {\r\n" + 
			"                  token: token_here\r\n" + 
			"                }\r\n" + 
			"                BODY:\r\n" + 
			"                {\r\n" + 
			"                  \"status\": true,\r\n" + 
			"                  \"message\": \"Registered successfully\",\r\n" + 
			"                  \"data\": {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"name\": \"Ripan Pal\",\r\n" + 
			"                    \"gender\": \"\",\r\n" + 
			"                    \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                    \"mobile\": \"\",\r\n" + 
			"                    \"username\": \"ripan.pal\",\r\n" + 
			"                    \"birthday\": \"01-31-1990\",\r\n" + 
			"                    \"address\": \"\",\r\n" + 
			"                    \"profile_img\": \"\",\r\n" + 
			"                    \"status\": 1\r\n" + 
			"                  }\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-social-login\"> \r\n" + 
			"    <h1 id=\"social-login\">Social Login</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/social_login<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"social_type\": \"google\",\r\n" + 
			"                \"social_id\": your_google_id,\r\n" + 
			"                \"name\": \"Ripan Pal\",\r\n" + 
			"                \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                \"mobile\": \"\",\r\n" + 
			"                \"birthday\": \"01-31-1990\",\r\n" + 
			"                \"profile_img_url\": your_google_profile_img_url\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                HEADER:\r\n" + 
			"                {\r\n" + 
			"                  token: token_here\r\n" + 
			"                }\r\n" + 
			"                BODY:\r\n" + 
			"                {\r\n" + 
			"                  \"status\": true,\r\n" + 
			"                  \"message\": \"Logged in through google\",\r\n" + 
			"                  \"data\": {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"name\": \"Ripan Pal\",\r\n" + 
			"                    \"gender\": \"\",\r\n" + 
			"                    \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                    \"mobile\": \"\",\r\n" + 
			"                    \"username\": \"ripan.pal\",\r\n" + 
			"                    \"birthday\": \"01-31-1990\",\r\n" + 
			"                    \"address\": \"\",\r\n" + 
			"                    \"profile_img\": profile_image_url,\r\n" + 
			"                    \"status\": 1\r\n" + 
			"                  }\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-save-security-question\"> \r\n" + 
			"    <h1 id=\"save-security-question\">Save Security Question</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/save_security_qtn<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"                {\r\n" + 
			"                  \"user_id\": \"1\",\r\n" + 
			"                  \"security_qtn1\": \"Which would be your favorite drink?\",\r\n" + 
			"                  \"security_qtn2\": \"What is your favorite brand?\",\r\n" + 
			"                  \"security_qtn3\": \"What is your favorite sport?\",\r\n" + 
			"                  \"security_qtn4\": \"Which of the following best describes you?\",\r\n" + 
			"                  \"security_ans1\": \"Wine\",\r\n" + 
			"                  \"security_ans2\": \"Nike\",\r\n" + 
			"                  \"security_ans3\": \"Cricket\",\r\n" + 
			"                  \"security_ans4\": \"Vegan\"\r\n" + 
			"                }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                HEADER:\r\n" + 
			"                {\r\n" + 
			"                  token: token_here\r\n" + 
			"                }\r\n" + 
			"                BODY:\r\n" + 
			"                {\r\n" + 
			"                  \"status\": true,\r\n" + 
			"                  \"message\": \"Security question successfully saved\",\r\n" + 
			"                  \"data\": {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"name\": \"Ripan Pal\",\r\n" + 
			"                    \"gender\": \"\",\r\n" + 
			"                    \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                    \"mobile\": \"\",\r\n" + 
			"                    \"username\": \"ripan.pal\",\r\n" + 
			"                    \"birthday\": \"01-31-1990\",\r\n" + 
			"                    \"address\": \"\",\r\n" + 
			"                    \"profile_img\": \"\",\r\n" + 
			"                    \"status\": 0\r\n" + 
			"                  }\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-login\"> \r\n" + 
			"    <h1 id=\"login\">Login</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/login<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                \"password\": \"Test@123\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                HEADER:\r\n" + 
			"                {\r\n" + 
			"                  token: token_here\r\n" + 
			"                }\r\n" + 
			"                BODY:\r\n" + 
			"                {\r\n" + 
			"                  \"status\": true,\r\n" + 
			"                  \"message\": \"Successfully logged in\",\r\n" + 
			"                  \"data\": {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"name\": \"Ripan Pal\",\r\n" + 
			"                    \"gender\": \"\",\r\n" + 
			"                    \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                    \"mobile\": \"\",\r\n" + 
			"                    \"username\": \"ripan.pal\",\r\n" + 
			"                    \"address\": \"\",\r\n" + 
			"                    \"birthday\": \"01-31-1990\",\r\n" + 
			"                    \"profile_img\": \"\",\r\n" + 
			"                    \"status\": 0\r\n" + 
			"                  }\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-profile\"> \r\n" + 
			"    <h1 id=\"profile\">Profile</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/profile<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Your profile data\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": \"\",\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-update-profile\"> \r\n" + 
			"    <h1 id=\"update-profile\">Update Profile</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/update_profile<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"name\": \"Ripan Pal\",\r\n" + 
			"                \"gender\": \"Male\",\r\n" + 
			"                \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                \"mobile\": \"8017770965\",\r\n" + 
			"                \"username\": \"ripan.pal\",\r\n" + 
			"                \"address\": \"Kolkata\",\r\n" + 
			"                \"birthday\": \"31-01-1990\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Profile successfully updated\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"Male\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"8017770965\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"Kolkata\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": \"\",\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-update-profile-img\"> \r\n" + 
			"    <h1 id=\"update-profile-img\">Update Profile Image</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/update_profile_img<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"                multipart or form_data:\r\n" + 
			"                  \"profile_img\": image_file\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Profile image successfully updated\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"Male\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"8017770965\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"Kolkata\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": profile_image_url,\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-change-password\"> \r\n" + 
			"    <h1 id=\"change-password\">Change Password</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/change_password<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"old_password\":\"Test@123\",\r\n" + 
			"                \"new_password\":\"Test@111\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Password changed successfully\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"Male\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"8017770965\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"Kolkata\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": profile_image_url,\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-security-question\"> \r\n" + 
			"    <h1 id=\"security-question\">Security Question</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/security_qtn<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Security questions list\",\r\n" + 
			"                \"data\": [\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"question\": \"Which would be your favorite drink?\",\r\n" + 
			"                    \"option1\": \"Wine\",\r\n" + 
			"                    \"option2\": \"Beer\",\r\n" + 
			"                    \"option3\": \"Fruit Juice\",\r\n" + 
			"                    \"option4\": \"Water\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 2,\r\n" + 
			"                    \"question\": \"What is your favorite brand?\",\r\n" + 
			"                    \"option1\": \"Lee Cooper\",\r\n" + 
			"                    \"option2\": \"Nike\",\r\n" + 
			"                    \"option3\": \"Adidas\",\r\n" + 
			"                    \"option4\": \"Puma\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 3,\r\n" + 
			"                    \"question\": \"What is your favorite sport?\",\r\n" + 
			"                    \"option1\": \"MotoGP\",\r\n" + 
			"                    \"option2\": \"Golf\",\r\n" + 
			"                    \"option3\": \"Cricket\",\r\n" + 
			"                    \"option4\": \"Poker\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 4,\r\n" + 
			"                    \"question\": \"Which of the following best describes you?\",\r\n" + 
			"                    \"option1\": \"Vegetarian\",\r\n" + 
			"                    \"option2\": \"All foods\",\r\n" + 
			"                    \"option3\": \"Meat eater\",\r\n" + 
			"                    \"option4\": \"Vegan\"\r\n" + 
			"                  }\r\n" + 
			"                ]\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-forget-password\"> \r\n" + 
			"    <h1 id=\"forget-password\">Forget Password</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/forget_pwd<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"type\":\"email\",\r\n" + 
			"                \"email_mobile\":\"ripan.pal@exnovation.in\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"OTP successfully sent to your email\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"Male\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"8017770965\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"Kolkata\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": profile_image_url,\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-reset-password\"> \r\n" + 
			"    <h1 id=\"reset-password\">Reset Password</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/reset_pwd<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"type\":\"email\",\r\n" + 
			"                \"email_mobile\":\"ripan.pal@exnovation.in\",\r\n" + 
			"                \"new_password\":\"Test@123\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Password reset successfully\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"name\": \"Ripan Pal\",\r\n" + 
			"                  \"gender\": \"Male\",\r\n" + 
			"                  \"email\": \"ripan.pal@exnovation.in\",\r\n" + 
			"                  \"mobile\": \"8017770965\",\r\n" + 
			"                  \"username\": \"ripan.pal\",\r\n" + 
			"                  \"address\": \"Kolkata\",\r\n" + 
			"                  \"birthday\": \"01-31-1990\",\r\n" + 
			"                  \"profile_img\": profile_image_url,\r\n" + 
			"                  \"status\": 0\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-all-users-list\"> \r\n" + 
			"    <h1 id=\"all-users-list\">All Users List</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/all_users_list?page=1&amp;search=biswajit<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"All users list\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"currentpage\": \"1\",\r\n" + 
			"                  \"nextpage\": \"0\",\r\n" + 
			"                  \"totalpages\": 1,\r\n" + 
			"                  \"totalrecords\": 2,\r\n" + 
			"                  \"perpage\": \"20\",\r\n" + 
			"                  \"all_users\": [\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 17,\r\n" + 
			"                      \"name\": \"Biswajit Deb\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"biswajit.deb@exnovation.com\",\r\n" + 
			"                      \"mobile\": \"8617293987\",\r\n" + 
			"                      \"username\": \"biswajit.deb\",\r\n" + 
			"                      \"address\": \"Kolkata\",\r\n" + 
			"                      \"birthday\": \"01-11-1990\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    },\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 4,\r\n" + 
			"                      \"name\": \"Biswajit Sarkar\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"msg2biswa@hotmail.com\",\r\n" + 
			"                      \"mobile\": \"8566379923\",\r\n" + 
			"                      \"username\": \"msg2biswa\",\r\n" + 
			"                      \"address\": \"Surat\",\r\n" + 
			"                      \"birthday\": \"12-04-1983\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    }\r\n" + 
			"                  ]\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-requests-users-list\"> \r\n" + 
			"    <h1 id=\"requests-users-list\">Requests Users List</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/requests_users_list?page=1&amp;search=<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Requests users list\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"currentpage\": \"1\",\r\n" + 
			"                  \"nextpage\": \"0\",\r\n" + 
			"                  \"totalpages\": 1,\r\n" + 
			"                  \"totalrecords\": 2,\r\n" + 
			"                  \"perpage\": \"20\",\r\n" + 
			"                  \"all_users\": [\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 13,\r\n" + 
			"                      \"name\": \"Sanjay Chatterjee\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"schatterjee1995@gmail.com\",\r\n" + 
			"                      \"mobile\": \"7665887765\",\r\n" + 
			"                      \"username\": \"schatterjee1995\",\r\n" + 
			"                      \"address\": \"Kolkata\",\r\n" + 
			"                      \"birthday\": \"11-14-1995\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    },\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 4,\r\n" + 
			"                      \"name\": \"Sunny Dubey\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"dubeyv23@gmail.com\",\r\n" + 
			"                      \"mobile\": \"9866357533\",\r\n" + 
			"                      \"username\": \"dubeyv23\",\r\n" + 
			"                      \"address\": \"Patna\",\r\n" + 
			"                      \"birthday\": \"08-08-1994\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    }\r\n" + 
			"                  ]\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-blocked-users-list\"> \r\n" + 
			"    <h1 id=\"blocked-users-list\">Blocked Users List</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/blocked_users_list?page=1&amp;search=<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Blocked users list\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"currentpage\": \"1\",\r\n" + 
			"                  \"nextpage\": \"0\",\r\n" + 
			"                  \"totalpages\": 1,\r\n" + 
			"                  \"totalrecords\": 2,\r\n" + 
			"                  \"perpage\": \"20\",\r\n" + 
			"                  \"all_users\": [\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 17,\r\n" + 
			"                      \"name\": \"Abhijit Biswas\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"abhijitbiswas@gmail.com\",\r\n" + 
			"                      \"mobile\": \"9887556432\",\r\n" + 
			"                      \"username\": \"abhijitbiswas\",\r\n" + 
			"                      \"address\": \"Kolkata\",\r\n" + 
			"                      \"birthday\": \"12-21-1993\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    },\r\n" + 
			"                    {\r\n" + 
			"                      \"id\": 4,\r\n" + 
			"                      \"name\": \"Rony Saha\",\r\n" + 
			"                      \"gender\": \"Male\",\r\n" + 
			"                      \"email\": \"rony.saha@exnovation.in\",\r\n" + 
			"                      \"mobile\": \"9748089020\",\r\n" + 
			"                      \"username\": \"rony.saha\",\r\n" + 
			"                      \"address\": \"Kolkata\",\r\n" + 
			"                      \"birthday\": \"05-11-1990\",\r\n" + 
			"                      \"profile_img\": profile_image_url,\r\n" + 
			"                      \"status\": 0\r\n" + 
			"                    }\r\n" + 
			"                  ]\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-friend-request\"> \r\n" + 
			"    <h1 id=\"friend-request\">Friend Request</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/friend_request<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Friend request successfully sent to Friend_Name\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-accept-friend-request\"> \r\n" + 
			"    <h1 id=\"accept-friend-request\">Accept Friend Request</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/accept_friend_request<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"You accept the friend request from Friend_Name\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-reject-friend-request\"> \r\n" + 
			"    <h1 id=\"reject-friend-request\">Reject Friend Request</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/reject_friend_request<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"You reject the friend request from Friend_Name\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-unfriend\"> \r\n" + 
			"    <h1 id=\"unfriend\">Unfriend</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/unfriend<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Friend_Name unfriend successfully\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-block-friend\"> \r\n" + 
			"    <h1 id=\"block-friend\">Block Friend</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/block_friend<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Friend_Name blocked successfully\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-unblock-friend\"> \r\n" + 
			"    <h1 id=\"unblock-friend\">Unblock Friend</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/unblock_friend<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"frnd_uname\": friend_username_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Friend_Name unblocked successfully\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-get-products\"> \r\n" + 
			"    <h1 id=\"get-products\">Scan to Get Products</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/get_products<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"scancode\": isbn_upc_ean_code_here\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Products list\",\r\n" + 
			"                \"data\": [\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"170953528404\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mGdB9Q7QjzU3NzrAGZVY4LA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/27g-Fem-Oxy-Life-Bleach-Oxygen-Oxygen-Facial-Skin-Care-Creme-/170953528404\",\r\n" + 
			"                    \"title\": \"27g Fem Oxy Life Bleach Oxygen Oxygen Facial Skin Care Creme\",\r\n" + 
			"                    \"price\": \"$8.99\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"303624907369\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mYCN-WMLpEPRkGk_GRU9gXA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Sexy-Miss-Santa-Fancy-Dress-Christmas-Costume-UK-Size-6-Paperback-Book-/303624907369\",\r\n" + 
			"                    \"title\": \"Sexy Miss Santa Fancy Dress Christmas Costume (UK Size 6) Paperback Book The\",\r\n" + 
			"                    \"price\": \"$17.36\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"153454286909\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mNcjg7SiEMd5qNwIc0lAXYA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/MICHAEL-KORS-BAR-PAVE-STATION-CHAIN-NECKLACE-ROSE-GOLD-TONE-60-NEW-/153454286909\",\r\n" + 
			"                    \"title\": \"MICHAEL KORS BAR PAVE STATION CHAIN NECKLACE ROSE GOLD TONE 60\\\" NEW\",\r\n" + 
			"                    \"price\": \"$59.99\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"402344449250\",\r\n" + 
			"                    \"pic_url\": \"http://pics.ebaystatic.com/aw/pics/express/icons/iconPlaceholder_96x96.gif\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Harry-Potter-and-Deathly-Hallows-J-K-Rowling-Paperback-Book-Fast-/402344449250\",\r\n" + 
			"                    \"title\": \"Harry Potter and the Deathly Hallows by J. K. Rowling Paperback Book The Fast\",\r\n" + 
			"                    \"price\": \"$4.8\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"383634973076\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mYCN-WMLpEPRkGk_GRU9gXA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Sexy-Miss-Santa-Fancy-Dress-Christmas-Costume-UK-Size-6-Paperback-Book-/383634973076\",\r\n" + 
			"                    \"title\": \"Sexy Miss Santa Fancy Dress Christmas Costume (UK Size 6) Paperback Book The\",\r\n" + 
			"                    \"price\": \"$16.18\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"391916068437\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mjhd116Ai9wlZ_btAF79ywQ/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Harry-Potter-and-Deathly-Hallows-Book-7-Adu-J-K-Rowling-Paperback-/391916068437\",\r\n" + 
			"                    \"title\": \"Harry Potter and the Deathly Hallows (Book 7) [Adu... by J. K. Rowling Paperback\",\r\n" + 
			"                    \"price\": \"$9.26\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"392190175796\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mAnqmM61sU4RgxmMh7TS9Rw/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/1st-ED-ADULT-PAPERBACK-BOOK-7-HARRY-POTTER-AND-DEATHLY-HALLOWS-J-K-ROWLING-/392190175796\",\r\n" + 
			"                    \"title\": \"1st ED ADULT PAPERBACK BOOK 7 HARRY POTTER AND THE DEATHLY HALLOWS J.K ROWLING\",\r\n" + 
			"                    \"price\": \"$9.99\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"333061311233\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mTv7CN1SXH-5nfQdmQ1DyOw/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Harry-Potter-and-Deathly-Hallows-J-K-Rowling-9780747595823-/333061311233\",\r\n" + 
			"                    \"title\": \"Harry Potter and the Deathly Hallows By J. K. Rowling. 9780747595823\",\r\n" + 
			"                    \"price\": \"$13.6\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"352785897773\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mDI6JU_9e2s7olgJiMxnY_w/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Castle-clash-DE-310k-HEROES-LIKE-LAVA-LAZU-KOSMO-AND-MORE-/352785897773\",\r\n" + 
			"                    \"title\": \"Castle clash DE, 310k+| HEROES LIKE LAVA, LAZU, KOSMO AND MORE\",\r\n" + 
			"                    \"price\": \"$120.0\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"392442680239\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs4.ebaystatic.com/m/mjhd116Ai9wlZ_btAF79ywQ/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Harry-Potter-and-Deathly-Hallows-J-K-Rowling-Paperback-Book-Fast-/392442680239\",\r\n" + 
			"                    \"title\": \"Harry Potter and the Deathly Hallows by J. K. Rowling Paperback Book The Fast\",\r\n" + 
			"                    \"price\": \"$9.26\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"item_id\": \"383599680025\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mjhd116Ai9wlZ_btAF79ywQ/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/Harry-Potter-and-Deathly-Hallows-J-K-Rowling-Paperback-Book-Fast-/383599680025\",\r\n" + 
			"                    \"title\": \"Harry Potter and the Deathly Hallows by J. K. Rowling Paperback Book The Fast\",\r\n" + 
			"                    \"price\": \"$9.26\"\r\n" + 
			"                  }\r\n" + 
			"                ]\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-save-wishlist\"> \r\n" + 
			"    <h1 id=\"save-wishlist\">Save to Wishlist</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/save_wishlist<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"item_id\": \"170953528404\",\r\n" + 
			"                \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mGdB9Q7QjzU3NzrAGZVY4LA/140.jpg\",\r\n" + 
			"                \"url\": \"https://www.ebay.com/itm/27g-Fem-Oxy-Life-Bleach-Oxygen-Oxygen-Facial-Skin-Care-Creme-/170953528404\",\r\n" + 
			"                \"title\": \"27g Fem Oxy Life Bleach Oxygen Oxygen Facial Skin Care Creme\",\r\n" + 
			"                \"price\": \"$8.99\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Product successfully added to wishlist\",\r\n" + 
			"                \"data\": {\r\n" + 
			"                  \"id\": 1,\r\n" + 
			"                  \"user_id\": 1,\r\n" + 
			"                  \"item_id\": \"170953528404\",\r\n" + 
			"                  \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mGdB9Q7QjzU3NzrAGZVY4LA/140.jpg\",\r\n" + 
			"                  \"url\": \"https://www.ebay.com/itm/27g-Fem-Oxy-Life-Bleach-Oxygen-Oxygen-Facial-Skin-Care-Creme-/170953528404\",\r\n" + 
			"                  \"title\": \"27g Fem Oxy Life Bleach Oxygen Oxygen Facial Skin Care Creme\",\r\n" + 
			"                  \"price\": \"$8.99\"\r\n" + 
			"                }\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-get-wishlist\"> \r\n" + 
			"    <h1 id=\"get-wishlist\">Get Wishlist</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/get_wishlist<br> <strong>Method:</strong> GET<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Your wishlist\",\r\n" + 
			"                \"data\": [\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 1,\r\n" + 
			"                    \"user_id\": 1,\r\n" + 
			"                    \"item_id\": \"170953528404\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs1.ebaystatic.com/m/mGdB9Q7QjzU3NzrAGZVY4LA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/27g-Fem-Oxy-Life-Bleach-Oxygen-Oxygen-Facial-Skin-Care-Creme-/170953528404\",\r\n" + 
			"                    \"title\": \"27g Fem Oxy Life Bleach Oxygen Oxygen Facial Skin Care Creme\",\r\n" + 
			"                    \"price\": \"$8.99\"\r\n" + 
			"                  },\r\n" + 
			"                  {\r\n" + 
			"                    \"id\": 2,\r\n" + 
			"                    \"user_id\": 1,\r\n" + 
			"                    \"item_id\": \"153454286909\",\r\n" + 
			"                    \"pic_url\": \"https://thumbs2.ebaystatic.com/m/mNcjg7SiEMd5qNwIc0lAXYA/140.jpg\",\r\n" + 
			"                    \"url\": \"https://www.ebay.com/itm/MICHAEL-KORS-BAR-PAVE-STATION-CHAIN-NECKLACE-ROSE-GOLD-TONE-60-NEW-/153454286909\",\r\n" + 
			"                    \"title\": \"MICHAEL KORS BAR PAVE STATION CHAIN NECKLACE ROSE GOLD TONE 60\\\" NEW\",\r\n" + 
			"                    \"price\": \"$59.99\"\r\n" + 
			"                  }\r\n" + 
			"                ]\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"   <div class=\"overflow-hidden content-section\" id=\"content-delete-wishlist\"> \r\n" + 
			"    <h1 id=\"delete-wishlist\">Delete from Wishlist</h1> \r\n" + 
			"    <p> <strong>URL:</strong> https://domax.xyz/wishsterapp/api/delete_wishlist<br> <strong>Method:</strong> POST<br> <strong>Header:</strong><br> Content-Type: application/json<br> Authorization: Bearer your_token_here </p> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              REQUEST:\r\n" + 
			"              {\r\n" + 
			"                \"item_id\": \"170953528404\"\r\n" + 
			"              }\r\n" + 
			"            </code>\r\n" + 
			"          </pre> \r\n" + 
			"    <pre>            <code class=\"json\">\r\n" + 
			"              RESPONSE:\r\n" + 
			"              {\r\n" + 
			"                \"status\": true,\r\n" + 
			"                \"message\": \"Product successfully deleted from wishlist\",\r\n" + 
			"                \"data\": {}\r\n" + 
			"              }\r\n" + 
			"            </code><br><br><br><br>\r\n" + 
			"          </pre> \r\n" + 
			"   </div> \r\n" + 
			"  </div> \r\n" + 
			"  <div class=\"content-code\"></div> \r\n" + 
			" </div> \r\n" + 
			" <script src=\"js/libs/jquery.js\"></script> \r\n" + 
			" <script src=\"js/script.js\"></script>  \r\n" + 
			"</body>\r\n";
}
