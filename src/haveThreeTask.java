public class haveThreeTask {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5};
        int[] number1 = {1,2,3,3,4,4};
        int[] number2 = {3,2,3,4,3};
        System.out.println(haveThree(number));
        System.out.println(haveThree(number1));
        System.out.println(haveThree(number2));
    }
    public static boolean haveThree(int[] number){
        int count=0;
        for(int i=0; i<number.length;i++){
            if(number[i]==3){
                count++;
            }
            else if(number[i]==3 && number[i+1]==3){
                return false;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }
}
