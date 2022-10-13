package src;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Doors door1;
    private Doors door2;
    private Condicioner condicioner;
    private Steering steering;
    
    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        door1 = new Doors();
        door2 = new Doors();
        condicioner = new Condicioner();
        steering = new Steering();
    }
    
    public void start() {
        door1.open();
        door1.close();
        engine.start();
        condicioner.start();
        
    }
    
    public void drive () {
        if (engine.getWork()) {
            transmission.switchGear(1);
            steering.turnleft();
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
            steering.turnright();
        }
    }
    
    public void stop() {
        condicioner.stop();
        engine.stop();
    }
    }