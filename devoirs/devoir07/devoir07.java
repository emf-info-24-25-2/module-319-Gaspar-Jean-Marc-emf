package devoir07;

import java.util.Random;

public class devoir07 {
    public static void main(String[] args) 
    {
        int TAILLE_TABLEAU = 10;
        int MIN_NOMBRE = -8;
        int MAX_NOMBRE = 8;
        int VALUR_RECHERCHEE = 7;
        genererValeursAleatoires(MIN_NOMBRE, MAX_NOMBRE, VALUR_RECHERCHEE);
}
public static int[] genererValeursAleatoires(int min, int max, int valeurAGenerer){
    int[] resultat = new int[valeurAGenerer];
    Random rdm = new Random();
    for (int i=0; i<valeurAGenerer;i++){
    resultat[i]=rdm.nextInt(max - min)+min;  
    }
    return resultat;
}
}
