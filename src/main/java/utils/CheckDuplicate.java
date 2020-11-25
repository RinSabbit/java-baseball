package playBaseBall;
import java.util.HashSet;


/**
 * ������ ������ �ߺ��� ���ڰ� �ִ��� �˻��ϴ� Ŭ����
 */
public class CheckDuplicate {
	
	/**
	 * �ߺ��� ���ڰ� ������ ������ ������ ��ȯ�Ѵ�
	 * @return int
	 */
	public static int makeRandomNumber() {
		int randomNumber = RandomUtils.nextInt(100, 999);
		if(isDuplicate(randomNumber)) {
			return makeRandomNumber();
		}
		return randomNumber;
	}

	/**
	 * �ߺ��� ���ڰ� ������ true�� ��ȯ�Ѵ�
	 * @param randomNum
	 * @return boolean
	 */
	private static boolean isDuplicate(int randomNum) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<3; i++) {
			set.add(randomNum % 10);
			randomNum /= 10;
		}
		
		if(set.size()==3) {
			return false;
		}
		return true;
	}
}
