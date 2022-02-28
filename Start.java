import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import CRUDOparetion.Student;
import CRUDOparetion.StudentDao;


public class Start {
	public static void main(String[] args)throws IOException {
	System.out.println("welcome student info app");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	while(true)
	{
		System.out.println("press 1 to Add student");
		System.out.println("press 2 to update student record");
		System.out.println("press 3 to delete student record");
		System.out.println("press 4 to display the all student record");
		System.out.println("press 5 to single student information depending on the student id filter.");
		System.out.println("press 0 to exit app");
		int c=Integer.parseInt(br.readLine());
		
		
		if(c==1)
		{
			//Add student
			try {
			System.out.println("Enter Student Name:");
			String name=br.readLine();
			System.out.println("Enter Student Date of birth");
			String dob1=br.readLine();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date date = sdf.parse(dob1);
			java.sql.Date sqldate=new java.sql.Date(date.getTime());
			System.out.println("Enter Student Date of join");
			String doj1=br.readLine();
			SimpleDateFormat sdf1=new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date date1=sdf1.parse(doj1);
			java.sql.Date sqldate1=new java.sql.Date(date1.getTime());
			
			
			Student st=new Student(name,sqldate,sqldate1);
			boolean answer=StudentDao.insertStudentToDB(st);
			if (answer)
			{
				System.out.println("student is added succesfully");
			}
			else {
				System.out.println("something went wrong try again");
			}
			
			break;
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
		}
		else if(c==2)
		{
			
			try {
				System.out.println("Enter student NO:");
				int S_id=Integer.parseInt(br.readLine());
				System.out.println("Enter Student Name:");
				String name=br.readLine();
				System.out.println("Enter Student Date of birth");
				String dob1=br.readLine();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
				java.util.Date date = sdf.parse(dob1);
				java.sql.Date sqldate=new java.sql.Date(date.getTime());
				System.out.println("Enter Student Date of join");
				String doj1=br.readLine();
				SimpleDateFormat sdf1=new SimpleDateFormat("dd-mm-yyyy");
				java.util.Date date1=sdf1.parse(doj1);
				java.sql.Date sqldate1=new java.sql.Date(date1.getTime());
				
				
				Student st=new Student(S_id,name,sqldate,sqldate1);
				boolean answer=StudentDao.updateStudentToDB(st);
				if (answer)
				{
					System.out.println("student is added succesfully");
				}
				else {
					System.out.println("something went wrong try again");
				}
				
				break;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else if(c==3)
		{
			//delete student
			System.out.println("Enter student id to delete:");
			int userId=Integer.parseInt(br.readLine());
			boolean f=StudentDao.deleteStudent(userId);
			if(f)
			{
				System.out.println("Deleted....");
			}
			else
			{
				System.out.println("something went wrong .....");
			}
			
			
			break;
		}
		else if(c==4)
		{
			//display student
			StudentDao.showAllStudent();
			break;
		}
		else if(c==5)
		{
			//display single student Record
			System.out.println("Enter student id :");
			int userId=Integer.parseInt(br.readLine());
			
			StudentDao.singleStudentRecord(userId);
			break;
		}
	}
	}
	
}