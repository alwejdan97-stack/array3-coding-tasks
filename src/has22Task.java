public class has22Task {
    public static void main(String[] args){
        int[] number= {1, 2, 3, 4, 5, 2};
        System.out.println(has22(number));
    }
    public static boolean  has22(int[] number){
        for(int i=0; i<number.length-1; i++){
            if(number[i]==2 && number[i+1]==2){
                return true;
            }
        }return false;
    }
}
