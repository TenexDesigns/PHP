Cookie - Information about a user stored in a users web browere.
This enables you to receive targeted adverts , browsing prefences and other non-sensitive data

          key          value      time    1day x 2   default file pah     
setcookie("fav_food", "pizza", time() + (86400 * 2), "/")



The time is addded to the current time in seconds . That is why we add 86400 seconds , which equas two days to the current time 



Cookies in PHP are a way to store data on the client-side, i.e., in the users web browser, to be used across multiple requests.
Cookies are used for a variety of purposes, such as tracking user preferences, maintaining user sessions, and storing shopping cart data.

To set a cookie in PHP, you can use the setcookie() function. The setcookie() function takes up to six parameters:

name: The name of the cookie.
value: The value of the cookie.
expire: The expiration time of the cookie. If not set, the cookie will expire when the browser is closed.
path: The path on the server where the cookie will be available. If not set, the cookie will be available on the entire domain.
domain: The domain where the cookie will be available. If not set, the cookie will be available on the current domain.
secure: A Boolean value indicating whether the cookie should only be sent over a secure HTTPS connection.



Example:

// Set a cookie with a name and value
setcookie('username', 'John', time() + 3600, '/');

// Get the value of a cookie
echo $_COOKIE['username'];




In this example,we set a cookie named username with a value of John that will expire in one hour.
We also set the path to /, which means that the cookie will be available on the entire domain.
We then retrieve the value of the username cookie using the $_COOKIE superglobal.

Note that cookies are stored on the client-side and can be manipulated by the user, so you should not store sensitive data in cookies.
Its also important to be aware of privacy regulations and obtain user consent before setting cookies that track user behavior or collect personal information.





TO DELETE A COOOKIE, SET THE TIME TO -0






















..
