package com.company.testing.in28minutes.mockito.data.api;

import java.util.List;

//Create TodoServiceStub
//Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {

	public List<String> retrieveTodos(String user);
}
