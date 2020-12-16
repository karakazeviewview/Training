public class Ex5_4{
	public static void main(String[] args){
		double triangleArea=calcTriangleArea(10.0,5.0);
		double bottom=10.0;
		double height=5.0;
		double radius=7.0;
		double circleArea=calcCircleArea(7.0);
		System.out.println(circleArea);
		System.out.println(triangleArea);
	}
	public static double calcTriangleArea(double bottom,double height){
		double triangleArea=bottom*height/2;
		return triangleArea;
	}
	public static double calcCircleArea(double radius){
		double circleArea=radius*radius*3.14;
		return circleArea;
	}
}

