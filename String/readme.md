# String 

Strings in Java are Objects that are backed internally by a char array. 
Since arrays are immutable(cannot grow), Strings are immutable as well. 
Whenever a change to a String is made, an entirely new String is created. 

String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.

### what is mean by the <a href = "https://www.programiz.com/java-programming/examples/create-immutable-class">Immutable</a> ?

Syntax:
```java
<String_Type> <string_variable> = "<sequence_of_string>";

String str = "Geeks";
```

Memory allotement of String
Whenever a String Object is created as a literal, the object will be created in String constant pool. 
This allows JVM to optimize the initialization of String literal.
Example:
```java
String str = "Geeks";
```

The string can also be declared using new operator i.e. dynamically allocated. 
In case of String are dynamically allocated they are assigned a new memory location in heap. 
This string will not be added to String constant pool.

Example:
```java
String str = new String(str);
```

# Interfaces and classes in java string
1. CharBuffer
2. String
   String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.
  - There is a two to create string-
    - String Literals
    - Using new keywords
3. StringBuffer

4. StringBuilder
   The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the              StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
   
   syntax:
   ```java
   StringBuilder str = new StringBuilder();
   str.append("GFG");
   ```
5. StringTockenizer
   StringTokenizer class in Java is used to break a string into tokens. 
   
   syntax:
   ```java
   
   ```



 


