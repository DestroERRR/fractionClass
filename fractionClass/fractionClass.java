/**
 * This is a class that represents Fraction as an object
 * 
 * 
 * @author Jason Shi
 * @version 1.0
 * 
 */

public class fractionClass{
    //can inbed html to documentation 
    private int numerator;
    private int denominator; 

    public fractionClass() { //all constructors in AP CS-A will be public 
        numerator = 0;
        denominator = 1;
    }

    
    public fractionClass(int x, int y){
        numerator = x;
        mutatorDenom(y);
        /*
        if(y !=0){
        denominator = y;
        } else {
        denominator = 1;
        System.out.println("i hate u");
        }
         */
    }

    public fractionClass(String xD){
        for(int i = 0; i < xD.length(); i++){
            if(xD.substring(i,i+1).equals("/") ){
                numerator = Integer.parseInt(xD.substring(0,i) );
                denominator = Integer.parseInt(xD.substring(i+1) );
            }
        }
        //System.out.println(numerator+"/"+denominator);

        /*
        int fwdIndex = f.indexOf("/");
        String numString = f.substring(0,fwdIndex);
        String denSting(f.substring(fwdIndex+1);
        num = Integer.parseInt(numString);
        ind d = Integer.praseInt(denString);

        mutatorDenom(y);

        OR

        if(d !=0){
        denominator = y;
        } else {
        denominator = 1;
        System.out.println("i hate u");
        }
         */
    }

    public fractionClass(fractionClass other){
        numerator = other.numerator;
        denominator = other.denominator; //we in the fractionClass class 
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    /**
     * Mutator method for setting the fraction's numerator
     * @param n - chaunceyli
     * @return - nothing 
     */
    public void mutatorNum(int x){
        numerator = x;
    }

    public void mutatorDenom(int y){
        if(y !=0){
            denominator = y;
        } else {
            denominator = 1;
            System.out.println("jasonmallpp");
        }
    }

    public String toString() {
        return numerator+"/"+denominator; //toString built in method 
        //must be public must be called toString,
        //autoboxing 
        //any kind of object has a stringto method built into it
        //the default is it'll print the address of the object in ram of pc 
        //now println calls this because this overrides default 
    }

    private int GCF(int a, int b) {
        /*int max = Math.max(a,b);
        int min = Math.min(a,b);
        int temp = 0;
        int prevTemp = 0;
        temp = max-min;
        prevTemp = temp;
        temp = min-temp;
        while (hehexD) {
        temp = max-min;     

        }
        return temp; */
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) return 1;

        while (a!=b){
            if (a > b) a = a - b;
            else b = b - a;
        }

        return b; 
    }

    public void reduce() {
        int gcf = GCF(numerator,denominator);
        numerator /= gcf;
        denominator /= gcf; 
    }

    public int reciprocalNum(){
        if(numerator!=0)
            return 1;
        return 1/numerator;
    }

    public int reciprocalDem(){
        return 1/denominator;
    }

    public static fractionClass mult(fractionClass x, fractionClass y) {
        fractionClass ans = new fractionClass();
        ans.mutatorNum(x.getNumerator()*y.getNumerator() );
        ans.mutatorDenom(x.getDenominator()*y.getDenominator());
        ans.reduce();
        return ans;
    }

    public static fractionClass div(fractionClass x, fractionClass y){
        fractionClass ans = new fractionClass();
        ans.mutatorNum(x.getNumerator()*y.reciprocalNum() );
        ans.mutatorDenom(x.getDenominator()*y.reciprocalDem() );
        ans.reduce();
        return ans;
    }

    public static fractionClass add(fractionClass x, fractionClass y) {
        fractionClass ans = new fractionClass();
        ans.mutatorNum(x.getNumerator()*y.getDenominator() + y.getNumerator()*x.getDenominator()  );
        ans.mutatorDenom(x.getDenominator()*y.getDenominator() );
        ans.reduce();
        return ans;
    }

    public static fractionClass sub(fractionClass x, fractionClass y) {
        fractionClass ans = new fractionClass();
        ans.mutatorNum(x.getNumerator()*y.getDenominator() - y.getNumerator()*x.getDenominator()  );
        ans.mutatorDenom(x.getDenominator()*y.getDenominator() );
        ans.reduce();
        return ans;
    }

    public static void main (String args[]) {
     System.out.println("bbbb");
    }
}

