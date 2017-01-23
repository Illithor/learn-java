## Intro
1. Classes and interfaces can be grouped into packages.    
 (e.g. Java.lang package contains fundamental classes. Java.util contains a collections of reusable ADTs.)
2. Make classes and interfaces into packages makes it easier to avoid collisions between classes and interfaces that have the same common name.    
 (Remember full name = package name + class name.)
3. Generics?

## Module 1
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
