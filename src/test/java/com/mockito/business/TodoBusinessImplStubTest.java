package com.mockito.business;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.mockito.data.api.TaskService;
import com.mockito.data.api.TaskServiceStub;

public class TodoBusinessImplStubTest {
	@Test
	public void testRetrieveTasksRelatedToSpring() {
		TaskService taskServiceStub = new TaskServiceStub();
		TaskBusinessImpl taskBusinessImpl = new TaskBusinessImpl(taskServiceStub);
		List<String> filteredTasks = taskBusinessImpl.retrieveTasksRelatedToSpring("Test");
		assertEquals(2, filteredTasks.size());
	}
}