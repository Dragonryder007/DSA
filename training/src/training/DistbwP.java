package training;

class Point {
    //Implement your code here
	
	private double xCoordinate;
	private double yCoordinate; 
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
	}
	
	public double calculateDistance() {
		double x1=this.xCoordinate;
		double y1=this.yCoordinate;
		double dist=Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		return Math.round(dist*100.0)/100.0;
	}
	
	public double calculateDistance(Point point) {
		double x2=this.xCoordinate, y2=this.yCoordinate;
		double x1=point.xCoordinate, y1=point.yCoordinate;
		double dist=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		return Math.round(dist*100.0)/100.0;
	}
	
	public double getxCoordinate() {
		return xCoordinate;
	}
	
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate=xCoordinate;
	}
	
	public double getyCoordinate() {
		return yCoordinate;
	}
	
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate=yCoordinate;
	}
}

public class DistbwP {
	public static void main(String[] args) {
	Point point1 = new Point(3.5, 1.5);
	Point point2 = new Point(6, 4);
	                                
	System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
	System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
	System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
	        
	//Create more objects for testing your code                

    }


}
