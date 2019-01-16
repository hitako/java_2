package lesson_1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[]{new Wall(2), new Water(100), new Sprint(200)}); // Создаем полосу препятствий
        Team team = new Team("Dream Team", new Participant[]{
                    new Participant("Вася", 150, 220, 10),
                    new Participant("Петя", 50, 300, 5),
                    new Participant("Степан", 75, 335, 2),
                    new Participant("Валерия", 125, 555, 3)
                }); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
