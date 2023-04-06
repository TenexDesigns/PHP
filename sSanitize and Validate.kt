To sanitize is to remove unwanted  characters from the data ,
While validating means not accepting the data submited if it does not meet he requured criteria.

username = 212\\44

$user = filter_input(INPUT_POST,"username",FILTER_SANITIZE_NUMBER_INT) ---> This will return 21244 . It removes the unwanted  charactres from the value received from post in the form saubmitted by the html.
$user = filter_input(INPUT_POST,"username",FILTER_VALIDATW_NUMBER_INT) ---> This will return NOTHING . Since there are characters that are not numbers in the given answer. 


















