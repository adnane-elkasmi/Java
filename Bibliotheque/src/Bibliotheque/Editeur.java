package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>Editeur est la classe dont les instances repr�sentent les �diteurs des documents.</b>
 * <p>
 * Un Editeur est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Le nom de l'�diteur.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Editeur a une liste d'�ditions Edition.
 * </p>
 * @see Livre
 * @see Periodique
 * @see Edition
 * @author Adnane Jules
 */
public class Editeur {

	/**
	 * Le nom de l'editeur ou de la maison d'edition.
	 * 
	 * @see Editeur#getNomEditeur()
	 * 
	 * @see Editeur#setNomEditeur(String)
	 */
	private String nomEditeur;
	
	/**
     * La liste des editions de l'editeur.
     * <p>
     * Il est possible d'ajouter des objets Edition dans cette liste.
     * <p>
     * 
     * @see Editeur#editer(Edition)
     */
	private ArrayList<Edition> editions=new ArrayList<Edition>();
	
	/**
     * Constructeur Editeur.
     * @param nomEditeur
     *            Le nom de l'editeur.
     * @see Editeur#nomEditeur
     */
	public Editeur(String nomEditeur) {
		this.nomEditeur=nomEditeur;
	}

	/**
	 * Retourne le nom de l'editeur.
	 * 
	 * @return Le nom de l'editeur
	 * @see Editeur#nomEditeur
	 */
	public String getNomEditeur() {
		return nomEditeur;
	}
	
	/**
	 * Met � jour le nom de l'editeur
	 * 
	 * @param Le nouveau nom d'editeur
	 * 
	 * @see Editeur#nomEditeur
	 */
	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}
	
	/**
	 * Pour rajouter des editions qu'a effectu� l'editeur
	 * @param edition
	 * 			Une des editions qu'a effectu� l'editeur.
	 * @see Edition
	 */
	public void editer(Edition edition) {
		editions.add(edition);
	}
	
	/**
	 * Pour afficher les livres et p�riodiques qu'a �dit� un �diteur
	 * @return Les livres et p�riodiques qu'a �dit� un editeur.
	 * @see Edition
	 * @see Editeur#editer(Edition)
	 */
	public String editions() {
		int i;
		String s=new String("");
		for (i=0;i<editions.size();i++) {
			if (editions.get(i).getLivre()==null) {
				s+="ann�e d'�dition: " + editions.get(i).getDateEdition()+ ", ref: " + editions.get(i).getPeriodique().getRef()+ System.getProperty("line.separator");
			} else {
				s+="ann�e d'�dition: " + editions.get(i).getDateEdition()+", ref: "+ editions.get(i).getLivre().getRef()+ System.getProperty("line.separator");
			}
		}
		return s;
	}
}
