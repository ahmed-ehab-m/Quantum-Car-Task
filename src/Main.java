import EngineModels.Engine;
import EngineModels.GasEngine;
import EngineModels.HybridEngine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// create the car
        Engine oldEngine=new GasEngine();
        Car car=CarFactory.createCar(oldEngine);
        /// replace engine
        car=CarFactory.replaceEngine(new HybridEngine(),car);
        /// test car operations
        car.start();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        ///
        car.brake();
        car.brake();
        car.brake();
        ///
        car.accelerate();
        car.accelerate();
        ///
        car.stop();

    }
}