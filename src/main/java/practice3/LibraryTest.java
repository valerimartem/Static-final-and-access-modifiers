package practice3;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        // library.bookTitle недоступен тк private (доступ только в классе)

        //доступ к полю author есть, тк тут protected (доступ в пакете и наследниках)
        library.author = "Роулинг";

        //доступ к полю int есть, тк тут по умолчанию (доступ в пакете)
        library.year = 1999;

        //доступ к полю category есть, тк тут public (доступ в программе)
        library.category = "Фентези";

    }
}
