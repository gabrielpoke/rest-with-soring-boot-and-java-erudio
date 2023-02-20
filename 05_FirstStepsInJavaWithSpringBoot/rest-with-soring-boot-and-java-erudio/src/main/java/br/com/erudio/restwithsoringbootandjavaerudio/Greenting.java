package br.com.erudio.restwithsoringbootandjavaerudio;

public class Greenting {
	
	private final Long id;
	
	private final String content;
	
	public Greenting(Long id, String content){
		this.id = id;
		
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
}
