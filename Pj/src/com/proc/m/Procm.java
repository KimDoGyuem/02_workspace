package com.proc.m;

import com.display.Display;
import com.util.Ci;
import com.util.Cw;

public class Procm {
	static public void run() {
		loop: while (true) {
			Display.mtitle("-관리자 전용 페이지-");
			Display.mMenu();
			String cmd = Ci.r("실행하실 메뉴를 입력해주세요");
			switch (cmd) {
			case "1":
				ProcmList.run();
				break;
			case "2":
				ProcmAdd.run();
				break;
			case "3":
				ProcmDel.run();
				break;
			case "4":
				ProcmEdit.run();
				break;
			case "x":
				break loop;
			default:
				Cw.wn("잘못된 명령어😐");
			}
		}
	}
}
