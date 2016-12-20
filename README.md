# learn-java
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
