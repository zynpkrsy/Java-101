

public class asalSayilar {
    public static void main(String[] args) {
        int n;
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 1) {
                if ((i % 3 == 1) || (i % 3 == 2)) {
                    if ((i % 5 != 0) && (i % 7 !=0)) {
                        n = i;
                        System.out.print(i + " ");
                    } else if (i == 5) {
                        System.out.print(i + " ");
                    } else if (i ==7) {
                        System.out.print(i + " ");
                    }
                }
                if (i ==3) {
                    System.out.print(i + " ");
                }
            } else if (i == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
