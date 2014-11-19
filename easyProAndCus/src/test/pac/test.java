package test.pac;

import commdity.pro.cus.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productor p=new Productor();
		Customer c=new Customer();
		new Thread(p,"生产线程").start();
		new Thread(c,"消费线程").start();
		
	}

}
