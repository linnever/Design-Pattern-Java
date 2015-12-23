---
layout: pattern
title: Singleton
permalink: /patterns/singleton/
categories: Creational

---

**Intent:** Ensure a class only has one instance, and provide a global point of access to the object.

**Applicability:** Use the Singleton pattern when

* there must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
* when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code

**Typical Use Case:**

* the logging class
* managing a connection to a database
* file manager
* factories implements as singleton

**Real world examples:**

* [java.lang.Runtime#getRuntime()](http://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime%28%29)

**Credits**

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [oodesign](http://www.oodesign.com/singleton-pattern.html)
* [iluwatar](https://github.com/iluwatar/java-design-patterns/tree/master/singleton)
