package com.company.testing.in28minutes.mockito.business;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	@Mock
			//Given - setup
	List listMock;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void
		//Given - setup is for base situations

	letsMockListSize_returnMultipleValues() {
		//When - the actual method call
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
		//Then - we check all the asserts

		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
		assertEquals(4, listMock.size());
	}

	@Test
	public void
	letsMockListSize_return_get_value() {
		when(listMock.get(0)).thenReturn("Dummy lorem ipsum");

		assertEquals("Dummy lorem ipsum", listMock.get(0));
		assertEquals(null, listMock.get(1));

	}

	@Test
	public void
	letsMockListSize_return_get_value_BDD() {
		given(listMock.get(0)).willReturn("Dummy lorem ipsum");
		assertThat( listMock.get(0), is("Dummy lorem ipsum"));
	}

	@Test
	public void
	letsMockListSize_return_get_value_with_Argumnet_Matcher() {

		//Argument Matcher = anysmth()
		when(listMock.get(anyInt())).thenReturn("Dummy lorem ipsum");

		assertEquals("Dummy lorem ipsum", listMock.get(0));
		assertEquals("Dummy lorem ipsum", listMock.get(1));

	}

	@Test(expected = RuntimeException.class)
	public void
	letsMockListSize_throw_an_exception() {

		//Argument Matcher = anysmth()
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));

		listMock.get(0);
		listMock.get(1);

	}

	@Test
	public void
	letsMockListSize_throw_an_exception_mixingUp() {
		listMock = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
		//Argument Matcher = anysmth()
		when(listMock.subList(anyInt(), anyInt())).thenReturn(listMock);

		assertEquals(listMock, listMock);


	}
}
