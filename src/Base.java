package src;

import java.util.List;

public class Base {
    private Engine1 engine;
    private Wheel1 wheel1;
    private Wheel1 wheel2;
    private Wheel1 wheel3;
    private Wheel1 wheel4;
    private Transmission1 transmission;
    private Doors door1;
    private Doors door2;
    private Condicioner condicioner;
    private Steering steering;
    private List<Checkable> checkables;
    
    public Base() {
        engine = new GasalineEngine();
        wheel1 = new Wheel1();
        wheel2 = new Wheel1();
        wheel3 = new Wheel1();
        wheel4 = new Wheel1();
        transmission = new Transmission1();
        door1 = new Doors();
        door2 = new Doors();
        condicioner = new Condicioner();
        steering = new Steering();
        checkables = List.of(engine, wheel1, wheel2, wheel3, wheel4, transmission);
    }
    
    public void start() {
        door1.open();
        door1.close();
        engine.start();
        condicioner.start();
        
    }
    
    public void drive () {
        if (engine.getWork()) {
            engine.throttleUp(1);
            steering.turnleft();
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
            steering.turnright();
        }
    }
    
    public void stop() {
        transmission.switchGear(0);
        engine.throttleDown(0);
        condicioner.stop();
        engine.stop();
    }

    public void сheckAll() {
        //engine.check();
        //transmission.check();
        //wheel1.check();
        //wheel2.check();
        //wheel3.check();
        //wheel4.check();
    for (Checkable checkables : checkables) {
    checkables.check();
    }
    }
    }