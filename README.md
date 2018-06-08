# MethodInjecttationDemo
https://www.sagarandcompany.com/

#@Lookup Annotation and Look-up xml tag

```java
Spring lookup method injection is the process of dynamically overriding a registered bean method.

The bean method should be annotated with @Lookup.

Spring returns the lookup result matched by the method's return type.


Method injection is different from Constructor Injection and Setter Injection. While in Constructor and Setter Injection, Spring creates the beans and injects them using the constructor or setter method, in Method Injection Spring overrides a given abstract method of an abstract class and provides an implementation of the overridden method.

This is an advanced form of dependency injection and should be used in very special cases as it involves byte-code manipulation by Spring.

A special case where
Method Injection should be used is when a Prototype bean needs to used within a Singleton
.To undestand this special case in which Method Injection is used, we need to understand the concept of
scope
of a bean.

Spring can instance objects in two ways:

Singleton: Instantiate only one object
Prototype: Instantiate a new object everytime
In Spring terminology, Singleton and Prototype define the scope of the bean.
```
