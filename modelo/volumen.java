package modelo;

public class volumen
{
    private Figura[] FigurasGeometricas;
    private int Cilindro;
    private int Cono;
    private int Cubo;
    private int esfera;

    //Metodos
    public void Figura(int C, int c, int cu, int E )
    {
     
    }


    public Figura[] getFigurasGeometricas() {
        return FigurasGeometricas;
    }

    public void setFigurasGeometricas(Figura[] figurasGeometricas) {
        FigurasGeometricas = figurasGeometricas;
    }

    public int getCilindro() {
        return Cilindro;
    }

    public void setCilindro(int cilindro) {
        Cilindro = cilindro;
    }

    public int getCono() {
        return Cono;
    }

    public void setCono(int cono) {
        Cono = cono;
    }

    public int getCubo() {
        return Cubo;
    }

    public void setCubo(int cubo) {
        Cubo = cubo;
    }

    public int getEsfera() {
        return esfera;
    }

    public void setEsfera(int esfera) {
        this.esfera = esfera;
    }

}
