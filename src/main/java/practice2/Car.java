package practice2;

public class Car {
    //Создайте класс Car с полями brand (строка) и year (целое число).
    // Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей,
    // метод print(), выводящий информацию о марке и годе выпуска.
    // В main создайте объект, установите значения через конструктор,
    // змените год через сеттер, выведите информацию.

    String brand;
    int year;

    Car(String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand() {
        return  this.brand;
    }
    int getYear() {
        return this.year;
    }
     void setBrand(String newBrand) {
        this.brand = newBrand;
     }
     void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
         System.out.println("Марка автомобиля " + this.brand + " Год выпуска " + this.year);
    }

}
