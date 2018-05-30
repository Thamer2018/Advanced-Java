/**
 * Interface d�crivant le comportement minimum des sous classes
 * repr�sentant une forme g�om�trique
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
     * Retourne le p�rim�tre d'une forme
     * @return Le p�rim�tre de la forme actuelle
     */
     public double getPerimetre();

    /**
     * Retourne une cha�ne repr�sentant une forme
     * @return La cha�ne repr�sentant la forme actuelle
     */
  	 public String toString();
}
