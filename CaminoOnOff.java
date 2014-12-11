
/** Classe per la gestione degli attuattori che comandano l'apertuira e chiusura di un camino in una cella di essicazione */
public class CaminoOnOff extends Camino
{
       
	/** Costruttore Camino */
    public CaminoOnOff(int tipo)
	{
		super(tipo);
	}
	
    /** */
    public void setTipoCamino(int tipo)
    {
		this.tipoCamino = tipo;
    }
    
    /** */
    public int getTipoCamino()
    {
		return this.tipoCamino;
    }
    
    /** */
    public void apriCamino()
    {
		if(!aperto)
		{
			System.out.println("Comando apertura camino");
			aperto = true;
		}
		else
			System.out.println("Il camino è già aperto");
    }
    
    /** */
    public void chiudiCamino()
    {
		if(aperto)
		{
			System.out.println("Comando chiusura camino");
			aperto = false;
		}
		else
			System.out.println("Il camino è già chiuso");
    
    }
}
