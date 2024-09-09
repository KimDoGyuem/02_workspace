package com.proc.m;

import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class ProcmDel {
	static void run() {
		String delName = "";
		String name = "";
		int no = 0;
		loop: while (true) {
			String del = Ci.r("삭제할 부품 선택[1.cpu / 2.쿨러 / 3.메인보드 / 4.메모리 / 5.그래픽카드 / 6.ssd / 7.파워 / 8.케이스](x.이전)");
			switch (del) {
			case "1":
				Cw.wn("=============== CPU 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from cpu");
					while (Db.result.next()) {
						name = Db.result.getString("cp_name");
						no = no + 1;
						Cw.wn(no + ". " + name);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 cpu명");
				Db.dbUpdate("delete from cpu where cp_name like '%" + delName + "%'");
				break;
			case "2":
				Cw.wn("=============== 쿨러 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from cool");
					while (Db.result.next()) {
						name = Db.result.getString("cl_name");
						no = no + 1;
						Cw.wn(no + ". " + name);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 쿨러명");
				Db.dbUpdate("delete from cool where cl_name like '%" + delName + "%'");
				break;
			case "3":
				Cw.wn("=============== 메인보드 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from mboard");
					while (Db.result.next()) {
						name = Db.result.getString("m_name");
						no = no + 1;
						Cw.wn(no + ". " + name);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 메인보드명");
				Db.dbUpdate("delete from mboard where m_name like '%" + delName + "%'");
				break;
			case "4":
				Cw.wn("=============== 메모리 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from ram");
					while (Db.result.next()) {
						name = Db.result.getString("r_name");
						no = no + 1;
						Cw.wn(no + ". " + name);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 메모리명");
				Db.dbUpdate("delete from ram where r_name like '%" + delName + "%'");
				break;
			case "5":
				Cw.wn("=============== 그래픽카드 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from gcard");
					while (Db.result.next()) {
						name = Db.result.getString("g_name");
						no = no + 1;
						Cw.wn(no + ". " + name);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 그래픽카드명");
				Db.dbUpdate("delete from gcard where g_name like '%" + delName + "%'");
				break;
			case "6":
				Cw.wn("=============== SSD 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from ssd");
					while(Db.result.next()) {
						name = Db.result.getString("s_name");
						no = no+1;
						Cw.wn(no+". "+name);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 ssd명");
				Db.dbUpdate("delete from ssd where s_name like '%"+delName+"%'");
				break;
			case "7":
				Cw.wn("=============== 파워 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from power");
					while(Db.result.next()) {
						name = Db.result.getString("p_name");
						no = no+1;
						Cw.wn(no+". "+name);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 파워명");
				Db.dbUpdate("delete from power where p_name like '%"+delName+"%'");
				break;
			case "8":
				Cw.wn("=============== 케이스 목록입니다 ===============");
				try {
					Db.result = Db.st.executeQuery("select*from comcase");
					while(Db.result.next()) {
						name = Db.result.getString("cc_name");
						no = no+1;
						Cw.wn(no+". "+name);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				delName = Ci.rl("삭제할 케이스명");
				Db.dbUpdate("delete from comcase where cc_name like '%"+delName+"%'");
				break;
			case "x":
				break loop;
			}
		}
	}
}
