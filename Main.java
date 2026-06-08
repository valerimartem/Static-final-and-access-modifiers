package practice3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание \"Класс Company\"");
        Company company1 = new Company(115, "Lera");
        Company company2 = new Company(120, "Lisa");
        Company company3 = new Company(135, "Lora");

        System.out.print("Сотрудник: " + company1.getEmployeeName() + ", компания: " );
        Company.printCompanyName();
        System.out.print("Сотрудник: " + company2.getEmployeeName() + ", компания: " );
        Company.printCompanyName();
        System.out.print("Сотрудник: " + company3.getEmployeeName() + ", компания: " );
        Company.printCompanyName();

        Company.companyName = "AQA";
        System.out.print("Новое имя компании: " );
        Company.printCompanyName();

        System.out.print("Сотрудник: " + company1.getEmployeeName() + ", компания: " );
        Company.printCompanyName();
        System.out.print("Сотрудник: " + company2.getEmployeeName() + ", компания: " );
        Company.printCompanyName();
        System.out.print("Сотрудник: " + company3.getEmployeeName() + ", компания: " );
        Company.printCompanyName();
        //company1.employeeID = 111;
        //cannot assign a value to final variable employeeID
        System.out.println();


        System.out.println("Задание \"Класс MathConstants\"");
        System.out.println("Площадь круга с радиусом 5: " + MathConstants.calculateCircleArea(5));
        System.out.println("Площадь круга с радиусом 6: " + MathConstants.calculateCircleArea(6));

        System.out.println("Длина окружности с радиусом 5: " + MathConstants.calculateCircumference(5));
        System.out.println("Длина окружности с радиусом 6: " + MathConstants.calculateCircumference(6));

        System.out.println("Расчет по формуле равен: "+ MathConstants.calculateExponentialGrowth(1,2,3));
        System.out.println();


        System.out.println("Задание \"Класс University\"");
        University student1 = new University(313, "Lera");
        University student2 = new University(312, "Katya");
        University student3 = new University(311, "Olya");

        University.changeUniversityName("AQA");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        System.out.println();


        System.out.println("Задание \"Класс GameSettings\"");
        GameSettings game1 = new GameSettings("game1", 12);
        GameSettings game2 = new GameSettings("game2", 10);

        GameSettings.setMaxPlayers(30);

        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();

        game2.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();
        System.out.println();


        System.out.println("Задание \"Класс Person\"");
        Person person1 = new Person("Lera", "Mart", "123-45-6789");
        Person person2 = new Person("Masha", "Ivanova", "123-45-9876");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person2.setFirstName("Dasha");
        person2.printPersonInfo();


    }
}
