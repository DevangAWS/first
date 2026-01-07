package Generics.CustomGenericsArrayList;

public class RunCustomGenericArrayList {
    static void main() {
        CustomArrayListUserDefined<Integer> listUserDefined=new CustomArrayListUserDefined<>();
        for (int i = 1; i < 20; i++) {
            listUserDefined.add(i);
        }
        listUserDefined.print();
        listUserDefined.add(55);
        listUserDefined.remove(15);
        System.out.println();
        listUserDefined.setIndex(5,88);
        listUserDefined.sizeOfArrayList();
        listUserDefined.print();
        listUserDefined.getIndex(5);
    }
}
