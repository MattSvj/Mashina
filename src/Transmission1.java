package src;

public class Transmission1 implements Checkable {
// private int grNumber;

public void switchGear(int number) {
// this.grNumber = number;
System.out.printf("Переключение скорости на %d%n", number);
}

//    public int getGrNumber() {
// return grNumber;
// }
@Override
public void check() {
System.out.println("Ок");
}
}