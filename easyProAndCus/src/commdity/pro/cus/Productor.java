package commdity.pro.cus;

public class Productor implements Runnable
{
	private Commdity tmp;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			
			if(Commdity.count<Commdity.num)
			{
				if(tmp==null)
				{
					tmp=new Commdity("´æÈë"+(Commdity.count+1));
					
				}
				
				
					
				synchronized(Commdity.com)
				{
					System.out.println(tmp.getName());
					Commdity.com[Commdity.count++]=tmp;
					tmp=null;
					
				}
			
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
	}
	
}
