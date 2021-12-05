package Bibliotheque;

/**
 * <b>Livre est la classe dont les instances repr�sentent les livres de la bibliotheque.</b>
 * <p>
 * Un Livre est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Son nombre de volumes.</li>
 * </ul>
 * </p>
 * <p>
 * Livre h�rite de Document. De plus, Livre a une Edition.
 * </p>
 * @see Document
 * @see Edition
 * @author Adnane Jules
 */
public class Livre extends Document {
	
	/**
	 * Le nombre de volumes du livre.
	 * @see Livre#getNbVolumes()
	 * @see Livre#setNbVolumes(Integer)
	 */
	private Integer nbVolumes;
	
	/**
	 * L'edition du livre
	 * @see Livre#afficherEdit()
	 * @see Livre#edit(Integer, Integer, Editeur)
	 * @see Edition
	 */
	private Edition editionL;
	
	
	/**
	 * Constructeur Livre.
	 * 
	 * @param ref
	 * 			La r�f�rence du livre (document).
	 * @param titre
	 * 			Le titre du livre (document).
	 * @param resume
	 * 			Le r�sum� du livre (document).
	 * @param nbExemplaires
	 * 			Le nombre d'exemplaires du livre (document).
	 * @param nbVolumes
	 * 			Le nombre de volumes du livre.
	 */
	public Livre(String ref, String titre, String resume, Integer nbExemplaires, Integer nbVolumes) {
		super(ref, titre, resume, nbExemplaires);
		this.nbVolumes=nbVolumes;
	}

	/**
	 * Retourne le nombre de volumes du livre
	 * @return le nombre de volumes
	 * @see Livre#nbVolumes
	 */
	public Integer getNbVolumes() {
		return nbVolumes;
	}

	/**
	 * Met � jour le nombre de volumes.
	 * @param nbVolumes
	 * @see Livre#nbVolumes
	 */
	public void setNbVolumes(Integer nbVolumes) {
		this.nbVolumes = nbVolumes;
	}

	/**
	 * Indique l'edition du livre, c'est � dire la date d'edition, le num�ro d'edition et l'editeur.
	 * @param dateEdition
	 * @param numEdition
	 * @param e
	 * @see Editeur
	 * @see Edition
	 */
	public void edit(Integer dateEdition, Integer numEdition, Editeur e) {
		this.editionL=new Edition(dateEdition, numEdition, e, this);
	}
	
	/**
	 * Affiche l'�dition du livre.
	 * @return La date et le num�ro d'edition et l'�diteur du livre.
	 * @see Livre#edit(Integer, Integer, Editeur)
	 * @see Livre#editionL
	 */
	public String afficherEdit() {
		return this.editionL.getDateEdition() + " " + this.editionL.getNumEdition() + this.editionL.getEditeur().getNomEditeur();
	}
	
}
