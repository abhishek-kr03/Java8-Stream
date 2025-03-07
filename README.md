# Java 8: Lambda Expressions, Stream API & Functional Interfaces

This repository contains a comprehensive guide to **Java 8** features including **Lambda Expressions**, **Stream API**, and key **Functional Interfaces**: `Supplier`, `Consumer`, `Predicate`, and `Function`.

## 📚 What is Java 8 Stream API?
The **Stream API** in Java 8 allows you to process collections (like Lists, Sets) in a **declarative**, **functional** style. It simplifies operations like filtering, mapping, and reducing data, making code more **concise**, **readable**, and **efficient**.

### Why Use Stream API?
- **Cleaner Code**: No need for complex `for` loops.
- **Efficiency**: Optimized internal iterations.
- **Lazy Execution**: Operations execute only when a terminal operation is called.

## 🔍 Difference Between Intermediate and Terminal Operations

| Feature               | Intermediate Operation                   | Terminal Operation                      |
|-----------------------|------------------------------------------|-----------------------------------------|
| **Definition**        | Transforms a stream but does not produce results immediately. | Produces a final result and ends the stream pipeline. |
| **Lazy Execution**    | ✅ Yes (Executes only when a terminal operation is called). | ❌ No (Executes immediately). |
| **Return Type**       | **Stream** (Allows chaining more operations). | **Non-Stream** (Returns a final value or performs a side-effect). |
| **Examples**          | `filter()`, `map()`, `sorted()`, `distinct()` | `forEach()`, `collect()`, `count()`, `reduce()` |
| **Chaining**          | ✅ Yes (Can be chained). | ❌ No (Ends the pipeline). |

👉 **Simple Definition:** Intermediate operations **prepare** the data (like filtering or mapping), while terminal operations **produce** the final result (like collecting or printing).

## 🧑‍💻 Key Functional Interfaces in Java 8

### 1. `Supplier<T>`
- **Definition**: Provides a value without taking any input.
- **Method**: `T get()`
- **Use Case**: Useful for **generating** or **providing** values.

```java
Supplier<String> supplier = () -> "Hello, World!";
System.out.println(supplier.get()); // Output: Hello, World!
```

### 2. `Consumer<T>`
- **Definition**: Accepts a value but does not return anything.
- **Method**: `void accept(T t)`
- **Use Case**: Useful for **performing actions** like **logging** or **printing**.

```java
Consumer<String> consumer = message -> System.out.println("Message: " + message);
consumer.accept("Hello"); // Output: Message: Hello
```

### 3. `Predicate<T>`
- **Definition**: Tests a condition and returns a boolean.
- **Method**: `boolean test(T t)`
- **Use Case**: Useful for **filtering** or **validating** data.

```java
Predicate<Integer> isEven = number -> number % 2 == 0;
System.out.println(isEven.test(4)); // Output: true
```

### 4. `Function<T, R>`
- **Definition**: Takes an input and produces a result.
- **Method**: `R apply(T t)`
- **Use Case**: Useful for **transforming** or **mapping** data.

```java
Function<String, Integer> lengthFunction = str -> str.length();
System.out.println(lengthFunction.apply("Hello")); // Output: 5
```

## 📌 Additional Notes
- Lambda expressions in Java 8 help implement functional interfaces in a **short, readable** form.
- **Streams** allow us to work with data in a functional style, reducing boilerplate code.


## 📖 Learn More
- [Java 8 Official Documentation](https://docs.oracle.com/javase/8/docs/api/)
- [Stream API Guide](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)

## 🤝 Contributions
Feel free to open an **issue** or submit a **pull request** if you want to contribute or improve this guide!

---

**Happy Coding! 🚀**

