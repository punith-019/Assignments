package patterns;

public class SHYLUSHREE 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=40;j++)
			{
				if(j==2 && i==1 || j==3&&i==1 || j==4&&i==1 || j==5&&i==1 || j==1&&i==2 || j==1&&i==3 || j==2&&i==3 || j==4&&i==3 || j==5&&i==3
					||j==5&&i==4 ||j==4&&i==5 || j==3&&i==5 || j==2&&i==5 || j==1 && i==5||i==3&&j==3 || j==9&&i==3||j==10&&i==3||j==11&&i==3||
					j==8&&i==1||j==8&&i==2||j==8&&i==3||j==8&&i==4||j==8&&i==5||j==12&&i==1||j==12&&i==2||j==12&&i==3||j==12&&i==4||j==12&&i==5||
					j==15&&i==1||j==19&&i==1||j==16&&i==2||j==18&&i==2||j==17&&i==4||j==17&&i==5 || j==17&&i==3||j==23&&i==5||j==24&&i==5||j==25&&
					i==5||j==26&&i==5||j==22&&i==1||j==22&&i==2||j==22&&i==3||j==22&&i==4||j==22&&i==5 || j==35&&i==1||j==40&&i==1||j==35&&i==2
					||j==40&&i==2||j==35&&i==3||j==40&&i==3||j==35&&i==4||j==40&&i==4||j==37&&i==5||j==38&&i==5)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	}

}
