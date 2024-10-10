public class App 
{
    public static void main(String[] args)
    {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println(maChaineDeCaractere);
        int nombreDeCaracteres = maChaineDeCaractere.length();

        System.out.println("maChaineDeCaractere :" + nombreDeCaracteres);

        int position = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot 'contenu' commence a la position: " + position);

        char lettrePosition17 = maChaineDeCaractere.charAt(17);
        System.out.println("la position 17 contient la lettre : " + lettrePosition17);

        String monPrenom = "jean-marc";

        for (int i = 0; i < monPrenom.length(); i++) 
        {
            char lettre = monPrenom.charAt(i);
            System.out.println("La lettre à la position " + i + " est : " + lettre);
        }
        String test = "test"; 
        if (monPrenom.contains(test)) 
        {
                System.out.println("La caine de caractere " + monPrenom + " contient le texte " + test );    
        } 
        else
        {
            System.out.println("La chaîne de caractère " + monPrenom + " ne contient pas le texte " + test +".");
        }
    }
}