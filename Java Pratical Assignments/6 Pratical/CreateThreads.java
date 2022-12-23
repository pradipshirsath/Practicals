//	Write a Java Program to create following threads : [10]
//	(a) Thread A - Print 1 to 10 Numbers 
//	(b) Thread B - Print 10 to 1 Numbers

class ThreadA extends Thread{
	public void run() {
		System.out.println("Printing 1 to 10 from Thread A : ");
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

class ThreadB extends Thread{
	public void run() {
		System.out.println("Printing 10 to 1 from Thread B : ");
		for(int i=10 ; i>=1 ; i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

public class CreateThreads {
	public static void main(String[] args) {

		ThreadA  t1 = new ThreadA();
		t1.start();
		ThreadB  t2 = new ThreadB();
		t2.start();
	}
}
