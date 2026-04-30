package kr.or.human4.dto;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private int sal = -1;
	private Integer comm;
	private int deptno;

	private int size = 10;
	private int page = 1;
	private int start = 0;
	private int end;
	
	
	private String type;
	private String keyword;
	
	private List empnos;
	
}
