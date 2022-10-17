package src;

public class Wheel1 implements Checkable {
public void rotate() {
System.out.println("Колесо крутится");
}

@Override
public void check() {
    System.out.println("Ок");
}
}