package Bibliotheque;

/**
 * <b>Edition est la classe dont les instances repr�sentent les �ditions des livres et p�riodiques</b>
 * <p>
 * Une Edition est caract�ris�e par les informations suivantes :
 * <ul>
 * <li>La date d'�dition.</li>
 * <li>Le num�ro d'�dition</li>
 * <li>Un �diteur.</li>
 * <li>Un p�riodique ou un livre</li>
 * </ul>
 * </p>
 * @see Livre
 * @see Periodique
 * @see Editeur
 * @author Adnane Jules
 */
public class Edition {
	
	// Date et num�ro d'�dition
	private Integer dateEdition;
	private Integer numEdition;
	private Editeur editeur;
	private Livre livre;
	private Periodique periodique;
	
	/**
	 * Constructeur Edition : Cas o� il s'agit d'une edition d'un livre.
	 * @param dateEdition
	 * @param numEdition
	 * @param editeur
	 * @param livre
	 */
	public Edition(Integer dateEdition, Integer numEdition, Editeur editeur, Livre livre) {
		this.dateEdition=dateEdition;
		this.numEdition=numEdition;
		this.editeur=editeur;
		this.livre=livre;
	}
	
	/**
	 * Constructeur Edition: Cas o� il s'agit d'une edition de periodique.
	 * @param dateEdition
	 * @param numEdition
	 * @param editeur
	 * @param periodique
	 */
	public Edition(Integer dateEdition, Integer numEdition, Editeur editeur, Periodique periodique) {
		this.dateEdition=dateEdition;
		this.numEdition=numEdition;
		this.editeur=editeur;
		this.periodique=periodique;
	}

	/**
	 * Retourne le p�riodique.
	 * @return P�riodique
	 */
	public Periodique getPeriodique() {
		return periodique;
	}
	
	/**
	 * Met � jour la valeur de periodique.
	 * @param periodique
	 */
	public void setPeriodique(Periodique periodique) {
		this.periodique=periodique;
	}

	/**
	 * Retourne la date d'�dition
	 * @return Date d'�dition
	 */
	public Integer getDateEdition() {
		return dateEdition;
	}

	/**
	 * Met � jour la date d'�dition
	 * @param dateEdition
	 */
	public void setDateEdition(Integer dateEdition) {
		this.dateEdition = dateEdition;
	}

	/**
	 * Retourne le num�ro d'�dition.
	 * @return num�ro d'�dition.
	 */
	public Integer getNumEdition() {
		return numEdition;
	}

	/**
	 * Met � jour le num�ro d'�dition.
	 * @param numEdition
	 */
	public void setNumEdition(Integer numEdition) {
		this.numEdition = numEdition;
	}

	/**
	 * Retourne l'�diteur.
	 * @return Editeur
	 */
	public Editeur getEditeur() {
		return editeur;
	}

	/**
	 * Met � jour la valeur de editeur.
	 * @param editeur
	 */
	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	/**
	 * Retourne le livre.
	 * @return Le livre.
	 */
	public Livre getLivre() {
		return livre;
	}

	/**
	 * Met � jour la valeur de livre.
	 * @param livre
	 */
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	
}
