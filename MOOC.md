## Week 1 
1. Classes and interfaces can be grouped into packages.    
 (e.g. Java.lang package contains fundamental classes. Java.util contains a collections of reusable ADTs.)
2. Make classes and interfaces into packages makes it easier to avoid collisions between classes and interfaces that have the same common name.    
 (Remember full name = package name + class name.)
3. Generics?

## Module 1 - Intro
1. Key object-oriented programming concepts: abstraction, inheritance, and polymorphism.
2. Examples of data abstraction features supported by Java: classes, interfaces.
3. `ADT` defines a set of data values and a set of operations on these values.
4. Differences between Java `classes` and `interfaces`: 
 * Java interface cannot be instantiated directly, whereas a class can
 * Java interface provides a subset of the features provided by a Java class
5. Benefits of Java `generics`:
 * ensure compile-type safety when operating on different types
 * help eliminate unnecessary duplication of code
6. Benefit of `inheritance`: enhances reuse by allowing classes to reuse common state and behavior from other class.
7. The purpose of `exception handling`: 
 * separates the control flow paths of normal app execution from the control flow paths of anomalous app execution
 * makes Java apps more robust and easier to understand and evolve
8. The purpose of `polymorphism`: enables transparent customization of methods in a subclass that are inherited from a super class.

## Module 2 - Android Studio
1. File tree:
 * manifests: contains .xml files that describe how the Android platform should interact with your project.
 * java: contains logic and code for the project (source codes files and test files)
 * res: resources (images, layout files etc.)
2. Among them, the two files that you will always create and edit are Java source code and resource files.
 * Java class: CapitalLetterForEachWord
 * layout files: all_lower_case_and_with_underscore.xml
3. Virtual Machine (VM) allows you to run your app on your developing machine as if it is running on an Android machine.
 * API = Application Program Interface
 * ABI = Application Binary Interface
 * For this course, we choose API = `22`, ABI = `armeabi-v7a`, Target = `Android 5.1 (with Google APIs)`.
4. Logging:
 Android has six logging levels: `Assert`, `Error`, `Warning`, `Info`, `Debug` and `Verbose`.    
 While filter the levels, you can only see the level that matches or the levels above the current level.

## Module 3
- `CPU` (central processing unit), the main component of a computer system.
 - `ALU` (arithmatic logic unit), which does all the mathematical and logic computations. 
 - control unit, directs what happens.
- Memory
 - `RAM` (random access memory)
 - `ROM` (read only memory)
 - high speed cache
- Input devices, that allow users to put information into the computer.
- Output devices, that allow the computer to provide information back to the user.

1. `RAM` stores the running program.
2. A `bit` is a binary digit that stores either 0 or 1.    
 A `byte` = 8 `bit`s, every `byte` has a unique address.
3. Java is a bit different from ither languages: its compiler does not produce object code that only runs on a particular computer. Instead, the Java compiler produces what is known as a byte-code, which is object code for a hypothetical computer, or what we call a virtual machine. This byte-code is a low level code that can run on **any computer** that has a piece of software known as the Java Virtual Machine (`JVM`). 
4. A value of any type can be assigned to the type to the right:    
 `byte -> short -> int -> long -> float -> double`
5. If `distance` is `9.7`, then `(int)distance` is `9`, but the value of `distance` does not change - a new value was created to represent the rounded value of distance.
6. %8d = an integer, 8 characters wide, right-aligned    
 %-8d = an integer, 8 characters wide, left-aligned    
 %.4f = a real number, 4 characters after decimal    
 %6.2f = a real number, 6 characters wide, 2 after decimal (rounded)    
 Note that width specifications set a minimum width (it can overflow)
7. Adding a char and an int, returns an int: `'a' + 7 // 104`.    
 To convert back to a char, use a cast: `(char)('a' + 7) // 'h'`
8. Differences between string and char: string is an object so we can call method to it, but char is not an object and we cannot call method to it.
9. Declaring a static method:    
 public static return_type name(parameters) {    
 statement1;    
 statement2;    
 }
10. In the Android, if you have a method that needs to access the out object for printing to the screen, you will need to remove the `static` keyword from the method header for the method to work correctly. If your helper methods simply take in parameters and return values and do not print anything to the out object, then they can remain as static methods. 
11.    
 ![](https://github.com/Illithor/learn-java/blob/master/screenshot/M3L6P1.png)
