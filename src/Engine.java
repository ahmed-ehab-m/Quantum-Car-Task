/// abstract because it is only blueprint class
public abstract class Engine {

    private boolean isRunning; /// status of engine
    private double speed;

    /// engine speed control methods
    public void increase()
    {
        ++speed;
    }
    public void decrease()
    {
        --speed;
    }

    /// getters , setters
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
