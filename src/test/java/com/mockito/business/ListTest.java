package com.mockito.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

/*  A few mockito examples mocking List class
	Multiple return values
	Introduction to Argument Matchers
	stub method
	Throwing exceptions 
 */

public class ListTest {

	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		Mockito.when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}

	@Test
	public void letsMockListSizeWithMultipleReturnValues() {
		List list = mock(List.class);
		Mockito.when(list.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, list.size()); // First Call
		assertEquals(20, list.size()); // Second Call
	}

	@Test
	public void letsMockListGet() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(0)).thenReturn("Test");
		assertEquals("Test", list.get(0));
		assertNull(list.get(1));
	}

	@Test
	public void letsMockListGetWithAny() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("Test");
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		assertEquals("Test", list.get(0));
		assertEquals("Test", list.get(1));
	}
	
	
	@Test(expected=RuntimeException.class)
	public void letsMockListThrowAnException() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenThrow(new RuntimeException());
		list.get(0);
		
	}
	
}
