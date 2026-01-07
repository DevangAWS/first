void main() {
    population devang = new population(22, "Devang", 200000000, false);
    IO.println(population.people);
    population disha = new population(20, "disha", 200000000, false);
    IO.println(population.people);
}

record population(int age, String name, int salary, boolean married) {
    static long people = 0;

    population(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        people += 1;
    }
}