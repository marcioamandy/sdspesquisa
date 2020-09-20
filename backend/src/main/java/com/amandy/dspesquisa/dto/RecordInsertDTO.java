package com.amandy.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer age;
	private Long gameid;
	
	public RecordInsertDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameid() {
		return gameid;
	}

	public void setGameid(Long gameid) {
		this.gameid = gameid;
	}


	
	
}
