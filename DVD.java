/**
 * Objekte dieser Klasse repr�sentieren DVDs. Es werden
 * Informationen �ber eine DVD verwaltet, die wieder
 * abgefragt werden k�nnen.
 * 
 * @author Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */
public class DVD extends Medium 
{
    private String regisseur;

    /**
     * Konstruktor f�r Objekte der Klasse DVD
     * @param derTitel Der Titel dieser DVD.
     * @param derRegisseur Der Regisseur dieser DVD.
     * @param laenge Die Spielzeit des Hauptfilms.
     */
    public DVD(String derTitel, String dieRegie, int laenge)
    {
        super(derTitel, laenge);
        regisseur = dieRegie;

    }


    /**
     * Gib die Details dieser DVD auf der Konsole aus.
     */
    public void ausgeben()
    {
        System.out.print("DVD: " + titel + " (" + spielzeit + " Min)");
        if(habIch) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + regisseur);
        System.out.println("    " + kommentar);
    }
}
