//A Java program to read and display at least 3 staff objects of all three categories.Designing a super class called Staff with details as StaffId, Name, Phone, Salary.

import java.util.Scanner;
class Staff {
int staffid;
long phone;
float salary;
String name;
public void accept() {
System.out.println(&quot;-------------------------------------&quot;);
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter Staff Id: &quot;);
staffid = scanner.nextInt();
System.out.print(&quot;Enter Name: &quot;);
name = scanner.next();
System.out.print(&quot;Enter Phone: &quot;);
phone = scanner.nextLong();
System.out.print(&quot;Enter Salary: &quot;);
salary = scanner.nextFloat();
}
void display() {
System.out.println(&quot;-------------------------------------&quot;);
System.out.println(&quot;Staff ID:&quot; + &quot; &quot; + staffid);
System.out.println(&quot;Staff Phone number:&quot; + &quot; &quot; + phone);
System.out.println(&quot;Staff Salary:&quot; + &quot; &quot; + salary);
System.out.println(&quot;Staff Name:&quot; + &quot; &quot; + name);
}
}
class Teaching extends Staff {
String domain;
String no_of_publications;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter Domain: &quot;);
domain = scanner.next();
System.out.print(&quot;Enter Number of Publications: &quot;);
no_of_publications = scanner.next();
System.out.println(&quot;-------------------------------------&quot;);
}
void Tdisplay() {
System.out.println(&quot;-------------------------------------&quot;);
System.out.println(&quot;Teaching Staff Details&quot;);
super.display();
System.out.println(&quot;Domain :&quot; + &quot; &quot; + domain);
System.out.println(&quot;No_of_publications:&quot; + &quot; &quot; + no_of_publications);
System.out.println(&quot;-------------------------------------&quot;);
}
}
class Technical extends Staff {
private String[] skills;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter Number of Skills: &quot;);
int n = scanner.nextInt();
skills = new String[n];
System.out.println(&quot;Enter Skills:&quot;);
for (int i = 0; i &lt; n; i++) {
skills[i] = scanner.next();
}
System.out.println(&quot;-------------------------------------&quot;);
}
void Tedisplay() {
System.out.println(&quot;-------------------------------------&quot;);
System.out.println(&quot;Technical Staff Details&quot;);
super.display();
System.out.println(&quot;Skills :&quot;);
for (int i = 0; i &lt; skills.length; i++) {
System.out.println(skills[i]);
System.out.println(&quot;\t&quot;);
}
System.out.println(&quot;-------------------------------------&quot;);
}
}
class Contract extends Staff {
int period;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter Period: &quot;);
period = scanner.nextInt();
System.out.println(&quot;-------------------------------------&quot;);
}
void Cdisplay() {
System.out.println(&quot;-------------------------------------&quot;);
System.out.println(&quot;Contract Staff Details&quot;);
super.display();
System.out.println(&quot;ContractPeriod:&quot; + &quot; &quot; + period + &quot;years&quot;);
System.out.println(&quot;-------------------------------------&quot;);
}
}
public class OopConcept {
public static void main(String[] args) {
Teaching t1 = new Teaching();
// Teaching t2 = new Teaching();
// Teaching t3 = new Teaching();
Technical te1 = new Technical();
// Technical te2 = new Technical();
// Technical te3 = new Technical();
Contract ct1 = new Contract();
// Contract ct2 = new Contract();
// Contract ct3 = new Contract();

System.out.println(&quot;Enter Details for Teaching Staff Member&quot;);
t1.accept();
// t2.accept();
// t3.accept();

System.out.println(&quot;Enter Details for Technical Staff Member&quot;);
te1.accept();
// te2.accept();
// te3.accept();

System.out.println(&quot;Enter Details for Contract Staff Member&quot;);
ct1.accept();
// ct2.accept();
// ct3.accept();

System.out.println(&quot;Details for Teaching Staff Member are&quot;);
t1.Tdisplay();
// t2.Tdisplay();
// t3.Tdisplay();

System.out.println(&quot;Details for Technical Staff Member are&quot;);
te1.Tedisplay();
// te2.Tedisplay();
// te3.Tedisplay();

System.out.println(&quot;Details for Contract Staff Member are&quot;);

ct1.Cdisplay();
// ct2.Cdisplay();
// ct3.Cdisplay();
}
}
