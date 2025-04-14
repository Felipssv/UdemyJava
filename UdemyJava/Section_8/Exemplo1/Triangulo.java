package Section_8.Exemplo1;

public class Triangulo {
    
        public double A;
        public double B;
        public double C;

        public double area() {
            double p = (A + B + C) / 2.0;
            return Math.sqrt(p * (p - A) * (p - B) * (p - C));
        }

    }   

