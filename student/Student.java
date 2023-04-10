package org.student;

/*Assignment 2
=============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/
import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student dept = new Student();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.department();

	}

}
