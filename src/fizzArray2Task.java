
public class fizzArray2Task {
    public static void main(String[] args){
        int number=6;
        String[] result=fizzArray2(number);
        for(String str : result){
            System.out.println(str +" ");
        }
    }
    public static String[]  fizzArray2(int number){
        String[] result= new String[number];
        for(int i=0; i<number;i++){
            result[i]=Integer.toString(i);
        }
        return result;
    }
}
