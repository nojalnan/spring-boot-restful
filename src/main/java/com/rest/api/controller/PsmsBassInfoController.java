package com.rest.api.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.model.PsmsBassInfo;
import com.rest.api.service.PsmsBassInfoService;

@RestController
@RequestMapping("/psmsBassInfo")
public class PsmsBassInfoController {

	@Autowired
	PsmsBassInfoService ps;
	
	@RequestMapping("/all")
	public Hashtable<String, PsmsBassInfo> getAll() {
		return ps.getAll();
	}
	
	@RequestMapping("{psmsBassInfoPk}")
	public PsmsBassInfo getPsmsBassInfo(@PathVariable("psmsBassInfoPk") String psmsBassInfoPk) {
		return ps.getPsmsBassInfo(psmsBassInfoPk);
	}
	
}
