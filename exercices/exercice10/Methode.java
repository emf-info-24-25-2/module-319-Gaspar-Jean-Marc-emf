public class Methode{

public static void main(String[] args){
    direBonjour();
    dire(null);
    maths();

}

public static void direBonjour()
{
    System.out.println("BONJOUR");
}
public static void dire(String message) 
{
    System.out.println("N'importe quoi");
}
public static void maths() 
{
int min=Math.min(2, 69);
int max=Math.max(2, 69);
Double pow=Math.pow(2.3, 6.9);
Double sqrt=Math.sqrt(3.2);
Double abs=Math.abs(2.3);
System.out.println("le min est " +min);
System.out.println("le max est "+max);
System.out.println("le pow est "+pow);
System.out.println("le sqrt est "+sqrt);
System.out.println("le abs est "+abs);
}
}
