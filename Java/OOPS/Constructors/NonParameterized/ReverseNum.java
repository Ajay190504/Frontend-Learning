public class ReverseNum{
    int num=1234;

    int rev = 0;
    public ReverseNum() {
        while(this.num!=0){
            int dig = this.num%10;
            this.rev=this.rev*10+dig;
            this.num/=10;
        }
    }
    public static void main(String[] args) {
        ReverseNum rn = new ReverseNum();
        System.err.println("Reversed number: "+rn.rev);
    }
    
}