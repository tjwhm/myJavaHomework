/**
 * 
 */
package c08.h01;

/**
 * @author Administrator
 * 
 */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		MyUtil util=new MyUtil();
		if(util.getDistinctCharCount("11225500122000555111550022")==4) {
			System.out.println("������ 1");
		}
		if(util.getFrequentChar("000001100220033005500088442255663321")=='0') {
			System.out.println("������2");
		}
		
		if(util.getPascalTriangle(6).equals("1*5*10*10*5*1")) {
			System.out.println("������ 3");
		}

	}

}
