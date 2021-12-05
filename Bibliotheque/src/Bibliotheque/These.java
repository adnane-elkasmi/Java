package Bibliotheque;

import java.sql.Date;

/**
 * <b>These est la classe dont les instances repr�sentent les th�ses de la bibliotheque.</b>
 * <p>
 * Une th�se est caract�ris�e par les informations suivantes :
 * <ul>
 * <li>La date de la soutenance.</li>
 * <li>Le lieu de la soutenance.</li>
 * </ul>
 * </p>
 * <p>
 * These h�rite de la classe Document.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class These extends Document {
	
	/**
	 * Date de la soutenance de la th�se.
	 * @see These#getDateSoutenance()
	 * @see These#setDateSoutenance(Date)
	 */
	private Date dateSoutenance;
	
	/**
	 * Lieu de la soutenance de la th�se.
	 * @see These#getLieuSoutenance()
	 * @see These#setDateSoutenance(Date)
	 */
	private String lieuSoutenance;

	/**
	 * Constructeur These.
	 * @param ref
	 * 			La r�f�rence de la th�se (document).
	 * @param titre
	 * 			Le titre de la th�se (document).
	 * @param resume
	 * 			Le r�sum� de la th�se (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires de la th�se (document).
	 * @param dateSoutenance
	 * 			La date de la soutenance de la th�se.
	 * @param lieuSoutenance
	 * 			Le lieu de la soutenance de la th�se.
	 */
	public These(String ref, String titre, String resume, Integer nbExemplaires, Date dateSoutenance, String lieuSoutenance) {
		super(ref, titre, resume, nbExemplaires);
		this.dateSoutenance=dateSoutenance;
		this.lieuSoutenance=lieuSoutenance;
		
	}
	
	/**
	 * Retourne la date de la soutenance de la th�se.
	 * @return La date de la soutenance.
	 * @see These#dateSoutenance
	 */
	public Date getDateSoutenance() {
		return dateSoutenance;
	}

	/**
	 * Met � jour la date de la soutenance de la th�se.
	 * @param dateSoutenance
	 * @see These#dateSoutenance
	 */
	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}

	/**
	 * Retourne le lieu de soutenance de la th�se.
	 * @return Le lieu de la soutenance.
	 * @see These#lieuSoutenance
	 */
	public String getLieuSoutenance() {
		return lieuSoutenance;
	}

	/**
	 * Met � jour le lieu de la soutenance de la th�se.
	 * @param lieuSoutenance
	 * @see These#lieuSoutenance
	 */
	public void setLieuSoutenance(String lieuSoutenance) {
		this.lieuSoutenance = lieuSoutenance;
	}

}
