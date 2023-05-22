package org.ctac.fs103.javalambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//      Simple Lambda Functions
        System.out.println("SIMPLE LAMBDA FUNCTIONS");
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5,7));

        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        System.out.println(subtract.apply(5,7));

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(5,7));

        BinaryOperator<Double> divide = (a, b) -> a / b;
        System.out.println(divide.apply(15.0,3.0));
        System.out.println();

//      Lambda Expressions with Functional Interfaces
        System.out.println("LAMBDA EXPRESSIONS WITH FUNCTIONAL INTERFACES");
        SimpleFunction addition = (a,b) -> a + b;
        int sum = addition.performOperation(4,3);
        System.out.println("4 + 3 = " + sum);

        SimpleFunction subtraction = (a,b) -> a - b;
        int difference = subtraction.performOperation(4,3);
        System.out.println("4 - 3 = " + difference);

        SimpleFunction multiplication = (a,b) -> a * b;
        int product = multiplication.performOperation(4,3);
        System.out.println("4 * 3 = " + product);

        SimpleFunction division = (a,b) -> a / b;
        int quotient = division.performOperation(77,11);
        System.out.println("77 / 11 = " + quotient);
        System.out.println();

//      Lambda Expressions with Built-in Functional Interfaces
        System.out.println("LAMBDA FUNCTIONS WITH BUILT-IN FUNCTIONAL INTERFACES");
        List<Person> people = new ArrayList<>();
        Person lane = new Person("Lane", 24);
        Person jane = new Person("Jane", 25);
        Person dane = new Person("Dane", 27);

        people.add(lane);
        people.add(jane);
        people.add(dane);

//      Predicate
        Predicate<Person> isMillenial = person -> person.getAge() > 26;
        for (Person person : people) {
            if (isMillenial.test(person)) {
                System.out.println(person.getName() + " is a millennial");
            }
        }
        System.out.println();

//      Function
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("7 squared is " + square.apply(7));
        System.out.println();

//      Consumer
        Consumer<Person> displayNames = person -> System.out.println(person.getName());
        people.forEach(displayNames);


    }
}
