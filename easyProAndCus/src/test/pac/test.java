package test.pac;

import commdity.pro.cus.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productor p=new Productor();
		Customer c=new Customer();
		new Thread(p,"�����߳�").start();
		new Thread(c,"�����߳�").start();
		
	}

}
