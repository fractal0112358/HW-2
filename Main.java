public class Main {

    public static void main(String[] args) {
        revertNumbers();
        fillArray();
        changeNumbersInArray();
        fillDiagonal();
        searchMinMax();
        int[] sixthArray = {5,1,1,1,1,3};
        checkArray(sixthArray);


    }

    static void revertNumbers() {
        System.out.println("First task:");
        int[] myArray = {0, 1, 1, 0, 1, 1, 1, 0, 1, 0};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }

        for (int k = 0; k < myArray.length - 1; k++) {
            System.out.print(myArray[k] + " ");
        }
    }


    static void fillArray() {
        System.out.println();
        System.out.println();
        System.out.println("Second task:");
        int[] arr = new int[8];
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            arr[j] = i;
            i += 3;
        }

        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }


    static void changeNumbersInArray() {
        System.out.println();
        System.out.println();
        System.out.println("Third task:");
        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6) {
                newArray[i] *= 2;
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }


    static void fillDiagonal() {
        System.out.println();
        System.out.println();
        System.out.println("Fourth task:");
        int[][] squareArray = new int[5][5];
        int a = 0;
        int b = 0;

        for (int i = 0; i < squareArray.length; i++) {
            squareArray[a][b] = 1;
            a++;
            b++;
        }

        a = 4;
        b = 0;

        for (int i = 0; i < squareArray.length; i++) {
            squareArray[a][b] = 1;
            a--;
            b++;
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void searchMinMax() {
        System.out.println();
        System.out.println();
        System.out.println("Fifth task:");
        int[] newArray = new int[10];
        int min = 0;
        int max = 0;

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = ((int)(Math.random() * 100) + 0);
            System.out.print(newArray[i] + " ");
        }
        for (int j = 0; j < newArray.length; j++) {
            if(newArray[j] > max) {
                max = newArray[j];
            }
        }
        min = max;
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] < min) {
                min = newArray[j];
            }
        }
        System.out.println();
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }

    static void checkArray(int[] sixthArray) {
        System.out.println();
        System.out.println();
        System.out.println("Sixth task:");



        if(sixthArray[0] + sixthArray[1] + sixthArray[2] + sixthArray[3] + sixthArray[4] == sixthArray[5]){
            System.out.println(true);
        } else if (sixthArray[0] + sixthArray[1] + sixthArray[2] + sixthArray[3] == sixthArray[4] + sixthArray[5]) {
            System.out.println(true);
        } else if (sixthArray[0] + sixthArray[1] + sixthArray[2] == sixthArray[3] + sixthArray[4] + sixthArray[5]) {
            System.out.println(true);
        } else if (sixthArray[0] + sixthArray[1] == sixthArray[2] + sixthArray[3] + sixthArray[4] + sixthArray[5]) {
            System.out.println(true);
        } else if (sixthArray[0] == sixthArray[1] + sixthArray[2] + sixthArray[3] + sixthArray[4] + sixthArray[5]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    }


