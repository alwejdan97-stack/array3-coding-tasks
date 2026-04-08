public class only14Task {
    public static void main(String[] args){
        int[] number = {1,1,1,1,4};
        System.out.println(only14(number));
    }
    public static boolean  only14(int[] number){
        for(int num : number){
            if(num != 1 && num !=4){
                return false;
            }
        }
        return true;
    }
}
