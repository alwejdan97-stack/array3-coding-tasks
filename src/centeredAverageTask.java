public class centeredAverageTask {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4, 5, 2};
        System.out.println(centeredAverage(number));
    }
    public static int centeredAverage(int[] number){
        int sum=0;
        int max= number[0];
        int mini= number[0];
        for(int i=0; i<number.length; i++){
            sum= sum+ number[i];
            if(number[i]< mini){
                mini=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        sum = sum - mini - max;
        return sum / (number.length-2);
    }
}
