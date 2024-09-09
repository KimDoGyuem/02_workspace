package com.proc.m;

import com.util.Ci;
import com.util.Db;

public class ProcmAdd {
	static void run() {
		String name = "";
		String price = "";
		loop:while (true) {
			String add = Ci.r("추가할 부품 선택[1.cpu / 2.쿨러 / 3.메인보드 / 4.메모리 / 5.그래픽카드 / 6.ssd / 7.파워 / 8.케이스](x.이전)");
			switch (add) {
			case "1":
				name = Ci.rl("cpu명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into cpu values('"+name+"',"+price+")");
				break;
			case "2":
				name = Ci.rl("쿨러명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into cool values('"+name+"',"+price+")");
				break;
			case "3":
				name = Ci.rl("메인보드명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into mboard values('"+name+"',"+price+")");
				break;
			case "4":
				name = Ci.rl("메모리명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into ram values('"+name+"',"+price+")");
				break;
			case "5":
				name = Ci.rl("그래픽카드명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into gcard values('"+name+"',"+price+")");
				break;
			case "6":
				name = Ci.rl("ssd명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into ssd values('"+name+"',"+price+")");
				break;
			case "7":
				name = Ci.rl("파워명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into power values('"+name+"',"+price+")");
				break;
			case "8":
				name = Ci.rl("케이스명");
				price = Ci.r("평균가");
				Db.dbUpdate("insert into comcase values('"+name+"',"+price+")");
				break;
			case "x":
				break loop;
			}
		}
	}
}
