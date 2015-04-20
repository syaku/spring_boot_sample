package net.sevenspirals.spring_boot_sample.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloData {
	private String mail;

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
