
/**
 * @author 
 * @version 
 */
public class Kontaktverwaltung
{
    // Bezugsobjekte

    // Attribute
    List<Kontakt> kontaktliste;

    // Konstruktor
    public Kontaktverwaltung()
    {
        kontaktliste = new List();
    }

    // Dienste
    public void neuerKontakt(Kontakt x)
    {
        kontaktliste.append(x);
    }
    
    public void loescheKontakt(String name)
    {
        kontaktliste.remove();
    }
    
    public Kontakt gibKontakt(String name)
    {
        kontaktliste.getContent();
        return null;
    }
}
