
public class Medium
{
    // instance variables - replace the example below with your own
    protected String titel;
    protected int spielzeit;
    protected boolean habIch;
    protected String kommentar;

    /**
     * Constructor for objects of class Medium
     */
    public Medium(String derTitel, int laenge)
    {
        titel = derTitel;
        spielzeit = laenge;
        habIch = false;
        kommentar = "<kein Kommentar>";
      
    }

    
    public String gibKommentar()
    {
        return kommentar;
    }
    
        public void setzeKommentar(String kommentar)
    {
        this.kommentar = kommentar;
    }
    
        public void setzeVorhanden(boolean vorhanden)
    {
        habIch = vorhanden;
    }
    
        public boolean gibVorhanden()
    {
        return habIch;
    }

}
