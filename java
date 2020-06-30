import java.io.*;
public class namestyler_Part2
{

public static void main(String args [])throws IOException
{

String S;
int N;
char ch;
char c;
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
S=br.readLine();
S=S.toUpperCase();
System.out.println("Hi "+S+ " Nice to meet you. Such a nice name you have😊🤗. Pls hit a like button");
N=S.length();
System.out.println();
System.out.println();
for(int i=0;i<N;i++)
{
ch=S.charAt(i);
switch(ch)
{
case 'A':
System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n\n");

System.out.println();System.out.println();
break;
case 'B':
System.out.println("..000000..\n..#....#..\n..#000#...\n..#....#..\n..000000..\n\n");
System.out.println();
System.out.println();
  break;
  case 'C':
System.out.println("..000000..\n..#.......\n..#.......\n..#.......\n..000000..\n\n");
System.out.println();
System.out.println();
break;
case 'D':
System.out.println("..00000...\n..#....#..\n..#....#..\n..#....#..\n..00000...\n\n");
System.out.println();
System.out.println();
break;
case 'E':
System.out.println("..000000..\n..#.......\n..#000#...\n..#.......\n..000000..\n\n");
System.out.println();System.out.println();
break;
case 'F':
System.out.println("..000000..\n..#.......\n..#000#...\n..#.......\n..#.......\n\n"); System .out.println();
System.out.println ();
break;

case'G':
System.out.println("..000000..\n..#.......\n..#000#...\n..#....#..\n..#000#...\n\n"); System.out.println();
System.out.println();
break;

case 'H':
System.out.println("..#....#..\n..#....#..\n..000000..\n..#....#..\n..#....#..\n\n");
System.out.println();
System.out.println();
break;
 
 case 'I':

System.out.println("..000000..\n....##....\n....##....\n....##....\n..000000..\n\n");
System.out.println();
System.out.println();

break;

case 'J':

System.out.println("..000000..\n....##....\n....##....\n..#.##....\n..#00#....\n\n");
System.out.println();
System.out.println();
break;

case 'K':

System.out.println("..0...#...\n..0..#....\n..0#......\n..0..#....\n..0...#...\n\n");
System.out.println();
System.out.println();

break;

case 'L':

System.out.println("..0.......\n..#.......\n..0.......\n..#.......\n..000000..\n\n");
System.out.println();
System.out.println();
break;

case 'M':

System.out.println("..#....0..\n..#0..#0..\n..#.0#.0..\n..#....0..\n..#....0..\n\n");
System.out.println();
System.out.println();

break;

case 'N':

System.out.println("..#....0..\n..#0...#..\n..0.#..0..\n..0..#.0..\n..#...0#..\n\n");
System.out.println();
System.out.println();

break;

case 'O':

System.out.println("..000000..\n..#....#..\n..#....#..\n..#....#..\n..000000..\n\n");
System.out.println();
System.out.println();

break;

case 'P':

System.out.println("..000000..\n..#....#..\n..000000..\n..#.......\n..#.......\n\n");
System.out.println();
System.out.println();

break;

case 'Q':

System.out.println("..000000..\n..#....0..\n..#.0..#..\n..0..#.#..\n..000000..\n\n");
System.out.println();
System.out.println();

break;

case 'R':

System.out.println("..000000..\n..#....#..\n..#.00...\n..#...#...\n..0....0..\n\n");
System.out.println();
System.out.println();

break;

case 'S':

System.out.println("..000000..\n..#.......\n..000000..\n.......#..\n..000000..\n\n");
System.out.println();
System.out.println();

break;

case 'T':

System.out.println("..00000p..\n....##....\n....00....\n....##....\n....00....\n\n");
System.out.println();System.out.println();

break;

case 'U' :


System.out.println("..0....0..\n..#....#..\n..0....0..\n..#....#..\n..000000..\n\n");
System.out.println();System.out.println();
break;

case 'V':

System.out.println("..#....0..\n..#....0..\n..#....0..\n...#..0...\n....##....\n\n");
System.out.println();System.out.println();

break;

case 'W':

System.out.println("..#....#..\n..0....0..\n..#.##.#..\n..00..00..\n..#....#..\n\n");
System.out.println();System.out.println();

break;

case 'X':
System.out.println("..0....0..\n...#..#...\n....00....\n...#..#...\n..0....0..\n\n");
System.out.println();System.out.println();
break;

case 'Y':
System.out.println("..0....0..\n...#..#...\n....00....\n....##....\n....00....\n\n"); System.out.println();System.out.println();

break;

case 'Z':

System.out.println("..000000..\n......#...\n.....#....\n....#.....\n..000000..\n\n");
System.out.println();
System.out.println();
break;
}}
System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
System.out.println( S +" Hope you love the code. Please hit an upvote and follow me");
System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
System.out.println(S + " Stay Home, Stay Safe💫🗡️");
}}

