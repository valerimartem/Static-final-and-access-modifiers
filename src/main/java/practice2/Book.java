package practice2;

public class Book {
    //Создайте класс Book с полями title и author.
    // Реализуйте конструктор, геттеры и сеттеры, и
    // метод printInfo(), выводящий название и автора книги.
    // В main создайте книгу, измените автора и выведите информацию.

    String title;
    String author;

    Book(String someTitle, String someAuthor){
        this.title = someTitle;
        this.author = someAuthor;
    }

    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    void setTitle(String newTitle) {
        this.title = newTitle;
    }
    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void printInfo(){
        System.out.println("Название книги: " + this.title + " Автор книги: " + this.author);
    }


    }
