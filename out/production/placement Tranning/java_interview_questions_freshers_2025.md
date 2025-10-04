Java Interview Questions for Freshers (2025)

1.  What are the main features of Java?
2.  Explain the difference between JDK, JRE, and JVM.
3.  What is the difference between a compiled language and an
    interpreted language?
4.  Why is Java platform-independent?
5.  What is the difference between ‘==’ and ‘equals()’ in Java?
6.  What are wrapper classes in Java?
7.  Explain the concept of Object-Oriented Programming in Java.
8.  What are constructors in Java? Can we overload them?
9.  What is the difference between method overloading and method
    overriding?
10. What is inheritance in Java? What are its types?
11. What is polymorphism in Java?
12. What is encapsulation? Give an example.
13. What is abstraction in Java?
14. Explain the difference between abstract class and interface.
15. Can Java support multiple inheritance?
16. What is the difference between static and non-static methods?
17. What are access modifiers in Java? List them.
18. What is the difference between final, finally, and finalize?
19. What is the use of the ‘super’ keyword in Java?
20. What is the difference between Array and ArrayList?
21. What is the difference between HashMap and Hashtable?
22. What is the difference between List, Set, and Map in Java?
23. What are generics in Java?
24. What is the difference between checked and unchecked exceptions?
25. What is try-catch-finally in Java?
26. What is the difference between throw and throws?
27. What are Java packages? Why are they used?
28. What is the difference between String, StringBuffer, and
    StringBuilder?
29. Why are strings immutable in Java?
30. What is garbage collection in Java? How does it work?
31. What are threads in Java?
32. What is the difference between process and thread?
33. Explain the difference between synchronized and concurrent
    collections.
34. What is the difference between sleep() and wait() methods in Java?
35. What is the lifecycle of a thread?
36. What is the difference between daemon thread and user thread?
37. What are functional interfaces in Java?
38. What are lambda expressions in Java?
39. What is the Stream API in Java?
40. Explain the difference between Comparable and Comparator.
41. What is serialization in Java?
42. What are annotations in Java?
43. What is the difference between transient and volatile keywords?
44. What is the difference between stack memory and heap memory?
45. What is classloader in Java?
46. Explain the difference between JDBC Statement, PreparedStatement,
    and CallableStatement.
47. What is the difference between shallow copy and deep copy?
48. What is the use of ‘this’ keyword in Java?
49. What is the difference between public, private, protected, and
    default access specifiers?
50. What are the new features introduced in Java 17/21 (LTS versions)?

---

# ✅ Java Interview Questions & Answers (Freshers – 2025)

---

### **1. What are the main features of Java?**

* **Object-Oriented:** Everything is treated as objects (inheritance, polymorphism, encapsulation).
* **Platform Independent:** Write once, run anywhere (WORA) due to JVM.
* **Simple & Easy:** Similar to C++ but without complex features like multiple inheritance via classes.
* **Secure:** No explicit pointers, has strong memory management, and security manager.
* **Robust:** Automatic memory management (Garbage Collection), strong exception handling.
* **Multithreaded:** Supports multiple threads execution concurrently.
* **Portable:** Compiled `.class` files can run on any system with JVM.
* **High Performance:** Uses Just-In-Time (JIT) compiler.

---

### **2. Explain the difference between JDK, JRE, and JVM.**

* **JVM (Java Virtual Machine):**

    * Abstract machine that executes bytecode.
    * Provides platform independence.
* **JRE (Java Runtime Environment):**

    * JVM + essential libraries.
    * Needed to run Java programs but not develop them.
* **JDK (Java Development Kit):**

    * JRE + development tools (compiler `javac`, debugger, etc.).
    * Required to write and compile Java programs.

---

### **3. What is the difference between a compiled language and an interpreted language?**

* **Compiled Language (e.g., C, C++):**

    * Source code → Compiler → Machine code.
    * Executes faster but not portable.
* **Interpreted Language (e.g., Python, JavaScript):**

    * Source code → Interpreter → Execution line by line.
    * Slower but portable.
* **Java:** Hybrid (compiled to bytecode, then interpreted/compiled by JVM).

---

### **4. Why is Java platform-independent?**

* Java code is compiled into **bytecode** (not machine-specific).
* The **JVM** on each OS interprets bytecode into native machine code.
* This allows **WORA (Write Once, Run Anywhere)**.

---

### **5. What is the difference between ‘==’ and `equals()` in Java?**

* **`==` (Reference Comparison):**

    * Compares memory addresses.
    * Example: `str1 == str2` → true only if both refer to same object.
* **`equals()` (Content Comparison):**

    * Compares actual object values.
    * Example: `str1.equals(str2)` → true if both strings have same content.

---

### **6. What are wrapper classes in Java?**

* Classes that wrap primitive data types into objects.
* Used for collections, generics, and utility methods.
* Examples:

    * `int → Integer`
    * `char → Character`
    * `double → Double`

---

### **7. Explain the concept of Object-Oriented Programming in Java.**

OOP organizes code around **objects**. Four principles:

1. **Encapsulation** – Wrapping data & methods into a single unit.
2. **Inheritance** – Reuse features from parent class.
3. **Polymorphism** – Many forms (method overloading/overriding).
4. **Abstraction** – Hiding internal implementation, showing only essentials.

---

### **8. What are constructors in Java? Can we overload them?**

* Special methods with the same name as the class.
* Automatically invoked when an object is created.
* Yes, constructors can be **overloaded** by changing parameters.

  ```java
  class Student {
      Student() { System.out.println("Default"); }
      Student(String name) { System.out.println("Name: " + name); }
  }
  ```

---

### **9. What is the difference between method overloading and method overriding?**

* **Overloading:**

    * Same method name, different parameters (compile-time polymorphism).
* **Overriding:**

    * Child class redefines parent’s method with same signature (runtime polymorphism).

---

### **10. What is inheritance in Java? What are its types?**

* **Definition:** Acquiring properties/methods from another class.
* **Types in Java:**

    * **Single Inheritance** → One parent, one child.
    * **Multilevel Inheritance** → Chain of classes.
    * **Hierarchical Inheritance** → One parent, multiple children.
    * **Hybrid (via Interfaces).**
    * **Multiple inheritance not supported via classes** (to avoid ambiguity).

---

### **11. What is polymorphism in Java?**

* Ability of an object to take multiple forms.
* **Compile-time (Overloading).**
* **Runtime (Overriding).**

---

### **12. What is encapsulation? Give an example.**

* Wrapping data (variables) and code (methods) in a class.
* Example:

  ```java
  class Account {
      private int balance;
      public void deposit(int amount) { balance += amount; }
      public int getBalance() { return balance; }
  }
  ```

---

### **13. What is abstraction in Java?**

* Hiding internal details, showing only functionality.
* Achieved via:

    * **Abstract classes** (0–100% abstraction).
    * **Interfaces** (100% abstraction before Java 8, now can have default methods).

---

### **14. Explain the difference between abstract class and interface.**

| Feature     | Abstract Class                              | Interface                                                |
| ----------- | ------------------------------------------- | -------------------------------------------------------- |
| Methods     | Abstract & non-abstract                     | Only abstract (Java 7); default/static allowed (Java 8+) |
| Inheritance | Single                                      | Multiple                                                 |
| Variables   | Can have final/non-final, static/non-static | Only `public static final`                               |
| Use case    | When classes share common base              | For multiple unrelated classes                           |

---

### **15. Can Java support multiple inheritance?**

* **Classes:** ❌ Not supported (to avoid ambiguity).
* **Interfaces:** ✅ Supported (a class can implement multiple interfaces).

---

### **16. What is the difference between static and non-static methods?**

* **Static:**

    * Belong to class, not object.
    * Called without object.
* **Non-static:**

    * Belong to objects.
    * Require object creation.

---

### **17. What are access modifiers in Java? List them.**

1. **public** – Accessible everywhere.
2. **protected** – Accessible within package + subclasses.
3. **default (no modifier)** – Accessible only within package.
4. **private** – Accessible only within class.

---

### **18. What is the difference between final, finally, and finalize?**

* **final** → Keyword (used with class, method, variable).
* **finally** → Block (executes always in exception handling).
* **finalize()** → Method (called by GC before destroying object).

---

### **19. What is the use of the `super` keyword in Java?**

* Access parent class methods, variables, or constructors.

  ```java
  super();  // calls parent constructor
  super.variable;  // parent variable
  super.method();  // parent method
  ```

---

### **20. What is the difference between Array and ArrayList?**

| Feature     | Array               | ArrayList                   |
| ----------- | ------------------- | --------------------------- |
| Size        | Fixed               | Dynamic                     |
| Data types  | Primitive & objects | Only objects                |
| Performance | Faster              | Slower                      |
| Flexibility | Less                | More (many utility methods) |

---
Perfect 👍 Let’s continue and **complete all 50 questions with detailed answers**. I’ll keep the same format (clear, structured, with examples & tables).

---
---

### **21. What is the difference between HashMap and Hashtable?**

| Feature          | HashMap                                  | Hashtable                     |
| ---------------- | ---------------------------------------- | ----------------------------- |
| Thread-safety    | Not synchronized (faster)                | Synchronized (slower)         |
| Null keys/values | 1 null key, multiple null values allowed | ❌ No null key, no null values |
| Introduced       | Java 1.2                                 | Java 1.0 (legacy)             |
| Performance      | Better in single-threaded apps           | Slower due to synchronization |

---

### **22. What is the difference between List, Set, and Map in Java?**

* **List:** Ordered, allows duplicates (`ArrayList`, `LinkedList`).
* **Set:** Unordered, no duplicates (`HashSet`, `TreeSet`).
* **Map:** Key-value pairs, keys unique (`HashMap`, `TreeMap`).

---

### **23. What are generics in Java?**

* Allow **type safety** and **code reusability**.
* Example:

  ```java
  List<String> names = new ArrayList<>();
  names.add("John");
  // names.add(123); ❌ Compile-time error
  ```

---

### **24. What is the difference between checked and unchecked exceptions?**

* **Checked exceptions:**

    * Checked at **compile time**.
    * Must be handled (e.g., `IOException`, `SQLException`).
* **Unchecked exceptions:**

    * Checked at **runtime**.
    * E.g., `NullPointerException`, `ArithmeticException`.

---

### **25. What is try-catch-finally in Java?**

* **try** → Code that may throw an exception.
* **catch** → Handles the exception.
* **finally** → Executes always (cleanup code).

  ```java
  try {
      int x = 10 / 0;
  } catch (ArithmeticException e) {
      System.out.println("Error: " + e);
  } finally {
      System.out.println("Always executed");
  }
  ```

---

### **26. What is the difference between throw and throws?**

* **throw:** Used to explicitly throw an exception inside a method.
* **throws:** Declares exceptions a method may throw.

  ```java
  void m() throws IOException { throw new IOException(); }
  ```

---

### **27. What are Java packages? Why are they used?**

* **Package:** Group of related classes and interfaces.
* Uses:

    * Avoid name conflicts.
    * Provide access control.
    * Easier maintenance.

  ```java
  package mypackage;
  class MyClass {}
  ```

---

### **28. What is the difference between String, StringBuffer, and StringBuilder?**

| Feature     | String          | StringBuffer       | StringBuilder |
| ----------- | --------------- | ------------------ | ------------- |
| Mutability  | Immutable       | Mutable            | Mutable       |
| Thread-safe | Yes (immutable) | Yes (synchronized) | No (faster)   |
| Performance | Slow            | Medium             | Fast          |

---

### **29. Why are strings immutable in Java?**

* Security (used in networking, class loading).
* Thread-safety.
* Caching (string pool optimization).

---

### **30. What is garbage collection in Java? How does it work?**

* Automatic memory management by JVM.
* **Removes unused objects** from heap.
* Uses algorithms like **Mark and Sweep**.
* Can be requested using `System.gc()`, but JVM decides execution.

---

### **31. What are threads in Java?**

* Lightweight sub-processes.
* Enable **multitasking** within a program.
* Created using:

    * Extending `Thread` class.
    * Implementing `Runnable` interface.

---

### **32. What is the difference between process and thread?**

| Feature       | Process                            | Thread              |
| ------------- | ---------------------------------- | ------------------- |
| Definition    | Independent program                | Sub-part of process |
| Memory        | Own memory space                   | Shared memory       |
| Communication | Inter-process communication needed | Easy (shared data)  |
| Weight        | Heavy                              | Lightweight         |

---

### **33. Explain the difference between synchronized and concurrent collections.**

* **Synchronized collections:** (`Vector`, `Hashtable`) – synchronized methods, but block entire collection.
* **Concurrent collections:** (`ConcurrentHashMap`, `CopyOnWriteArrayList`) – allow better performance with fine-grained locks.

---

### **34. What is the difference between sleep() and wait() methods in Java?**

* **sleep():**

    * Defined in `Thread` class.
    * Temporarily stops execution but does **not release lock**.
* **wait():**

    * Defined in `Object` class.
    * Releases lock and waits until `notify()` or `notifyAll()`.

---

### **35. What is the lifecycle of a thread?**

1. **New** → Created but not started.
2. **Runnable** → Ready to run.
3. **Running** → Executing.
4. **Waiting/Timed Waiting** → Waiting for another thread.
5. **Terminated** → Dead.

---

### **36. What is the difference between daemon thread and user thread?**

* **User thread:** Performs main tasks, keeps JVM alive.
* **Daemon thread:** Runs in background (e.g., Garbage Collector). JVM exits when only daemon threads remain.

---

### **37. What are functional interfaces in Java?**

* Interfaces with **exactly one abstract method**.
* Annotated with `@FunctionalInterface`.
* Example: `Runnable`, `Callable`, `Comparator`.

---

### **38. What are lambda expressions in Java?**

* Introduced in Java 8.
* Provide a clear and concise way to represent a functional interface.

  ```java
  (a, b) -> a + b;  // Lambda expression
  ```

---

### **39. What is the Stream API in Java?**

* Introduced in Java 8.
* Allows functional-style operations on collections.
* Example:

  ```java
  List<String> names = Arrays.asList("A", "B", "C");
  names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
  ```

---

### **40. Explain the difference between Comparable and Comparator.**

| Feature        | Comparable           | Comparator                |
| -------------- | -------------------- | ------------------------- |
| Package        | `java.lang`          | `java.util`               |
| Method         | `compareTo(Object)`  | `compare(Object, Object)` |
| Sorting        | Natural ordering     | Custom ordering           |
| Implementation | Implemented in class | Defined externally        |

---

### **41. What is serialization in Java?**

* Process of converting an object into a byte stream.
* Used for file storage or network transfer.
* Achieved using `Serializable` interface.

---

### **42. What are annotations in Java?**

* Metadata added to classes, methods, variables.
* Example: `@Override`, `@Deprecated`, `@FunctionalInterface`.
* Used by compilers and frameworks (Spring, Hibernate).

---

### **43. What is the difference between transient and volatile keywords?**

* **transient:** Prevents variable from being serialized.
* **volatile:** Ensures variable is read directly from main memory (not cache), making it thread-safe.

---

### **44. What is the difference between stack memory and heap memory?**

| Feature   | Stack                                          | Heap                           |
| --------- | ---------------------------------------------- | ------------------------------ |
| Stores    | Local variables, method calls                  | Objects, class instances       |
| Access    | Fast                                           | Slower                         |
| Memory    | Fixed                                          | Dynamic                        |
| Lifecycle | Created on method call, destroyed after return | Exists until garbage collected |

---

### **45. What is classloader in Java?**

* Part of JVM that loads classes into memory.
* Types:

    1. **Bootstrap ClassLoader** – loads core Java classes.
    2. **Extension ClassLoader** – loads extension libraries.
    3. **Application ClassLoader** – loads user-defined classes.

---

### **46. Explain the difference between JDBC Statement, PreparedStatement, and CallableStatement.**

| Feature     | Statement          | PreparedStatement                   | CallableStatement             |
| ----------- | ------------------ | ----------------------------------- | ----------------------------- |
| Use         | Simple SQL queries | Precompiled queries with parameters | Stored procedures             |
| Performance | Slower             | Faster (cached)                     | Faster                        |
| Parameters  | Not supported      | `?` placeholders                    | Input/output params supported |

---

### **47. What is the difference between shallow copy and deep copy?**

* **Shallow copy:** Copies object references (changes in original reflect in copy).
* **Deep copy:** Copies actual values (independent objects).

---

### **48. What is the use of ‘this’ keyword in Java?**

* Refers to **current object**.
* Uses:

    * Access current object’s variables.
    * Call current object’s methods.
    * Invoke another constructor in same class (`this()`).

---

### **49. What is the difference between public, private, protected, and default access specifiers?**

| Modifier  | Within Class | Within Package | Subclass | Outside Package |
| --------- | ------------ | -------------- | -------- | --------------- |
| public    | ✅            | ✅              | ✅        | ✅               |
| protected | ✅            | ✅              | ✅        | ❌               |
| default   | ✅            | ✅              | ❌        | ❌               |
| private   | ✅            | ❌              | ❌        | ❌               |

---

### **50. What are the new features introduced in Java 17/21 (LTS versions)?**

**Java 17 (LTS):**

* Sealed classes.
* Pattern matching for `switch`.
* Strong encapsulation of JDK internals.
* New macOS rendering pipeline.

**Java 21 (LTS):**

* Virtual Threads (Project Loom).
* Pattern Matching for `switch` (standardized).
* Record patterns.
* Sequenced Collections API.
* String templates (preview).

---


## Examples 
Perfect 🚀 Let’s complete **all 50 Java interview questions with examples**. 

---

#  Java Interview Questions with Examples (Freshers – 2025)

---

### **1. What are the main features of Java?**

* OOP, Platform Independent, Simple, Secure, Robust, Multithreaded, Portable.

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Java Features Example");
    }
}
```

---

### **2. JDK vs JRE vs JVM**

* **JVM**: Executes bytecode.
* **JRE**: JVM + libraries.
* **JDK**: JRE + development tools (`javac`).

```bash
javac MyApp.java   # Compile (JDK)
java MyApp         # Run (JRE + JVM)
```

---

### **3. Compiled vs Interpreted**

* Compiled → C++ (machine code).
* Interpreted → Python (line by line).
* Java → Hybrid (bytecode + JVM).

---

### **4. Why platform-independent?**

* Bytecode runs on any OS with JVM.

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("Run Anywhere");
    }
}
```

---

### **5. `==` vs `equals()`**

* `==`: Reference comparison.
* `equals()`: Value comparison.

```java
String s1 = new String("Java");
String s2 = new String("Java");
System.out.println(s1 == s2);       // false
System.out.println(s1.equals(s2));  // true
```

---

### **6. Wrapper Classes**

* Wrap primitives as objects.

```java
int x = 5;
Integer y = Integer.valueOf(x);
System.out.println(y); // 5
```

---

### **7. OOP Concepts**

Encapsulation, Inheritance, Polymorphism, Abstraction.

```java
class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void sound() { System.out.println("Bark"); } }
```

---

### **8. Constructors & Overloading**

```java
class Student {
    Student() { System.out.println("Default"); }
    Student(String name) { System.out.println("Name: " + name); }
}
```

---

### **9. Overloading vs Overriding**

* Overloading: Compile-time.
* Overriding: Runtime.

```java
class Calc { int add(int a, int b){ return a+b; } double add(double a,double b){ return a+b; } }
class Parent { void show(){ System.out.println("Parent"); } }
class Child extends Parent { void show(){ System.out.println("Child"); } }
```

---

### **10. Inheritance**

Types: Single, Multilevel, Hierarchical, Multiple (via interfaces).

```java
class Animal { void eat(){ System.out.println("eating"); } }
class Dog extends Animal { void bark(){ System.out.println("barking"); } }
```

---

### **11. Polymorphism**

```java
class Shape { void draw(){ System.out.println("Shape"); } }
class Circle extends Shape { void draw(){ System.out.println("Circle"); } }
```

---

### **12. Encapsulation**

```java
class Account {
    private int balance = 1000;
    public void deposit(int amt){ balance += amt; }
    public int getBalance(){ return balance; }
}
```

---

### **13. Abstraction**

```java
abstract class Shape { abstract void draw(); }
class Circle extends Shape { void draw(){ System.out.println("Circle"); } }
```

---

### **14. Abstract Class vs Interface**

```java
interface Animal { void sound(); }
class Dog implements Animal { public void sound(){ System.out.println("Bark"); } }
```

---

### **15. Multiple Inheritance**

```java
interface A { void show(); }
interface B { void display(); }
class C implements A,B { public void show(){ } public void display(){ } }
```

---

### **16. Static vs Non-static**

```java
class Demo {
    static void sMethod(){ System.out.println("Static"); }
    void nsMethod(){ System.out.println("Non-Static"); }
}
```

---

### **17. Access Modifiers**

* public, protected, default, private.

```java
public class Demo {
    public int a; protected int b; int c; private int d;
}
```

---

### **18. final, finally, finalize**

```java
final int x = 10;
try { int y = 5/0; } catch(Exception e){ } finally { System.out.println("Always"); }
protected void finalize(){ System.out.println("Clean-up"); }
```

---

### **19. super keyword**

```java
class Parent { int x = 10; }
class Child extends Parent {
    void print(){ System.out.println(super.x); }
}
```

---

### **20. Array vs ArrayList**

```java
int[] arr = {1,2,3};
ArrayList<Integer> list = new ArrayList<>();
list.add(1); list.add(2);
```

---

### **21. HashMap vs Hashtable**

```java
Map<Integer,String> map = new HashMap<>(); // allows null
Hashtable<Integer,String> ht = new Hashtable<>(); // no nulls
```

---

### **22. List vs Set vs Map**

```java
List<String> list = new ArrayList<>();
Set<String> set = new HashSet<>();
Map<Integer,String> map = new HashMap<>();
```

---

### **23. Generics**

```java
List<String> names = new ArrayList<>();
names.add("Alice"); // only String allowed
```

---

### **24. Checked vs Unchecked Exceptions**

```java
// Checked
try { new FileReader("abc.txt"); } catch(IOException e){ }
// Unchecked
int x = 5/0;
```

---

### **25. try-catch-finally**

```java
try { int x = 10/0; } catch(Exception e){ System.out.println(e); } finally { System.out.println("Done"); }
```

---

### **26. throw vs throws**

```java
void m() throws IOException { throw new IOException("error"); }
```

---

### **27. Packages**

```java
package mypkg;
public class Test {}
```

---

### **28. String vs StringBuffer vs StringBuilder**

```java
String s = "Hi";
StringBuffer sb = new StringBuffer("Hi");
StringBuilder sb2 = new StringBuilder("Hi");
```

---

### **29. Why Strings Immutable?**

* Security, caching, thread-safety.

```java
String s = "Hello";
s.concat("World"); // creates new object
```

---

### **30. Garbage Collection**

```java
public class GC {
    protected void finalize(){ System.out.println("GC called"); }
    public static void main(String[] args){ new GC(); System.gc(); }
}
```

---

### **31. Threads**

```java
class MyThread extends Thread {
    public void run(){ System.out.println("Running..."); }
}
```

---

### **32. Process vs Thread**

* Process = Independent program.
* Thread = Sub-task.

---

### **33. Synchronized vs Concurrent Collections**

```java
List<String> list = Collections.synchronizedList(new ArrayList<>());
ConcurrentHashMap<Integer,String> cmap = new ConcurrentHashMap<>();
```

---

### **34. sleep() vs wait()**

```java
Thread.sleep(1000); // pause, no lock release
synchronized(obj){ obj.wait(); } // releases lock
```

---

### **35. Thread Lifecycle**

New → Runnable → Running → Waiting → Terminated.

---

### **36. Daemon vs User Threads**

```java
Thread t = new Thread();
t.setDaemon(true);
```

---

### **37. Functional Interfaces**

```java
@FunctionalInterface
interface MyFunc { void display(); }
```

---

### **38. Lambda Expressions**

```java
MyFunc f = () -> System.out.println("Hello Lambda");
f.display();
```

---

### **39. Stream API**

```java
List<String> names = Arrays.asList("A","B","C");
names.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
```

---

### **40. Comparable vs Comparator**

```java
class Student implements Comparable<Student> {
    int age; public int compareTo(Student s){ return age - s.age; }
}
Comparator<Student> comp = (s1,s2) -> s1.age - s2.age;
```

---

### **41. Serialization**

```java
class Student implements Serializable { int id; String name; }
```

---

### **42. Annotations**

```java
@Override
public String toString(){ return "Hello"; }
```

---

### **43. transient vs volatile**

```java
transient int a; // not serialized
volatile int x; // thread-safe access
```

---

### **44. Stack vs Heap**

* Stack = local variables.
* Heap = objects.

---

### **45. ClassLoader**

Loads classes into JVM: Bootstrap, Extension, Application.

---

### **46. Statement vs PreparedStatement vs CallableStatement**

```java
Statement st = con.createStatement();
PreparedStatement ps = con.prepareStatement("insert into emp values(?)");
CallableStatement cs = con.prepareCall("{call getEmp(?)}");
```

---

### **47. Shallow vs Deep Copy**

```java
Student s1 = new Student();
Student s2 = s1;  // shallow
Student s3 = new Student(s1); // deep
```

---

### **48. this keyword**

```java
class Demo {
    int x;
    Demo(int x){ this.x = x; }
}
```

---

### **49. Access Specifiers**

* public, protected, default, private.

---

### **50. Java 17/21 Features**

* Java 17: Sealed classes, Pattern Matching for switch.
* Java 21: Virtual Threads, Record patterns, Sequenced collections.

---

✅ Done: All **50 questions with explanations + examples**.
