package com.computer.estimate;

import com.display.Display;
import com.member.ProcLogin;
import com.member.ProcRegister;
import com.proc.m.Procm;
import com.proc.u.Procu;
import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class SiteMain {
	static String cmd = "";
	private static final String MASTER_KEY = "master0721"; //관리자 키
	static public String loginId = null;
	
	static public void run() {
		Db.dbInit();
		loop: while (true) {
			if (loginId == null) {
				Display.title("컴퓨터 견적 시뮬레이터 -ver.01-");
				Display.siteMenu();
				cmd = Ci.r("실행하실 메뉴를 입력해주세요");
			} else {
				cmd = "l";
			}
			switch (cmd) {
			case "r":
				loginId = ProcRegister.run();
				break;
			case "l":
				if(loginId == null) {
					loginId = ProcLogin.run();
				}else {
					Procu.run();
				}
				break;
			case "m":
				String m = Ci.r("관리자 키를 입력해주세요");
				if (m.equals("master0721")) {
					Procm.run();
				} else {
					Cw.wn("관리자 키가 다릅니다😡");
				}
				break;
			case "x":
				Cw.wn("프로그램이 종료되었습니다");
				break loop;
			default:
				Cw.wn("잘못된 명령어😐");
			}
		}
	}
}
