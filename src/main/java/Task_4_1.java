public class Task_4_1 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(arr[i]);
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max number: " + max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min number: " + min);
        int a = max;

        if (a > min) {
            a = min;
            System.out.println(a);

            int b = min;
            if (b < max) {
                b = max;
                System.out.println(b);
            }
        }
    }
}

