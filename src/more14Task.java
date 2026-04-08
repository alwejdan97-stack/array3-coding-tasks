public class more14Task {
    public static void main(String[] args){
        int[] number= {1, 2, 3, 4, 5, 2};
        System.out.println(more14(number));
    }
    public static boolean  more14(int[] number){
        int count1= 0;
        int count2= 0;
        for(int i=0; i< number.length; i++){
            if(number[i]==1){
                count1++;
            }
            if(number[i]==4){
                count2++;
            }
        }
        if(count2>count2){
            return true;
        }
        return false;
    }
}
