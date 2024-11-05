import java.util.*;
class Even extends Thread{
int num;
Even(int num){
this.num=num;
}
public void run(){
System.out.println("Square of"+num+"="+(num*num));
}
}
class Odd extends Thread{
int num;
Odd(int num){
this.num=num;
}
public void run(){
System.out.println("Cube of"+num+"="+(num*num*num)); }
}
class Multi extends Thread{
public void run(){
try{
Random R=new Random();
for(int i=0;i<10;i++){
int num=R.nextInt(100);
sleep(1000);
if(num%2==0){
new Even(num).start();
}
else{
new Odd(num).start();
}
}
}
catch(Exception e){
System.out.println(e);
}
}
}
class MultiThread{
public static void main(String args[]){ Multi M=new Multi();
M.start(); }
}

/*Square of68=4624
Cube of87=658503
Cube of71=357911
Square of28=784
Cube of77=456533
Square of4=16
Square of30=900
Square of92=8464
Cube of3=27
Square of8=64/* */