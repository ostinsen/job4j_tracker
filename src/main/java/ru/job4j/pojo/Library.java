package ru.job4j.pojo;

public class Library {
    public static void main( String[] args) {
        Book b1 = new Book("code", 50);
        Book b2 = new Book("Clean", 100);
        Book b3 = new Book("Clean code", 150);
        Book b4 = new Book("Clode", 200);
        Book[] books = new Book[4];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getAmountSheet());
        }
        Book b = books[0];
        books[0] = books[3];
        books[3] = b;
        System.out.println("after replacing");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getAmountSheet());
        }
        System.out.println("print Clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")){
                System.out.println(books[i].getName() + " " + books[i].getAmountSheet());
            }
        }
    }

}
