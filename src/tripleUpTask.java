public class tripleUpTask {
    public static void main(String[] args){
        int[] number = {1,4,3,4,6};
        System.out.println(tripleUp(number));
    }
    public static boolean  tripleUp(int[] number){
        for(int i = 0; i<number.length-1; i++){
            if((number[i]+1==number[i+1]) && (number[i+1]+1==number[i+2])){
                return true;
            }
        }return false;
    }
}