/**
 * 
 */
package Pojo;

import java.util.List;

import Pojo.entity.Student;
import Pojo.enums.Branch;

/**
 * @author Puneet
 *
 */
public interface StudentInterface {
	Student addStudent(Student student);
	List<Student>getBranchStudent(Branch branch);
	Student findByRollNo(String rollNum);
	List<Student> sortStudents(String sortFeild,String direction);
	Student removeStudent(String rollNum);
	Student updateStudentRank(String rollNum,Integer rank);
	Integer countStudents();
}
