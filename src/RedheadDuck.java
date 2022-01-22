public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public String Display() {
        return "Display " + getClass();
    }

    public String Fly() {
        return "Fly " + getClass();
    }

    public String Quack() {
        return "Quack " + getClass();
    }
}
