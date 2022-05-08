# String 

Strings in Java are Objects that are backed internally by a char array. 
Since arrays are immutable(cannot grow), Strings are immutable as well. 
Whenever a change to a String is made, an entirely new String is created. 

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


