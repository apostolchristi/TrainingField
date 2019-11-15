package com.company.ocp.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SchedulerExecutorServiceExamples {

	public static void main(String[] args) {


		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	}
}
