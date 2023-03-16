import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();

        double[] myArray  = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        short[] myDate = new short[5];
        myDate[0] = 1925;
        short date1 = myDate[0];
        myDate[1] = 1989;
        short date2 = myDate[1];
        myDate[2] = 1984;
        short date3 = myDate[2];
        myDate[3] = 2008;
        short date4 = myDate[3];
        myDate[4] = 2012;
        short date5 = myDate[4];
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println();

    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        System.out.println();

        double[] myArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        short[] myDate = new short[5];
        myDate[0] = 1925;
        short date1 = myDate[0];
        myDate[1] = 1989;
        short date2 = myDate[1];
        myDate[2] = 1984;
        short date3 = myDate[2];
        myDate[3] = 2008;
        short date4 = myDate[3];
        myDate[4] = 2012;
        short date5 = myDate[4];
        for (int index = 0; index < myDate.length; index++) {
            if (index == myDate.length - 1) {
                System.out.println(myDate[index]);
                break;
            }
            System.out.print(myDate[index] + ", ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] myArray  = {1.57, 7.654, 9.986};
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        short[] myDate = new short[5];
        myDate[0] = 1925;
        short date1 = myDate[0];
        myDate[1] = 1989;
        short date2 = myDate[1];
        myDate[2] = 1984;
        short date3 = myDate[2];
        myDate[3] = 2008;
        short date4 = myDate[3];
        myDate[4] = 2012;
        short date5 = myDate[4];
        for (int i = myDate.length - 1; i >= 0; i--) {
            System.out.print(myDate[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        }

        public static void task4 () {
            System.out.println("Задача 4");
            int[] array = new int[3];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    array[i] += 1;
                }
            }
            System.out.println(Arrays.toString(array));
        }
}