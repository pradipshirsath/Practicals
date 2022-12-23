package InterfaceAbstractpkg;

//	Write Rectangle class and Circle class which 
//	implement Area interface and override its methods.
public class Circle implements Area {

	double AreaOfCircle;

	public void compute(int radious) {
		AreaOfCircle = radious * radious * PI;
	}

	public void print() {
		System.out.println("Area of circle is : " + AreaOfCircle);
	}

	public void compute() {

	}

}
