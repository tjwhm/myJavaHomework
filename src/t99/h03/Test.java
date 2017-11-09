package t99.h03;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/**
		 * ��ɺ��ʵ��ࣨ�ӿڣ���ʹ�����г���������ȷ
		 */
		Human human = new Student("tom", "beijing");
		if (human.getName().equals("tom")) {
			System.out.println("ok step 1");
		}

		Passenger passenger = new Student("tom", "beijing");
		if (passenger.getDestination().equals("beijing")) {
			System.out.println("ok step 2");
		}

		human = new Human();
		if (!(human instanceof Passenger)) {
			System.out.println("ok step 4");
		}

	}

}
