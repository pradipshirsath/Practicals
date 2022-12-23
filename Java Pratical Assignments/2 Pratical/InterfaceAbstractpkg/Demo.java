package InterfaceAbstractpkg;

//	Writen another class having objects of Rectangle class 
//	and Circle class and invoked their respective methods.

public class Demo {
	public static void main(String[] args) {
//		objects of Rectangle class and Circle class
		Circle objCircle = new Circle();
		Rectangle objRectangle = new Rectangle();

//		invoked their respective methods.
		objCircle.compute(4);
		objCircle.print();

		objRectangle.compute(11.0, 22.0);
		objRectangle.print();
	}
}
