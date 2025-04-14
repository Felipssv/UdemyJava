package Section_10.ForEach;

public class Main {
    public static void main(String[] args) {
        String[] vect = new String[] {"Ronaldo", "Johson", "Rolandinho"};

        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-------------------");
        System.out.println("FOR EACH");
        System.out.println("-------------------");
        /*/ 
        for (Tipo Variável : coleção){
            <comando>
        }/* */
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
