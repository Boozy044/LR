public class RubberDuck extends Duck implements Quackable {
    @Override
    public String Display() {
        return "Display " + getClass();
    }

    public String Quack() {
        return "Quack " + getClass();
    }
}
