package Bibliotheque;

import java.sql.Date;

/**
 * <b>Proceeding est la classe dont les instances repr�sentent les proceeding de la bibliotheque.</b>
 * <p>
 * Un proceeding est caract�ris� par les informations suivantes :
 * <ul>
 * <li>La date du s�minaire.</li>
 * </ul>
 * </p>
 * <p>
 * Proceeding h�rite de la classe Document.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class Proceeding extends Document {
	
	/**
	 * La date du s�minaire
	 * @see Proceeding#getDateSeminaire()
	 * @see Proceeding#setDateSeminaire(Date)
	 */
	private Date dateSeminaire;

	/**
	 * Constructeur Proceeding
	 * @param ref
	 * 			La r�f�rence du proceeding (document).
	 * @param titre
	 * 			Le titre du proceeding (document).
	 * @param resume
	 * 			Le r�sum� du proceeding (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du proceeding (document).
	 * @param dateSeminaire
	 * 			La date du s�minaire.
	 * @see Document
	 */
	public Proceeding(String ref, String titre, String resume, Integer nbExemplaires, Date dateSeminaire) {
		super(ref, titre, resume, nbExemplaires);
		this.dateSeminaire=dateSeminaire;
	}

	/**
	 * Retourne la date du s�minaire.
	 * @return Date du s�minaire.
	 * @see Proceeding#dateSeminaire
	 */
	public Date getDateSeminaire() {
		return dateSeminaire;
	}

	/**
	 * Met � jour la date du s�minaire
	 * @param dateSeminaire
	 * @see Proceeding#dateSeminaire
	 */
	public void setDateSeminaire(Date dateSeminaire) {
		this.dateSeminaire = dateSeminaire;
	}
	
	

}
