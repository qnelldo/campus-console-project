
package GuGuDanWithClass;

public class GuGuDanWithClassView {
	public void printGuGuDan(String modelDan, String modelValue) {
		// 뷰는 출력만!
		System.out.println("구구단을 외자, 구구단을 외자!");
		System.out.println(modelDan + "단");
		System.out.println(modelValue);

	}

	public void printErrorLimit() {
			System.out.println("에러! 1~999 사이에서 입력하세요!");
	
	}
	
	public void printErrorChar() {
			System.out.println("에러! 문자열입니다!!");
	}
}

