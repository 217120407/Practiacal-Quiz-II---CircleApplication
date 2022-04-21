//This a Circle class
package za.ac.wsu.s217120407;

/**
 *
 * @author 217120407 Zonke 
 */

public class Circle {

    private float radius;        //Radius of the circle
    private int x, y;            //Coordinates of the centre

    //Setters
    public void setRadius(float radius) {
        this.radius = radius;               //Sets the value of the radius 
    }

    public void setX(int x) {
        this.x = x;                         //Sets the value of the x coordinate
    }

    public void setY(int y) {
        this.y = y;                         //Sets the value of the y coordinate
    }

    //Getters 
    public float getRadius() {
        return radius;                      //Returns the value of the radius to the calling function
    }

    public int getX() {
        return x;                           //Returns the value of the x coordinate to the calling function
    }

    public int getY() {
        return y;                           //Returns the value of the y coordinate to the calling function
    }

    //Computes the Area of the Circle
    public float calculateArea() {
        float area;                         //Declaring variable to stores the area of the circle
        area = (float) (radius * radius * 3.14);    //Formula for computing the area 

        if (radius >= 0) {                  //Area must be always positive 
            return area;                    //Returns the Area to the calling function if the radius >= 0
        } else {
            System.out.println("The radius can not be less than 0");
            return 0;                       //Returns 0 to the calling function if the radius < 0
        }

    }

    public float calculateCircumference() { //This method computes the Circumference

        float circumference;                // Declaring variable to stores the Circumference of the circle
        circumference = (float) (2 * 3.14 * radius);    //Formula for computing the Circumference

        if (radius >= 0) {                  //Checking if the radius is positive 
            return circumference;           //Returns the circumference to the calling function

        } else {
            System.out.println("The radius can not be less than 0");    //Promt the user if the radius is negative
            return 0;                       //Returns 0 to the calling function if the radius < 0
        }
    }

    public float calculateDiameter() {      //This method computes the Diameter of the circle

        float diameter;                     //Declaring variable to stores the diameter of the circle
        diameter = (float) (2 * radius);    //Formula for computing the diameter

        if (radius >= 0) {                  //Checking if the radius is positive 
            return diameter;                //Returns the diameter to the calling function if the radius is positive

        } else {
            System.out.println("The radius can not be less than 0");    //Promt the user if the radius is negative
            return 0;                       //Returns 0 to the calling function if the radius < 0
        }

    }

}
