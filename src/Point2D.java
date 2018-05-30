/**
 * 
 * Repr�sente un point dans un espace � deux dimensions
 *            
 * @author <a href="mailto:Pierre.Belisle@etsmtl.ca">Pierre Belisle</a>
 * @version octobre 2005
 */
public class Point2D
{
	/*
	 * Dans le cadre du cours inf111 : 
	 * 
	 * Sert � montrer :
	 *           -la m�canique d'appel des constructeurs lors du new
	 *           -la d�finition des observateurs et des mutateurs
	 *           -la d�finition de quelques comportements possibles
	 *            d'objets de cette classe
	 */            

          //correspond � la coordonn�e (x,y) d'un point
          //dans le plan cart�sien en 2 dimensions
           private double x;
           private double y;
           
          /**************************************************
           * 
           * LES CONSTRUCTEURS
           * 
           **************************************************/
          /**
           * Constructeur par d�faut 
           *    construit le point (0,0)
           */
          public Point2D(){};
          
          /**
           * Constructeur par copie d'attributs
           *    construit le point (x,y)
           */
          public Point2D(double x, double y){
              this.x = x;
              this.y = y;
          }
          
          /**
           * Constructeur par copie d'objet 
           *    construit une copie de point
           */
          public Point2D(Point2D point){
              
              //on peut faire point.x et point.y puisqu'on est dans la classe
              this.x = point.x;
              this.y = point.y;
          }
                   
          
          /**************************************************
           * 
           * LES OBSERVATEURS
           * 
           **************************************************/
          /**
           * Retourne l'abscisse du point
           * @return La valeur de la coordonn�e x  
           */
          public double getX(){
               return x;
           }
           
          /**
           * Retourne l'ordonn�e du point
           * @return La valeur de la coordonn�e y  
           */
           public double getY(){
               return y;
           }
           
          /**************************************************
           * 
           * LES MUTATEURS
           * 
           **************************************************/

           /**
            * Permet de modifier l'abscisse du point
            * @param x La nouvelle coordonn�e x
            */
           public void setX(double x){
               this.x = x;
           }
           
           /**
            * Permet de modifier l'ordonn�e du point
            * @param x La nouvelle coordonn�e y
            */
           public void setY(double y){
               this.y = y;
           }
           
           
          /**************************************************
           * 
           * LES COMPORTEMENTS
           * 
           **************************************************/
           /**
            * Calcul la distance entre le point actuel 
            * et un autre point
            * @param point Le point � consid�rer
            * @return La racine carr�e de la somme des diff�rences en x et en y au carr�
            */
           public double distance (Point2D point){
               return Math.sqrt(Math.pow(point.x-x,2) + Math.pow(point.y-y,2));
           }
           
           
           /**
            * Calcul la pente de la droite form�e par le point actuel 
            * et un autre point
            * @param point Le point � consid�rer
            * @return La diff�rence de y divis� par la diff�rence des x
            * 
            */
           public double pente (Point2D point){
               return (point.y-y) / (point.x-x);
           }
           
           
           /**
            * Calcul le point au centre entre le point actuel et un autre point
            * @param point Le point � consid�rer
            * @return Les diff�rences en x,y divis� par 2
            * 
            */
           public Point2D milieu (Point2D point){
               return new Point2D(Math.abs((x-point.x)/2),Math.abs((y-point.y)/2));
           }
           
           
           /**
            * Retourne le point actuel sous forme de la cha�ne "(x,y)"
            * @return Une cha�ne repr�sentant la coordonn�e (x,y) du point
            */
           public String toString(){
               return "(" + x + "," + y + ")";
           }
           
           
           /**
            * Retourne vrai si le point actuel est �gal � un autre point
            * @param point Le point � consid�rer
            * @return this.getX() == point.getX() && this.getY() == point.getY() 
            */
           public boolean equals(Point2D point){
               return point.x == x && point.y == y;
           }
           
           /**
            * Retourne une copie du point actuel
            * @return Un nouveau point identique � this 
            */
           public Point2D copie(){
               return new Point2D(x,y);
           }
}