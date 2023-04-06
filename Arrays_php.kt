In PHP, an array is a data structure that stores a collection of values, such as numbers, strings, or even other arrays.
An array can hold any number of elements, and each element is identified by a unique key or index.

There are two types of arrays in PHP: indexed arrays and associative arrays.

Indexed Arrays:
An indexed array is an array where each element is assigned a numeric index starting from 0.
The elements can be of any data type. To create an indexed array in PHP, you can use the array() function, as shown below:


$fruits = array("apple", "banana", "cherry");

You can also use square brackets to create an indexed array, like this:


$fruits = ["apple", "banana", "cherry"];


To access an element in an indexed array, you can use its index:

echo $fruits[0]; // Output: apple
echo $fruits[1]; // Output: banana
echo $fruits[2]; // Output: cherry


                                                        Associative Arrays:

An associative array is an array where each element is assigned a unique key or name. 
The elements can be of any data type. To create an associative array in PHP, you can use the array() function, like this:


$age = array("Peter" => 35, "John" => 42, "Mary" => 27);


You can also use square brackets to create an associative array, like this:


$age = ["Peter" => 35, "John" => 42, "Mary" => 27];


To access an element in an associative array, you can use its key:

echo $age["Peter"]; // Output: 35
echo $age["John"]; // Output: 42
echo $age["Mary"]; // Output: 27













































































































