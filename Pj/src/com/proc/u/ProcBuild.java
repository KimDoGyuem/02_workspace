package com.proc.u;

import com.computer.estimate.SiteMain;
import com.util.Ci;
import com.util.Cw;
import com.util.Db;

public class ProcBuild {
	static void run() {
		String name = "";
		String price = "";
		String cmd = "";
		String select = "";
		String count = "";
		String slCpu = "미선택";
		String slCool = "미선택";
		String slMboard = "미선택";
		String slRam = "미선택";
		String slGcard = "미선택";
		String slSsd = "미선택";
		String slPower = "미선택";
		String slComcase = "미선택";
		int no = 0;
		int icount = 0;
		int iprice = 0;
		int totalPrice = 0;
		loop: while (true) {
			Cw.wn("----------------------------------------------------------------------------------------------------------------------------------");
			Cw.wn("📦현재견적[CPU:" + slCpu + " /쿨러:" + slCool + " /메인보드:" + slMboard + " /메모리:" + slRam + " /그래픽카드:"
					+ slGcard + " /SSD:" + slSsd + " /파워:" + slPower + " /케이스:" + slComcase + "]");
			Cw.wn("💰 총 : " + totalPrice + "원");
			Cw.wn("----------------------------------------------------------------------------------------------------------------------------------");
			cmd = Ci.r("부품선택[1.CPU / 2.쿨러 / 3.메인보드 / 4.메모리 / 5.그래픽카드 / 6.SSD / 7.파워 / 8.케이스 / b.견적저장](x.이전)");
			switch (cmd) {
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from cpu where cp_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from cpu where cp_name like '%" + select + "%'");
						Db.result.next();
						slCpu = Db.result.getString("cp_name");
						String cpuPrice = Db.result.getString("cp_price");
						iprice = Integer.parseInt(cpuPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from cool where cl_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from cool where cl_name like '%" + select + "%'");
						Db.result.next();
						slCool = Db.result.getString("cl_name");
						String coolPrice = Db.result.getString("cl_price");
						iprice = Integer.parseInt(coolPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from mboard where m_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from mboard where m_name like '%" + select + "%'");
						Db.result.next();
						slMboard = Db.result.getString("m_name");
						String mboardPrice = Db.result.getString("m_price");
						iprice = Integer.parseInt(mboardPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from ram where r_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from ram where r_name like '%" + select + "%'");
						Db.result.next();
						slRam = Db.result.getString("r_name");
						String ramPrice = Db.result.getString("r_price");
						iprice = Integer.parseInt(ramPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from gcard where g_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from gcard where g_name like '%" + select + "%'");
						Db.result.next();
						slGcard = Db.result.getString("g_name");
						String gcardPrice = Db.result.getString("g_price");
						iprice = Integer.parseInt(gcardPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from ssd where s_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from ssd where s_name like '%" + select + "%'");
						Db.result.next();
						slSsd = Db.result.getString("s_name");
						String ssdPrice = Db.result.getString("s_price");
						iprice = Integer.parseInt(ssdPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st.executeQuery("select count(*) from power where p_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from power where p_name like '%" + select + "%'");
						Db.result.next();
						slPower = Db.result.getString("p_name");
						String powerPrice = Db.result.getString("p_price");
						iprice = Integer.parseInt(powerPrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
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
				select = Ci.rl("선택 할 제품명");
				try {
					Db.result = Db.st
							.executeQuery("select count(*) from comcase where cc_name like '%" + select + "%'");
					Db.result.next();
					count = Db.result.getString("count(*)");
				} catch (Exception e) {
					e.printStackTrace();
				}
				icount = Integer.parseInt(count);
				if (icount > 1) {
					Cw.wn("중복된 제품명이 존재합니다 더 정확한 검색어로 입력해주세요");
				} else if (icount == 0) {
					Cw.wn("선택한 제품명이 없습니다 다시 입력해주세요");
				} else {
					try {
						Db.result = Db.st.executeQuery("select*from comcase where cc_name like '%" + select + "%'");
						Db.result.next();
						slComcase = Db.result.getString("cc_name");
						String comcasePrice = Db.result.getString("cc_price");
						iprice = Integer.parseInt(comcasePrice);
						totalPrice = totalPrice + iprice;
						Cw.wn("선택완료");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				break;
			case "b":
				String basketName = Ci.rl("저장할 견적 이름을 입력해주세요");
				String sql = String.format("insert into cbasket values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s',%d)",
						SiteMain.loginId, basketName, slCpu, slCool, slMboard, slRam, slGcard, slSsd, slPower, slComcase, totalPrice);
				Db.dbUpdate(sql);
				Cw.wn("견적 저장완료");
				break;
			case "x":
				break loop;
			default:
				Cw.wn("잘못된 명령어😐");
			}

		}
	}
}
