package org.example.selfcode.cwhCode.Chapter.chp08IntroOpps.example;
/*
    Abstraction is one of the four fundamental Object-Oriented Programming (OOP) concepts in Java.
    It allows you to hide the complex implementation details and show only the essential features of an object.
     By using abstraction, you can simplify complex systems and reduce code duplication.

    In Java, abstraction can be achieved using abstract classes and interfaces.

    Abstract Class Example
    An abstract class is a class that cannot be instantiated, meaning you cannot create an object of
    an abstract class. It can have abstract methods (methods without a body) and concrete
    methods (methods with a body).

    Here's an example to illustrate:
 */
    abstract class Animals {
        // Abstract method (does not have a body)
        public abstract void sound();

        // Regular method
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }

    class Dogs extends Animals {
        // Provide implementation for the abstract method
        public void sound() {
            System.out.println("The dog barks.");
        }
        public void eat() {
            System.out.println("wo bolne lga.");
        }
    }

public class abstraction {

        public static void main(String[] args) {
            Dogs dog = new Dogs();
            dog.sound(); // Output: The dog barks.
            dog.eat();   // Output: This animal eats food.
        }
    }

/*
    In this example:

    Animal is an abstract class with an abstract method sound() and a regular method eat().
    Dog is a subclass of Animal and provides an implementation for the abstract method sound().
    In the Main class, we create an object of Dog and call its methods.

    इंटरफेस में सभी मेथड्स डिफ़ॉल्ट रूप से पब्लिक और एब्स्ट्रैक्ट होते हैं।
    इसमें मेथड्स का सिर्फ डिक्लेरेशन होता है, इम्प्लीमेंटेशन नहीं।
    इंटरफेस में फील्ड्स को डिफाइन किया जा सकता है, लेकिन वे पब्लिक, स्टैटिक और फाइनल होनी चाहिए।

    नहीं, आप एब्स्ट्रैक्ट क्लास का ऑब्जेक्ट डायरेक्टली नहीं बना सकते हैं। एब्स्ट्रैक्ट क्लास को इस तरह डिज़ाइन किया गया है कि यह अधूरी है
    और इसे सिर्फ सबक्लास द्वारा इम्प्लीमेंट किया जाना चाहिए। इसका मतलब है कि आप एब्स्ट्रैक्ट क्लास के ऑब्जेक्ट को डायरेक्टली इंस्टैंशिएट नहीं कर सकते,
    लेकिन आप इसके सबक्लास का ऑब्जेक्ट बना सकते हैं जो सभी एब्स्ट्रैक्ट मेथड्स को इम्प्लीमेंट करता है।
 */
