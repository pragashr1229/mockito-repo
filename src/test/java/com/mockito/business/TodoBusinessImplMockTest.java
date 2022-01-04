package com.mockito.business;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mockito.data.api.TaskService;
import com.mockito.data.api.TaskServiceStub;

public class TodoBusinessImplMockTest {
	@Test
	public void testRetrieveTasksRelatedToSpring() {
		TaskService taskServiceMock = mock(TaskService.class);
		
		List<String> taskList = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		
		when(taskServiceMock.retrieveTasks("Test1")).thenReturn(taskList);
		
		TaskBusinessImpl taskBusinessImpl = new TaskBusinessImpl(taskServiceMock);
		List<String> filteredTasks = taskBusinessImpl.retrieveTasksRelatedToSpring("Test1");
		assertEquals(2, filteredTasks.size());
	}
}