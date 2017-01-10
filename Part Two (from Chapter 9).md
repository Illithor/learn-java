## Chapter 9 - constructors and garbage collection
1. Objects live on the heap (also known as garbage-collectible heap), while method invocations and local variables live on the stack.
 Instance variables live within the object is on the heap. If the instance variable is a reference to an object, both the instance variable and the object are on the heap.
2. Instance variables are declared inside a *class* but not Inside a method.    
 Local variables are declared Inside a *method*, Including method parameters.
3. When you call a method, the method lands on the top of a call stack.    
 The method on the top of the stack is always the currently executing method.
4. Remember, a non-primitive variable holds a reference to an object.
5. If the local variable is a reference to an object, only the variable (the reference/remote control) goes on the stack. The object itself still goes in the heap.
6. No matter where the object is declared (inside a method / as an instance variable of a class), the object always gets on the heap.
7. lf the instance variable is declared but no object is assigned to it, then only the space for the reference variable (the remote control) is created.    
 No actual object is made on the heap until the reference variable is assigned a new object.
 
 ```java
 public class CellPhone {
 private Antenna ant;
 }  
 // will only create the space for a CellPhone object
 public class CellPhone {
 private Antenna ant = new Antenna();
 }
 // will make both the CellPhone and the Antenna on the heap
 ```
8. The only way to invoke a constructor is with the keyword new followed by the class name.
9. The key feature of a constructor is that it runs before the object can be assigned to a reference.
10. Difference between method and constructor: Methods must have a return type, but constructors cannot have a return type.
11. If you have more than one constructor in a class, it means you have overloaded constructors.
 ![](https://github.com/Krabapple/learn-java/blob/master/screenshot/09-11.png)
12. If you write a constructor that takes arguments, and you still want a no-arg constructor, you'll have to build the no-arg constructor yourself! (The JVM won’t write it for you!)
13. If you have more than one constructor in a class, the constructors MUST have different argument lists.
14. You can have two constructors that have identical types, as long as the order is different.
 ![](https://github.com/Krabapple/learn-java/blob/master/screenshot/09-14.png)
15. Four things about constructor:
 * A constructor is the code that runs when somebody says **new** on a class type.
 * A constructor must have the **same name** as the class, and **no** return type.
 * If you don't put a constructor in your class, the compiler puts in a default constructor. The default constructor is always a no-arg constructor.
 * You can have more than one constructor in your class, as long as the argument lists are different. Having more than one constructor in a class means you have overloaded constructors.
16. All the constructors in an object's inheritance tree must run when you make a new object.
17. You can never say new on an abstract class.
18. Constructor chaining: when a constructor runs, it immediately calls its superclass constructor, all the way up the chain until you get to the class Object constructor.
19. If you make a new Hippo, the output may be:

 ```
 Making an Animal.
 Making a Hippo.
 ```
 Hippo was the first to put on the stack, but then Animal goes to the top, then Object, then Object finishes its task and it leaves, then Animal says “Making an Animal” and disappears, and the remaining Hippo will finally say its words.
20. The only way to call a super constructor is by calling super(), and the call to super() must be the **first** statement in each constructor. If you do not write super() in your constructor, the compiler will do it for you.
 You **can** write a super() as the first statement explicitly, or you **can** also eliminate the super() and let the compiler to add it for you in the first line. However, you **cannot** write super() explicitly without putting it in the first line.
21. The superclass parts of an object have to fully-formed (completely built) before the subclass parts can be constructed.
22. Use this() to call a constructor from another overloaded constructor in the same class.
23. You can say this() **only** within a **constructor**, and it must be the **first** statement in the constructor!
24. Every constructor can have a call to super() or this(), but never both! (Since only one of them can be the first statement.)
25. A local variable lives only within the method that declared the variable. No other code in the class (or any other class) can see “s”.
 An instance variable lives as long as the object does.
26. A **local** variable disappears when the method ends.
 An **instance** variable can still be used elsewhere in the object after some of the methods end.
27. Note the difference between **life** and **scope**:
 Basically a variable is in scope when its method is on the top of the stack.
 For example, if we have    
`crazy() c`    
`go() x z`    
`doStuff() b`    
 Then c is alive and in scope, while x, z and b are alive but out of scope.
 When crazy() completes, c is dead, x and z are alive and in scope, b is alive but out of scope.
 You can use a variable only when it is in scope.
28. An object is alive as long as there are live references to it. In contrast, an object becomes
eligible for GC when its last live reference disappears.

## Chapter 10 - numbers and statics
1. ` max()` `min()` `round()` `abs()`, these methods never use instance variable values.
2. You can NEVER say new to a Math class to create a new Math object.
3. The keyword **static** lets a method run without any instance of the class.
4. Often (although not always), a class with static methods is not meant to be instantiated.
![](https://github.com/Illithor/learn-java/blob/master/screenshot/10-04.png)

5. And again, it's impossible to instantiate an abstract class.
6. But you can restrict other code from instantiating a non-abstract class by marking the constructor private. (a method marked private means that only code from within the class can invoke the method)
7. A static method:    
 * cannot refer to any **instance variables** of the class. (as it does not know any of the objects or instance variables on the heap.)
 * cannot use **non-static methods** either. (since the non-static method may use instance variables, which go back to the same old question - whose variable? The static method doesn’t know the objects. Even the non-static method uses no instance variables, the code still won’t compile, because there may be an override method that consumes instance variables later.)    
 STATIC METHOD = DO NOT NEED INSTANCE (YOU CAN USE CLASS TO CALL IT DIRECTLY)
 See this link for more details: http://www.cnblogs.com/shenliang123/archive/2011/10/27/2226923.html
8. Static variables are **shared**.    
 For example, as for duck-counting, each duck **object** has its own size/color/age variable, but there’s only one copy of the duckCount variable - the one shared in the **class**.
9. All instances of the same class share a single copy of the static variables.
10. Instance variables: 1 per **instance**    
 Static variables: 1 per **class**
11. Static variables are initialized when a class is loaded.
12. Static variables in a class are initialized before any object of that class can be created.    
 Static variables in a class are initialized before any static method of the class runs. 
13. Static final variables are constants and constant variable names should be in all caps!
14. To initialize a **final** static variable, you should do it:
 * At the time you declare it
 * In a static initializer
 If you do not initialize the final static variable, the compiler will catch it!
15. Final = cannot change
16. A static method **can't** access a non-static variable, but a non-static method **can** access a static variable.
17. To make a constant in Java, mark a variable as both static and final.
18. Wrapper class names are different from primitives! (pay attention to `Integer` and `Character`.)
19. Wrap and unwrap (before Java 5.0):
![](https://github.com/Illithor/learn-java/blob/master/screenshot/10-19.png)

20. Before Java 5.0, you could not specify the type of `ArrayList`. It is only a list of objects.
![](https://github.com/Illithor/learn-java/blob/master/screenshot/10-20.png)    
After Java 5.0:
![](https://github.com/Illithor/learn-java/blob/master/screenshot/10-20a.png)

21. Inside the parentheses of ArrayList<>, you can only write class or interface types, not primitives. For example, `ArrayList<Integer>` is right, but `ArrayList<int>` is wrong.
22. If a method takes:
 * a wrapper type - you can pass a reference to a wrapper or a primitive of the matching type.
 * a primitive - you can pass in either a compatible primitive or a reference to a wrapper of that primitive type.
 If a method declares:
 * a primitive return type - you can return either a compatible primitive or a reference to the wrapper of that primitive type. 
 * a wrapper return type - you can return either a reference to the wrapper type or a primitive of the matching type.
23. Formatting consumes two parts:
 * formatting instructions
 * arguments to be formatted
24. A format specifier can have up to five different parts:    
 `%[argument number] [flags] [width] [.precision]type`, in which `type` is the only **required** specifier.
25. `%d = decimal`    
 `%f = float`    
 `%x = hexadecimal`    
 `%c = character`    
 `%tc = complete date and time`    
 `%tr = just time`    
 `%tA, %tB %td = day in week, month day`
 ```java
Date today = new Date();
String.format(“%tA, %tB %td”, today, today, today);
=> Sunday, November 28

Date today = new Date();
String.format(“%tA, %<tB %<td”, today);
=> Sunday, November 28
 ```
26. Use the Java API java.util.GregorianCalendar to deal with time problems.
27. Again, **static methods are called on the class, rather than on a particular instance.**
28. If you're only going to use astatic member a few times, you should avoid static Imports, to help keep the code more readable.    
 But if you're going to use astatic member a lot, (like doing lots of Math calculations), then it's probably OK to use the static Import.
 ```java
 // without static import
 import java.lang.Math;
 class NoStatic {
   public static void main (string[] args) {
     System.out.println("sqrt" + Math.sqrt(2.0);
     System.out.println("tan" + Math.tan(60));
   }
   
 // with static import
  import static java.lang.System.out;
  import static java.lang.Math.*;
  class NoStatic {
    public static void main (string[] args) {
      out.println("sqrt" + sqrt(2.0);
      out.println("tan" + tan(60));
    }
  }
```
