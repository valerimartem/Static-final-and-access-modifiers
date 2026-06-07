package practice2;

public class Circle {
    //Создайте класс Circle с полем radius.
    // Реализуйте конструктор, геттер и сеттер,
    // методы calculateArea() и calculateCircumference().
    // В main измените радиус, выведите площадь и длину окружности.

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    int getRadius() {
        return this.radius;
    }
    void setRadius(int radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    double calculateCircumference(){
        return Math.PI * 2 * radius;
    }

}
