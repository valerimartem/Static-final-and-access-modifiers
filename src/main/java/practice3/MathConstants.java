package practice3;

public class MathConstants {
    //Создайте класс MathConstants с полями:
    //final double PI = 3.14159
    //final double E = 2.71828
    //Реализуйте статические методы calculateCircleArea(double r) — площадь круга и
    // calculateCircumference(double r) — длина окружности.
    // В main: вызовите методы с разными значениями радиуса.
    //calculateExponentialGrowth(double initialValue, double rate, double time) — расчет по формуле экспоненциального роста:
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double radius) {
        return PI * radius *radius;
    }
    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
    static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return (initialValue * Math.pow(E, (rate * time)));
    }
}
