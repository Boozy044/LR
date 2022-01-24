import com.myLibrary.classes.*;

public class Program {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();

        Duck[] ducks = {mallardDuck, redheadDuck};

        for (Duck duck : ducks) {
            System.out.println(duck.Display());
            System.out.println(duck.Swim());
            System.out.println(duck.Quack());
            System.out.println();
        }
    }
}

