package Bibliotheque;

import java.sql.Date;

/**
 * <b>Periodique est la classe dont les instances repr�sentent les periodiques de la bibliotheque.</b>
 * <p>
 * Un p�riodique est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Sa date de parution</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un p�riodique a une �dition. <br>
 * Periodique h�rite de la classe Document.
 * </p>
 * @see Edition
 * @see Document
 * @author Adnane Jules
 */
public class Periodique extends Document {
	
	/**
	 * Date de parution du p�riodique
	 * @see Periodique#getDateParution()
	 * @see Periodique#setDateParution(Date)
	 */
	private Date dateParution;
	
	/**
	 * L'edition du p�riodique.
	 * @see Edition
	 * @see Periodique#afficherEdit()
	 * @see Periodique#edit(Integer, Integer, Editeur)
	 */
	private Edition editionP;
	
	/**
	 * Constructeur Periodique
	 * @param ref
	 * 			La r�f�rence du p�riodique (document).
	 * @param titre
	 * 			Le titre du p�riodique (document).
	 * @param resume
	 * 			Le r�sum� du p�riodique (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du p�riodique (document).
	 * @param dateParution
	 * 			La date de parution du p�riodique.
	 * @see Document
	 */
	public Periodique(String ref, String titre, String resume, Integer nbExemplaires, Date dateParution) {
		super(ref, titre, resume, nbExemplaires);
		this.dateParution=dateParution;
	}

	/**
	 * Retourne la date de parution du p�riodique.
	 * @return Date de parution
	 * @see Periodique#dateParution
	 */
	public Date getDateParution() {
		return dateParution;
	}

	/**
	 * Met � jour la date de parution.
	 * @param dateParution
	 * @see Periodique#dateParution
	 */
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	/**
	 * Methode pour indiquer l'edition du p�riodique.
	 * @param dateEdition
	 * @param numEdition
	 * @param e
	 * @see Editeur
	 * @see Edition
	 */
	public  void edit(Integer dateEdition, Integer numEdition, Editeur e) {
		this.editionP=new Edition(dateEdition, numEdition, e, this);
	}
	/**
	 * M�thode pour afficher l'edition du periodique.
	 * @return La date d'�dition, le num�ro d'�dition et le nom de l'�diteur du p�riodique.
	 * @see Periodique#editionP
	 * @see Edition
	 */
	public String afficherEdit() {
		return this.editionP.getDateEdition()+ " " + this.editionP.getNumEdition() + " " +this.editionP.getEditeur().getNomEditeur();
	}
}
