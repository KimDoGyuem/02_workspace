package com.computer.estimate;

import com.display.Display;
import com.proc.m.Procm;
import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class SiteMain {
	private static final String MASTER_KEY = "master0721";
	static public void run() {
		Db.dbInit();
		loop: while (true) {
			Display.title("컴퓨터 견적 시뮬레이터 -ver.01-");
			Display.siteMenu();
			String cmd = Ci.r("실행하실 메뉴를 입력해주세요");
			switch (cmd) {
			case "r":
				break;
			case "l":
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
			}
		}
	}
}
