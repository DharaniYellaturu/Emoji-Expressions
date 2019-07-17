import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Project2 extends Applet implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7;
public String str;
public void init()
{

b1=new Button("smile");
b2=new Button("sad");
b3=new Button("angry");
b4=new Button("wow");
b5=new Button("cry");
b6=new Button("love");
b7=new Button("end");
setBackground(Color.black);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
str=ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
Font fg=new Font("Arial",Font.ITALIC,20);
if(str=="smile")
{		g.setColor(Color.yellow);
g.fillOval(40,60,90,90);
g.setColor(Color.black);
g.fillOval(60, 90, 10, 10);
g.fillOval(100, 90, 10, 10);

g.fillArc(70,110,30,20,180,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("Hihi...I am Happy...",60,200);

g.setColor(Color.yellow);
g.fillOval(280,60,90,90);
g.setColor(Color.black);
g.fillOval(300, 90, 10, 10);
g.fillOval(340, 90, 10, 10);
g.fillArc(310,110,40,30,180,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("I am very Happy...",300,200);

g.setColor(Color.yellow);
g.fillOval(40,240,90,90);
g.setColor(Color.black);
g.fillOval(60,270,10,10);
g.fillOval(100,270,10,10);
g.drawArc(70,290,30,20,180,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("Smilyy..",40,380);

g.setColor(Color.yellow);
g.fillOval(400,240,90,90);
g.setColor(Color.black);
g.fillOval(420, 270, 10, 10);
g.fillOval(460, 270, 10, 10);
g.drawArc(430,290,30,20,180,180);
g.setColor(Color.white);
g.fillArc(430,290,30,20,180,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("lol..",400,380);




}
else if(str=="angry")
{
g.setColor(Color.red);
g.fillOval(70, 50, 150, 150);
g.setColor(Color.black);
g.fillOval(80, 100, 40, 20);
g.fillOval(160, 100, 40, 20);
g.drawArc(100,130,95,94,0,180);
g.drawArc(101,131,95,94,0,180);
g.setColor(Color.red);
g.setFont(fg);
g.drawString("Hmph....",70,220);

g.setColor(Color.yellow);
g.fillOval(430, 50, 150, 150);
g.setColor(Color.black);
g.fillOval(460,100, 20, 20);
g.fillOval(530, 100, 20, 20);
g.drawArc(460,130,95,94,0,180);
g.drawArc(461,131,95,94,0,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("shut up....",430,220);

g.setColor(Color.red);
g.fillOval(70,230, 150, 150);
g.setColor(Color.black);
g.fillOval(100, 280, 30, 30);
g.fillOval(170, 280, 30, 30);
g.drawArc(100,310,95,94,0,180);
g.drawArc(101,311,95,94,0,180);
g.setColor(Color.white);
g.fillOval(112, 292, 10, 10);
g.fillOval(182, 292, 10, 10);
g.setColor(Color.red);
g.setFont(fg);
g.drawString("Get out....",70,400);




}
else if(str=="sad")
{
g.setColor(Color.yellow);
g.fillOval(40,60,90,90);
g.setColor(Color.black);
g.fillOval(60, 90, 10, 10);
g.fillOval(100, 90, 10, 10);
g.fillArc(70,110,30,20,0,180);
g.setColor(Color.cyan);
g.setFont(fg);
g.drawString("Hmph..i am sad..",40,220);


	g.setColor(Color.yellow);
	g.fillOval(40,240,90,90);
	g.setColor(Color.black);
	g.fillArc(60,270,10,5,0,360);
	g.fillArc(100,270,10,5,0,360);
	g.fillArc(70,290,30,20,0,180);
	g.setColor(Color.cyan);
	g.setFont(fg);
	g.drawString("i am depressed",40,400);

g.setColor(Color.yellow);
g.fillOval(400,60,90,90);
g.setColor(Color.black);
g.fillOval(420, 90, 10, 10);
g.fillOval(460, 90, 10, 10);
g.drawArc(430,110,30,20,0,180);
g.setColor(Color.cyan);
g.setFont(fg);
g.drawString("feeling sad..",400,220);


}
else if(str=="wow")
{
g.setColor(Color.yellow);
g.fillOval(40,60,90,90);
g.setColor(Color.black);
g.fillOval(60, 90, 10, 10);
g.fillOval(100, 90, 10, 10);
g.fillOval(75,110,20,20);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("Oh My God...",40,200);

g.setColor(Color.yellow);
g.fillOval(40,240,90,90);
g.setColor(Color.black);
g.fillOval(60, 270, 20, 20);
g.fillOval(100,270, 20, 20);
g.fillOval(75,305,20,10);
g.setColor(Color.white);
g.fillOval(65,270,10,10);
g.fillOval(105,270,10,10);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("is it!!!",40,380);

g.setColor(Color.yellow);
g.fillOval(400,60,90,90);
g.setColor(Color.black);
g.fillOval(420, 90, 10, 20);
g.fillOval(390,45,5,10);
g.fillOval(460, 90, 10, 20);
g.fillOval(410,45,5,10);
g.fillOval(435,110,20,20);
g.setColor(Color.white);
g.fillOval(437,120,16,10);
g.setColor(Color.red);
g.setFont(fg);
g.drawString("wow.......",400,200);
}
else if(str=="cry")
{

g.setColor(Color.yellow);
g.fillOval(40,60,90,90);
g.setColor(Color.black);
g.fillOval(60, 90, 10, 10);
g.fillOval(100, 90, 10, 10);
g.fillArc(70,110,30,20,0,180);
g.setColor(Color.cyan);
g.drawLine(63,100,63,130);
g.drawLine(64,100,64,130);
g.drawLine(65,100,65,130);
g.drawLine(106,100,106,130);
g.drawLine(104,100,104,130);
g.drawLine(105,100,105,130);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("Hmmm....My Chocolate had gone..",10,200);

g.setColor(Color.yellow);
g.fillOval(400,60,90,90);
g.setColor(Color.black);
g.drawArc(420,90,10,10,0,180);
g.drawArc(460,90,10,10,0,180);
g.drawArc(430,110,30,20,0,180);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("leave me alone...",370,200);

g.setColor(Color.yellow);
g.fillOval(400,420,90,90);
g.setColor(Color.black);
g.fillArc(420,450, 10, 10,0,180);
g.fillArc(460, 450,10, 10,0,180);
g.fillArc(430,470,30,20,0,180);
g.setColor(Color.cyan);
g.drawLine(423,460,423,490);
g.drawLine(424,460,424,490);
g.drawLine(425,460,425,490);
g.drawLine(466,460,466,490);
g.drawLine(464,460,464,490);
g.drawLine(465,460,465,490);
g.setColor(Color.yellow);
g.setFont(fg);
g.drawString("im crying...",370,560);



}
else if(str=="love")
{
g.setColor(Color.yellow);
g.fillOval(40,60,90,90);
g.setColor(Color.black);
g.fillArc(70,110,30,20,180,180);
g.setColor(Color.red);
g.drawArc(60,85,10,10,0,180);
g.drawArc(70,85,10,10,0,180);
g.drawLine(60, 90,70, 100);
g.drawLine(70,100,80,90);
g.drawArc(95,85,10,10,0,180);
g.drawArc(105,85,10,10,0,180);
g.drawLine(95, 90,105, 100);
g.drawLine(105,100,115,90);
g.setColor(Color.pink);
g.setFont(fg);
g.drawString("Awww....",40,300);

/*
g.setColor(Color.white);
g.fillRect(440,110,100,80);
g.setColor(Color.red);
g.fillArc(420,80,10,10,0,180);
g.fillArc(430,80,10,10,0,180);
g.drawLine(490,140,470,160);
g.drawLine(470,160,450,180);
g.setColor(Color.pink);
g.setFont(fg);
g.drawString("love letter",400,300);
*/

}
else if(str=="end")
{
g.setColor(Color.green);
g.setFont(fg);
g.drawString("HOW LUCKY WE ARE TO HAVE SOMETHING ",250,300);
g.drawString("THAT MAKES SAYING GOOD BYE SO HARD....",250,350);
}


}
}

/*
<applet code=Project2.class width=800 height=800>
</applet>    */