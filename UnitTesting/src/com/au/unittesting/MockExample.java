package com.au.unittesting;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;

//import com.au.unittesting.MockerClass;

import org.junit.Test;

public class MockExample {
	
//	private static final Class MockerClass = null;
	UserDetails user;
	MockerInterface mck;
	@Before
	public void setUp() throws Exception{
		user = new UserDetails();
		mck=mock(MockerInterface.class);
	}

	@Test
	public void testCanCall() {
		
		when(mck.isReceiver()).thenReturn(true);
		assertThat(user.canCall(mck), is("call"));
	}

}
