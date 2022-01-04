package com.mockito.data.api;

import java.util.List;

public interface TaskService {
	public List<String> retrieveTasks(String user);
}
