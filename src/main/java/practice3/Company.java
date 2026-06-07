package practice3;

public class Company {
    //Создайте класс Company с полями:
    //static String companyName — общее название для всех сотрудников
    //final int employeeID — уникальный идентификатор (нельзя менять)
    //String employeeName — имя сотрудника
    // Реализуйте конструктор, принимающий employeeID и employeeName,
    // статический метод printCompanyName(), геттеры и сеттеры для employeeName.
    // В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех.
    // Попробуйте изменить employeeID — должно быть невозможно.


    static String companyName = "Google";

    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Имя компании: " + Company.companyName);
    }
    String getEmployeeName() {
        return this.employeeName;
    }
    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

}
