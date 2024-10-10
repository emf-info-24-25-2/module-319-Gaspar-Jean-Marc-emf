import java.util.Random;

public class devoir02 
{

    public static int CAPACITE_RESERVOIR_A = 3;
    public static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) 
    {
    
        int reservoirA = 0;
        int reservoirB = 0;

     
        Random rand = new Random();
        int remplissage = rand.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1);

    
        System.out.println("Il y a " + remplissage + " litres à remplir.");

   
        while (reservoirA + reservoirB < remplissage) 
        {
            if (reservoirA < CAPACITE_RESERVOIR_A) 
            {
    
                reservoirA++;
                System.out.println("Remplissage du réservoir A...");
            } 
            else if (reservoirB < CAPACITE_RESERVOIR_B) 
            {
    
                reservoirB++;
                System.out.println("Remplissage du réservoir B...");
            }

    
        System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }

    
        System.out.println("Remplissage terminé!");
    }
}