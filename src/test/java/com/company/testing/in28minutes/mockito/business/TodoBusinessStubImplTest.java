package com.company.testing.in28minutes.mockito.business;

import com.company.testing.in28minutes.mockito.data.api.TodoService;
import com.company.testing.in28minutes.mockito.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessStubImplTest {

	@Test
	public void retrieveTodosRelatedToSpring() {

		TodoService todoServicesStub = new TodoServiceStub();
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServicesStub);

		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
}