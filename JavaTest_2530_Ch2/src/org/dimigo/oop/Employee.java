/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_Employee
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 20.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class Employee {
	private String id;
	private String name;
	private String department = "개발팀";
	private String position = "사원";
	private int salary = 32000000;
	
	public Employee(){
	}
	public Employee(String id, String name, String department, String position, int salary){
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.salary = salary;
		
	}
	public Employee(String id, String name, String department, String position){
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		
	}
	public Employee(String id, String name, String department){
		this.id = id;
		this.name = name;
		this.department = department;		
	}
	public Employee(String id, String name){
		this.id = id;
		this.name = name;
		
	}
	public void printEmployee(){
		System.out.println("<<직원 정보 출력>>");
		System.out.println("사번 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("직급 : " + position);
		System.out.println("연봉 : " + String.format("%,d", salary) + "원");
	}
//	public void increaseSalary(){
//		int rate = 5;
//		if (salary != 0){
//			double salary = salary + salary/(rate/100)d;
//		}
//		System.out.println("<<직원 정보 출력>>");
//		System.out.println("사번 : " + id);
//		System.out.println("이름 : " + name);
//		System.out.println("부서 : " + department);
//		System.out.println("직급 : " + position);
//		System.out.println("연봉 : " + String.format("%,d", salary) + "원");
//		
//	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
