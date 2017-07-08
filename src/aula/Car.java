package aula;

/**
 *  A classe Car recebe as milhas anuais, a media de milhas por gal�o e o
 *  kgCO2PorMilha gastas por um carro e calcula sua pegada de carbono
 * 
 * @author Matheus Truyts
 * @version 1.0
 *
 */

/*Queimando um gal�o de g�s, emite-se 9 kg de di�xido de carbono na atmosfera. Ent�o, 
para calcular as suas emiss�es de condu��o:
	(Gal�es/ano * 9 kg/gal�o = Kilogramas de dioxido de carbono/ano).
 */

//Media milhas/ano x media MPG = Gal�es/ano

public class Car implements CarbonFootprint {

	private double milhasAnuais; //milhas anuais
	private double mediaMPG; //media de milhas por gal�o
	private final int kgCO2PorMilha = 9; //kilogramas de dioxido de carbono por milha

	/**
	 * Constructor que recebe a quantidade de milhas gastas no ano e
	 * a media de milhas por gal�o
	 * 
	 * @param milhas - milhas anuais 
	 * @param MPG - media de milhas por gal�o
	 * 
	 */
	public Car( double milhas, double MPG ) {
		milhasAnuais = milhas;
		mediaMPG = MPG;
	}

	/**
	 * Metodo que obtem a quantidade de milhas gastas no ano 
	 * 
	 * @param  milhas - milhas anuais
	 * 
	 */
	public void setMilhasAnuais( double milhas ) {
		milhasAnuais = milhas;
	}

	/**
	 * Metodo que obtem a media de milhas por gal�o 
	 * 
	 * @param MPG - media de milhas por gal�o
	 * 
	 */
	public void setMediaMPG( double MPG ) {
		mediaMPG = MPG;
	}

	/**
	 * Metodo que retorna a quantidade de milhas gastas no ano 
	 * 
	 * @return milhas anuais
	 * 
	 */
	public double getMilhasAnuais() {
		return milhasAnuais;
	}

	/**
	 * Metodo que retorna a media de milhas por gal�o 
	 * 
	 * @return media de milhas por gal�o
	 * 
	 */
	public double getMediaMPG() {
		return mediaMPG;
	}

	/**
	 * Metodo que imrime a media de milhas gastas no ano e
	 * a media de milhas por gal�o
	 *
	 * @return media de milhas gastas no ano
	 * @return media de milhas por gal�o
	 * 
	 */
	@Override
	public String toString() {
		return String.format( "%s: %.2f \n%s: %.2f ",
				"Media anual de milhas ", getMilhasAnuais(),
				"Media MPG � ", getMediaMPG() );
	}

	/**
	 * Metodo que calcula a pegada de carbono produzida por carros
	 *
	 * @return CarbonFootprint de carros
	 * 
	 */
	@Override
	public double getCarbonFootprint() {
		return (( getMilhasAnuais() * getMediaMPG() ) * kgCO2PorMilha );
	}
}
