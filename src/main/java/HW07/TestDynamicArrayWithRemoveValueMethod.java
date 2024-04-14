package HW07;

public class TestDynamicArrayWithRemoveValueMethod {
    public static void main(String[] args) {
        DynamicArrayWithRemoveValueMethod da = new DynamicArrayWithRemoveValueMethod();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);

        System.out.println("Elements of array before removal:");
        for (int i = 0; i < da.getCount(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }
        System.out.println();

        int valueToRemove = 5;
        boolean removed = da.removeValue(valueToRemove);
        if (removed) {
            System.out.println("Element " + valueToRemove + " is removed successfully.");
        } else {
            System.out.println("Element " + valueToRemove + " is not found in the array.");
        }

        System.out.println("Elements of array after removal:");
        for (int i = 0; i < da.getCount(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }
        System.out.println();
    }
}
