/**
 * 
 */
package c04.h03;



/**
 * @author Administrator
 *
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("tom");
		Student s2=new Student("jack");
		String s;
		
		if(s1.getName().equals("tom")){
			System.out.println(1);
		}
		
		if(s2.getName().equals("jack")){
			System.out.println(2);
		}
		
		s1.setPid("123");
		s2.setPid("456");
		if(!s1.equals(s2)){
			System.out.println(3);
		}
		
		s2.setPid(s1.getPid());
		if(s1.equals(s2)){
			System.out.println(4);
		}
		
		
		String str=String.valueOf(s1);
		if(str.equals("name=tom pid=123")){
			System.out.println(5);
		}
		

	}

}
