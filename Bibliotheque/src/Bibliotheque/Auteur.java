package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>Auteur est la classe repr�sentant un auteur d'un Document, c'est � dire un �crivain, un journaliste, un chercheur...</b>
 * <p>
 * Un auteur est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Son nom et pr�nom.</li>
 * <li>Le siecle o� il a �t� le plus actif </li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Auteur a une liste d'ouvrages Documents.
 * </p>
 * @see Document
 * @author Adnane Jules
 */

public class Auteur {
	
	/**
	 * Le nom et le pr�nom de l'auteur.
	 * @see Auteur#Auteur(String, Integer)
	 * @see Auteur#getNomAuteur()
	 * @see Auteur#setNomAuteur(String)
	 */
	private String nomAuteur;
	
	/**
	 * Le siecle o� il a �t� le plus actif.
	 * @see Auteur#getSiecleActiv()
	 * @see Auteur#setSiecleActiv(Integer) 
	 */
	private Integer siecleActiv;
	
	/**
     * La liste des ouvrages que l'Auteur a r�alis�.
     * <p>
     * Il est possible d'ajouter des objets Document dans cette liste.
     * <p>
     * 
     * @see Auteur#ajouterL(Livre)
     * @see Auteur#ajouterP(Periodique)
     * @see Auteur#ajouterPr(Proceeding)
     * @see Auteur#ajouterT(These)
     */
	private ArrayList<Document> ouvrages=new ArrayList<Document>();
	
	/**
     * Le nombre d'auteurs que contient la bibliotheque.
     * @see Auteur#getC()
     */
	static private Integer c=0;
	
	/**
     * Constructeur Auteur.
     * <p>
     * A la construction d'un objet Auteur, le nombre d'auteur est incr�ment� de 1.
     * </p>
     * @param nomAuteur
     *            Le nom de l'auteur ainsi que son pr�nom.
     * @param siecleActiv
     *            Le siecle d'activit� de l'auteur.
     * 
     * @see Auteur#nomAuteur
     * @see Auteur#siecleActiv
     */
	public Auteur(String nomAuteur, Integer siecleActiv) {
		this.nomAuteur=nomAuteur;
		this.siecleActiv=siecleActiv;
		c+=1;
	}
	
	/**
     * Retourne le nom de l'auteur.
     * 
     * @return Le nom et le pr�nom de l'auteur
     * 
     * @see Auteur
     */
	public String getNomAuteur() {
		return nomAuteur;
	}

	/**
     * Met � jour le nom de l'auteur, notamment si on a fait une faute lors de la cr�ation initiale.
     * 
     * @param nomAuteur
     * 					Le nouveau nom de l'auteur
     * @see Auteur
     */
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	
	/**
     * Retourne le siecle d'activit� de l'auteur.
     * 
     * @return Le siecle d'activit� de l'auteur.
     * 
     * @see Auteur
     */
	public Integer getSiecleActiv() {
		return siecleActiv;
	}

	/** 
	 * Met � jour le siecle d'activit� de l'auteur.
	 * @param siecleActiv
	 * 					La nouvelle valeur du siecle d'activit�.
	 * @see Auteur
	 */
	public void setSiecleActiv(Integer siecleActiv) {
		this.siecleActiv = siecleActiv;
	}
	
	/**
	 * Pour ajouter un livre � la liste des ouvrages de l'auteur.
	 * @param l
	 * 			Le livre � ajouter.
	 * @see Livre
	 */
	public void ajouterL(Livre l) {
		ouvrages.add(l);
	}
	
	/**
	* Pour ajouter un p�riodique � la liste des ouvrages de l'auteur.
	* @param p
	* 			Le p�riodique � ajouter.
	* @see Periodique
	*/
	public void ajouterP(Periodique p) {
		ouvrages.add(p);
	}
	
	/**
	 * Pour ajouter un proceeding � la liste des ouvrages de l'auteur.
	 * @param pr
	 * 			Le proceeding � ajouter.
	 * @see Proceeding
	 */
	public void ajouterPr(Proceeding pr) {
		ouvrages.add(pr);
	}
	
	/**
	* Pour ajouter une th�se � la liste des ouvrages de l'auteur.
	* @param t
	* 			La th�se � ajouter.
	* @see These
	*/
	public void ajouterT(These t) {
		ouvrages.add(t);
	}
	
	/**
	 * Pour afficher les ouvrages selon leurs genres
	 * @return Un ensemble de lignes contenant chacun un ouvrage pr�cis (sa r�f�rence, son titre, et son genre).
	 * @see Document
	 */
	public String ouvrages() {
		int i;
		String o=new String("");
		String g=new String(", genre : ");
		for (i=0;i<ouvrages.size();i++) {
			if (ouvrages.get(i) instanceof These) {
				g+="these";
			}
			if (ouvrages.get(i) instanceof Proceeding) {
				g+="proceeding";
			}
			if (ouvrages.get(i) instanceof Periodique) {
				g+="periodique";
			}
			if (ouvrages.get(i) instanceof Livre) {
				g+="livre";
			}
			o+=ouvrages.get(i).ref + ' ' + ouvrages.get(i).titre + g;
		}
		return o;
	}
	
	/**
	 * Pour afficher le nombre d'auteurs contenus dans la bibliotheque.
	 * 
	 * @return Le nombre d'auteurs de la bibliotheque.
	 * @see Auteur#c
	 */
		public Integer getC() {
			return c;
		}
}
