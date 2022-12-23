class ThreadEven extends Thread{
	public void run() {
		System.out.println("Printing First 10 Odd Numbers from Thread Even : ");
		for(int i=1 ; i<=20 ; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class ThreadOdd extends Thread{
	public void run() {
		System.out.println("Printing First 10 Even Numbers from Thread Odd : ");
		for(int i=2 ; i<=20 ; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

public class OddEvenPrint {
	public static void main(String[] args) {

		ThreadEven  t1 = new ThreadEven();
		t1.start();
		ThreadOdd  t2 = new ThreadOdd();
		t2.start();
	}
}
