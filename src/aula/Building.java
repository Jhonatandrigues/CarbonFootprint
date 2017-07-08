package aula;

/**
 *  A classe Building recebe a consuma��o mensal de energia por hora de uma
 *  constru��o multiplicada pela quantidade de meses e retorna a pegada de
 *  carbono produzida
 *  
 * @author Matheus Truyts
 * @version 1.0
 *
 */

//Formula = (carbon footprint = kWh * 12).
//kwh = quantidade de energia gasta por hora.

public class Building implements CarbonFootprint {
	
    private double mediaMensalKwh; //consuma��o mensal de energia por hora
    private final int meses = 12;
    
    /**
	 * Constructor que recebe a a consuma��o mensal de energia por hora
	 * 
	 * @param consumoMensal - consuma��o mensal de energia por hora
	 * 
	 */
    public Building( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }
    
    /**
	 * Metodo que obtem a consuma��o mensal de energia por hora
	 * 
	 * @param consumoMensal - consuma��o mensal de energia por hora
	 * 
	 */
    public void setMediaMensalKwh( double consumoMensal ) {
        mediaMensalKwh = consumoMensal;
    }
    
    /**
	 * Metodo que retorna a consuma��o mensal de energia por hora
	 * 
	 * @return consuma��o mensal de energia por hora
	 * 
	 */
    public double getMediaMensalKwh() {
        return mediaMensalKwh;
    }
    
    /**
	 * Metodo que imprime consuma��o mensal de energia por hora
	 * 
	 * @return consuma��o mensal de energia por hora
	 * 
	 */
    
    @Override 
    public String toString() {
        return String.format("%s: %.2f", "Consuma��o mensal � ", getMediaMensalKwh() );
    }
    
    /**
	 * Metodo que calcula a pegada de carbono produzida por constru��es
     *
	 * @return CarbonFootprint de buildings
	 * 
	 */
    @Override
    public double getCarbonFootprint() {
        return getMediaMensalKwh() * meses;
    }
}
