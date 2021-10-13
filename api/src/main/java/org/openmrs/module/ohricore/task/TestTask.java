package org.openmrs.module.ohricore.task;

import org.openmrs.scheduler.tasks.AbstractTask;

public class TestTask extends AbstractTask {
	
	@Override
	public void execute() {
		if (!isExecuting) {
			startExecuting();
			System.out.println("Running task");
			stopExecuting();
		}
	}
}
