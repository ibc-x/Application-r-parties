public class Calculatrice {

    private double a;
    private double b;
    private double resultat;

    public Calculatrice(double a, String operateur, double b){
        this.a = a;
        this.b = b;
        this.resultat = 0;
    }

    public Calculatrice addition(){
        this.resultat = this.resultat + this.a + b;
        return this;
    }

    public Calculatrice soubstraction(){
        this.resultat = this.resultat + this.a - b;
        return this;
    }

    public Calculatrice multiplication(){
        this.resultat = this.resultat + this.a * b;
        return this;
    }
    public Calculatrice division(){
        try {
            this.resultat = this.resultat + this.a / b;
        } catch (ArithmeticException e) {
           System.err.println("Erreur division par 0 ");
        }
        return this;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
