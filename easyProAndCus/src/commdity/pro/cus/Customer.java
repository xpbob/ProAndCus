package commdity.pro.cus;

public class Customer implements Runnable
{
	private Commdity tmp;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			if(Commdity.count>0 )
			{
				
				
				synchronized(Commdity.com)
				{
					Commdity.count--;
					tmp=Commdity.com[Commdity.count];
					
					Commdity.com[Commdity.count]=null;
					System.out.println("È¡³ö"+tmp.getName());
					
					
				}
				
				
				
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}