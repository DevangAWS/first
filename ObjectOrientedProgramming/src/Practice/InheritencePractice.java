package Practice;

public class InheritencePractice {
    static class GrandBox{
        private String name;
        private String country;

        public GrandBox(String name, String country) {
            this.name = name;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public void welcomeMessage(){
            System.out.println("""
                    Welcome to the Box Infrastructure
                    """);
        }
    }

    static class Box extends GrandBox{
        private String boxName;
        private String state;

        public Box(String name, String country, String boxName, String state) {
            super(name, country);
            this.boxName = boxName;
            this.state = state;
        }

        public String getBoxName() {
            return boxName;
        }

        public String getState() {
            return state;
        }

        @Override
        public void welcomeMessage() {
            System.out.println("""
                    Welcome to the Box design level
                    """);
        }
    }

    static class IndividualCityBox extends Box{
        private String cityBoxName;
        private String city;

        public IndividualCityBox(String name, String country, String boxName, String state, String cityBoxName, String city) {
            super(name, country, boxName, state);
            this.cityBoxName = cityBoxName;
            this.city = city;
        }

        @Override
        public void welcomeMessage(){
            System.out.println("""
                    Welcome to the city level Box
                    """);
        }
    }
}

class runInheritencePractice{
    static void main() {
        InheritencePractice.GrandBox grandBox=new InheritencePractice.GrandBox("Level 1","International");
        InheritencePractice.Box box=new InheritencePractice.Box(grandBox.getName(), grandBox.getCountry(),"Level 2","National");
        InheritencePractice.IndividualCityBox individualCityBox=new InheritencePractice.IndividualCityBox(grandBox.getName(), grandBox.getCountry(), box.getBoxName(), box.getState(),"Level 3","Regional");
        grandBox.welcomeMessage();
        box.welcomeMessage();
        individualCityBox.welcomeMessage();
    }
}
