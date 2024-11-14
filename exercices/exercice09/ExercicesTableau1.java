import java.util.Random;

public class ExercicesTableau1 {
    public static void main(String[] args) 
        
    
{
    int [] nombres = new int [10];

    int min = 1;
    int max = 6;

    Random rdm = new Random();

    for(int cpt = 0; cpt < nombres.length; cpt++)
    {
        nombres[cpt] = rdm.nextInt((max-min)+ 1 ) + min;
    }

    for(int Index = 0; Index < nombres.length; Index++) 
    {
        System.out.println("Cellule " + Index + " : " + nombres[Index]);
    }
    
    
}
}

