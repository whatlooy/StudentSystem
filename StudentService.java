package Pojo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import Pojo.entity.Student;
import Pojo.enums.Branch;

public class StudentService {

	private static List<Student> slist = new LinkedList<>();

	public static void main(String[] args) throws Exception {

		Student st = new Student("A", "Puneet", 1, 20, Branch.CIVIL);
		Student st1 = new Student("B", "Bhanu", 2, 23, Branch.CIVIL);
		Student st2 = new Student("C", "Rajat", 3, 24, Branch.IT);
		
		slist.add(addStudent(st1));
		slist.add(addStudent(st));
		slist.add(addStudent(st2));
		for(Student s:slist) {
			System.out.println(s.getAge()+" "+s.getName()+" "+ s.getRank()+" "+s.getRollNum()+" "+s.getBranch());
		}
		List<Student> ls=new LinkedList<>();
        ls=getBranchStudent(Branch.CIVIL);
            for(Student s:ls){
                System.out.println(s.getAge()+" "+s.getName()+" "+ s.getRank()+" "+s.getRollNum()+" "+s.getBranch());
            }
		removeByRollNum("C");
		System.out.println("The number of student in list\n"+countNum());
		 List<Student> ls1=new ArrayList<>();
         ls1=sortStudent("rank","A");
         for(Student s:ls1){
             System.out.println(s.getAge()+" "+s.getName()+" "+ s.getRank()+" "+s.getRollNum()+" "+s.getBranch());
         }
         Student st3=new Student();
        		 st3=foundByRollNum("C");
         System.out.println(st3.getAge()+" "+st3.getName()+" "+st3.getRank()+" "+st3.getRollNum()+" "+st3.getBranch());
	}
	

	static int countNum(){
	    int count=0;
	    for(@SuppressWarnings("unused") Student s:slist){
	        count++;
	    }
	    return count;
	}
	public static Student removeByRollNum(String rollNumber) throws Exception {
		if (slist.isEmpty()) {
			throw new Exception("Student list is empty");
		}
		

		// studentList.removeIf(student -> student.getRollNum().equals(rollNumber));
		return null;
	}
	static Student addStudent(Student student) throws Exception{
        if(student.getRollNum()==null||student.getName()==null||student.getRank()==0){
            throw new Exception("the feild of the student is null");
        }
        return student;
    }
	static List<Student> getBranchStudent(Branch branch) throws Exception{
        List<Student> ls=new LinkedList<>();
        for(Student s:slist){
            if(s.getBranch().equals(branch)){
                ls.add(s);
            }
        }
        if(ls.isEmpty()){
            throw new Exception("No branch found");
        }
        return ls;
    }
	 
	 static Comparator<Student> compareByName=new Comparator<Student>() {
	        @Override
	        public int compare(Student s1,Student s2){
	            return s1.getName().compareTo(s2.getName());
	        }
	    };
	    static Comparator<Student> compareByAge=new Comparator<Student>() {
	        @Override
	        public int compare(Student s1,Student s2){
	            return s1.getAge() - s2.getAge();
	        }
	    };
	    static Comparator<Student> compareByBranch=new Comparator<Student>() {
	        @Override
	        public int compare(Student s1,Student s2){
	            return s1.getBranch().compareTo(s2.getBranch());
	        }
	    };
	    static Comparator<Student> compareByRank=new Comparator<Student>() {
            @Override
            public int compare(Student s1,Student s2){
                return s1.getRank() - s2.getRank();
            }
        };
	 static List<Student> sortStudent(String sortfeild,String order){
         if(sortfeild=="name" && order=="A"){
             slist.sort(compareByName);
         }
         else if(sortfeild=="name" && order=="D"){
             slist.sort(compareByName);
             Collections.reverse(slist);
         }
         if(sortfeild=="branch"&&order=="A"){
             slist.sort(compareByBranch);
         }
         else if(sortfeild=="branch" && order=="D"){
             slist.sort(compareByBranch);
             Collections.reverse(slist);
         }
         if(sortfeild=="rank"&&order=="A"){
             slist.sort(compareByRank);
         }
         else if(sortfeild=="rank" && order=="D"){
             slist.sort(compareByRank);
             Collections.reverse(slist);
         }
         if(sortfeild=="age"&&order=="A"){
             slist.sort(compareByAge);
         }
         else if(sortfeild=="age" && order=="D"){
             slist.sort(compareByAge);
             Collections.reverse(slist);
         }
         return slist;
     }
	 static Student foundByRollNum(String rollNumber) throws Exception{
         Student s=new Student();
         for(Student s1:slist){
             if(s1.getRollNum()==rollNumber){
                 s=s1;
                 break;
             }
             else{
                 continue;
             }
         }
         if(s.getRollNum()== null){
             throw new Exception("No roll number found");
         }
         return s;
	
}
}

