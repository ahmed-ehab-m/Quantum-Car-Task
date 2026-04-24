package EngineModels;

public class HybridEngine extends Engine {

    private final GasEngine gasEngine=new GasEngine();
    private final ElectricalEngine electricalEngine=new ElectricalEngine();

    private Engine activeEngine; /// default engine

    @Override
    public void setRunning(boolean running) {
        System.out.println("Hybrid EngineModels.Engine Starting ...");
        electricalEngine.setRunning(running);
        activeEngine=electricalEngine;
    }
    private double engineSpeed=0;

    /// method for determine the returned Active engine type depend on car speed
    @Override
    public void increase(double carSpeed)
    {
        super.increase(carSpeed);
        double speedCarCondition = 50;
        if(carSpeed < speedCarCondition)
        {
            /// first time
        activeEngine=electricalEngine;
//            if(carSpeed==0)
//            {
//                activeEngine=electricalEngine;
//            }
//            else {
//                activeEngine = convertEngineType(gasEngine, electricalEngine);
//            }
        }
        else {
            activeEngine= convertEngineType(electricalEngine,gasEngine);
        }
    }
    /////
    @Override
    public void decrease(double carSpeed)
    {
        super.decrease(carSpeed);
        double speedCarCondition = 50;
        if(carSpeed > speedCarCondition)
        {
            /// first time
            activeEngine=gasEngine;
//            if(carSpeed==0)
//            {
//                activeEngine=electricalEngine;
//            }
//            else {
//                activeEngine = convertEngineType(gasEngine, electricalEngine);
//            }
        }
        else {
            activeEngine= convertEngineType(gasEngine,electricalEngine);
        }
    }

    /// synchronous converting the engine type
    private Engine convertEngineType(Engine existingEngine,Engine newEngine) {
        System.out.println("converting the engine type...");

        /// get the current speed of existing engine
        engineSpeed=electricalEngine.getSpeed();
        for(int i=1;i<=engineSpeed/2;i++)
        {
            newEngine.setSpeed(i);
            existingEngine.decrease(i);
        }
        existingEngine.setRunning(false);
        newEngine.setRunning(true);
        return newEngine;
    }
}
