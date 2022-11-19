public class Triangle {
    public Triangle(){}
    public static boolean checkTriangle(double first,double second,double third){
        return first + second > third && first + third > second && second + third > first;

    }
}
