package com.mockito.data.api;

import java.util.Arrays;
import java.util.List;

// Dummy implementation of TaskService
public class TaskServiceStub implements TaskService {

	@Override
	public List<String> retrieveTasks(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}
}
