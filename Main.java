package practice3;

public class Main {
    public static void main(String[] args) {

        //Задание "Класс Company"
        Company company1 = new Company(115, "Lera");
        Company company2 = new Company(120, "Lisa");
        Company company3 = new Company(135, "Lora");

        Company.printCompanyName();
        Company.companyName = "AQA";
        Company.printCompanyName();

        //company1.employeeID = 111;
        //cannot assign a value to final variable employeeID

        //Задание "Класс MathConstants"
        System.out.println("Площадь круга с радиусом 5: " + MathConstants.calculateCircleArea(5));
        System.out.println("Площадь круга с радиусом 6: " + MathConstants.calculateCircleArea(6));

        System.out.println("Длина окружности с радиусом 5: " + MathConstants.calculateCircumference(5));
        System.out.println("Длина окружности с радиусом 6: " + MathConstants.calculateCircumference(6));

        MathConstants mathConstants = new MathConstants();
        System.out.println("Расчет по формуле равен: "+ mathConstants.calculateExponentialGrowth(1,2,3));

        //Задание "Класс University"
        University student1 = new University(313, "Lera");
        University student2 = new University(312, "Katya");
        University student3 = new University(311, "Olya");

        University.changeUniversityName("AQA");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        //Задание "Класс GameSettings"
        GameSettings game1 = new GameSettings("game1", 12);
        GameSettings game2 = new GameSettings("game2", 10);

        GameSettings.setMaxPlayers(30);

        game1.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();

        game2.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();

        //Задание "Класс Person"

        Person person1 = new Person("Lera", "Mart", "123-45-6789");
        Person person2 = new Person("Masha", "Ivanova", "123-45-9876");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person2.setFirstName("Dasha");
        person2.printPersonInfo();


    }
}
