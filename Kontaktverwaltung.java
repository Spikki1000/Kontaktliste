/**
 * @author 
 * @version 
 */
public class Kontaktverwaltung
{
    List<Kontakt> kontaktliste;
    public Kontaktverwaltung()
    {
        kontaktliste = new List();
    }

    public void neuerKontakt(Kontakt x)
    {
        Kontakt gefunden = null;
        kontaktliste.toFirst();
        while (kontaktliste.hasAccess())
        {
            if (kontaktliste.getContent().gibName() == x)
            {
                break;
            }
            kontaktliste.next();
        }
        
        if (kontaktliste.hasAccess())
        {
            kontaktliste.append(x);
        }
    }
    
    public void loescheKontakt(String name)
    {
        Kontakt gefunden = null;
        kontaktliste.toFirst();
        while (kontaktliste.hasAccess())
        {
            if (kontaktliste.getContent().gibName() == name)
            {
                break;
            }
            kontaktliste.next();
        }
        
        if (kontaktliste.hasAccess())
        {
            kontaktliste.remove();
        }
    }
    
    public Kontakt gibKontakt(String name)
    {
         kontaktliste.toFirst();
        while (kontaktliste.hasAccess())
        {
            if (kontaktliste.getContent().gibName() == name)
            {
                break;
            }
            kontaktliste.next();
        }
        
        if (kontaktliste.hasAccess())
        {
            kontaktliste.getContent();
        }
        return null;
    }
}
