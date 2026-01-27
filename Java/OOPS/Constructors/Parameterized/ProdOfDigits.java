public class ProdOfDigits{
    int prod = 1;

    public ProdOfDigits(int num) {
        while(num!=0){
            int dig = num%10;
            this.prod*=dig;
            num/=10;
        }
    }

    public static void main(String[] args) {
        ProdOfDigits sd = new ProdOfDigits(1234);

        System.out.println("Product of Digits: "+sd.prod);
    }
    

}