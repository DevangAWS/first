package challanges;

public class CuboidPoolAreaCalculation {
    static class Rectangle{
        private double width;
        private double length;

        public Rectangle(double width, double length) {
            if (width<0)width=0;
            if (length<0)length=0;
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        public double getArea(){
            return width*length;
        }
    }

    static class Cuboid extends Rectangle{

        private double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            if (height<0)height=0;
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public double getVolume(){
            return getArea()*height;
        }
    }
}

class RunCuboidPoolAreaCalculation{
    static void main() {
        CuboidPoolAreaCalculation.Rectangle rectangle = new CuboidPoolAreaCalculation.Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        CuboidPoolAreaCalculation.Cuboid cuboid = new CuboidPoolAreaCalculation.Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
