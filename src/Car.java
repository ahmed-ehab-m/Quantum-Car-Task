import EngineModels.Engine;

public class Car {
    private Engine engine;
    private double speed;

    /// business logic methods
    void start()
    {
        engine.setRunning(true);
        engine.setSpeed(0);
        System.out.println( "EngineModels.Engine initialized successfully. Ready to drive");
    }

    void stop()
    {
        engine.setSpeed(0);
        engine.setRunning(false);
        setSpeed(0);
        System.out.println( "EngineModels.Engine shut down. Parking brake engaged.");

    }

    void accelerate()
    {
        double carSpeed=getSpeed();
        carSpeed+=20;
        /// 1=> increase our car speed
        setSpeed(carSpeed);
        /// 3=> call our engine to increase his speed
        if(carSpeed < 200)
        {
            engine.increase(carSpeed);
        }
        System.out.printf("Accelerating.. Current Speed: [%f km/h]%n", speed);

    }

    void brake()
    {
        double carSpeed=getSpeed();
        carSpeed-=20;
        /// 1=> decrease our car speed
        setSpeed(carSpeed);

        /// 2 => call our engine to decrease his speed
        engine.decrease(carSpeed);

        /// 3 => determine type of engine depend on car speed (if EngineModels.Engine is EngineModels.HybridEngine)
        System.out.printf("Speed reduced. Current Speed: [%f km/h]%n", speed);
    }

    /// getters , setters
    public void setSpeed(double speed) {
        if(speed < 200 && speed >= 0)
        {
            this.speed = speed;
        }
        else
        {
            System.out.println("Invalid Speed Value, Max Speed is 200 KM/H and " +
                    "Min Speed is 0 KM/H");
        }
    }
    public double getSpeed() {
        return speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
