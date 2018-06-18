package net.geektao.lab.examples.jpa.annotations.associationoverride;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:associationoverride/app.xml")
public class AssociationOverrideTest {

	@Test
	public void test() {
		System.out.println("xxx");
	}
}
