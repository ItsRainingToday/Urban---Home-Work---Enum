import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******Задание № 1******");
        System.out.println("Выбирите букву");
        String latter = scanner.next();
        task1(latter.toUpperCase());
        System.out.println("******Задание № 2******");
        int n;
        do {
            System.out.println("Выбирите пол: ");
            System.out.println("1. Музчина");
            System.out.println("2. Женчина");
            System.out.println("0. Завершить работу");
            n = scanner.nextInt();
            if (n == 1) {
                System.out.println("список мужчин:");
                task2("Мужчина");
            } else if (n == 2) {
                System.out.println("список женщин:");
                task2("Женщина");
            } else if (n == 0) {
                break;
            } else {
                System.out.println("Ошибка!");
            }
        } while (n != 0);


    }

    /**
     * Медод № 1
     */
    public static String task1(String latter) {

        for (Alphabet.Word word: Alphabet.Word.values()){
            if (word.toString().equals(latter)){
                System.out.println("позиция буквы алфавита " + (word.ordinal()+1));
                break;
            }
        }
        return "";
    }


    /** Медод № 2 */
    public static String task2(String genom){
        List<Human> human = new ArrayList<>();
        human.add(new Human("Алексей",43, Human.Gender.MAN));
        human.add(new Human("Роман", 32, Human.Gender.MAN));
        human.add(new Human("Евгений",35, Human.Gender.MAN));
        human.add(new Human("Вячеслав",80, Human.Gender.MAN));
        human.add(new Human("Михаил",20, Human.Gender.MAN));
        human.add(new Human("Александра",10, Human.Gender.WOMAN));
        human.add(new Human("Марго",20, Human.Gender.WOMAN));
        human.add(new Human("Елена",40, Human.Gender.WOMAN));
        human.add(new Human("Ирина",17, Human.Gender.WOMAN));
        human.add(new Human("Надежда",32, Human.Gender.WOMAN));


        for (int i =0; i < human.size(); i++){
            if (human.get(i).gender.getGender().equals(genom)){
                System.out.println(human.get(i));
            }
        }
        return "";
    }

}
