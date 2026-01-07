package Generics.CustomArrayList;

public class RunCustomArrayList {
    static void main() {
        CustomArrayListByUser list = new CustomArrayListByUser();
        list.add("5000");
        list.add("20");
        list.add("50");
        list.print();
        list.remove("5000");
        list.print();
        list.add("dev");
        list.add("larvitar");
        list.add("us");
        list.print();
        list.add("0");
        list.add("2");
        list.add("r");
        list.add("j");
        list.add("s");
        list.add("h");
        list.print();
        list.remove("s");
        list.setIndex(2, "hoyo");
        System.out.println(list.getIndex(5));
        list.print();
        list.sizeOfList();
    }
}