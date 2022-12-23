package InterfaceAbstractpkg;

//	Created a package “InterfaceAbstractpkg”.
//	In this package writen an interface Area 
//	having methods compute() and print().
//	This interface is used to compute area of given shape.
public interface Area {
	void compute();

	void print();

//	It also has a constant for Pi.
	static final double PI = 3.14;
}
