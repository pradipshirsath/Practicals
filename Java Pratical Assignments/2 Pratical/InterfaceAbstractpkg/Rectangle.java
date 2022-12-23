package InterfaceAbstractpkg;

//	Write Rectangle class and Circle class which 
//	implement Area interface and override its methods.
public class Rectangle implements Area {

	double areaOfRectangle;

	public void compute(double lenght, double width) {
		areaOfRectangle = lenght * width;
	}

	public void print() {
		System.out.println("Area Of Rectangle is : " + areaOfRectangle);
	}

	public void compute() {

	}

}
