package practice2;

public class BankAccount {
    //Класс BankAccount
    //Создайте класс BankAccount с полями owner и balance.
    // Реализуйте конструктор, геттеры, сеттер для владельца,
    // методы deposit(amount) и withdraw(amount) и метод printBalance().
    // В main внесите деньги, снимите и выведите баланс.

    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    String getOwner() {
        return this.owner;
    }
    int getBalance() {
        return this.balance;
    }
    void setOwner(String owner){
        this.owner = owner;
    }
    void deposit(int amount) {
        balance = balance + amount;
    }
    void withdraw(int amount) {
        balance = balance - amount;
    }
    void printBalance() {
        System.out.println("Текущий балансе: " + this.balance);
    }

}
