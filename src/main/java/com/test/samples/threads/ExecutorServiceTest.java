package com.test.samples.threads;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);

		// Approach 1
		Runnable r = () -> System.out.println("Hello World");
		Thread t = new Thread(r);
		t.start();

		// Approach 2
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Hello World");
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();

		// Approach 3
		new Thread(() -> System.out.println()).start();

		Callable<Integer> callableObj = () -> {
			return 2 * 3;
		};

		Callable<Integer> callableObj2 = new Callable<Integer>() {
			@Override
			public Integer call() {
				return 2 * 3;

			}
		};
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(callableObj);
		Future<Integer> future2 = service.submit(callableObj2);
		try {
			System.out.println(future.get() + "::" + future2.get());
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}
	}
}
