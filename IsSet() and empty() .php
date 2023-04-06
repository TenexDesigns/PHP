isset() - Returns TRUE  if a variable is declared and not null.

empty - Returns TRUE if a variable is not declared ,false ,null or "", empty string



$username = "Bro code ";
$userDtate = null;



echo isset($username); --- Retruns true ...but is seen as 1 on the browser
echo isset($userDate); --- Retruns false ...but is seen as nothing on the browser



                                                    *********************************** EMPTY ******************************************

isset() - Returns TRUE  if a variable is declared and not null.




HERE IS ANOTHER EXAMPLE



if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}


This variable is NOT  set will be returned -------------> Since the variable book has not yet been declared



HERE IS ANOTHER EXAMPLE

$book = null


if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}

This variable is NOT  set will be returned -------------> Since the variable book is null.





HERE IS ANOTHER EXAMPLE

$book = true


if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}

This variable is set will be returned -------------> Since the variable book has been declared and has been assigned a value of true. In is set , we chack if the varialbe has a value ,true or false. That is a boolean declareation , thus is set returns true






HERE IS ANOTHER EXAMPLE

$book = false


if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}

This variable is set will be returned -------------> Since the variable book has been declared and has been assigned a value of false. In is set , we chack if the varialbe has a value ,true or false. That is a boolean declareation , thus is set returns true





HERE IS ANOTHER EXAMPLE

$book = ""


if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}

This variable is set will be returned -------------> Since the variable book has been declared and has been assigned a value of an empty string. In is set , we chack if the varialbe has a value ,true or false. That is a boolean declareation , thus is set returns true




HERE IS ANOTHER EXAMPLE

$book = "George"


if(isset($books)){

echo "This variable is set";
}
else{
echo "The variable is NOT set";


}

This variable is set will be returned -------------> Since the variable book has been declared and has been assigned a  string value of ""George. In is set , we chack if the varialbe has a value ,true or false. That is a boolean declareation , thus is set returns true









                                                    *********************************** EMPTY ******************************************

empty - Returns TRUE if a variable is not declared ,false ,null or "", empty string






HERE IS ANOTHER EXAMPLE




if(isset($books)){

echo "This variable is empty";
}
else{
echo "The variable is NOT empty";


}

This variable is empty will be returned -------------> Since the variable book has not  been declared 






HERE IS ANOTHER EXAMPLE


$books = null; 

if(isset($books)){

echo "This variable is empty";
}
else{
echo "The variable is NOT empty";


}

This variable is empty will be returned -------------> Since the variable book is null. 




HERE IS ANOTHER EXAMPLE


$books = false; 

if(isset($books)){

echo "This variable is empty";
}
else{
echo "The variable is NOT empty";


}

This variable is empty will be returned -------------> Since the variable book is false. 





HERE IS ANOTHER EXAMPLE


$books = ""; 

if(isset($books)){

echo "This variable is empty";
}
else{
echo "The variable is NOT empty";


}

This variable is empty will be returned -------------> Since the variable book is an empty string. 



HERE IS ANOTHER EXAMPLE


$books = "Brocode"; 

if(isset($books)){

echo "This variable is empty";
}
else{
echo "The variable is NOT empty";


}

This variable is NOT  empty will be returned -------------> Since the variable book is assigned a value of "bro code". 













HERE IS MORE EXPLANATION
_________________________________________________________________________________________________________________________________________

In PHP, isset() and empty() are two important functions used to check if a variable has a value or not. 
Both of these functions return a boolean value indicating whether the variable has a value or not.

The isset() function checks if a variable is set and not null. It returns true if the variable exists and has a value other than null. Here's an example:




$name = "John";
if (isset($name)) {
  echo "The variable is set and has a value.";
} else {
  echo "The variable is not set or has a null value.";
}



In this example, the isset() function checks if the variable $name is set and not null.
Since $name has the value "John", the isset() function will return true, and the message "The variable is set and has a value." will be displayed.

The empty() function, on the other hand, checks if a variable is empty or not.
It returns true if the variable is empty, meaning it has a value of false, 0, "" (an empty string), null, array() (an empty array), 
or a variable that has been unset. Here's an example:


$age = "";
if (empty($age)) {
  echo "The variable is empty.";
} else {
  echo "The variable is not empty.";
}


In this example, the empty() function checks if the variable $age is empty. Since $age has an empty string as its value, 
the empty() function will return true, and the message "The variable is empty." will be displayed.

It's important to note that isset() and empty() behave differently when dealing with undefined variables.
If you pass an undefined variable to the isset() function, it will return false, whereas the empty() function will generate a warning and return true.

















