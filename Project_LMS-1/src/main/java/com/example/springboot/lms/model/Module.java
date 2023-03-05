package com.example.springboot.lms.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity

@Table(name = "Modules")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int moduleId;
	private String moduleName;
	
	@OneToMany(mappedBy = "module",cascade = CascadeType.ALL)
	private List<PDF> pdfList = new ArrayList<>();
	
	@OneToMany(mappedBy = "module",cascade = CascadeType.ALL)
	private List<Question> questionList = new ArrayList<>();
	
	@OneToMany(mappedBy = "module",cascade = CascadeType.ALL)
	private List<Test> testList =new ArrayList<>();

	@ManyToMany(cascade = CascadeType.ALL)
	private List<User> userList = new ArrayList<>();

	
	public Module() {
		super();
	}

	
	public Module(int moduleId, String moduleName, List<PDF> pdfList, List<Question> questionList, List<Test> testList,
			List<User> userList) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.pdfList = pdfList;
		this.questionList = questionList;
		this.testList = testList;
		this.userList = userList;
	}

	
	
	
	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<PDF> getPdfList() {
		return pdfList;
	}

	public void setPdfList(List<PDF> pdfList) {
		this.pdfList = pdfList;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
