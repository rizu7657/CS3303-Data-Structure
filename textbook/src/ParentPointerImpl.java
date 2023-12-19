public class ParentPointerImpl {

    private Integer[] array;

    public ParentPointerImpl() {
        this.array = new Integer[10];
    }

    public Integer find(Integer curr) {
        if (array[curr] == null) return curr; // At root
        array[curr] = find(array[curr]);
        return array[curr];
    }

    public static void main(String[] args) {
        ParentPointerImpl parentPointer = new ParentPointerImpl();
        parentPointer.array[0] = null;
        parentPointer.array[1] = 2;
        parentPointer.array[2] = 0;
        parentPointer.array[3] = 4;
        parentPointer.array[4] = 5;
        parentPointer.array[5] = 6;
        parentPointer.array[6] = 7;
        parentPointer.array[7] = 8;
        parentPointer.array[8] = 9;

        parentPointer.find(0);
        for (int i = 0; i < parentPointer.array.length - 1; i++) {
            System.out.println(String.format("%s: %s", i, parentPointer.array[i]));
        }
    }
}
