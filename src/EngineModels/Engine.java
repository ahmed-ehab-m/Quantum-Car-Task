package EngineModels;

/// abstract because it is only blueprint class
public abstract class Engine {

    private final boolean isRunning=false; /// status of engine
    private double speed=0;

    /// engine speed control methods
    public void increase(double carSpeed)
    {
        ++speed;
    }
    public void decrease(double carSpeed)
    {
        /// to avoid negative values
        if (speed-1 > 0)
            --speed;
    }

    /// getters , setters
    public boolean isRunning() {
        return isRunning;
    }

    public abstract void setRunning(boolean running);

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
