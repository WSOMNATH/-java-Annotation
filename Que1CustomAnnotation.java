package Annotation;
import java.lang.reflect.Method;

public class Que1CustomAnnotation {

	@interface Test {
		int test_case();

	}

	@Test(test_case = 1)
	public static void meth1() {
		System.out.println("this is method 1");

	}

	@Test(test_case = 1)
	public void meth2() {
		System.out.println("this is method 2");
	}

	public static void main(String[] args) {
		meth1();
		// below we commintted we can create a new object to call the neew method ie non static 
		//Que1CustomAnnotation m= new Que1CustomAnnotation();
		//m.meth2();
				
	}
}