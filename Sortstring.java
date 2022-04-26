import java.io.*;
import java.util.*;
class Sortstring{
public static void main(String args[])throws IOException
{
int n,i,j,m;
String temp;
Scanner sr=new Scanner(System.in);
System.out.println("Enter the No. of names:");
n=sr.nextInt();
m=n+1;
String names[]=new String[m];
System.out.println("Enter the names:");
for(i=0;i<m;i++){
names[i]=sr.nextLine();
}
for(i=0;i<m;i++){
for(j=i+1;j<m;j++){
if(names[i].compareTo(names[j])>0){
temp=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
System.out.print("The names are:");
for(i=0;i<m;i++){
System.out.println(names[i]);
}
}
}
