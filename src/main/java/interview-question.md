## Why string is immutable?
- The String is immutable, so its value cannot be changed. If the String doesn't remain immutable, any hacker can cause a security issue in the application by changing the reference value. The String is safe for multithreading because of its immutableness. Different threads can access a single “String instance”
### Why Collection not support primitive types ?
```collection holds only Object type.

1.objects are more secure than primitive types.

2.ambiguity chances are less. everyone has its own state behavior and identity.

3.objects are good to manage. sorting, searching etc became more easy.
```
### Why encapsulation used?

   - Better maintainability: When all the properties are private and encapsulated, it is easy for us to maintain the program simply by changing the methods.

   - Make Debugging Easy: This is in line with the above point. We know that the object can only be manipulated through methods. So, this makes it easy to debug and catch bugs.

   - Have a Controlled Environment: Let the users use the given objects, in a controlled manner, through objects.

   - Hide Complexities: Hiding the complexities irrelevant to the users. Sometimes, some properties and methods are only for internal use and the user doesn't have to know about these. This makes is simple for the user to use the object.
### Why string has separated pool in heap memory ?
  - It is just like object allocation. By default, it is empty and privately maintained by the Java String class. Whenever we create a string the string object occupies some space in the heap memory. Creating a number of strings may increase the cost and memory too which may reduce the performance also.
### Autoboxing and Unboxing?



### Contrast between RabbitMq and Kafka