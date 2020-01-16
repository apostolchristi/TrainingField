package in28minutes;

import org.junit.*;
import org.mockito.Mock;

import java.util.Map;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * @Before and @After runs after every test method
 * @BeforeClass and @AfterClass runs at class level only once and should be static in order to run
 */
public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass test");
	}

	// It runs before every test method
	@Before
	public void setup() {
		System.out.println("Before test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");

	}

	@Test
	public void test2() {
		System.out.println("test2 executed");

	}

	// It runs after every test method
	@After
	public void teardown() {
		System.out.println("After test");

	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass test");

	}

}