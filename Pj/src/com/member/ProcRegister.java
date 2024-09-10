package com.member;

import com.display.Display;
import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class ProcRegister {
	static public String run() {
		Cw.wn("================================ 회원가입 ================================");
		String id = "";
		String pw = "";
		while(true) {
			id = Ci.r("가입할 아이디 입력");
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
		Db.dbUpdate("insert into cmember values('"+id+"','"+pw+"')");
		Cw.wn("회원가입이 완료되었습니다");
		return id;
	}
}
