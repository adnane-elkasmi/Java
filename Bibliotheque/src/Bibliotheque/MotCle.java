package Bibliotheque;

import java.util.ArrayList;

/**
 * <b>MotCle est la classe dont les instances repr�sentent les mots-cl�s d'un Document.</b>
 * <p>
 * Un MotCle est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Le mot.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un MotCle a une liste de Document qui le contiennent.
 * </p>
 * @see Document
 * @author Adnane Jules
 */
public class MotCle {
	
	/**
	 * Le mot cl�
	 * 
	 * @see MotCle#getMot()
	 * 
	 * @see MotCle#setMot(String)
	 */
	private String mot;
	
	/**
	 * La liste des documents qui contiennent le mot cl�.
	 * 
	 * @see MotCle#ajouterL(Livre)
	 * @see MotCle#ajouterP(Periodique)
	 * @see MotCle#ajouterPr(Proceeding)
	 * @see MotCle#ajouterT(These)
	 */	
	public ArrayList<Document> documents=new ArrayList<Document>();
	
	/**
	 * Constructeur MotCle
	 * @param mot
	 * 			Le mot cl�.
	 * @see MotCle#mot
	 */
	public MotCle(String mot) {
		this.mot=mot;
	}
	
	/**
	 * Retourne le mot cl�
	 * @return le mot cl�
	 * @see MotCle#mot
	 */
	public String getMot() {
		return mot;
	}

	/**
	 * Met � jour le mot
	 * @param mot
	 * @see MotCle#mot
	 */
	public void setMot(String mot) {
		this.mot = mot;
	}
	
	/**
	 * Pour ajouter un livre � la liste de documents qui contienent le mot cl�.
	 * @param l
	 * @see MotCle#documents
	 */
	public void ajouterL(Livre l) {
		documents.add(l);
	}
	
	/**
	 * Pour ajouter un p�riodique � la liste de documents qui contienent le mot cl�.
	 * @param p
	 * @see MotCle#documents
	 */
	public void ajouterP(Periodique p) {
		documents.add(p);
	}
	
	/**
	 * Pour ajouter un proceeding � la liste de documents qui contienent le mot cl�.
	 * @param pr
	 * @see MotCle#documents
	 */
	public void ajouterPr(Proceeding pr) {
		documents.add(pr);
	}
	
	/**
	 * Pour ajouter une th�se � la liste de documents qui contiennent le mot cl�.
	 * @param t
	 * @see MotCle#documents
	 */
	public void ajouterT(These t) {
		documents.add(t);
	}

}
