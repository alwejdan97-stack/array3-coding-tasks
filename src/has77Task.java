public class has77Task {
    public static void main(String[] args){
        int[] number = {1,2,7,2,7};
        int[] number1 = {1,1,7,7,7};
        int[] number2 = {1,2,3,4,4};
        System.out.println(has77(number));
        System.out.println(has77(number1));
        System.out.println(has77(number2));
    }
    public static boolean  has77(int[] number){
        for(int i=0; i< number.length; i++) {
            if((number[i] == 7) && (number[i + 1] == 7)) {
                return true;
            } else if ((number[i] == 7) && (number[i + 2] == 7)) {
                return true;
            }
        }return false;
    }
}
