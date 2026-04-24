package EngineModels;

public class GasEngine extends Engine {

    @Override
    public void setRunning(boolean running) {
        if (running) {
            System.out.println("Gas EngineModels.Engine is running now");
        } else {
            System.out.println("Gas EngineModels.Engine Stop");
        }
    }
}
