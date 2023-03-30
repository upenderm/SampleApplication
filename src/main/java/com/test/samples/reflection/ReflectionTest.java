package com.test.samples.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.test.samples.model.CitiesList;

public class ReflectionTest {

	public static void main(String[] args) {
		Class cc = CitiesList.class;
		Method[] methods = cc.getMethods();
		for (Method method : methods) {
			System.out.println(method.getReturnType().getCanonicalName() + "   " + method.getName());
			System.out.println("****************");
		}

		try {
			Method declaredMethod = cc.getDeclaredMethod("testMethodAndNotUsingAnyWhere", null);
			Object newInstance = cc.newInstance();
			declaredMethod.setAccessible(true);
			declaredMethod.invoke(newInstance, args);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
