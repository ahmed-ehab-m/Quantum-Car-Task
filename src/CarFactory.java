import EngineModels.Engine;

public abstract class CarFactory {

    public static Car createCar(Engine newEngine)
    {
        Car car=new Car();
         car.setEngine(newEngine);
         return car;
    }
    ////////////////////////////////////
    public static Car replaceEngine(Engine newEngine , Car exsitingCar)
    {
        exsitingCar.setEngine(newEngine);
        return exsitingCar;
    }
}
