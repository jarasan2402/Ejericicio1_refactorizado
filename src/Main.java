 public class Main {
        public static void main(String[] args) {
            double lado1 = 5.0;
            double ancho1 = 4.0;
            double superficie1 = calculoSuperficie(lado1, ancho1);
            double x1 = getX(superficie1);
            double y1 = calculoSuperficie(x1, 4);
            Habitacion(x1, y1);

            double lado2 = 6.0;
            double ancho2 = 2.5;
            double superficie2 = calculoSuperficie(lado2, ancho2);
            double x2 = getX(superficie2);
            double y2 = calculoSuperficie(x2, 4);
            Habitacion(x2, y2);

            double tl = sumatotal(x1, x2);
            extracted("Total de litros: " + tl);
            double te = sumatotal(y1, y2);
            extracted("Total de euros: " + te);
        }

     private static double getX(double superficie) {
         return superficie / 10;
     }

     private static void extracted(String te) {
         System.out.println(te);
     }

     private static double sumatotal(double x1, double x2) {
         return x1 + x2;
     }

     private static void Habitacion(double x, double y) {
         extracted("Habitacion 1: " + x + " litros, " + y + " euros");
     }

     private static double calculoSuperficie(double l, double a) {
         return l * a;
     }
 }