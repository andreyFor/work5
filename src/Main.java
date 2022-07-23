public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задание номер 1

        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        for (int i = 0; i < apple.length; i++) {
            System.out.print(apple[i] + ",");

        }


        double[] orange = {1.57, 7.654, 9.986};
        for (int i = 0; i < orange.length; i++) {
            System.out.print(orange[i] + ",");

        }

        int[] bananas = new int[11];
        bananas[0] = 101;
        bananas[1] = 102;
        bananas[2] = 103;
        bananas[3] = 104;
        bananas[4] = 105;
        bananas[5] = 106;
        bananas[6] = 108;
        bananas[7] = 109;
        bananas[8] = 1021;
        bananas[9] = 10312;
        bananas[10] = 10414124;
        for (int i = 0; i < bananas.length; i++) {
            System.out.print(bananas[i] + ",");
        }


        // задание номер 3
        for (int i = apple.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(apple[i] + ", ");
            } else {
                System.out.println(apple[i]);
            }
        }
        for (int i = orange.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(orange[i] + ", ");
            } else {
                System.out.println(orange[i]);
            }
        }
        for (int i = bananas.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(bananas[i] + ", ");
            } else {
                System.out.println(bananas[i]);
            }
        }
        //Задача номер 4
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] % 2 != 0) {
                apple[i] = apple[i] + 1;
            }
            if (i != apple.length - 1) {
                System.out.print(apple[i] + ", ");
            } else {
                System.out.println(apple[i]);
            }
        }


















    }


















    }
