package com.henau.studentmanager.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.henau.studentmanager.model.Student;

public class StudentDao
{
	public static void main(String[] args) throws IOException
	{
//		readStudent();
//		createStudent();
	}

	public static void createStudent(Student stu)
	{
		//todo:添加学生之前，你要判断该学号的学生是否存在
		//如果存在，提示用户
		//不存在的情况下，才执行添加学生
		BufferedWriter bw=null;
		try
		{
			 bw=new BufferedWriter(new FileWriter("student.csv",true));
//		//我们要用面向对象的理念来实现学生的添加
//		Student stu=new Student();
//		stu.setName("李四");
//		stu.setAge(12);
			//bw.write("李四,12,男,123452354,zhangsan,123,zhangsan@163.com,1213454346,132452,计应3班");
			bw.write(stu.getName()+","+stu.getAge()+","+stu.getSex()+","+stu.getNum()+","
					+stu.getUsername()+","+stu.getPwd()+","+
					stu.getEmail()+","+stu.getPhone()+","+
					stu.getQq()+","+stu.getGrade());
			bw.newLine();
			bw.close();
		}
		catch (IOException e)
		{
			throw new RuntimeException("存储数据失败"+e.getMessage());
		}
		finally
		{
			if(bw!=null)
			{
				try
				{
					bw.close();
				}
				catch (IOException e)
				{
					throw new RuntimeException("关闭文件失败"+e.getMessage());
				}
			}
		}
	}
	
	public List<Student> getMans()
	{
		return getStudentsBySex("男");
	}
	public List<Student> getWomen()
	{
		return getStudentsBySex("女");
	}
	private List<Student> getStudentsBySex(String sex)
	{
		List<Student> students=new ArrayList<Student>();
		
		BufferedReader bReader=null;
		
		try
		{
			bReader=new BufferedReader(new FileReader("student.csv"));
			String line=bReader.readLine();
			while((line=bReader.readLine())!=null)
			{
				String[] s=line.split(",");
				if(s[2].equals(sex))
				{
					Student student=new Student();
					student.setName(s[0]);
					student.setAge(Integer.parseInt(s[1]));
					student.setSex(s[2]);
					student.setNum(s[3]);
					student.setUsername(s[4]);
					student.setPwd(s[5]);
					student.setEmail(s[6]);
					student.setPhone(s[7]);
					student.setQq(s[8]);
					student.setGrade(s[9]);
					students.add(student);
				}
				else {
					continue;
				}
			}
			
			
		}
		catch (IOException e)
		{
			throw new RuntimeException("读取数据失败"+e.getMessage());
		}
		finally
		{
			if(bReader!=null)
			{
				try
				{
					bReader.close();
				}
				catch (IOException e)
				{
					throw new RuntimeException("关闭文件失败"+e.getMessage());
				}
			}
		}
		
		return students;
	}
	

    /**
     * 根据学生的学号来查询学生信息
     * 
     */
	public Student getStudentByNum(String num)
	{
		BufferedReader bReader=null;
		
		try
		{
			bReader=new BufferedReader(new FileReader("student.csv"));
			String line=bReader.readLine();
			while((line=bReader.readLine())!=null)
			{
				String[] s=line.split(",");
				if(s[3].equals(num))
				{
					Student student=new Student();
					student.setName(s[0]);
					student.setAge(Integer.parseInt(s[1]));
					student.setSex(s[2]);
					student.setNum(s[3]);
					student.setUsername(s[4]);
					student.setPwd(s[5]);
					student.setEmail(s[6]);
					student.setPhone(s[7]);
					student.setQq(s[8]);
					student.setGrade(s[9]);
					return student;
				}
				else {
					continue;
				}
			}
			
			
		}
		catch (IOException e)
		{
			throw new RuntimeException("读取数据失败"+e.getMessage());
		}
		finally
		{
			if(bReader!=null)
			{
				try
				{
					bReader.close();
				}
				catch (IOException e)
				{
					throw new RuntimeException("关闭文件失败"+e.getMessage());
				}
			}
		}
		
//		student.setName("李和");
//		student.setAge(45);
		return null;
	}
	
	
	private static void readStudent() throws  IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("student.csv"));
		System.out.println(br.readLine());
		String string=br.readLine();
		String[] stus=string.split(",");
//		for (String string2 : strings)
//		{
//			System.out.println(string2);
//		}
		Student stu=new Student();
		stu.setName(stus[0]);
		stu.setAge(Integer.parseInt(stus[1]));
		System.out.println(stu.getName()+":"+stu.getAge());
		br.close();
	}

}
