package practice2;

public class Laptop {
    //Создайте класс Laptop с полями brand и price.
    // Реализуйте конструктор, геттеры и сеттеры,
    // и метод printInfo(), выводящий информацию о ноутбуке и его цене.
    // В main измените цену и выведите информацию.

    String brand;
    int price;

    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    String getBrand(){
        return this.brand;
    }
    int getPrice(){
        return this.price;
    }
    void setBrand(String brand){
        this.brand = brand;
    }
    void setPrice(int price){
        this.price = price;
    }
    void printInfo(){
        System.out.println("Марка ноутбука: " + this.brand + " Цена: " + this.price + "руб.");
    }


}
