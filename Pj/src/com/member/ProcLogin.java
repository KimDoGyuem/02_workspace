package com.member;

import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class ProcLogin {
	static public String run() {
		Cw.wn("================================ 로그인 ================================");
		String id = "";
		String pw = "";
		while(true) {
			id = Ci.r("아이디 입력");
			if(id.length()>0) {
				break;
			}else {
				Cw.wn("아이디에 공백은 입력 할 수 없습니다");
			}
		}
		while(true) {
			pw = Ci.r("비밀번호 입력");
			if(pw.length()>0) {
				break;
			}else {
				Cw.wn("비밀번호에 공백은 입력 할 수 없습니다");
			}
		}
		if(Db.loginCheck(id, pw)) {
			Cw.wn("로그인 성공 했습니다");
			return id;
		}else {
			Cw.wn("로그인 실패 했습니다");
			return null;
		}
	}
}
