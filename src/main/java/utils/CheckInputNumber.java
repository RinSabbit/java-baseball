/**
 * Copyright rinsabbit. All rights reserved.
 */

package utils;

/**
 * �Է��� ���ڿ��� ���ǿ� �´��� �˻��ϴ� Ŭ����
 */
public class CheckInputNumber {

	/**
	 * �Է��� ���ڿ��� 3�ڸ� ������ ���ڸ� true ��ȯ
	 * @param inputNum
	 * @return boolean
	 */
	public boolean isValid(String inputNum) {

		if (inputNum.length() != 3) {
			return false;
		}
		for (int i = 0; i < inputNum.length(); i++) {
			char num = inputNum.charAt(i);
			if (!isValidInteger(num)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * �Է��� ���ڰ� 1-9 ������ ���ڸ� true ��ȯ. �ƽ�Ű�ڵ�� �˻�.
	 * @param inputChar
	 * @return boolean
	 */
	private boolean isValidInteger(char inputChar) {

		if (inputChar < 49 || inputChar > 57) {
			return false;
		}
		return true;
	}

}
