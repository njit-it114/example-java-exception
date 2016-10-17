/**
 * 
 */
package com.mycompany.myExceptionP1;

/**
 * @author John
 *
 */
public class MyChild extends MyParent {
	@Override
	public void method1(Integer _inp) throws MyException1Child {
	}

	// NOTE while overwriting one can not go up the Exception inheritance. Going down and throwing child like above method is OK.
//	@Override
//	public void method2(Integer _inp) throws MyException1 {
//	}

}
