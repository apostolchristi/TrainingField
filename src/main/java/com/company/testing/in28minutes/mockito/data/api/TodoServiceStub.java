package com.company.testing.in28minutes.mockito.data.api;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TodoServiceStub implements TodoService {

	@Override
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}

	@Override
	public void deleteTodo(String todo) {

	}
}