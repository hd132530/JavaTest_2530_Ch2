/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *        |_EmployeeTest
 * 
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 20.
 * </pre>
 * 
 * @author : Seungjin Jeong
 * @version : 1.0
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("10001", "채지수", "영업팀", "과장", 41000000);
		Employee e2 = new Employee("10002", "정대만", "홍보팀", "대리", 37000000);
		Employee e3 = new Employee("10003", "송태섭", "인사팀");
		Employee e4 = new Employee("10004", "서태웅", "회계팀");
		Employee e5 = new Employee("10005", "강백호");
		
		System.out.println("[위메이크 주식회사]");
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();
		e4.printEmployee();
		e5.printEmployee();
		System.out.println("[연봉 5% 인상]");
		
//		Employee e11 = new Employee("10001", "채지수", "영업팀", "과장", 41000000);
//		Employee e21 = new Employee("10002", "정대만", "홍보팀", "대리", 37000000);
//		Employee e31 = new Employee("10003", "송태섭", "인사팀");
//		Employee e41 = new Employee("10004", "서태웅", "회계팀");
//		Employee e51 = new Employee("10005", "강백호");
//		
//		e11.increaseSalary();
//		e21.increaseSalary();
//		e31.increaseSalary();
//		e41.increaseSalary();
//		e51.increaseSalary();
	}

}
