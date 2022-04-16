import java.lang.reflect.Array;



public class Main {

    public static void main(String[] args) {
//Задание 1
        int[] arr = generateRandomArray();
        int amount = 0;
        for(int current:arr){
            amount += current;
        }
        System.out.println("Amount: " + amount);
        //Задание 2
        int[] array1= new int [2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100_000 + 100_000);
        }

        int max = array1[0];
        int min = array1[0];
        int avg = 0;

        for (int b = 0; b < array1.length; b++) {
            if (max < array1[b])
                max = array1[b];
            if (min > array1[b])
                min = array1[b];
            avg = avg + array1[b]/array1.length;
        }

// задание 3
        float c =0;
        for (float sumS : array1){
            c += sumS;
        }
        System.out.println("Maximum amount is " + max);
        System.out.println("Minimum amount is " +min);
        System.out.println("Average amount is " + avg);
        System.out.println("\n");
        //Задание 4
        String oldString = "navI vonavI";
        String newString = oldString.replace( "navI vonavI", "Ivanov Ivan");
        System.out.println("Early - " + oldString);
        System.out.println("Now - " + newString);


    }

    private static Object replace(char[] reverseFullName) {
        return null;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
