package practice3;

public class GameSettings {
    //Создайте класс GameSettings с полями:
    //static int maxPlayers — общее ограничение игроков
    //final String gameName — название (нельзя менять)
    //int currentPlayers — сколько игроков в игре сейчас
    // Реализуйте конструктор, статический метод setMaxPlayers(int),
    // метод addPlayer() — добавляет 1 игрока,
    // метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
    // В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.

    static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }
    public static void setMaxPlayers(int someMaxPlayers) {
        maxPlayers = someMaxPlayers;
    }
    public void addPlayer() {
        this.currentPlayers++;
    }
    public void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + " Текущее количество игроков: " + this.currentPlayers + " Максимум игроков: " + GameSettings.maxPlayers);
    }
}
