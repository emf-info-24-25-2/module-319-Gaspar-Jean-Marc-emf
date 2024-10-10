public class App {
    public static void main(String[] args){
        int[] tableauEntiers = new int[5];

        tableauEntiers[0] = 10;
        tableauEntiers[1] = 20;
        tableauEntiers[2] = 30;
        tableauEntiers[3] = 40;
        tableauEntiers[4] = 50;

        System.out.println("Contenu du tableau :");
        for (int i = 0; i < tableauEntiers.length; i++) {
            System.out.println("Élément à l'indice " + i + ": " + tableauEntiers[i]);


    }
}
}
