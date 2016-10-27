

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NextDay extends JApplet implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel showJlabel,yearLabel,monthLabel,dayLabel,output,student;
	JTextField yearField,monthField,dayField,outputField;
	JButton button1,button2;
	
	
	static int year;
	static int month;
	static int day;
	String yearString,monthString,dayString,inform;
	
	
	 
	
	public void init()//����GUI����
	{
		Container container = getContentPane();
		container.setLayout( null);
				
		
		showJlabel = new JLabel("��������������:");
		showJlabel.setBounds(20, 20, 200, 20);
		container.add(showJlabel);
		
		yearLabel = new JLabel("��:");
		yearLabel.setBounds(20, 50, 20, 20);
		container.add(yearLabel);
		yearField = new JTextField(10);
		yearField.setBounds(40, 50, 50, 20);
		container.add(yearField);
		
		monthLabel = new JLabel("��:");
		monthLabel.setBounds(120, 50, 20, 20);
		container.add(monthLabel);
		monthField = new JTextField(10);
		monthField.setBounds(140, 50, 50, 20);
		container.add(monthField);
		
		dayLabel = new JLabel("��:");
		dayLabel.setBounds(210, 50, 20, 20);
		container.add(dayLabel);
		dayField = new JTextField(10);
		dayField.setBounds(230, 50, 50, 20);
		container.add(dayField);
		
		output = new JLabel("���������Ϊ��");
		output.setBounds(20, 100, 100, 20);
		container.add(output);
		
		outputField = new JTextField(20);
		outputField.setBounds(20, 130, 230, 30);
		outputField.setEditable(false);
		container.add(outputField);
		
		button1 = new JButton("����");
		button1.setBounds(20, 170, 100, 50);
		button1.addActionListener(this);
		container.add(button1);
		
		button2 = new JButton("���");
		button2.setBounds(200, 170, 100, 50);
		container.add(button2);
		button2.addActionListener(this);
		
		student = new JLabel("1210107049         ������       ");
		student.setBounds(20, 250, 200, 30);
		container.add(student);
		
		setSize(400,500);
		
	}
	
	public void actionPerformed(ActionEvent actionEvent)//Ϊ��ť��Ӽ����¼�
	{
		if( actionEvent.getSource() ==  button1)
		{
			yearString = yearField.getText();
			year = Integer.parseInt(yearString);
			
			monthString = monthField.getText();
			month = Integer.parseInt(monthString);
			
			dayString = dayField.getText();
			day = Integer.parseInt(dayString);
			
			test();//���ø�ʽ��ⷽ��
			outputField.setText(year+"��"+month+"��"+day+"��");
		}
		
		if(actionEvent.getSource() ==  button2)
		{
			yearField.setText("");
			monthField.setText("");
			dayField.setText("");
			
		}
	}
	
	public static void test()//�������ڸ�ʽ��ⷽ��
	{
		if(year<1800 || year > 2050)JOptionPane.showMessageDialog(null, "Խ�����ڣ����� ������1800��2050�����");
		if(month<1 || month > 12)JOptionPane.showMessageDialog(null, "Խ�����ڣ����� ������1��12���·�");
		if(day<1 || day > 31)JOptionPane.showMessageDialog(null, "Խ�����ڣ����� ������1��31������ ");
		switch(month){
		
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(day < 1 || day > 31) JOptionPane.showMessageDialog(null, "����Խ�磡���� ������1��31������");
			day = (day + 1)%32;
			if(day==0)
				{
				day = 1;
				month = (month + 1)%13;
				 if(month == 0)
					 month = 1;
					 {year = year + 1;
					 if (year > 2050)JOptionPane.showMessageDialog(null, "���Խ�磡������ݳ��� 2050");}}
			break;
		case 6:
		case 9:
		case 11:if(day < 1 || day > 30) JOptionPane.showMessageDialog(null, "����Խ�磡���� ������1��30������");
		
		day = (day + 1)%31;
		if(day==0)
			{
			day = 1;
			month = (month + 1)%13;
			 if(month == 0)
				 month = 1;
				 {year = year + 1;
				 if (year > 2050)JOptionPane.showMessageDialog(null, "���Խ�磡������ݳ��� 2050");}}
		        break;
		
		case 2:
			if(isLeapYear(year))
		    {
				if(day <1 || day > 29)JOptionPane.showMessageDialog(null, "Խ�����ڣ����� ���������29��");
				day = (day + 1)%30;
				if(day==0)
					{
					day = 1;
					month = (month + 1); 
				    }
			}
			else 
			{if(day <1 || day > 28)JOptionPane.showMessageDialog(null, "Խ�����ڣ����� ���������28��");
			day = (day + 1)%29;
			if(day==0)
				{
				day = 1;
				month = (month + 1);
				}
			}
			break;
		
		}
	 
		
		
		
	}
	
	public static boolean isLeapYear( int year )//�����ж����귽��
	{
		if( (year%4==0 && year%100!=0 )|| (year%400==0))
			return true;
		else 
			return false;
	}
	
	
	

}
