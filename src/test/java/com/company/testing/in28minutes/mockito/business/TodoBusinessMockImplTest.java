package com.company.testing.in28minutes.mockito.business;

import com.company.testing.in28minutes.mockito.data.api.TodoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

/**
 * How do we create a mock:
 * 1) We use mock method to make a stub class or interface
 * 2) when is used to stub a method and then to return a value which we are expecting
 */
@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessMockImplTest {

	@Mock
	TodoService todoServiceMock;
	TodoBusinessImpl todoBusiness;
	List<String> todos;

	@Before
	public void setup() {
		 todoBusiness= new TodoBusinessImpl(todoServiceMock);
		 todos = Arrays.asList();

	}


	@Test
	public void
	retrieveTodosRelatedToSpring_usingAMock() {
		todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void
	retrieveTodosRelatedToSpring_with_empty_list() {

		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(0, filteredTodos.size());
	}

	@Test
	public void
	retrieveTodosRelatedToSpring_usingBDD_raw_Example() {

		//Given - everything what do the setup
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		//When - we will call the method
		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");

		//Then - we will check all the changes
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void
	retrieveTodosRelatedToSpring_usingBDD_mock_syntax() {

		//Given - everything what do the setup
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("Learn to Dance")).willReturn(todos); 	//same functionality different syntax
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		//When - we will call the method
		List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Learn to Dance");

		//Then - we will check all the changes
		assertThat(filteredTodos.size(), is(2));
	}


	@Test
	public void
	deleteTodosRelatedToSpring_usingBDD_mock_syntax() {

		//Given - everything what do the setup
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("Learn to Dance")).willReturn(todos); 	//same functionality different syntax
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		//When - we will call the method
		todoBusiness.deleteTodosNotRelatedToSpring("Learn to Dance");

		//Then - we will check all the changes
		//verify - check if the method was called on a mock
		verify(todoServiceMock, times(1)).deleteTodo("Learn to Dance");

		verify(todoServiceMock, never()).deleteTodo("Learn Spring MVC");

	}

	// How was capture the argument which was passed to a specific method
	@Test
	public void
	deleteTodosRelatedToSpring_usingBDD_mock_syntax_usingBDD_argumentCapture() {

		//Declare Argument Captor
		ArgumentCaptor<String>stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
		//Define Argument Captor on specific method call
		//Capture the argument

		//Given - everything what do the setup
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("Learn to Dance")).willReturn(todos); 	//same functionality different syntax
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		//When - we will call the method
		todoBusiness.deleteTodosNotRelatedToSpring("Learn to Dance");

		//Then - we will check all the changes
		//verify - check if the method was called on a mock
		then(todoServiceMock).should().deleteTodo(stringArgumentCaptor.capture()); // same as verify
		assertThat(stringArgumentCaptor.getValue(),is("Learn to Dance"));
	}


	@Test
	public void
	deleteTodosRelatedToSpring_usingBDD_mock_syntax_usingBDD_argumentCapture_MultipleTimes() {

		//Declare Argument Captor
		ArgumentCaptor<String>stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
		//Define Argument Captor on specific method call
		//Capture the argument

		//Given - everything what do the setup
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn to Rock and Roll", "Learn Spring", "Learn to Dance");
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos); 	//same functionality different syntax
		TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);

		//When - we will call the method
		todoBusiness.deleteTodosNotRelatedToSpring("Dummy");

		//Then - we will check all the changes
		//then - check if the method was called on a mock
		then(todoServiceMock).should(times(2)).deleteTodo(stringArgumentCaptor.capture()); // same as verify
		assertThat(stringArgumentCaptor.getAllValues().size(), is(2));
	}
}