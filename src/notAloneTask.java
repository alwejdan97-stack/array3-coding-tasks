public class notAloneTask {
    public static void main(String[] args){
        int n = 5;
        int[] number = {1, 2, 3, 4, 5, 2};
        number = notAlone(number, n);
        for(int result : number){
            System.out.print(result + " ");
        }
    }
    public static int[] notAlone(int[] number, int n){
        for(int i = 1; i < number.length - 1; i++){
            if(number[i] == n &&
                    number[i - 1] != n &&
                    number[i + 1] != n){
                number[i] = Math.max(number[i - 1], number[i + 1]);
            }
        }
        return number;
    }
}