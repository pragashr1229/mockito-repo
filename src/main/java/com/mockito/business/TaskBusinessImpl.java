package com.mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.mockito.data.api.TaskService;

//TaskBusinessImpl - SUT (System Under Test)
//TaskService - Dependency

/* Problem statement -  Here we want to write the test cases for TaskBusinessImpl, 
					    without implementation of TaskService

*/

public class TaskBusinessImpl {
	private TaskService taskService;

	TaskBusinessImpl(TaskService taskService) {
		this.taskService = taskService;
	}

	public List<String> retrieveTasksRelatedToSpring(String user) {
		List<String> filteredTasks = new ArrayList<String>();
		List<String> allTasks = taskService.retrieveTasks(user);
		for (String task : allTasks) {
			if (task.contains("Spring")) {
				filteredTasks.add(task);
			}
		}
		return filteredTasks;
	}
}