The `filter_var()` function in PHP is a versatile and powerful tool used to both validate and sanitize data. Sanitization refers to the process of cleaning input data by removing or encoding unwanted characters to prevent security vulnerabilities like SQL injection or XSS attacks. Here’s a detailed overview of what can be sanitized using `filter_var()` and the associated filter options.

### Common Sanitization Filters

1. **FILTER_SANITIZE_STRING / FILTER_SANITIZE_FULL_SPECIAL_CHARS**
   - **Description:** Removes tags and encodes special characters to HTML entities. This filter is useful to sanitize input that will be displayed as HTML.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_FULL_SPECIAL_CHARS)`

2. **FILTER_SANITIZE_EMAIL**
   - **Description:** Removes all characters except letters, digits, and `!#$%&'*+-/=?^_`{|}~@.[]`. This filter helps ensure that the input is a well-formed email address.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_EMAIL)`

3. **FILTER_SANITIZE_URL**
   - **Description:** Removes all characters except letters, digits, and `:/?#[]@!$&'()*+,;=.`, making the input safe to be used as a URL.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_URL)`

4. **FILTER_SANITIZE_NUMBER_INT**
   - **Description:** Removes all characters except digits and `+` and `-` signs, making the input safe to be used as an integer.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_NUMBER_INT)`

5. **FILTER_SANITIZE_NUMBER_FLOAT**
   - **Description:** Removes all characters except digits, `+`, `-`, `.` and `,` depending on the specified flags. This filter makes the input safe to be used as a float.
   - **Flags:**
     - `FILTER_FLAG_ALLOW_FRACTION` to allow decimal points.
     - `FILTER_FLAG_ALLOW_THOUSAND` to allow thousand separators.
     - `FILTER_FLAG_ALLOW_SCIENTIFIC` to allow scientific notation.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_NUMBER_FLOAT, FILTER_FLAG_ALLOW_FRACTION | FILTER_FLAG_ALLOW_THOUSAND)`

6. **FILTER_SANITIZE_SPECIAL_CHARS**
   - **Description:** Encodes special characters to HTML entities, preventing XSS by ensuring the input is safe to be displayed as HTML.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_SPECIAL_CHARS)`

7. **FILTER_SANITIZE_ENCODED**
   - **Description:** URL-encodes string by replacing all non-alphanumeric characters except `-_.` with percent-encoded characters.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_ENCODED)`

8. **FILTER_SANITIZE_MAGIC_QUOTES**
   - **Description:** Applies `addslashes()` to the input, escaping quotes, backslashes, and NUL characters. Note that `magic quotes` is deprecated and not recommended for use.
   - **Usage:** `filter_var($input, FILTER_SANITIZE_MAGIC_QUOTES)`

### Example Usage

```php
$input_string = "<h1>Hello, World!</h1>";

// Sanitize string to remove HTML tags
$sanitized_string = filter_var($input_string, FILTER_SANITIZE_STRING); // Deprecated, use FILTER_SANITIZE_FULL_SPECIAL_CHARS instead
echo $sanitized_string; // Outputs: Hello, World!

$email = "john.doe@example.com<script>alert('XSS')</script>";
$sanitized_email = filter_var($email, FILTER_SANITIZE_EMAIL);
echo $sanitized_email; // Outputs: john.doe@example.com

$url = "https://www.example.com/?search=<script>alert('XSS')</script>";
$sanitized_url = filter_var($url, FILTER_SANITIZE_URL);
echo $sanitized_url; // Outputs: https://www.example.com/?search=alert('XSS')

$int = "42a";
$sanitized_int = filter_var($int, FILTER_SANITIZE_NUMBER_INT);
echo $sanitized_int; // Outputs: 42

$float = "3.14abc";
$sanitized_float = filter_var($float, FILTER_SANITIZE_NUMBER_FLOAT, FILTER_FLAG_ALLOW_FRACTION);
echo $sanitized_float; // Outputs: 3.14
```

### Conclusion

Using `filter_var()` with appropriate sanitization filters ensures that the data is clean and safe to be used in your application. It's a crucial step in securing user input and preventing common web vulnerabilities.
