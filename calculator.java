
public class calculator implements implementaion{

	
		public int add(int num1,int num2)
		{
			return num1+num2;
		}
		
		public int sub(int num1,int num2)
		{
			return num1-num2;
		}
		public int mul(int num1,int num2)
		{
			return num1*num2;
		}
		
		public void display()
		{
			System.out.println("Addition:"+this.add(10,10));
			System.out.println("subtract:"+this.sub(10, 10));
			System.out.println("multiply:"+this.mul(10, 10));
		}
	public static void main(String arg[])
	{
		calculator calc=new calculator();
		calc.display();
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return 0;
	}}


