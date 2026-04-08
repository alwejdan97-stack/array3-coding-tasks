public class isEverywhereTask {
    public static void main(String[] args){
        int n = 2;
        int n1 = 1;
        int[] number = {1,1,1,2,4};
        System.out.println(isEverywhere(number,n));
        System.out.println(isEverywhere(number,n1));
    }
    public static boolean  isEverywhere(int[] number, int n){
        for(int i=0; i< number.length; i++){
            if((number[i]==n && number[i+1]==n)){
                return true;
            }
        }return false;
    }
}
