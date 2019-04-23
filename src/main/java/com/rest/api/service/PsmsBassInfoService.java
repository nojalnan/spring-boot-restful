package com.rest.api.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.rest.api.model.PsmsBassInfo;

@Service
public class PsmsBassInfoService {

	Hashtable<String, PsmsBassInfo> psmsBassInfo = new Hashtable<String, PsmsBassInfo>();
	
	public PsmsBassInfoService() {
		PsmsBassInfo psms = new PsmsBassInfo();
		psms.setPsmsBassInfoPk("1111010001");
		psms.setBildngNo("1111020001");
		psms.setBildngNm("도렴빌딩");
		psms.setPnu("1111011600100600000");
		psmsBassInfo.put("1", psms);
		
		psms = new PsmsBassInfo();
		psms.setPsmsBassInfoPk("1111010002");
		psms.setBildngNo("1111020002");
		psms.setBildngNm("종교교회");
		psms.setPnu("1111011600100320000");
		psmsBassInfo.put("2", psms);
		
		psms = new PsmsBassInfo();
		psms.setPsmsBassInfoPk("1111010003");
		psms.setBildngNo("1111020003");
		psms.setBildngNm("센터포인트");
		psms.setPnu("1111011600100650000");
		psmsBassInfo.put("3", psms);
	}
	
	public PsmsBassInfo getPsmsBassInfo(String psmsBassInfoPk) {
		if(psmsBassInfo.containsKey(psmsBassInfoPk)) {
			return psmsBassInfo.get(psmsBassInfoPk);
		} else {
			return null;
		}
	}
	
	public Hashtable<String, PsmsBassInfo> getAll(){
		return psmsBassInfo;
	}
}
