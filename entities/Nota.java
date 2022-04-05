package entities;

public class Nota {
    public double nota1;
    public double nota2;
    public double nota3;

    public Nota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Nota() {
    }

    public double Media(){
        return  (nota1*2+nota2*3+nota3*5)/10;
    }
    
}
