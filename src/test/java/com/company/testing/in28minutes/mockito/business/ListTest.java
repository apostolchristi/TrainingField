package com.company.testing.in28minutes.mockito.business;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	@Mock
	List listMock;

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void
	letsMockListSize_returnMultipleValues() {
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);

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
}
