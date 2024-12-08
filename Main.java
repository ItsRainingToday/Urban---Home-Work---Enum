import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("******Задание № 1******");
        System.out.println("Выбирите букву");
        //String w = scanner.next();
        //task1(w);
        task1("A"); //Почему ты видишь только букву A?
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
            } else if(n == 0){
                break;
            } else {
                System.out.println("Ошибка!");
            }
        } while ( n != 0);
    }

    /** Медод № 1 */
    public static String task1(String w){
    List<Alphabet> alphabets = new ArrayList<>();
        alphabets.add(new Alphabet(1, Alphabet.World.a));
        alphabets.add(new Alphabet(2, Alphabet.World.b));
        alphabets.add(new Alphabet(3, Alphabet.World.c));
        alphabets.add(new Alphabet(4, Alphabet.World.d));
        alphabets.add(new Alphabet(5, Alphabet.World.e));
        alphabets.add(new Alphabet(6, Alphabet.World.f));
        alphabets.add(new Alphabet(7, Alphabet.World.g));
        alphabets.add(new Alphabet(8, Alphabet.World.h));
        alphabets.add(new Alphabet(9, Alphabet.World.i));
        alphabets.add(new Alphabet(10, Alphabet.World.j));
        alphabets.add(new Alphabet(11, Alphabet.World.k));
        alphabets.add(new Alphabet(12, Alphabet.World.l));
        alphabets.add(new Alphabet(13, Alphabet.World.m));
        alphabets.add(new Alphabet(14, Alphabet.World.n));
        alphabets.add(new Alphabet(15, Alphabet.World.o));
        alphabets.add(new Alphabet(16, Alphabet.World.p));
        alphabets.add(new Alphabet(17, Alphabet.World.q));
        alphabets.add(new Alphabet(18, Alphabet.World.r));
        alphabets.add(new Alphabet(19, Alphabet.World.s));
        alphabets.add(new Alphabet(20, Alphabet.World.t));
        alphabets.add(new Alphabet(21, Alphabet.World.u));
        alphabets.add(new Alphabet(22, Alphabet.World.v));
        alphabets.add(new Alphabet(23, Alphabet.World.w));
        alphabets.add(new Alphabet(24, Alphabet.World.x));
        alphabets.add(new Alphabet(25, Alphabet.World.y));
        alphabets.add(new Alphabet(26, Alphabet.World.z));
        for (int i=0; i < alphabets.size(); i++) {
            if (alphabets.get(i).world.getWorld().equals(w)){
                System.out.println("позиция буквы алфавита " +alphabets.get(i).world.getWorld() +": "+alphabets.get(i).position);
                break;
            } else {
                System.out.println("Ошибка");
                break;
            }
        }
        System.out.println("");
        return "";
    }

    /** Медод № 2 */
    public static String task2(String genom){
        List<Human> human = new ArrayList<>();
        human.add(new Human("Алексей",43, Human.Gender.men));
        human.add(new Human("Роман", 32, Human.Gender.men));
        human.add(new Human("Евгений",35, Human.Gender.men));
        human.add(new Human("Вячеслав",80, Human.Gender.men));
        human.add(new Human("Михаил",20, Human.Gender.men));
        human.add(new Human("Александра",10, Human.Gender.women));
        human.add(new Human("Марго",20, Human.Gender.women));
        human.add(new Human("Елена",40, Human.Gender.women));
        human.add(new Human("Ирина",17, Human.Gender.women));
        human.add(new Human("Надежда",32, Human.Gender.women));


        for (int i =0; i < human.size(); i++){
            if (human.get(i).gender.getGender().equals(genom)){
                System.out.println(human.get(i));
            }
        }
        return "";
    }

}


