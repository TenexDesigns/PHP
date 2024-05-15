Magic methods in PHP are special methods that are triggered automatically in certain situations. They provide powerful mechanisms for customizing object behavior and can simplify common tasks. All magic methods in PHP start with a double underscore (`__`).

### Common Magic Methods and Their Uses

1. **`__construct()`**
   - **Purpose:** Called when a new object is instantiated. It is used to initialize properties or perform setup tasks.
   - **Example:**
     ```php
     class MyClass {
         public function __construct($name) {
             $this->name = $name;
         }
     }

     $obj = new MyClass('John');
     ```

2. **`__destruct()`**
   - **Purpose:** Called when an object is destroyed. It can be used for cleanup tasks, such as closing database connections or releasing resources.
   - **Example:**
     ```php
     class MyClass {
         public function __destruct() {
             echo 'Object destroyed';
         }
     }

     $obj = new MyClass();
     unset($obj);
     ```

3. **`__call($name, $arguments)`**
   - **Purpose:** Invoked when an inaccessible or non-existent method is called on an object. This can be used to handle method calls dynamically.
   - **Example:**
     ```php
     class MyClass {
         public function __call($name, $arguments) {
             echo "Calling method '$name' with arguments: " . implode(', ', $arguments);
         }
     }

     $obj = new MyClass();
     $obj->undefinedMethod('arg1', 'arg2');
     ```

4. **`__callStatic($name, $arguments)`**
   - **Purpose:** Invoked when an inaccessible or non-existent static method is called. Similar to `__call()`, but for static methods.
   - **Example:**
     ```php
     class MyClass {
         public static function __callStatic($name, $arguments) {
             echo "Calling static method '$name' with arguments: " . implode(', ', $arguments);
         }
     }

     MyClass::undefinedStaticMethod('arg1', 'arg2');
     ```

5. **`__get($name)`**
   - **Purpose:** Invoked when trying to access an inaccessible or non-existent property. It allows for custom behavior when getting properties.
   - **Example:**
     ```php
     class MyClass {
         private $data = ['name' => 'John'];

         public function __get($name) {
             if (array_key_exists($name, $this->data)) {
                 return $this->data[$name];
             }
             return null;
         }
     }

     $obj = new MyClass();
     echo $obj->name; // Outputs: John
     ```

6. **`__set($name, $value)`**
   - **Purpose:** Invoked when trying to set an inaccessible or non-existent property. It allows for custom behavior when setting properties.
   - **Example:**
     ```php
     class MyClass {
         private $data = [];

         public function __set($name, $value) {
             $this->data[$name] = $value;
         }
     }

     $obj = new MyClass();
     $obj->name = 'John';
     ```

7. **`__isset($name)`**
   - **Purpose:** Invoked when `isset()` or `empty()` is called on an inaccessible or non-existent property.
   - **Example:**
     ```php
     class MyClass {
         private $data = ['name' => 'John'];

         public function __isset($name) {
             return isset($this->data[$name]);
         }
     }

     $obj = new MyClass();
     var_dump(isset($obj->name)); // Outputs: bool(true)
     ```

8. **`__unset($name)`**
   - **Purpose:** Invoked when `unset()` is called on an inaccessible or non-existent property.
   - **Example:**
     ```php
     class MyClass {
         private $data = ['name' => 'John'];

         public function __unset($name) {
             unset($this->data[$name]);
         }
     }

     $obj = new MyClass();
     unset($obj->name);
     ```

9. **`__sleep()`**
   - **Purpose:** Invoked when `serialize()` is called. It allows you to specify which properties should be serialized.
   - **Example:**
     ```php
     class MyClass {
         private $data = 'some data';

         public function __sleep() {
             return ['data'];
         }
     }

     $obj = new MyClass();
     $serialized = serialize($obj);
     ```

10. **`__wakeup()`**
    - **Purpose:** Invoked when `unserialize()` is called. It allows you to reinitialize properties or resources.
    - **Example:**
      ```php
      class MyClass {
          private $data;

          public function __wakeup() {
              $this->data = 'woken up';
          }
      }

      $obj = unserialize($serialized);
      ```

11. **`__toString()`**
    - **Purpose:** Invoked when an object is treated as a string, such as in `echo` or `print`.
    - **Example:**
      ```php
      class MyClass {
          public function __toString() {
              return 'MyClass object';
          }
      }

      $obj = new MyClass();
      echo $obj; // Outputs: MyClass object
      ```

12. **`__invoke()`**
    - **Purpose:** Invoked when an object is called as a function.
    - **Example:**
      ```php
      class MyClass {
          public function __invoke($argument) {
              echo 'Called with argument: ' . $argument;
          }
      }

      $obj = new MyClass();
      $obj('Hello'); // Outputs: Called with argument: Hello
      ```

13. **`__set_state($array)`**
    - **Purpose:** Invoked when `var_export()` is called. It allows you to return an object from the exported state.
    - **Example:**
      ```php
      class MyClass {
          public $property;

          public static function __set_state($array) {
              $obj = new self();
              $obj->property = $array['property'];
              return $obj;
          }
      }

      $obj = new MyClass();
      $obj->property = 'value';
      eval('$newObj = ' . var_export($obj, true) . ';');
      ```

14. **`__clone()`**
    - **Purpose:** Invoked when an object is cloned using the `clone` keyword. It allows you to customize the cloning process.
    - **Example:**
      ```php
      class MyClass {
          public function __clone() {
              // Perform any deep copying needed here
          }
      }

      $obj = new MyClass();
      $clonedObj = clone $obj;
      ```

15. **`__debugInfo()`**
    - **Purpose:** Invoked when `var_dump()` is called. It allows you to customize the information displayed.
    - **Example:**
      ```php
      class MyClass {
          private $data = 'secret';

          public function __debugInfo() {
              return ['data' => $this->data];
          }
      }

      $obj = new MyClass();
      var_dump($obj);
      ```

### Summary

Magic methods in PHP provide a way to define custom behavior for various operations on objects, such as object construction, method calls, property access, serialization, and cloning. By using these methods, developers can create more flexible and dynamic classes. However, it’s important to use magic methods judiciously to maintain code readability and performance.
