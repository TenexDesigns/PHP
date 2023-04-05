$_GET , $_POST - Are special variables used to collectdata from an HTML form data 
                Data is sent to the file in the action attribute of <form>
               < form action = "some_file.php" method = "get">
  
  
  
  
  $_GET - Data is appended to the url
          Not secure - Since what ever information is sent to the php file is appeneded tot he url
          char limit
          Bookmark is possible w/values
          GET requests can be cahed
          Better for a search page

$_POST - Data is packaged inside the body of the http request
         More secure
         Cannot bookmark
         GET requests are not cached
         Better for submitting credentials.




THIS IS WHERE WE USE THE GET METHOD

<!DOCTYPE html>
<body>
  <form action="index.php" method="get">      /// Here is where we speify the bet or post method and also the file where the data is to be saved

  <label>Username:</label>
  <input type="text" name ="username"/>  <br>
  <br>
  <label>Password:</label>
  <input type="password" name ="password"/> <br>
<br>
  <input type="submit" value ="log in"/>

  </form>  
</body>
</html>



<?php
// Here is where we c=access the data sent to this index.php file.

echo "{$_GET["username"]} <br>";
echo "{$_GET["password"]} <br>";


?>




THIS IS WHERE WE USE THE GET METHOD- Here the sensitive data is not appended to the url.


<!DOCTYPE html>
<body>
  <form action="index.php" method="post">

  <label>Username:</label>
  <input type="text" name ="username"/>  <br>
  <br>
  <label>Password:</label>
  <input type="password" name ="password"/> <br>
<br>
  <input type="submit" value ="log in"/>

  </form>  
</body>
</html>



<?php

echo "{$_POST["username"]} <br>";
echo "{$_POSR["password"]} <br>";


?>



































..
