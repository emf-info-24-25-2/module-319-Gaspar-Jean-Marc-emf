
    public class EchangeValeurs {

        public static void main(String[] args) {
            int valeur1 = 50;
            int valeur2 = 14;

            System.out.println("le contenu de la variable1 est :" + valeur1);
            System.out.println("le contenu de la variable2 est :" + valeur2);

            int valeur3;

            valeur3 = valeur1;
            valeur1 = valeur2;
            valeur2 = valeur3;

            System.out.println("..... Traitement .....");
            System.out.println("Le contenu de la variable 1 est : " + valeur1);
            System.out.println("Le contenu de la variable 2 est : " + valeur2);
        }
    }
