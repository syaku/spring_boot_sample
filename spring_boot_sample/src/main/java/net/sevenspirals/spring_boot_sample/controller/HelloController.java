package net.sevenspirals.spring_boot_sample.controller;

import java.util.ArrayList;
import java.util.List;

import net.sevenspirals.spring_boot_sample.bean.HelloData;
import net.sevenspirals.spring_boot_sample.component.HelloLogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private HelloLogic logic;

	@RequestMapping(method = RequestMethod.GET)
	public List<HelloData> get() {
		ArrayList<HelloData> list = new ArrayList<HelloData>();
		List<String> mailList = logic.getEMailList();
		for (String string : mailList) {
			HelloData helloData = new HelloData();
			helloData.setMail(string);
			list.add(helloData);
		}
		return list;
	}
}
