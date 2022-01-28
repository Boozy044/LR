import com.myLibrary.Behavios.*;
import com.myLibrary.Duck;
import com.myLibrary.interfaces.FlyBehavior;
import com.myLibrary.interfaces.QuackBehavior;
import com.myLibrary.entities.*;

public class Program {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        QuackBehavior Quack = new Quack();
        QuackBehavior Squeak = new Squeak();
        QuackBehavior MuteQuack = new MuteQuack();

        FlyBehavior FlyNoWay = new FlyNoWay();
        FlyBehavior FlyWithWings = new FlyWithWings();

        mallardDuck.SetQuackBehavior(Quack);
        redheadDuck.SetQuackBehavior(Quack);
        rubberDuck.SetQuackBehavior(Squeak);
        decoyDuck.SetQuackBehavior(MuteQuack);

        mallardDuck.SetFlyBehavior(FlyWithWings);
        redheadDuck.SetFlyBehavior(FlyWithWings);
        rubberDuck.SetFlyBehavior(FlyNoWay);
        decoyDuck.SetFlyBehavior(FlyNoWay);

        Duck[] ducks = {mallardDuck, redheadDuck, rubberDuck, decoyDuck};

        for (Duck duck : ducks) {
            System.out.println(duck.Display());
            System.out.println(duck.Swim());
            System.out.println(duck.PerformQuack());
            System.out.println(duck.PerformFly());

            System.out.println();
        }
    }
}

