package es.upm.dit.aled.lab3;

/**
 * Exception to wrap errors especific to the processing of FASTA files.
 * 
 * @author mmiguel, rgarciacarmona
 *
 */
public class FASTAException extends Exception{ //llama a la clase Exception y lanza mensaje

	public FASTAException(String msg) {
		super(msg);
	}
}
