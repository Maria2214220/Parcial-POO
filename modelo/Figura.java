package modelo;

public class Figura {

        private static final int r = 0;
        //Atributos
        private String Nombre ;
        private int Cono;
        private int Cubo;
        private int Cilindro;
        private int esfera;

}
        //Métodos

        public Figura()
        {
            Object volumen = (4/3)*Math.PI*(r*r*r);

        }

        //Volumen de la esfera

            abstract class Figura implements Servicio{
                private double radio;
                //este es el método que calcula el volumen de la esfera
                public abstract double volumen();
             
                public Figura(){}
             
                public Figura(double _radio){
                    this.radio=_radio;
                }
             
                public double getRadio(){
                    return this.radio;
                }
            }
        
    