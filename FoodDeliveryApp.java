import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
class FoodDeliveryApp implements ActionListener
{
//**************************FRAME -1  Log in Page*************************
int add1=0,add2=0,add3=0,tot=0,add4=0,add5=0,add6=0,add7=0,add8=0,add9=0,add10=0,z=0,z1=0,z2=0,z3=0,z4=0,z5=0,tot1,tot2,tot3,tot4,tot5,tot6,tot7,tot8,tot9,tot10,add11=0,add12=0,add13=0,add14=0,add15=0,add16=0,t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0,t13=0,t14=0,t15=0,t16=0,t17=0;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50;
JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8,jtf9,jtf10,jtf11,jtf12,jtf13,jtf14,jtf15,jtf16,jtf17,jtf18,jtf19,jtf20,jtf21,jtf22,jtf23,jtf24,jtf25,jtf26,jtf27,jtf28,jtf29,jtf30,jtf31,jtf32,jtf33,jtf34,jtf35,jtf36,jtf37,jtf38,jtf39,jtf40,jtf41;
JButton jb1,jb2,jb3,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20,jb21,jb22,jb23,jb24,jb25,jb26,jb27,jb28,jb29,jb30,jb31,jb32,jb33,jb34,jb35,jb36,jb37,jb38,jb39,jb40,jb41,jb42,jb43,jb44,jb45,jb46,jb47,jb48,jb49,jb50,jb51,jb52,jb53,jb54,jb55,jb56,jb57,jb58,jb59,jb60,jb61,jb62,jb63,jb64,jb65,jb66,jb67,jb68,jb69,jb70,jb71,jb72,jb73,jb74,jb78,jb79,jb80,jb81,jb82,jb83,jb84,jb85,jb86,jb87,jb88,jb89,jb90,jb91,jb92,jb93,jb94,jb95,jb96,jb97,jb98,jb99,jb100;
String Id,Pw,a,b,y1,y2,loc,type,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11,lab12,lab13,lab14,lab15,lab16,lab17,lab18,lab19,lab20,lab21,lab22,lab23,lab24,lab25,lab26,lab27,lab28,lab29,lab30,lab31,lab32,lab33,lab34,lab35,lab36,lab37,lab38,lab39,lab40,lab41,lab42,lab43,lab44;
JFrame jf1=new JFrame();
JFrame jf=new JFrame();
JFrame jf2=new JFrame();
JFrame jf3=new JFrame();
JFrame jf4=new JFrame();
JFrame jf5=new JFrame();
JFrame jf6=new JFrame();
JFrame jf7=new JFrame();
JComboBox jcb1,jcb2,jcb3,jcb4,jcb5,jcb6;
Font f=new Font("Verdana",Font.PLAIN,18);
Connection con;    
Statement st;   
ResultSet rs;
PreparedStatement ps;
int t=0,cos	=0,cos1=0,cos2=0,cos3=0,cos4=0,cos5=0,cos6=0,cos7=0,cos8=0,cos9=0,cos10=0,cos11=0,cos12=0,cos13=0,cos14=0,cos15=0,cos16=0,cos17=0,cos18=0,cos19=0,cos20=0,cos21=0,cos22=0,cos23=0,cos24=0,cos25=0,cos26=0,cos27=0;
FoodDeliveryApp()
{
l1=new JLabel("User ID");
l1.setBackground(Color.CYAN);
l1.setOpaque(true);
l1.setForeground(Color.BLACK);
l1.setBounds(250,300,100,30);
l1.setFont(f);
l2=new JLabel("Password");
l2.setBackground(Color.CYAN);
l2.setForeground(Color.BLACK);
l2.setBounds(250,350,100,30);
l2.setOpaque(true);
l2.setFont(f);
jb1=new JButton("Submit");
jb1.setBounds(400,400,100,30);
jb1.setFont(f);
jb1.setBackground(Color.BLACK);
jb1.setForeground(Color.WHITE);
jb2=new JButton("Create");
jb2.setBounds(550,400,100,30);
jb2.setFont(f);
jb2.setBackground(Color.BLACK);
jb2.setForeground(Color.WHITE);
jb52=new JButton("Exit");
jb52.setBounds(700,400,100,30);
jb52.setBackground(Color.BLACK);
jb52.setForeground(Color.WHITE);
jb52.setFont(f);
jf.add(jb52);
jb52.addActionListener(this);
jtf1=new JTextField();
jtf1.setBackground(Color.CYAN);
jtf1.setForeground(Color.BLACK);
jtf1.setFont(f);
jtf1.setBounds(400,300,200,30);
jtf2=new JTextField();
jtf2.setFont(f);
jtf2.setBackground(Color.CYAN);
jtf2.setForeground(Color.BLACK);
jtf2.setBounds(400,350,200,30);
jtf3=new JTextField();
jtf3.setFont(f);
jtf3.setBackground(Color.CYAN);
jtf3.setForeground(Color.BLACK);
jtf3.setBounds(250,200,150,30);
jtf4=new JTextField();
jtf4.setFont(f);
jtf4.setBackground(Color.CYAN);
jtf4.setForeground(Color.BLACK);
jtf4.setBounds(250,250,150,30);
jtf5=new JTextField();
jtf5.setFont(f);
jtf5.setBackground(Color.CYAN);
jtf5.setForeground(Color.BLACK);
jtf5.setBounds(250,450,150,30);
jtf6=new JTextField();
jtf6.setFont(f);
jtf6.setBackground(Color.CYAN);
jtf6.setForeground(Color.BLACK);
jtf6.setBounds(250,500,150,30);
jtf7=new JTextField();
jtf7.setFont(f);
jtf7.setBackground(Color.CYAN);
jtf7.setForeground(Color.BLACK);
jtf7.setBounds(250,720,150,30);
jtf8=new JTextField();
jtf8.setFont(f);
jtf8.setBackground(Color.CYAN);
jtf8.setForeground(Color.BLACK);
jtf8.setBounds(250,770,150,30);
jf.add(l1);
jf.add(l2);
jf.add(jb1);
jf.add(jb2);
jf.add(jtf1);
jf.add(jtf2);
jf2.add(jtf3);
jf2.add(jtf4);
jf2.add(jtf5);
jf2.add(jtf6);
jf2.add(jtf7);
jf2.add(jtf8);
jb1.addActionListener(this);
jb2.addActionListener(this);
JLabel b = new JLabel(new ImageIcon("res2.jpg"));
jf.getContentPane().add(b);
jf.pack();      
jf.setVisible(true);
jf1.setVisible(false);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
}
//***********************FRAME -1 Submit Button**************************
public void actionPerformed(ActionEvent e)
{
Id=jtf1.getText();
Pw=jtf2.getText();
//System.out.println("Id="+Id+"\n"+"Password"+Pw);
if(e.getSource()==jb1)
{
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"Rare.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nazriya");
while(rs.next())
{
a=rs.getString("ID");
b=rs.getString("Password");
//System.out.println("a="+a+"\n"+"b="+b);
if(a.equals(Id)&&b.equals(Pw))
	{
	//System.out.println("hhh");
	t=1;
	jf2.setVisible(false);
	jf3.setVisible(false);
	jf4.setVisible(false);
	jf5.setVisible(false);
	jf6.setVisible(false);
	jf7.setVisible(false);
	jf.setVisible(false);
	//System.out.println("bbb");
	l3=new JLabel("Enter your location");
	l3.setBounds(300,250,250,30);
	l3.setBackground(Color.CYAN);
	l3.setForeground(Color.BLACK);
	l3.setOpaque(true);
	l3.setFont(f);
	jcb1=new JComboBox();
	jcb1.addItem("Dindigul_urban");
	jcb1.addItem("Dindigul_rural");
	jcb1.setBounds(600,250,250,30);
	jcb1.setFont(f);
	l4=new JLabel("Enter your preference");
	l4.setBounds(300,350,250,30);
	l4.setBackground(Color.CYAN);
	l4.setForeground(Color.BLACK);
	l4.setOpaque(true);
	l4.setFont(f);
	jcb2=new JComboBox();
	jcb2.addItem("Veg");
	jcb2.addItem("Non_veg");
	jcb2.setBounds(600,350,250,30);
	jcb2.setFont(f);
	jf1.add(l3);
	jf1.add(l4);
	jf1.add(jcb1);
	jf1.add(jcb2);
	//jf1.getContentPane().setBackground(Color.CYAN);
	jb5=new JButton("Submit");
	jb5.setBounds(600,450,100,30);
	jb5.setFont(f);
	jf1.add(jb5);
	jb52=new JButton("Exit");
	jb52.setBounds(600,650,100,30);
	jb52.setBackground(Color.BLACK);
	jb52.setForeground(Color.WHITE);
	jb52.setFont(f);
	jb52.addActionListener(this);
	jf1.add(jb52);
	jb6=new JButton("Submit");
	jb6.setBounds(400,650,100,30);
	jb6.setBackground(Color.BLACK);
	jb6.setForeground(Color.WHITE);
	jb6.setFont(f);
	jb6.addActionListener(this);
	jf1.add(jb6);
	//jb3=new JButton("Back");
	//jb3.setBounds(250,650,100,30);
	//jb3.setBackground(Color.BLACK);
	//jb3.setForeground(Color.WHITE);
	//jb3.setFont(f);
	//jb3.addActionListener(this);
	//jf1.add(jb3);
	jb5.setBackground(Color.BLACK);
	jb5.setForeground(Color.WHITE);
	jb5.addActionListener(this);
	l5=new JLabel("Select Your Hotel Name");
	l5.setBounds(300,500,250,30);
	l5.setBackground(Color.CYAN);
	l5.setForeground(Color.BLACK);
	l5.setOpaque(true);
	l5.setFont(f);
	jf1.add(l5);
	jcb3=new JComboBox();
	jcb3.setBounds(600,500,250,30);
	jcb3.setFont(f);
	jf1.add(jcb3);
	JLabel b1 = new JLabel(new ImageIcon("res3.jpg"));
	jf1.getContentPane().add(b1);
	jf1.pack();  
	//System.out.println("Welcome");
	jf1.setVisible(true);
	}
}
//System.out.println("hello");
	if(t!=1)
	{
	if(Id.equals("")||Pw.equals(""))
	{
	JOptionPane.showMessageDialog(jf,"You have to enter the data","Warning",JOptionPane.WARNING_MESSAGE);
	}
	else if(!a.equals(Id)&&!b.equals(Pw))
	{
	JOptionPane.showMessageDialog(jf,"Create Your Accont!","Warning",JOptionPane.WARNING_MESSAGE);
	}
	}
}
catch(Exception e1)
{
System.out.println(e1);
}
}

//*****************************Frame 3- Saravana Back Button******************************
if(e.getSource()==jb28)
{
t2=1;
jf1.setVisible(true);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
//jf1.setVisible(false);
}
//if(e.getSource()==jb3)
//{
//t2=1;
//jf.setVisible(true);
//jf2.setVisible(false);
//jf3.setVisible(false);
//jf4.setVisible(false);
//jf5.setVisible(false);
//jf6.setVisible(false);
//jf7.setVisible(false);
//jf1.setVisible(false);
//}
//***************************Frame 4-Balaji Back Button***********************
if(e.getSource()==jb29)
{
t3=1;
jf.setVisible(false);
jf1.setVisible(true);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
//jf1.setVisible(false);
}
//**************************Frame 5-aachis Back Button***********************
if(e.getSource()==jb40)
{
t4=1;
jf.setVisible(false);
jf1.setVisible(true);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
//jf1.setVisible(false);
}
//******************************Frame 6 -Nandha Back Button*********************
if(e.getSource()==jb51)
{
t5=1;
jf.setVisible(false);
jf1.setVisible(true);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
//jf1.setVisible(false);
}
//**************************FRAME -2 Submit******************************
if(e.getSource()==jb5)
{
t6=1;
if(jcb1.getSelectedItem().equals("Dindigul_urban")&&jcb2.getSelectedItem().equals("Veg"))
{
if(z==0)
{
jcb3.removeAllItems();
//System.out.println("hai");
jcb3.addItem("Saravana_Bhavan");
jcb3.addItem("Balaji_Bhavan");
}
z++;
}
else if(jcb1.getSelectedItem().equals("Dindigul_urban")&&jcb2.getSelectedItem().equals("Non_veg"))
{
if(z1==0)
{
jcb3.removeAllItems();
jcb3.addItem("Aachis");
jcb3.addItem("Nandha_Mess");
}
z1++;
}
}
//*****************Saravana_Bhavan  submit***************
if(e.getSource()==jb6)
{
t7=1;
if(jcb3.getSelectedItem().equals("Saravana_Bhavan"))
{
jf.setVisible(false);
jf1.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
jb7=new JButton(new ImageIcon("dhosa.jpg"));  
jb7.setBounds(30,30,200,200);  
jf2.add(jb7); 
l5=new JLabel("Dhosa");
l5.setBounds(30,250,200,30);
l5.setBackground(Color.CYAN);
l5.setForeground(Color.BLACK);
l5.setOpaque(true);
l5.setFont(f); 
jb10=new JButton("ADD");
jb10.setBounds(250,150,100,30);
jb10.setFont(f);
jb10.setBackground(Color.BLACK);
jb10.setForeground(Color.WHITE);
jb10.addActionListener(this);
jb11=new JButton("CANCEL");
jb11.setBounds(370,150,150,30);
jb11.setFont(f);
jb11.setBackground(Color.BLACK);
jb11.setForeground(Color.WHITE);
jb11.addActionListener(this);
JButton jb8= new JButton(new ImageIcon("pizza.jpg"));  
jb8.setBounds(30,300,200,200);
jf2.add(jb8);
jb12=new JButton("ADD");
jb12.setBounds(250,400,100,30);
jb12.setFont(f);
jb12.setBackground(Color.BLACK);
jb12.setForeground(Color.WHITE);
jb12.addActionListener(this);
jb13=new JButton("CANCEL");
jb13.setBounds(370,400,150,30);
jb13.setFont(f);
jb13.setBackground(Color.BLACK);
jb13.setForeground(Color.WHITE);
jb13.addActionListener(this);
l6=new JLabel("Pizza");
l6.setBounds(30,520,200,30);
l6.setBackground(Color.CYAN);
l6.setForeground(Color.BLACK);
l6.setOpaque(true);
l6.setFont(f); 
JButton jb9= new JButton(new ImageIcon("id.jpg"));  
jb9.setBounds(30,570,200,200);
jf2.add(jb9);
jb14=new JButton("ADD");
jb14.setBounds(250,670,100,30);
jb14.setFont(f);
jb14.setBackground(Color.BLACK);
jb14.setForeground(Color.WHITE);
jb15=new JButton("CANCEL");
jb15.setBounds(370,670,150,30);
jb15.setBackground(Color.BLACK);
jb15.setForeground(Color.WHITE);
jb15.setFont(f);
l7=new JLabel("Idli");
l7.setBounds(30,780,200,30);
l7.setBackground(Color.CYAN);
l7.setForeground(Color.BLACK);
l7.setOpaque(true);
l7.setFont(f);
jf2.add(l7); 
jf2.add(l5);
jf2.add(l6);
jf2.add(jb10);
jf2.add(jb11);
jf2.add(jb12);
jf2.add(jb13);
jf2.add(jb14);
jb16=new JButton("SUBMIT");
jb16.setBounds(700,500,150,30);
jb16.setFont(f);
jb16.setBackground(Color.BLACK);
jb16.setForeground(Color.WHITE);
jf2.add(jb16);
jb14.addActionListener(this);
jf2.add(jb15);
jb15.addActionListener(this);
jb16.addActionListener(this);
jf2.setSize(300,300); 
jb28=new JButton("Back");
jb28.setBounds(900,500,100,30);
jb28.setBackground(Color.BLACK);
jb28.setForeground(Color.WHITE);
jb28.setFont(f);
jf2.add(jb28); 
jb28.addActionListener(this);
jb52=new JButton("Exit");
jb52.setBounds(1100,500,100,30);
jb52.setBackground(Color.BLACK);
jb52.setForeground(Color.WHITE);
jb52.setFont(f);
jf2.add(jb52); 
jb52.addActionListener(this);
jf2.setTitle("This is our basic AWT example");   
JLabel b4 = new JLabel(new ImageIcon("r1.jpg"));
jf2.getContentPane().add(b4);
jf2.pack();  
jf2.setVisible(true);
}
//********************************Balaji_Bhavan submit*************
else if(jcb3.getSelectedItem().equals("Balaji_Bhavan"))
{
jf.setVisible(false);
jf1.setVisible(false);
jf2.setVisible(false);
jf4.setVisible(false);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
//jf3.setVisible(true);
jb17 = new JButton(new ImageIcon("c1.jpg"));  
jb17.setBounds(30,30,200,200);  
jf3.add(jb17);
l8=new JLabel("Curd_Rice");
l8.setBounds(30,250,200,30);
l8.setBackground(Color.CYAN);
l8.setForeground(Color.BLACK);
l8.setOpaque(true);
l8.setFont(f); 
jf3.add(l8);
jb18=new JButton("ADD");
jb18.setBounds(250,150,100,30);
jb18.setFont(f);
jb18.setBackground(Color.BLACK);
jb18.setForeground(Color.WHITE);
jf3.add(jb18);
jb19=new JButton("CANCEL");
jb19.setBounds(370,150,150,30);
jb19.setFont(f);
jb19.setBackground(Color.BLACK);
jb19.setForeground(Color.WHITE);
jf3.add(jb19);
JButton jb20= new JButton(new ImageIcon("c2.png"));  
jb20.setBounds(30,300,200,200);
jf3.add(jb20);
jb21=new JButton("ADD");
jb21.setBounds(250,400,100,30);
jb21.setFont(f);
jb21.setBackground(Color.BLACK);
jb21.setForeground(Color.WHITE);
jf3.add(jb21);
jb22=new JButton("CANCEL");
jb22.setBounds(370,400,150,30);
jb22.setFont(f);
jb22.setBackground(Color.BLACK);
jb22.setForeground(Color.WHITE);
jf3.add(jb22);
l9=new JLabel("Cauliflower_fry");
l9.setBounds(30,520,200,30);
l9.setBackground(Color.CYAN);
l9.setForeground(Color.BLACK);
l9.setOpaque(true);
l9.setFont(f);
jf3.add(l9); 
JButton jb24= new JButton(new ImageIcon("c3.jpg"));  
jb24.setBounds(30,570,200,200);
jf3.add(jb24);
jb25=new JButton("ADD");
jb25.setBounds(250,670,100,30);
jb25.setFont(f);
jb25.setBackground(Color.BLACK);
jb25.setForeground(Color.WHITE);
jf3.add(jb25);
jb18.setBackground(Color.BLACK);
jb18.setForeground(Color.WHITE);
jb26=new JButton("CANCEL");
jb26.setBounds(370,670,150,30);
jb26.setFont(f);
jb26.setBackground(Color.BLACK);
jb26.setForeground(Color.WHITE);
jf3.add(jb26);
l10=new JLabel("Noodles");
l10.setBounds(30,780,200,30);
l10.setBackground(Color.CYAN);
l10.setForeground(Color.BLACK);
l10.setOpaque(true);
l10.setFont(f);
jf3.add(l10);
jb27=new JButton("SUBMIT");
jb27.setBounds(700,500,150,30);
jb27.setFont(f);
jb27.setBackground(Color.BLACK);
jb27.setForeground(Color.WHITE);
jf3.add(jb27);
jb18.addActionListener(this);
jb19.addActionListener(this);
jb21.addActionListener(this);
jb22.addActionListener(this);
jb25.addActionListener(this);
jb26.addActionListener(this);
jb27.addActionListener(this);
//jf3.setSize(300,300);  
jb29=new JButton("Back");
jb29.setBounds(900,500,100,30);
jb29.setBackground(Color.BLACK);
jb29.setForeground(Color.WHITE);
jb29.setFont(f);
jb29.addActionListener(this);
jf3.add(jb29); 
jb52=new JButton("Exit");
jb52.setBounds(1100,500,100,30);
jb52.setBackground(Color.BLACK);
jb52.setForeground(Color.WHITE);
jb52.setFont(f);
jf3.add(jb52); 
jb52.addActionListener(this);
jtf9=new JTextField();
jtf9.setFont(f);
jtf9.setBackground(Color.CYAN);
jtf9.setForeground(Color.BLACK);
jtf9.setBounds(250,200,150,30);
jtf10=new JTextField();
jtf10.setFont(f);
jtf10.setBackground(Color.CYAN);
jtf10.setForeground(Color.BLACK);
jtf10.setBounds(250,250,150,30);
jtf11=new JTextField();
jtf11.setFont(f);
jtf11.setBackground(Color.CYAN);
jtf11.setForeground(Color.BLACK);
jtf11.setBounds(250,450,150,30);
jtf12=new JTextField();
jtf12.setFont(f);
jtf12.setBackground(Color.CYAN);
jtf12.setForeground(Color.BLACK);
jtf12.setBounds(250,500,150,30);
jtf13=new JTextField();
jtf13.setFont(f);
jtf13.setBackground(Color.CYAN);
jtf13.setForeground(Color.BLACK);
jtf13.setBounds(250,720,150,30);
jtf14=new JTextField();
jtf14.setFont(f);
jtf14.setBackground(Color.CYAN);
jtf14.setForeground(Color.BLACK);
jtf14.setBounds(250,770,150,30);
jf3.add(jtf9);
jf3.add(jtf10);
jf3.add(jtf11);
jf3.add(jtf12);
jf3.add(jtf13);
jf3.add(jtf14);
JLabel b5= new JLabel(new ImageIcon("n1.jpg"));
jf3.getContentPane().add(b5);
jf3.pack();  
jf3.setVisible(true);
}
}
//*******************dhosa-Add**************
if(e.getSource()==jb10)
{
if(add1>=0)
{
add1++;
jtf3.setText(Integer.toString(add1));
}
else if(add1<0)
{
jtf3.setText(Integer.toString(0));
add1=Integer.parseInt(jtf3.getText());
}
else if(add1==0)
{
add1++;
jtf3.setText(Integer.toString(add1));
}
lab1=l5.getText();
//System.out.println("lab1="+lab1);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab2=rs.getString("Item");
cos=rs.getInt("Cost");
if(lab2.equals(lab1))
{
cos=cos*add1;
//System.out.println("cos="+cos);
jtf4.setText(Integer.toString(cos));
}
}
}
catch(Exception e3)
{
System.out.println(e3);
}
}
//****************************Cancel Button*************************
else if(e.getSource()==jb11)
{
try
{
if(add1>0)
{
add1--;
//System.out.println("start="+add1);
jtf3.setText(Integer.toString(add1));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab3=rs.getString("Item");
cos1=rs.getInt("Cost");
if(lab3.equals(lab1))
{
//System.out.println("add1="+add1);
cos1=cos1*add1;
//System.out.println("cos="+cos1);
jtf4.setText(Integer.toString(cos1));
}
}
}
}
catch(Exception e4)
{
System.out.println(e4);
}
}
//********************pizza - Add Button**************************
if(e.getSource()==jb12)
{
if(add2>=0)
{
add2++;
jtf5.setText(Integer.toString(add2));
}
else if(add2<0)
{
jtf5.setText(Integer.toString(0));
add2=Integer.parseInt(jtf5.getText());
}
else if(add2==0)
{
add2++;
jtf5.setText(Integer.toString(add2));
}
lab4=l6.getText();
//System.out.println("lab4="+lab4);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab5=rs.getString("Item");
cos2=rs.getInt("Cost");
if(lab5.equals(lab4))
{
cos2=cos2*add2;
//System.out.println("cos="+cos2);
jtf6.setText(Integer.toString(cos2));
}
}
}
catch(Exception e4)
{
System.out.println(e4);
}
}
//************************************Cancel Button*****************************
else if(e.getSource()==jb13)
{
try
{
if(add2>0)
{
add2--;
//System.out.println("start="+add2);
jtf5.setText(Integer.toString(add2));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab6=rs.getString("Item");
cos3=rs.getInt("Cost");
if(lab6.equals(lab4))
{
//System.out.println("add2="+add2);
cos3=cos3*add2;
//System.out.println("cos="+cos3);
jtf6.setText(Integer.toString(cos3));
}
}
}
}
catch(Exception e5)
{
System.out.println(e5);
}
}
//***********************************idli Add Button***************************
if(e.getSource()==jb14)
{
if(add3>=0)
{
add3++;
jtf7.setText(Integer.toString(add3));
}
else if(add3<0)
{
jtf7.setText(Integer.toString(0));
add3=Integer.parseInt(jtf7.getText());
}
else if(add3==0)
{
add3++;
jtf7.setText(Integer.toString(add3));
}
lab7=l7.getText();
//System.out.println("lab7="+lab7);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab8=rs.getString("Item");
cos4=rs.getInt("Cost");
if(lab7.equals(lab8))
{
cos4=cos4*add3;
//System.out.println("cos="+cos2);
jtf8.setText(Integer.toString(cos4));
}
}
}
catch(Exception e6)
{
System.out.println(e6);
}
}
else if(e.getSource()==jb15)
{
try
{
if(add3>0)
{
add3--;
//System.out.println("start="+add2);
jtf7.setText(Integer.toString(add3));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"pricelist.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from price");
while(rs.next())
{
lab9=rs.getString("Item");
cos5=rs.getInt("Cost");
if(lab9.equals(lab7))
{
//System.out.println("add2="+add2);
cos5=cos5*add3;
//System.out.println("cos="+cos3);
jtf8.setText(Integer.toString(cos5));
}
}
}
}
catch(Exception e7)
{
System.out.println(e7);
}
}
//***************Submit Total Amount Button**************************
if(e.getSource()==jb16)
{
t8=1;
if(jtf4.getText().equals(""))
{
jtf4.setText(Integer.toString(0));
}
if(jtf6.getText().equals(""))
{
jtf6.setText(Integer.toString(0));
}
if(jtf8.getText().equals(""))
{
jtf8.setText(Integer.toString(0));
}
tot=Integer.parseInt(jtf4.getText())+Integer.parseInt(jtf6.getText())+Integer.parseInt(jtf8.getText());
JOptionPane.showMessageDialog(jf2,tot,"Total Amount",JOptionPane.WARNING_MESSAGE);
}
//***************************************Write************************
//************************FINISH I FRAME   SARAVANA BHAVAN*****************
//*******************dhosa Add Button**************
if(e.getSource()==jb18)
{
if(add4>=0)
{
add4++;
jtf9.setText(Integer.toString(add4));
}
else if(add4<0)
{
jtf9.setText(Integer.toString(0));
add4=Integer.parseInt(jtf9.getText());
}
else if(add4==0)
{
add4++;
jtf9.setText(Integer.toString(add4));
}
lab10=l8.getText();
//System.out.println("lab1="+lab1);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab11=rs.getString("Item");
cos6=rs.getInt("Price");
if(lab10.equals(lab11))
{
cos6=cos6*add4;
//System.out.println("cos="+cos);
jtf10.setText(Integer.toString(cos6));
}
}
}
catch(Exception e18)
{
System.out.println(e18);
}
}
//***********************************Cancel Button*******************************
else if(e.getSource()==jb19)
{
try
{
if(add4>0)
{
add4--;
//System.out.println("start="+add1);
jtf9.setText(Integer.toString(add4));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab12=rs.getString("Item");
cos7=rs.getInt("Price");
if(lab10.equals(lab12))
{
//System.out.println("add1="+add1);
cos7=cos7*add4;
//System.out.println("cos="+cos1);
jtf10.setText(Integer.toString(cos7));
}
}
}
}
catch(Exception e19)
{
System.out.println(e19);
}
}
//********************pizza   Add Button**************
if(e.getSource()==jb21)
{
if(add5>=0)
{
add5++;
jtf11.setText(Integer.toString(add5));
}
else if(add5<0)
{
jtf11.setText(Integer.toString(0));
add5=Integer.parseInt(jtf11.getText());
}
else if(add5==0)
{
add5++;
jtf11.setText(Integer.toString(add5));
}
lab13=l9.getText();
//System.out.println("lab4="+lab4);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab14=rs.getString("Item");
cos8=rs.getInt("Price");
if(lab13.equals(lab14))
{
cos8=cos8*add5;
//System.out.println("cos="+cos2);
jtf12.setText(Integer.toString(cos8));
}
}
}
catch(Exception e21)
{
System.out.println(e21);
}
}
//*******************************Cancel Button********************
else if(e.getSource()==jb22)
{
try
{
if(add5>0)
{
add5--;
//System.out.println("start="+add2);
jtf11.setText(Integer.toString(add5));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab15=rs.getString("Item");
cos9=rs.getInt("Price");
if(lab13.equals(lab15))
{
//System.out.println("add2="+add2);
cos9=cos9*add5;
//System.out.println("cos="+cos9);
jtf12.setText(Integer.toString(cos9));
}
}
}
}
catch(Exception e22)
{
System.out.println(e22);
}
}
//***********************************idli Add Button***************
if(e.getSource()==jb25)
{
if(add7>=0)
{
add7++;
jtf13.setText(Integer.toString(add7));
}
else if(add7<0)
{
jtf13.setText(Integer.toString(0));
add7=Integer.parseInt(jtf13.getText());
}
else if(add7==0)
{
add7++;
jtf13.setText(Integer.toString(add7));
}
lab16=l10.getText();
//System.out.println("lab7="+lab7);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab17=rs.getString("Item");
cos10=rs.getInt("Price");
if(lab16.equals(lab17))
{
cos10=cos10*add7;
//System.out.println("cos="+cos2);
jtf14.setText(Integer.toString(cos10));
}
}
}
catch(Exception e25)
{
System.out.println(e25);
}
}
//**************************Cancel Button***************************
else if(e.getSource()==jb26)
{
try
{
if(add7>0)
{
add7--;
//System.out.println("start="+add2);
jtf13.setText(Integer.toString(add7));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"balaji.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from bhavan");
while(rs.next())
{
lab18=rs.getString("Item");
cos11=rs.getInt("Price");
if(lab16.equals(lab18))
{
//System.out.println("add2="+add2);
cos11=cos11*add7;
//System.out.println("cos="+cos3);
jtf14.setText(Integer.toString(cos11));
}
}
}
}
catch(Exception e26)
{
System.out.println(e26);
}
}
//***************Final Answer Total Amount Submit Button**************************
if(e.getSource()==jb27)
{
t9=1;
if(jtf10.getText().equals(""))
{
jtf10.setText(Integer.toString(0));
}
if(jtf12.getText().equals(""))
{
jtf12.setText(Integer.toString(0));
}
if(jtf14.getText().equals(""))
{
jtf14.setText(Integer.toString(0));
}
tot1=Integer.parseInt(jtf10.getText())+Integer.parseInt(jtf12.getText())+Integer.parseInt(jtf14.getText());
JOptionPane.showMessageDialog(jf2,tot1,"Total Amount",JOptionPane.WARNING_MESSAGE);
}
//****************************************Finish Balaji bhavan Frame************************
//*******************************************Click submit Button*******************************
//******************************************Aachis Frame*************************************
if(e.getSource()==jb6)
{
t10=1;
if(jcb3.getSelectedItem().equals("Aachis"))
{
jf.setVisible(false);
jf1.setVisible(false);
jf2.setVisible(false);
jf3.setVisible(false);
//jf4.setVisible(true);
jf5.setVisible(false);
jf6.setVisible(false);
jf7.setVisible(false);
jb30 = new JButton(new ImageIcon("briyani.jpg"));  
jb30.setBounds(30,30,200,200);  
jf4.add(jb30); 
l11=new JLabel("briyani");
l11.setBounds(30,250,200,30);
l11.setBackground(Color.CYAN);
l11.setForeground(Color.BLACK);
l11.setOpaque(true);
l11.setFont(f); 
jf4.add(l11);
jb31=new JButton("ADD");
jb31.setBounds(250,150,100,30);
jb31.setFont(f);
jb31.setBackground(Color.BLACK);
jb31.setForeground(Color.WHITE);
jb31.addActionListener(this);
jf4.add(jb31);
jb32=new JButton("CANCEL");
jb32.setBounds(370,150,150,30);
jb32.setFont(f);
jb32.setBackground(Color.BLACK);
jb32.setForeground(Color.WHITE);
jb32.addActionListener(this);
jf4.add(jb32);
JButton jb33= new JButton(new ImageIcon("kabab.jpg"));  
jb33.setBounds(30,300,200,200);
jf4.add(jb33);
jb34=new JButton("ADD");
jb34.setBounds(250,400,100,30);
jb34.setFont(f);
jb34.setBackground(Color.BLACK);
jb34.setForeground(Color.WHITE);
jb34.addActionListener(this);
jf4.add(jb34);
jb35=new JButton("CANCEL");
jb35.setBounds(370,400,150,30);
jb35.setFont(f);
jb35.setBackground(Color.BLACK);
jb35.setForeground(Color.WHITE);
jb35.addActionListener(this);
jf4.add(jb35);
l12=new JLabel("kabab");
l12.setBounds(30,520,200,30);
l12.setBackground(Color.CYAN);
l12.setForeground(Color.BLACK);
l12.setOpaque(true);
l12.setFont(f); 
jf4.add(l12);
JButton jb36= new JButton(new ImageIcon("swarma.jpg"));  
jb36.setBounds(30,570,200,200);
jf4.add(jb36);
jb37=new JButton("ADD");
jb37.setBounds(250,670,100,30);
jb37.setFont(f);
jb37.setBackground(Color.BLACK);
jb37.setForeground(Color.WHITE);
jb37.addActionListener(this);
jf4.add(jb37);
jb38=new JButton("CANCEL");
jb38.setBounds(370,670,150,30);
jb38.setBackground(Color.BLACK);
jb38.setForeground(Color.WHITE);
jb38.setFont(f);
jb38.addActionListener(this);
jf4.add(jb38);
l13=new JLabel("shawarma");
l13.setBounds(30,780,200,30);
l13.setBackground(Color.CYAN);
l13.setForeground(Color.BLACK);
l13.setOpaque(true);
l13.setFont(f);
jf4.add(l13);
jb39=new JButton("SUBMIT");
jb39.setBounds(700,500,150,30);
jb39.setFont(f);
jb39.setBackground(Color.BLACK);
jb39.setForeground(Color.WHITE); 
jb39.addActionListener(this);
jf4.add(jb39);
jb40=new JButton("Back");
jb40.setBounds(900,500,100,30);
jb40.setBackground(Color.BLACK);
jb40.setForeground(Color.WHITE);
jb40.setFont(f);
jb40.addActionListener(this);
jf4.add(jb40);
jb52=new JButton("Exit");
jb52.setBounds(1100,500,100,30);
jb52.setBackground(Color.BLACK);
jb52.setForeground(Color.WHITE);
jb52.setFont(f);
jb52.addActionListener(this);
jf4.add(jb52); 
jtf15=new JTextField();
jtf15.setFont(f);
jtf15.setBackground(Color.CYAN);
jtf15.setForeground(Color.BLACK);
jtf15.setBounds(250,200,150,30);
jtf16=new JTextField();
jtf16.setFont(f);
jtf16.setBackground(Color.CYAN);
jtf16.setForeground(Color.BLACK);
jtf16.setBounds(250,250,150,30);
jtf17=new JTextField();
jtf17.setFont(f);
jtf17.setBackground(Color.CYAN);
jtf17.setForeground(Color.BLACK);
jtf17.setBounds(250,450,150,30);
jtf18=new JTextField();
jtf18.setFont(f);
jtf18.setBackground(Color.CYAN);
jtf18.setForeground(Color.BLACK);
jtf18.setBounds(250,500,150,30);
jtf19=new JTextField();
jtf19.setFont(f);
jtf19.setBackground(Color.CYAN);
jtf19.setForeground(Color.BLACK);
jtf19.setBounds(250,720,150,30);
jtf20=new JTextField();
jtf20.setFont(f);
jtf20.setBackground(Color.CYAN);
jtf20.setForeground(Color.BLACK);
jtf20.setBounds(250,770,150,30);
jf4.add(jtf15);
jf4.add(jtf16);
jf4.add(jtf17);
jf4.add(jtf18);
jf4.add(jtf19);
jf4.add(jtf20);
JLabel b10 = new JLabel(new ImageIcon("r2.jpg"));
jf4.getContentPane().add(b10);
jf4.pack();  
jf4.setVisible(true);
}
//*************************************Second Frame  Nandha_Mess*******************
else if(jcb3.getSelectedItem().equals("Nandha_Mess"))
{
jf.setVisible(false);
jf1.setVisible(false);
jf2.setVisible(false);
jf3.setVisible(false);
jf4.setVisible(false);
//jf5.setVisible(true);
//jf5.setTitle("nandha");
jf6.setVisible(false);
jf7.setVisible(false);
jb41 = new JButton(new ImageIcon("briyani.jpg"));  
jb41.setBounds(30,30,200,200);  
jf5.add(jb41); 
l14=new JLabel("briyani");
l14.setBounds(30,250,200,30);
l14.setBackground(Color.CYAN);
l14.setForeground(Color.BLACK);
l14.setOpaque(true);
l14.setFont(f); 
jf5.add(l14);
jb42=new JButton("ADD");
jb42.setBounds(250,150,100,30);
jb42.setFont(f);
jb42.setBackground(Color.BLACK);
jb42.setForeground(Color.WHITE);
jf5.add(jb42);
jb42.addActionListener(this);
jb43=new JButton("CANCEL");
jb43.setBounds(370,150,150,30);
jb43.setFont(f);
jb43.setBackground(Color.BLACK);
jb43.setForeground(Color.WHITE);
jf5.add(jb43);
jb43.addActionListener(this);
JButton jb44= new JButton(new ImageIcon("kabab.jpg"));  
jb44.setBounds(30,300,200,200);
jf5.add(jb44);
jb45=new JButton("ADD");
jb45.setBounds(250,400,100,30);
jb45.setFont(f);
jb45.setBackground(Color.BLACK);
jb45.setForeground(Color.WHITE);
jb45.addActionListener(this);
jf5.add(jb45);
jb46=new JButton("CANCEL");
jb46.setBounds(370,400,150,30);
jb46.setFont(f);
jb46.setBackground(Color.BLACK);
jb46.setForeground(Color.WHITE);
jb46.addActionListener(this);
jf5.add(jb46);
l15=new JLabel("kabab");
l15.setBounds(30,520,200,30);
l15.setBackground(Color.CYAN);
l15.setForeground(Color.BLACK);
l15.setOpaque(true);
l15.setFont(f); 
jf5.add(l15);
JButton jb47= new JButton(new ImageIcon("swarma.jpg"));  
jb47.setBounds(30,570,200,200);
jf5.add(jb47);
jb48=new JButton("ADD");
jb48.setBounds(250,670,100,30);
jb48.setFont(f);
jb48.setBackground(Color.BLACK);
jb48.setForeground(Color.WHITE);
jf5.add(jb48);
jb48.addActionListener(this);
jb49=new JButton("CANCEL");
jb49.setBounds(370,670,150,30);
jb49.setBackground(Color.BLACK);
jb49.setForeground(Color.WHITE);
jb49.setFont(f);
jb49.addActionListener(this);
jf5.add(jb49);
l16=new JLabel("shawarma");
l16.setBounds(30,780,200,30);
l16.setBackground(Color.CYAN);
l16.setForeground(Color.BLACK);
l16.setOpaque(true);
l16.setFont(f);
jf5.add(l16);
jb50=new JButton("SUBMIT");
jb50.setBounds(700,500,150,30);
jb50.setFont(f);
jb50.setBackground(Color.BLACK);
jb50.setForeground(Color.WHITE); 
jf5.add(jb50);
jb50.addActionListener(this);
jb51=new JButton("Back");
jb51.setBounds(900,500,100,30);
jb51.setBackground(Color.BLACK);
jb51.setForeground(Color.WHITE);
jb51.setFont(f);
jb51.addActionListener(this);
jf5.add(jb51);
jb52=new JButton("Exit");
jb52.setBounds(1100,500,100,30);
jb52.setBackground(Color.BLACK);
jb52.setForeground(Color.WHITE);
jb52.setFont(f);
jb52.addActionListener(this);
jf5.add(jb52); 
jtf21=new JTextField();
jtf21.setFont(f);
jtf21.setBackground(Color.CYAN);
jtf21.setForeground(Color.BLACK);
jtf21.setBounds(250,200,150,30);
jtf22=new JTextField();
jtf22.setFont(f);
jtf22.setBackground(Color.CYAN);
jtf22.setForeground(Color.BLACK);
jtf22.setBounds(250,250,150,30);
jtf23=new JTextField();
jtf23.setFont(f);
jtf23.setBackground(Color.CYAN);
jtf23.setForeground(Color.BLACK);
jtf23.setBounds(250,450,150,30);
jtf24=new JTextField();
jtf24.setFont(f);
jtf24.setBackground(Color.CYAN);
jtf24.setForeground(Color.BLACK);
jtf24.setBounds(250,500,150,30);
jtf25=new JTextField();
jtf25.setFont(f);
jtf25.setBackground(Color.CYAN);
jtf25.setForeground(Color.BLACK);
jtf25.setBounds(250,720,150,30);
jtf26=new JTextField();
jtf26.setFont(f);
jtf26.setBackground(Color.CYAN);
jtf26.setForeground(Color.BLACK);
jtf26.setBounds(250,770,150,30);
jf5.add(jtf21);
jf5.add(jtf22);
jf5.add(jtf23);
jf5.add(jtf24);
jf5.add(jtf25);
jf5.add(jtf26);
JLabel b10 = new JLabel(new ImageIcon("b4.jpg"));
jf5.getContentPane().add(b10);
jf5.pack();  
jf5.setVisible(true);
}
}
//*******************briyani   Add Button**************
if(e.getSource()==jb31)
{
if(add8>=0)
{
add8++;
jtf15.setText(Integer.toString(add8));
}
else if(add8<0)
{
jtf15.setText(Integer.toString(0));
add8=Integer.parseInt(jtf15.getText());
}
else if(add8==0)
{
add8++;
jtf15.setText(Integer.toString(add8));
}
lab19=l11.getText();
//System.out.println("lab1="+lab1);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab20=rs.getString("Item");
cos12=rs.getInt("Price");
if(lab19.equals(lab20))
{
cos12=cos12*add8;
//System.out.println("cos="+cos);
jtf16.setText(Integer.toString(cos12));
}
}
}
catch(Exception e31)
{
System.out.println(e31);
}
}
//************************************Cancel Button*****************************
else if(e.getSource()==jb32)
{
try
{
if(add8>0)
{
add8--;
//System.out.println("start="+add1);
jtf15.setText(Integer.toString(add8));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab21=rs.getString("Item");
cos13=rs.getInt("Price");
if(lab21.equals(lab19))
{
//System.out.println("add1="+add1);
cos13=cos13*add8;
//System.out.println("cos="+cos1);
jtf16.setText(Integer.toString(cos13));
}
}
}
}
catch(Exception e32)
{
System.out.println(e32);
}
}
//********************kabab   Add Button**************
if(e.getSource()==jb34)
{
if(add9>=0)
{
add9++;
jtf17.setText(Integer.toString(add9));
}
else if(add9<0)
{
jtf17.setText(Integer.toString(0));
add9=Integer.parseInt(jtf17.getText());
}
else if(add9==0)
{
add9++;
jtf17.setText(Integer.toString(add9));
}
lab22=l12.getText();
//System.out.println("lab4="+lab4);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab23=rs.getString("Item");
cos14=rs.getInt("Price");
if(lab22.equals(lab23))
{
cos14=cos14*add9;
//System.out.println("cos="+cos2);
jtf18.setText(Integer.toString(cos14));
}
}
}
catch(Exception e34)
{
System.out.println(e34);
}
}
//****************************************Cancel -Button********************
else if(e.getSource()==jb35)
{
try
{
if(add9>0)
{
add9--;
//System.out.println("start="+add2);
jtf17.setText(Integer.toString(add9));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab24=rs.getString("Item");
cos15=rs.getInt("Price");
if(lab22.equals(lab24))
{
//System.out.println("add2="+add2);
cos15=cos15*add9;
//System.out.println("cos="+cos3);
jtf18.setText(Integer.toString(cos15));
}
}
}
}
catch(Exception e35)
{
System.out.println(e35);
}
}
//***********************************Sharwarma - Add***************
if(e.getSource()==jb37)
{
if(add10>=0)
{
add10++;
jtf19.setText(Integer.toString(add10));
}
else if(add10<0)
{
jtf19.setText(Integer.toString(0));
add10=Integer.parseInt(jtf19.getText());
}
else if(add10==0)
{
add10++;
jtf19.setText(Integer.toString(add10));
}
lab25=l13.getText();
//System.out.println("lab7="+lab7);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab26=rs.getString("Item");
cos16=rs.getInt("Price");
if(lab25.equals(lab26))
{
cos16=cos16*add10;
//System.out.println("cos="+cos2);
jtf20.setText(Integer.toString(cos16));
}
}
}
catch(Exception e37)
{
System.out.println(e37);
}
}
//********************************************Cancel Button**********************
else if(e.getSource()==jb38)
{
try
{
if(add10>0)
{
add10--;
//System.out.println("start="+add2);
jtf19.setText(Integer.toString(add10));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"aachis.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from amess");
while(rs.next())
{
lab27=rs.getString("Item");
cos17=rs.getInt("Price");
if(lab25.equals(lab27))
{
//System.out.println("add2="+add2);
cos17=cos17*add10;
//System.out.println("cos="+cos3);
jtf20.setText(Integer.toString(cos17));
}
}
}
}
catch(Exception e38)
{
System.out.println(e38);
}
}
//***************Final Answer Total Amount Submit**************************
if(e.getSource()==jb39)
{
t11=1;
if(jtf16.getText().equals(""))
{
jtf16.setText(Integer.toString(0));
}
if(jtf18.getText().equals(""))
{
jtf18.setText(Integer.toString(0));
}
if(jtf20.getText().equals(""))
{
jtf20.setText(Integer.toString(0));
}
tot4=Integer.parseInt(jtf16.getText())+Integer.parseInt(jtf18.getText())+Integer.parseInt(jtf20.getText());
JOptionPane.showMessageDialog(jf2,tot4,"Total Amount",JOptionPane.WARNING_MESSAGE);
}
//*********************************Nandha Mess******************************
//*******************briyani   Add Button**************************************
if(e.getSource()==jb42)
{
if(add11>=0)
{
add11++;
jtf21.setText(Integer.toString(add11));
}
else if(add11<0)
{
jtf21.setText(Integer.toString(0));
add11=Integer.parseInt(jtf21.getText());
}
else if(add11==0)
{
jtf21.setText(Integer.toString(add11));
}
lab28=l14.getText();
//System.out.println("lab1="+lab1);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab29=rs.getString("Item");
cos18=rs.getInt("Price");
if(lab28.equals(lab29))
{
cos18=cos18*add11;
//System.out.println("cos="+cos);
jtf22.setText(Integer.toString(cos18));
}
}
}
catch(Exception e42)
{
System.out.println(e42);
}
}
//************************************Cancel Button*****************************
else if(e.getSource()==jb43)
{
try
{
if(add11>0)
{
add11--;
//System.out.println("start="+add1);
jtf21.setText(Integer.toString(add11));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab30=rs.getString("Item");
cos19=rs.getInt("Price");
if(lab28.equals(lab30))
{
//System.out.println("add1="+add1);
cos19=cos19*add11;
//System.out.println("cos="+cos1);
jtf22.setText(Integer.toString(cos19));
}
}
}
}
catch(Exception e43)
{
System.out.println(e43);
}
}
//********************kabab   Add Button**************
if(e.getSource()==jb45)
{
if(add12>=0)
{
add12++;
jtf23.setText(Integer.toString(add12));
}
else if(add9<0)
{
jtf17.setText(Integer.toString(0));
add9=Integer.parseInt(jtf17.getText());
}
else if(add12==0)
{
add12++;
jtf23.setText(Integer.toString(add12));
}
lab31=l15.getText();
//System.out.println("lab4="+lab4);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab32=rs.getString("Item");
cos22=rs.getInt("Price");
if(lab31.equals(lab32))
{
cos22=cos22*add12;
//System.out.println("cos="+cos2);
jtf24.setText(Integer.toString(cos22));
}
}
}
catch(Exception e45)
{
System.out.println(e45);
}
}
//****************************************Cancel -Button********************
else if(e.getSource()==jb46)
{
try
{
if(add12>0)
{
add12--;
//System.out.println("start="+add2);
jtf23.setText(Integer.toString(add12));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab33=rs.getString("Item");
cos23=rs.getInt("Price");
if(lab31.equals(lab33))
{
//System.out.println("add2="+add2);
cos23=cos23*add12;
//System.out.println("cos="+cos3);
jtf24.setText(Integer.toString(cos23));
}
}
}
}
catch(Exception e48)
{
System.out.println(e48);
}
}
//***********************************Sharwarma - Add***************
if(e.getSource()==jb48)
{
if(add13>=0)
{
add13++;
jtf25.setText(Integer.toString(add13));
}
else if(add13<0)
{
jtf25.setText(Integer.toString(0));
add13=Integer.parseInt(jtf25.getText());
}
else if(add13==0)
{
add13++;
jtf25.setText(Integer.toString(add13));
}
lab34=l16.getText();
//System.out.println("lab7="+lab7);
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab35=rs.getString("Item");
cos24=rs.getInt("Price");
if(lab34.equals(lab35))
{
cos24=cos24*add13;
//System.out.println("cos="+cos2);
jtf26.setText(Integer.toString(cos24));
}
}
}
catch(Exception e48)
{
System.out.println(e48);
}
}
//********************************************Cancel Button**********************
else if(e.getSource()==jb49)
{
try
{
if(add13>0)
{
add13--;
//System.out.println("start="+add2);
jtf25.setText(Integer.toString(add13));
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"nandha.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nandhamess");
while(rs.next())
{
lab36=rs.getString("Item");
cos25=rs.getInt("Price");
if(lab34.equals(lab36))
{
//System.out.println("add2="+add2);
cos25=cos25*add13;
//System.out.println("cos="+cos3);
jtf26.setText(Integer.toString(cos25));
}
}
}
}
catch(Exception e49)
{
System.out.println(e49);
}
}
//***************Final Answer Total Amount Submit**************************
if(e.getSource()==jb50)
{
t12=1;
if(jtf22.getText().equals(""))
{
jtf22.setText(Integer.toString(0));
}
if(jtf24.getText().equals(""))
{
jtf24.setText(Integer.toString(0));
}
if(jtf26.getText().equals(""))
{
jtf26.setText(Integer.toString(0));
}
tot5=Integer.parseInt(jtf22.getText())+Integer.parseInt(jtf24.getText())+Integer.parseInt(jtf26.getText());
JOptionPane.showMessageDialog(jf2,tot5,"Total Amount",JOptionPane.WARNING_MESSAGE);
}
//*****************************Finish Nandha Frame********************************
if(e.getSource()==jb52)
{
System.exit(0);
}
//**********************Create Button*******************************************
if(e.getSource()==jb2)
{
try
{
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");  // bridge
con=DriverManager.getConnection("jdbc:ucanaccess://"+"Rare.accdb");
st=con.createStatement();  
rs=st.executeQuery("select * from nazriya");
while(rs.next())
{
a=rs.getString("ID");
b=rs.getString("Password");
}

if(!a.equals(Id)&&!b.equals(Pw))
{
ps=con.prepareStatement("insert into nazriya(ID,Password) values(?,?)");
ps.setString(1,Id);
ps.setString(2,Pw);
int x=ps.executeUpdate();
if(x>0)
JOptionPane.showMessageDialog(jf,"Account Created!","Confirmation",JOptionPane.WARNING_MESSAGE);
else
JOptionPane.showMessageDialog(jf,"Account not Created!","Error",JOptionPane.WARNING_MESSAGE);
st.close();
con.close();
}
}
catch(Exception e2)
{
System.out.println(e2);
}
}
}
public static void main(String []args)throws Exception
{
new  FoodDeliveryApp();
}
}