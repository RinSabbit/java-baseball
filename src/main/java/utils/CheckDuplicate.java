package utils;

import java.util.HashSet;

/**
 * ������ ������ �ߺ��� ���ڰ� �ִ��� �˻��ϴ� Ŭ����
 */
public class CheckDuplicate {
	
	final int TRUE_SIZE = 3;
	
	/**
	 * �ߺ��� ���ڰ� ������ ������ ������ ��ȯ�Ѵ�
	 * @return int
	 */
	public String makeRandomNumber() {
		int randomNumber = RandomUtils.nextInt(100, 999);
		if(isDuplicate(randomNumber)) {
			return makeRandomNumber();
		}
		return String.valueOf(randomNumber);
	}

	/**
	 * �ߺ��� ���ڰ� ������ true�� ��ȯ�Ѵ�
	 * @param randomNum
	 * @return boolean
	 */
	private boolean isDuplicate(int randomNum) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<3; i++) {
			set.add(randomNum % 10);
			randomNum /= 10;
		}
		if(set.size()==TRUE_SIZE) {
			return false;
		}
		return true;
	}
}
