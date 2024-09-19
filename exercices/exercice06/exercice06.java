public class exercice06 
{
    public static void main(String[] args) 
    {
       int noteDuModule = 5;
    
       if (noteDuModule >= 4) 
       {
       System.out.println("promu"); 
       } 
       else 
       {
        System.out.println("non promu");
        }
        switch (noteDuModule) {
            case 1:
                System.out.println("Travail non rendu");
                break;
            case 2: 
                System.out.println("Très insuffisant");
                break;
            case 3:
                System.out.println("Insuffisant");
                break;
            case 4:
                System.out.println("Suffisant");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Très bien");
                break;
        }

    }
}
