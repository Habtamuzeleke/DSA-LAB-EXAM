public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = findMaximum(array);
        System.out.println("Maximum element in the array is: " + max);
    }

    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

