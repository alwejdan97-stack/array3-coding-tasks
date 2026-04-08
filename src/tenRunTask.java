public class tenRunTask {
    public static void main(String[] args){
        int[] number = {10,2,3,20,5};
        number=tenRun(number);
        for(int modify : number){
            System.out.println(modify+" ");
        }
    }
    public static int[] tenRun(int[] number){
        int current = -1;
        for(int i=0; i< number.length; i++) {
            if (number[i]%10==0) {
                current = number[i];
            }
            else if(current!= -1){
                number[i]=current;
            }
        }
        return number;
    }
}
