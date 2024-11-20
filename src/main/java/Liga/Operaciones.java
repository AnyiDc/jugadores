package Liga;

public class Operaciones {
    int ai,bi;
    double ad,bd;

    Operaciones( int ai,int bi){
        this.ai =ai;
        this.bi= bi;
    }
//sobrecarga de metodos, indica que los metodos se llaman igual pero usan distintos tipos de varibales
    public Operaciones(double ad, double bd) {
        this.ad = ad;
        this.bd = bd;
    }

   public int suma(int ai,int bi){
        return ai+bi;
   }

   public double suma(double ad,double bd){
        return ad+bd;
   }
}
