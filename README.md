# learn-java
## How to use Eclipse
### Always remember to right click on the project to add a new class, or you can't launch it.

## Chapter 1
1. source file -> class -> method -> statement.
2. Every Java application has to have at least one class and at least one main method.
3. The main() method is where your program starts running.    
   No matter how big your program is, there's got to be a main() method to get the ball rolling.   
   i.e. it's not true that every class should have a main method - **but at least one main method in the whole file**.
4. Assignment operator "=" and equal operator "==" are different. Make sure you pick the right one.    
5. The only varIable you can directly test (without using a comparison operator) is a boolean. 
  ~~~~
  // this piece of code is not correct
  int x = 1;
  while (x) { };
  
  // but this one is correct
  boolean isNot = true;
  while (isNot) { };
  ~~~~
  
  
## Chapter 2 - class and object
1. Superclass <-> Subclass
2. The subclasses inherit the methods of the superclass i.e. if the a class has the functionality, then its subclasses automatically get that same functionality.    
   But it can be a little different: subclasses can override what is written in the superclass.
3. Things an object knows about itself are called instance variables.    
   Things an object can do are called methods.
4. Object = instance variables + methods    
   But instance variables and methods are designed as part of class.
5. A class is not an object. One class. Many objects.
6. To create an object, we need two classes - one *real* class and one *tester* class.
7. We put the main method under the *tester* class and in that main class we create and access objects in the new class type.
8. A real Java application =  object talking to object.

## Chapter 3 - primitives and references
1. Variables come in two flavors: primitive and reference.
2. Java cares about type. VARIABLES MUST HAVE A TYPE AND A NAME.
3. Java thinks all number with a floating point is a double unless you put a “f” at the last digit of a number.
4. You mustn’t put a big thing into a small thing. But putting a small thing into a big thing is fine.
5. A name must start with a letter, underscore (_), or dollar sign ($). You can't start a name with a number.
6. Eight primitive types: Boolean Char Byte Short Int Long Float Double.
7. All references for a given JVM will be the same size regardless of the objects they reference.
8. Every element in an array is a variable.
9. An array is an object, even it is an array of primitives.
10. In an array of type int (int[]) . each element can hold an int. (Because int is a primitive)   
    In a Dog array (Dog[]), each element can hold... a Dog? No, remember that **a reference variable just holds a reference (a remote control), not the object itself**. So in a Dog array, each element can hold a remote control to a Dog.
11. Arrays are always objects.
12. Once declared an array, you can't put anything in it except things that are of the declared array type.

## Chapter 4 – methods use instance variables
1. A class is the blueprint for an object. It defines what the object(s) know(s) and do(es).
2. `dog.bark(3); =  dog.bark(); dog.bark(); dog.bark();`
3. A `void` return type does not give anything back.
4. When the value of x is passed to z and we change z’s value, the value of x doesn’t change. What passed to z is only a **copy** of x’s value.
5. You can return a *byte* where an *int* is expected. However, you can’t return a big stuff into what expects a small stuff.
6. A method **must** declare a return type.    
   But you can make a method returns a non-void result without using it. By doing that, you are calling the method for what it does inside. It is legal. Java doesn’t force you to use the returned value.
7. Java cares about type, both when taking a value and returning a value.
8. You shouldn’t let your instance variables exposed. So you must build a setter to stop accessing the data directly. So you should encapsulate!
9. Encapsulation rule of thumb: mark the instance variables *private* and provide *public* getters and setters.
10. `int x = 3 + one.getSize();` is available if one.getSize() returns an int.
11. Instance variables always have a default value.    
    Int: 0    Float: 0.0    Booleans: false    References: null (not an object,is a reference)
12. Instance and local variables:    
    Instance variables are declared inside a class but not within a method.    
    Local variables are declared within a method.
13. `LOCAL VARIABLES DO NOT HAVE A DEFAULT VALUE!` You can’t use a local variable before initialize it.
14. Use “==” to see if two **primitives** or **reference variables** are same.    
    For primitives: the == operator can be used to compare two variables of any kind, and it simply compares the bits. (i.e. int a = 3; byte b = 3; a == b is true.)    
    For reference variables: the == operator returns true if two reference variables refer to the same object.
    Use `.equal()` to see if two objects are same.

## Chapter 5 - writing a program
1. Prep Code – Test Code – Real Code.    
   Prep Code: a form of pseudocode to help you focus on the logic without stressing about syntax.    
   Test Code: a class or methods that will test the real code and validate that it's doing the right thing.    
   Real Code: the actual implementation of the class.
2. Figure out what the class is supposed to do:
   * List the Instance variables and methods.
   * Write prep code for the methods.
   * Implement the class.
   * Test the methods.
   * Debug and reimplement as needed.
