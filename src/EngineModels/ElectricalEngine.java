package EngineModels;

public class ElectricalEngine extends Engine {

    @Override
    public void setRunning(boolean running) {
        if (running) {
            System.out.println("Electrical EngineModels.Engine running now");
        } else {
            System.out.println("Electrical EngineModels.Engine Stop");
        }
    }
}
