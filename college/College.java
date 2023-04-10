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
package org.college;

public class College {
	public void collegeName() {
		System.out.println("Thiagarajar college of Engineering");
	}
    public void collegeCode() {
    	System.out.println("code: 16406");
    }
    public void collegeRank() {
    	System.out.println("Rank: 6");
    }
}
