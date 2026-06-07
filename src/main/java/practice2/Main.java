package practice2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 1992);
        car.print();
        car.setYear(1990);
        car.print();

        Rectangle rect = new Rectangle(5, 4);
        System.out.println("Площадь прямоугольника " + rect.calculateArea());
        rect.setWidth(6);
        System.out.println("Площадь прямоугольника " + rect.calculateArea());

        Book book = new Book("Гарри Поттер", "Роулинг");
        book.printInfo();
        book.setAuthor("Джоан Роулинг");
        book.printInfo();

        BankAccount account = new BankAccount("Lera", 100);
        account.printBalance();
        account.deposit(10);
        account.printBalance();
        account.withdraw(20);
        account.printBalance();

        Point xy = new Point(5,6);
        xy.print();
        xy.setX(6);
        xy.print();

        StudentGroup group = new StudentGroup("QA", 20);
        group.printInfo();
        group.setStudentCount(15);
        group.printInfo();

        Circle circle = new Circle(5);
        System.out.println("Радиус равен " + circle.radius);
        circle.setRadius(6);
        System.out.println("Радиус равен " + circle.radius);
        System.out.println("Площадь круга равна " + circle.calculateArea());
        System.out.println("Длина окружности равна " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Лю", "Китайский");
        teacher.printInfo();
        teacher.setSubject("Китайский язык");
        teacher.printInfo();

        Product product = new Product("Книга", 200);
        product.printInfo();
        product.setPrice(250);
        product.printInfo();
        product.applyDiscount(15);
        product.printInfo();

        Laptop laptop = new Laptop("Asus", 100000);
        laptop.printInfo();
        laptop.setPrice(120000);
        laptop.printInfo();



    }
}
