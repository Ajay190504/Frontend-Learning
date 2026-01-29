package constructors.nonparameterized;


public class Average{
    int n1=5,n2=4,n3=6;
    float avg;
    public Average() {
        this.avg = (this.n1+this.n2+this.n3)/3.0f;
    }

    public static void main(String[] args) {
        Average av = new Average();

        System.out.println("Average of numbers: "+av.avg);
    }
    
}
