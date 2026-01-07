package challanges;

public class ChallangeTheCar {
    public static class Car{
        private String description;

        public Car(String description){
            this.description=description;
        }

        public void startEngine(){
            System.out.println("The engine is now starting.");
        }

        public void drive(){
            startEngine();
            System.out.println("Car is now being driven.");
        }

        protected void runEngine(){
            startEngine();
            System.out.println("Testing the Engine.");
        }
    }

    public static class GasPoweredCar extends Car{
        private double avgKilometrePerLitre;
        private int cylinders;

        public GasPoweredCar(String description, double avgKilometrePerLitre, int cylinders) {
            super(description);
            this.avgKilometrePerLitre = avgKilometrePerLitre;
            this.cylinders = cylinders;
        }

        @Override
        protected void runEngine(){
            super.startEngine();
            System.out.println("The gas has been released and the engine is running.");
        }
    }
}

class runChallangeTheCar{
    static void main() {
        ChallangeTheCar.GasPoweredCar car1=new ChallangeTheCar.GasPoweredCar("Gas Powered Car",22,4);
        car1.runEngine();
    }
}