package com.cg.hibernateprogram;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
	@Entity  
	@Table(name="question12")  
	public class Questions {    
	  
	@Id   
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;    
	private String qname;    
	  
	@ManyToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	@OrderColumn(name="type")  
	private List<Answer> answers;  
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getQname() {  
	    return qname;  
	}  
	public void setQname(String qname) {  
	    this.qname = qname;  
	}  
	public List<Answer> getAnswers() {  
	    return answers;  
	}  
	public void setAnswers(List<Answer> answers) {  
	    this.answers = answers;  
	}  
}
