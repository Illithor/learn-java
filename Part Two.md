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
    
i.e.

```
java
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
(09-11)
12. If you write a constructor that takes arguments, and you still want a no-arg constructor, you'll have to build the no-arg constructor yourself! (The JVM won¡¯t write it for you!)
13. If you have more than one constructor in a class, the constructors MUST have different argument lists.
14. You can have two constructors that have identical types, as long as the order is different.
(09-14)
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
Hippo was the first to put on the stack, but then Animal goes to the top, then Object, then Object finishes its task and it leaves, then Animal says ¡°Making an Animal¡± and disappears, and the remaining Hippo will finally say its words.
20. The only way to call a super constructor is by calling super(), and the call to super() must be the **first** statement in each constructor. If you do not write super() in your constructor, the compiler will do it for you.
 You **can** write a super() as the first statement explicitly, or you **can** also eliminate the super() and let the compiler to add it for you in the first line. However, you **cannot** write super() explicitly without putting it in the first line.
21. The superclass parts of an object have to fully-formed (completely built) before the subclass parts can be constructed.
22. Use this() to call a constructor from another overloaded constructor in the same class.
23. You can say this() **only** within a **constructor**, and it must be the **first** statement in the constructor!
24. Every constructor can have a call to super() or this(), but never both! (Since only one of them can be the first statement.)
25. A local variable lives only within the method that declared the variable. No other code in the class (or any other class) can see ¡°s¡±.
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
