package com.proc.u;

import com.computer.estimate.SiteMain;
import com.display.Display;
import com.util.Ci;
import com.util.Cw;

public class Procu {
	static public void run() {
		loop:while (true) {
			Display.ltitle("🖥⌨🖱 즐거운 컴퓨터 견적 짜보기 😁💰💰");
			Cw.wn("🎉" + SiteMain.loginId + "님 환영합니다🎉");
			Display.mainMenu();
			String cmd = Ci.r("실행하실 메뉴를 입력해주세요");
			switch (cmd) {
			case "1":
				ProcBuild.run();
				break;
			case "2":
				ProcBuildList.run();
				break;
			case "3":
				break;
			case "x":
				Cw.wn("로그아웃 되었습니다");
				SiteMain.loginId = null;
				break loop;
			default:
				Cw.wn("잘못된 명령어😐");
			}
		}
	}
}
