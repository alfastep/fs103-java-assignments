package org.ctac.fs103.objectsinlists;

import java.util.ArrayList;

public class OverloadingMain {
    public static void main(String[] args) {
//      ANIMAL OVERLOADED CONSTRUCTORS
        System.out.println("ANIMAL OVERLOADED CONSTRUCTORS");
        ArrayList<Animal> animalList = new ArrayList<>();

        Animal animal1 = new Animal("Max", true);
        animalList.add(animal1);

        Animal animal2 = new Animal(false);
        animalList.add(animal2);

        Animal animal3 = new Animal();
        animalList.add(animal3);

        for (Animal animal:animalList) {
            System.out.println(animal.toString());
        }
        System.out.println();

//      TV SHOW OVERLOADED CONSTRUCTORS
        System.out.println("TV SHOW OVERLOADED CONSTRUCTORS");
        ArrayList<TvShow> tvShowList = new ArrayList<>();

        TvShow show1 = new TvShow("Game of Thrones", 73, "drama");
        tvShowList.add(show1);

        TvShow show2 = new TvShow("Breaking Bad", 62);
        tvShowList.add(show2);

        TvShow show3 = new TvShow("Seinfeld", "comedy");
        tvShowList.add(show3);

        TvShow show4 = new TvShow("Ted Lasso");
        tvShowList.add(show4);

        for (TvShow show : tvShowList) {
            System.out.println(show.toString());
        }
        System.out.println();

//      BOOK OVERLOADED CONSTRUCTORS
        System.out.println("BOOK OVERLOADED CONSTRUCTORS");
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("Hamlet", 104, 1603);
        books.add(book1);

        Book book2 = new Book("Lord of the Flies");
        books.add(book2);

        Book book3 = new Book("1984", 1949);
        books.add(book3);

        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println();


//      COUNTER OVERLOADED CONSTRUCTOR AND METHODS
        System.out.println("COUNTER OVERLOADED CONSTRUCTOR AND METHODS");
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();

        System.out.println("Counter1");
        counter1.increase();
        System.out.println(counter1.value());
        counter1.increase(4);
        System.out.println(counter1.value());
        counter1.increase(-1);
        System.out.println(counter1.value());
        counter1.decrease();
        System.out.println(counter1.value());
        counter1.decrease(2);
        System.out.println(counter1.value());
        counter1.decrease(-3);
        System.out.println(counter1.value());
        System.out.println();

        System.out.println("Counter2");
        counter2.increase();
        System.out.println(counter2.value());
        counter2.increase(7);
        System.out.println(counter2.value());
        counter2.increase(-23);
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());
        counter2.decrease(8);
        System.out.println(counter2.value());
        counter2.decrease(-8);
        System.out.println(counter2.value());
        System.out.println();

    }
}
