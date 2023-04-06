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








































