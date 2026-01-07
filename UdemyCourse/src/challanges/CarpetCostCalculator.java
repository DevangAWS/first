package challanges;

public class CarpetCostCalculator {
    static class Floor{
        private double width;
        private double length;

        public Floor(double width, double length) {
            if (width<0)width=0;
            if (length<0)length=0;
            this.width = width;
            this.length = length;
        }

        public double getArea(){
            return width*length;
        }
    }

    static class Carpet{
        private double cost;

        public Carpet(double cost) {
            if (cost<0)cost=0;
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    static class Calculator{
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea()* carpet.getCost();
        }
    }
}

class RunCarpetCostCalculator{
    static void main() {
        CarpetCostCalculator.Carpet carpet = new CarpetCostCalculator.Carpet(3.5);
        CarpetCostCalculator.Floor floor = new CarpetCostCalculator.Floor(2.75, 4.0);
        CarpetCostCalculator.Calculator calculator = new CarpetCostCalculator.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new CarpetCostCalculator.Carpet(1.5);
        floor = new CarpetCostCalculator.Floor(5.4, 4.5);
        calculator = new CarpetCostCalculator.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
