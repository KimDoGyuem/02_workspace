package com.proc.m;

import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class ProcmList {
	static void run() {
		String name = "";
		String price = "";
		int no = 0;
		loop: while (true) {
			String list = Ci.r("확인할 부품 선택[1.CPU / 2.쿨러 / 3.메인보드 / 4.메모리 / 5.그래픽카드 / 6.SSD / 7.파워 / 8.케이스](x.이전)");
			switch (list) {
			case "1":
				Cw.wn("============ CPU 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from cpu");
					while (Db.result.next()) {
						name = Db.result.getString("cp_name");
						price = Db.result.getString("cp_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "2":
				Cw.wn("============ 쿨러 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from cool");
					while (Db.result.next()) {
						name = Db.result.getString("cl_name");
						price = Db.result.getString("cl_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "3":
				Cw.wn("============ 메인보드 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from mboard");
					while (Db.result.next()) {
						name = Db.result.getString("m_name");
						price = Db.result.getString("m_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "4":
				Cw.wn("============ 메모리 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from ram");
					while (Db.result.next()) {
						name = Db.result.getString("r_name");
						price = Db.result.getString("r_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "5":
				Cw.wn("============ 그래픽카드 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from gcard");
					while (Db.result.next()) {
						name = Db.result.getString("g_name");
						price = Db.result.getString("g_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "6":
				Cw.wn("============ SSD 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from ssd");
					while (Db.result.next()) {
						name = Db.result.getString("s_name");
						price = Db.result.getString("s_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "7":
				Cw.wn("============ 파워 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from power");
					while (Db.result.next()) {
						name = Db.result.getString("p_name");
						price = Db.result.getString("p_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "8":
				Cw.wn("============ 케이스 목록입니다(제품명/가격) ============");
				try {
					Db.result = Db.st.executeQuery("select*from comcase");
					while (Db.result.next()) {
						name = Db.result.getString("cc_name");
						price = Db.result.getString("cc_price");
						no = 0;
						no = no + 1;
						Cw.wn(no + ". " + name + " / " + price + "(원)");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "x":
				break loop;
			default:
				Cw.wn("잘못된 명령어😐");
			}
		}
	}
}
