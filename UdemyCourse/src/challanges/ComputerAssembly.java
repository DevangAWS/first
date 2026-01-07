package challanges;

public class ComputerAssembly {
    static class Products{
        private String model;
        private String manufacturer;
        private int width;
        private int height;
        private int depth;

        public Products(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }
    }

    static class PersonalComputer extends Products{

        private Monitor monitor;
        private MotherBoard motherBoard;
        private ComputerCase computerCase;

        public PersonalComputer(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }

    static class Monitor extends PersonalComputer{

        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }

    static class MotherBoard extends Products{

        public MotherBoard(String model, String manufacturer) {
            super(model, manufacturer);
        }

    }

    static class ComputerCase extends Products{
        public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }
}
