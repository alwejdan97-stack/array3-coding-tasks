public class either24Task {
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 3, 4, 4};
        System.out.println(either24(number));
    }

    public static boolean either24(int[] number) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == 2 && number[i + 1] == 2) {
                has22 = true;
            }

            if (number[i] == 4 && number[i + 1] == 4) {
                has44 = true;
            }
        }

        return has22^has44;
    }
}
