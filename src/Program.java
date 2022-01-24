import com.myLibrary.interfaces.Flyable;
import com.myLibrary.interfaces.Quackable;
import com.myLibrary.classes.*;

public class Program {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        Duck[] ducks = {mallardDuck, redheadDuck, rubberDuck, decoyDuck};

        for (Duck duck : ducks) {
            System.out.println(duck.Display());
            System.out.println(duck.Swim());

            if (duck instanceof Flyable) {
                System.out.println(((Flyable) duck).Fly());
            }

            if (duck instanceof Quackable) {
                System.out.println(((Quackable) duck).Quack());
            }

            System.out.println();
        }
    }
}

