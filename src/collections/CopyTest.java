package collections;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4};
        int[] sCopy = null;
        int[] dCopy = null;

        sCopy = shallowCopy(data);
        dCopy = deepCopy(data);

        System.out.println("original : " + Arrays.toString(data)); // 01234
        System.out.println("shallow : " + Arrays.toString(sCopy)); // 01234
        System.out.println("deep : " + Arrays.toString(dCopy)); // 01234
        System.out.println();

        data[0] = 5;
        System.out.println("original : " + Arrays.toString(data)); //51234
        System.out.println("shallow : " + Arrays.toString(sCopy)); //51234
        System.out.println("deep : " + Arrays.toString(dCopy)); //01234
    }
    public static int[] shallowCopy(int[] arr){
        return arr;
    }
    public static int[] deepCopy(int[] arr){
        if(arr == null) return null;
        int[] result = new int[arr.length];

        System.arraycopy(arr, 0, result, 0, arr.length);
        return result;
    }
}
