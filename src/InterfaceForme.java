/**
 * Interface décrivant le comportement minimum des sous classes
 * représentant une forme géométrique
 *
 * @author <a href="mailto:Pierre.Belisle@etsmtl.ca">Pierre Belisle</a>
 * @version octobre 2005
 */
public interface InterfaceForme
{
    /**
     * Retourne la superficie d'une forme
     * @return La superficie de la forme actuelle
     */
	 public double getSuperficie();

     /**
     * Retourne le périmètre d'une forme
     * @return Le périmètre de la forme actuelle
     */
     public double getPerimetre();

    /**
     * Retourne une chaîne représentant une forme
     * @return La chaîne représentant la forme actuelle
     */
  	 public String toString();
}
