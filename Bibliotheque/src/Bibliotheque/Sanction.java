package Bibliotheque;

/**
 * <b>Sanction est une �num�ration des diff�rentes sanctions d'un lecteur donn�e.</b>
 * <p>
 * Une sanction est soit :
 * <ul>
 * <li>Vert : c'est � dire que le lecteur n'a jamais eu d'avertissements</li>
 * <li>Jaune : c'est � dire que le lecteur a un avertissement.</li>
 * <li>Rouge : le lecteur est exclu.
 * </ul>
 * </p>
 * @see Lecteur
 * @see Emprunt
 * @author Adnane Jules
 */
public enum Sanction {
	vert, jaune, rouge

}
