public class fractionClass{

    private int numerator;
    private int denominator; 

    public fractionClass() {
        numerator = 0;
        denominator = 1;
    }

    public fractionClass(int x, int y){
        System.out.println(x+"/"+y);
    }

    public fractionClass(String xD){
        for(int i = 0; i < xD.length(); i++){
            if(xD.substring(i,i+1).equals("/") ){
                numerator = Integer.parseInt(xD.substring(0,i) );
                denominator = Integer.parseInt(xD.substring(i+1) );
            }
        }
        System.out.println(numerator+"/"+denominator);
    }

    public fractionClass(fractionClass other){
        numerator = other.numerator;
        denominator = other.denominator; 

    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public int mutatorNum(int x){
        numerator = x;
        return numerator;
    }

    public int mutatorDenom(int y){
        if(y!=0){
            denominator = y;
            return denominator;
        }
        return 1;
    }

}