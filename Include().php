include() is a PHP function that allows you to include and run external PHP scripts within another PHP script.

The include() function takes a single argument, which is the name of the file to be included.
If the file exists and can be opened, its contents are included in the current script and executed as if they were part of the current script.

Syntax:

include ('filename.php');


The include() function is often used to separate the code into different files for better organization and maintainability.
For example, you could define a set of utility functions in a separate PHP file, and then include that file in your main script to use those functions.

The include() function is similar to the require() function, which also includes external files, but with one key difference: 
if the file cannot be included, require() will produce a fatal error and stop the script execution, while include() will only produce 
a warning and continue the script execution.

Example:

// Include a file with utility functions
include 'utils.php';

// Use a function from the included file
$result = addNumbers(10, 20);
echo $result;


In this example, we include a file called utils.php that contains a function called addNumbers().
We then call the addNumbers() function in our main script and print the result.







































//
