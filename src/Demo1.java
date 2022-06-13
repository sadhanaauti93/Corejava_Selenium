
public class Demo1 {

	public static void main(String[] args) throws Exception{
		/*
		 * try{ assert false; System.out.println("t"); }catch(Error e) {
		 * System.out.println("c"); throw new Exception(); }finally {
		 * System.out.println("f"); }
		 */
		int x=3;
		if(x==2)
			x=0;
		if(x==3)
			x++;
		else x+=2;	
	}
}
	
