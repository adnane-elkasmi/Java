package Bibliotheque;

/**
 * <b>Exemplaire est la classe dont les instances repr�sentent les exemplaires d'un Document.</b>
 * <p>
 * Un Exemplaire est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Le code barre.</li>
 * <li>La r�f�rence du document.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Editeur a un param�tre de disponibilit�, soit vrai soit faux.
 * </p>
 * @see Emprunt
 * @see Document
 * @author Adnane Jules
 */
public class Exemplaire {
	
	/**
	 * Le code barre unique de l'exemplaire
	 * 
	 * @see Exemplaire#getCodeBarre()
	 * 
	 * @see Exemplaire#setCodeBarre(Integer)
	 */
	private Integer codeBarre;
	
	/**
	 * La r�f�rence du document (livre, p�riodique, proceeding ou th�se).
	 * 
	 * @see Exemplaire#getRefDoc()
	 * 
	 * @see Exemplaire#setRefDoc(String)
	 */	
	private String refDoc;
	
	/**
	 * Disponibilit� de l'exemplaire, false si l'exemplaire est emprunt� et true si disponible, initialis�e � true.
	 * 
	 * @see Exemplaire#getDispo()
	 * 
	 * @see Exemplaire#setDispo(Boolean)
	 */	
	private Boolean dispo=true;
	
	/**
     * Constructeur Exemplaire.
     * @param codeBarre
     *            Le code barre de l'exemplaire.
     * @param refDoc
     * 			  La r�f�rence du document.
     * @see Exemplaire#codeBarre
     * @see Exemplaire#refDoc
     */
	public Exemplaire(Integer codeBarre, String refDoc) {
		this.codeBarre=codeBarre;
		this.refDoc=refDoc;
	}

	/**
	 * Retourne le code barre de l'exemplaire.
	 * 
	 * @return Le code barre.
	 * @see Exemplaire#codeBarre
	 */	
	public Integer getCodeBarre() {
		return codeBarre;
	}

	/** 
	 * Met � jour le codeBarre du document.
	 * 
	 * @param codeBarre
	 * @see Exemplaire#codeBarre
	 */
	public void setCodeBarre(Integer codeBarre) {
		this.codeBarre = codeBarre;
	}
	
	/**
	 * Retourne la disponibilit� de l'exemplaire.
	 * 
	 * @return La disponibilit�.
	 * @see Exemplaire#dispo
	 */		
	public Boolean getDispo() {
		return dispo;
	}

	/**
	 * Met � jour la disponibilit� du document.
	 * @param dispo
	 * @see Exemplaire#dispo
	 */
	public void setDispo(Boolean dispo) {
		this.dispo = dispo;
	}

	/**
	 * Retourne la r�f�rence du document que repr�sente l'exemplaire.
	 * 
	 * @return La r�f�rence du document.
	 * @see Exemplaire#refDoc
	 */	
	public String getRefDoc() {
		return this.refDoc;
	}
	
	/**
	 * Met � jour la r�f�rence du document que repr�sente l'exemplaire.
	 * @param refDoc
	 * @see Exemplaire#refDoc
	 */
	public void setRefDoc(String refDoc) {
		this.refDoc=refDoc;
	}

	
}
