public class zeroMaxTask {
    public static void main(String[] args){
        int[] number = {0, 2, 0, 3, 0, 1};
        number = zeroMax(number);
        for(int result : number){
            System.out.println(result + " ");
        }
    }
    public static int[] zeroMax(int[] number){
        for(int i = 0; i < number.length; i++){
            if(number[i] == 0){
                int maxOdd = 0; // reset for each zero
                for(int j = i + 1; j < number.length; j++){
                    if(number[j] % 2 != 0){ // correct odd check
                        if(number[j] > maxOdd){
                            maxOdd = number[j];
                        }
                    }
                }
                if(maxOdd != 0){
                    number[i] = maxOdd;
                }
            }
        }
        return number;
    }
}