package mypractice.run;

// way 1 to import classes with same name from different packages
import mypractice.bdw.Calc as BdwCalc;  // Importing Calc from bdw package
import mypractice.adw.Calc as AdwCalc;  // Importing Calc from adw package

public class Main {
    public static void main(String[] args) {
        // Using Calc from bdw package
        BdwCalc bdwCalc = new BdwCalc(); // Creating object of Calc from bdw package
        bdwCalc.add(10, 20);    // Calling add method from Calc in bdw package

        // Using Calc from adw package
        AdwCalc adwCalc = new AdwCalc(); // Creating object of Calc from adw package
        adwCalc.add(30, 40);    // Calling add method from Calc in adw package
    }
}

//way 2 to import classes with same name from different packages (use fully qualified names) (Ex: mypractice.bdw.Calc)
/*
import mypractice.bdw.Calc;
import mypractice.adw.Calc;

public class Main {
    public static void main(String[] args) { 
        // Using Calc from bdw package
        Calc bdwCalc = new mypractice.bdw.Calc(); // Creating object of Calc from bdw package
        bdwCalc.add(10, 20);    // Calling add method from Calc in bdw package           
        // Using Calc from adw package
        Calc adwCalc = new mypractice.adw.Calc(); // Creating object of Calc from adw package
        adwCalc.add(30, 40);    // Calling add method from Calc  
    } in adw package
}  
*/  

//way 3 to import classes with same name from different packages (do not import any Calc class and use fully qualified names)
/*
public class Main {
    public static void main(String[] args) { 
        // Using Calc from bdw package
        mypractice.bdw.Calc bdwCalc = new mypractice.bdw.Calc(); // Creating object of Calc from bdw package
        bdwCalc.add(10, 20);    // Calling add method from Calc in bdw package           
        // Using Calc from adw package
        mypractice.adw.Calc adwCalc = new mypractice.adw.Calc(); // Creating object of Calc from adw package
        adwCalc.add(30, 40);    // Calling add method from Calc in adw package
    }  
}  
*/

// way 4 to access class from different package (using import for that class only) and using fully qualified names for other class
/* import mypractice.bdw.Calc;  // Importing Calc from bdw package
public class Main {
    public static void main(String[] args) { 
        // Using Calc from bdw package
        Calc bdwCalc = new Calc(); // Creating object of Calc from bdw package
        bdwCalc.add(10, 20);    // Calling add method from Calc in bdw package           

        // Using Calc from adw package
        mypractice.adw.Calc adwCalc = new mypractice.adw.Calc(); // Creating object of Calc from adw package
        adwCalc.add(30, 40);    // Calling add method from Calc in adw package
    }  
}  
*/