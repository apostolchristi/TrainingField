package com.company.ocp.concurrency;

import java.util.concurrent.*;

public class FutureExamples {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for (int i = 0; i < 500; i++) {
					CheckResults.counter++;
				}
			});
			result.get(10, TimeUnit.SECONDS);
			System.out.println("reached!");
		} catch (TimeoutException e) {
			System.out.println("Not reached in time");
		}
		finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}
}
