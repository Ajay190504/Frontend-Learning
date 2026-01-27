public class EvenOdd{
    int num;

    public EvenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
    }

    public static void main(String[] args) {
        EvenOdd e1 = new EvenOdd(5);
    }
}