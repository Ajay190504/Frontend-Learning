public class ReverseNum{
    int rev=0;
    public ReverseNum(int num) {
        while(num!=0){
            int dig = num%10;
            this.rev=this.rev*10+dig;
            num/=10;
        }
    }

    public static void main(String[] args) {
        ReverseNum rn = new ReverseNum(1234);
        System.out.println("Reversed number: "+rn.rev);
    }
}