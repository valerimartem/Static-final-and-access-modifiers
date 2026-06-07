package practice3;

public class University {
    //Создайте класс University с полями:
    //static String universityName — общее имя университета
    //final int studentID — уникальный ID
    //String studentName
    // Реализуйте конструктор для studentID и studentName,
    // статический метод changeUniversityName(String newName), геттер для studentName,
    // метод printStudentInfo() — выводит имя, ID и университет.
    // В main: создайте 3 студента, измените название университета и выведите данные.

    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    static void changeUniversityName(String newName) {
        universityName = newName;
    }
    String getStudentName() {
        return this.studentName;
    }
    void printStudentInfo() {
        System.out.println("Имя: " + this.studentName + " ID: " + this.studentID + " Университет: " + University.universityName);
    }
}
