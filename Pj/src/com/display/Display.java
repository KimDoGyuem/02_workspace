package com.display;

import com.util.Cw;

public class Display {
	static public void title(String x) {
		Cw.line(3);
		Cw.dot(3);
		Cw.space(18);
		Cw.w(x);
		Cw.space(18);
		Cw.dot(3);
		Cw.wn();
		Cw.line(2);
	}
	static public void siteMenu() {
		Cw.wn("============ [r]회원가입 === [l]로그인 === [m]관리자메뉴 === [x]종료 ============");
	}
	
	static public void mainMenu() {
	}
	
	static public void mMenu() {
		Cw.wn("=== [1]목록확인 == [2]부품추가 == [3]부품삭제 == [4]부품정보수정 == [x]메인으로이동 ===");
	}
	
	static public void mtitle(String x) {
		Cw.mline(3);
		Cw.mdot(3);
		Cw.space(23);
		Cw.w(x);
		Cw.space(23);
		Cw.mdot(3);
		Cw.wn();
		Cw.mline(2);
	}
	
}
