package com.proc.u;

import com.computer.estimate.SiteMain;
import com.util.Cw;
import com.util.Db;

public class ProcBuildList {
	static void run() {
		String name = "";
		String cpu = "";
		String cool = "";
		String mboard = "";
		String ram = "";
		String gcard = "";
		String ssd = "";
		String power = "";
		String comcase = "";
		String totalPrice = "";
		try {
			Db.result = Db.st.executeQuery("select*from cbasket where c_user='"+SiteMain.loginId+"'");
			while(Db.result.next()) {
				name = Db.result.getString("c_name");
				cpu = Db.result.getString("c_cpu");
				cool = Db.result.getString("c_cool");
				mboard = Db.result.getString("c_mboard");
				ram = Db.result.getString("c_ram");
				gcard = Db.result.getString("c_gcard");
				ssd = Db.result.getString("c_ssd");
				power = Db.result.getString("c_power");
				comcase = Db.result.getString("c_comcase");
				totalPrice = Db.result.getString("c_totalprice");
				String estimate = String.format("CPU:%s /쿨러:%s /메인보드:%s /메모리:%s /그래픽카드:%s /SSD:%s /파워:%s /케이스:%s"
						,cpu,cool,mboard,ram,gcard,ssd,power,comcase);
				Cw.wn("---------------------------------------------------------------------------------");
				Cw.wn("[견적명:"+name+" (총 가격:"+totalPrice+")]");
				Cw.wn(estimate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
