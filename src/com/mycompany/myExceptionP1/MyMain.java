package com.mycompany.myExceptionP1;
/**
 * 
 */


import java.io.FileNotFoundException;

/**
 * @author ilker
 *
 */
public class MyMain {

	/**
	 * 
	 */
	public MyMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	public void method1(Integer _inp) throws MyException2, MyException1Child {
// NOTE ilker above is wrong. Have to declare all checked exceptions
	public void method1(Integer _inp) throws MyException1, MyException2, MyException1Child {
		switch (_inp) {
		case 1:
			throw new MyException1("1");
//			break;
		case 2:
			throw new MyException2("2");
//			break;
		case 11:
			throw new MyException1Child("11");
//			break;
		case 90:
		case 91:
			System.out.println("bla bla");
			break;
		default:
//			throw new FileNotFoundException("default threw checked exception");
			throw new IllegalArgumentException("default threw RuntimeException");	// no need to add to throws of method signature
//			break;
		}
	}
	
	public static void useMethod1(Integer _inp) {
		MyMain m = new MyMain();
		
		try {
			m.method1(_inp);
		} catch (MyException1Child e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void useMethod2(Integer _inp) {
		MyMain m = new MyMain();
		try {
			m.method1(_inp);
		} catch (MyException1 | MyException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void useMethod3(Integer _inp) throws MyException1Child, MyException1, MyException2 {
		MyMain m = new MyMain();
		m.method1(_inp);
	}

	public static void useMethod4(Integer _inp) {
		MyMain m = new MyMain();
		try {
			m.method1(_inp);
		} catch (MyException1Child  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException2   e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// NOTE below line should be above line catch (MyException1  e) {
//		} catch (MyException1Child  e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	public static void useMethod5(Integer _inp) {
		MyMain m = new MyMain();
		try {
			m.method1(_inp);
		} catch (MyException1Child e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void useMethod6(Integer _inp) throws MyException1 {
	MyMain m = new MyMain();
	try {
		m.method1(_inp);
	} catch (MyException1Child e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MyException1 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MyException2 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		// NOTE can wrap an Exception ( Throwable) into another Exception via its constructor like below
		MyException1 e1 = new MyException1("got MyException2 " + e.getMessage(), e);
		throw e1;
	}
}

	
//	public static void useMethod7(Integer _inp) {
//		MyMain m = new MyMain();
//		m.method1(_inp);
//	}
	
}
