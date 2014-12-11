
/** Classe per la gestione degli attuattori che comandano l'apertuira e chiusura di un camino in una cella di essicazione */
public abstract class Camino
{
    /** Indica se il camino è di tipo on/off o proporzionale*/
    public int tipoCamino;
    
    /** Indica se il camino è aperto */
    public boolean aperto;
    
    
	/** Costruttore Camino */
    public Camino(int tipo)
	{
		this.tipoCamino = tipo;
		this.aperto = false;
	}
	
    /** */
    public abstract void setTipoCamino(int tipo);
    
    /** */
    public abstract int getTipoCamino();
    
    /** */
    public abstract void apriCamino();
    
    /** */
    public abstract void chiudiCamino();


	/*****/
    
}
