package com.company.testing.in28minutes.mockito.business;

import com.company.testing.in28minutes.mockito.data.api.TodoService;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * How do we create a mock:
 * 1) We use mock method to make a stub class or interface
 * 2) when is used to stub a method and then to return a value which we are expecting
 */
public class TodoBusinessMockImplTest {


	@Test
	public void
	retrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void
	retrieveTodosRelatedToSpring_with_empty_list() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();

		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}
}