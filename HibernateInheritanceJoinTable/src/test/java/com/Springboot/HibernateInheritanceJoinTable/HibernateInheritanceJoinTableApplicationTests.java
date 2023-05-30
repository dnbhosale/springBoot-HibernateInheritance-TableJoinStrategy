package com.Springboot.HibernateInheritanceJoinTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInheritanceJoinTableApplicationTests {

	
	@Autowired
	private PaymentRepository pr;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createPayment() {
		CreditCard cc=new CreditCard();
		cc.setAmmount(32244);
		cc.setCardNumber("543654634635");
		cc.setId(34234);
		pr.save(cc);
		
	}
	@Test
	public void createPayement2() {
	Check ch=new Check();
	ch.setAmmount(36546);
	ch.setCheckNumber("53257354");
	ch.setId(6354);
	pr.save(ch);
	}

}
