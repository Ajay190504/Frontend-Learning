public class Average{
    float avg;
    public Average(int a, int b, int c) {
        this.avg=(a+b+c)/3.0f;
    }

    public static void main(String[] args) {
        Average av = new Average(3, 4, 5);
        System.out.println("Average of 3,4,5 : "+av.avg);
    }
    
}