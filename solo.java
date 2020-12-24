import java.util.*;
public class Program
{
static void play(String choice)
{
Random r=new Random();
    int user_score = 0,comp_score = 0,user_wickets = 0,comp_wickets = 0;
  String arr[]={"0","1","2","4","6","w"};
    if(choice.equals("bat"))
    {
  System.out.println("User batting: \n");
    for(int i=1;i<=5;i++)
    {
    System.out.print("over "+i+": ");
        for(int j=1;j<=6;j++)
        {
        if(user_wickets==5)
        {
            break;
        }
     String b=arr[r.nextInt(arr.length)];
       System.out.print(b+"|");
       if(b.equals("w"))
       user_wickets++;
       else
       user_score+=Integer.parseInt(b);
        }
        System.out.println("\nScore after "+i+" over: "+ user_score +"/"+ user_wickets+"\n" );
        if(user_wickets ==5)
        {
            break;
        }
    }
    System.out.println("\n");
    System.out.println("Computer batting:  \n");
    for(int i=1;i<=5;i++)
    {
    System.out.print("over "+i+": ");
        for(int j=1;j<=6;j++)
        {
        if(comp_wickets==5)
        {
            break;
        }
        if(comp_score > user_score )
       {
           break;
       }
     String b=arr[r.nextInt(arr.length)];
       System.out.print(b+"|");
       if(b.equals("w"))
       comp_wickets++;
       else
       comp_score+=Integer.parseInt(b);
       
        }
        System.out.println("\nScore after "+i+" over: "+ comp_score +"/"+ comp_wickets +"\n");
        if(comp_wickets ==5)
        {
            break;
        }
        if(comp_score > user_score )
       {
           break;
       }
    }}
    else if(choice.equals("bowl"))
    {
        System.out.println("Computer batting: \n");
    for(int i=1;i<=5;i++)
    {
    System.out.print("over "+i+": ");
        for(int j=1;j<=6;j++)
        {
        if(comp_wickets==5)
        {
            break;
        }
     String b=arr[r.nextInt(arr.length)];
       System.out.print(b+"|");
       if(b.equals("w"))
       comp_wickets++;
       else
       comp_score+=Integer.parseInt(b);
        }
        System.out.println("\nScore after "+i+" over: "+ comp_score +"/"+ comp_wickets +"\n");
        if(comp_wickets ==5)
        {
            break;
        }
    }
    System.out.println("\n");
    System.out.println("User batting:  \n");
    for(int i=1;i<=5;i++)
    {
    System.out.print("over "+i+": ");
        for(int j=1;j<=6;j++)
        {
        if(user_wickets==5)
        {
            break;
        }
        if(user_score > comp_score )
       {
           break;
       }
     String b=arr[r.nextInt(arr.length)];
       System.out.print(b+"|");
       if(b.equals("w"))
       user_wickets++;
       else
       user_score+=Integer.parseInt(b);
       
        }
        System.out.println("\nScore after "+i+" over: "+ user_score +"/"+ user_wickets+"\n" );
        if(user_wickets ==5)
        {
            break;
        }
        if(user_score > comp_score )
       {
           break;
       }
    }
    
    }
   if(user_score != comp_score )
   {
   if (comp_score < user_score)
   System.out.println("\nUser Wins😃😃🥳🥳");
   else if (user_score < comp_score)
   System.out.println("\nComputer Wins🙁🙁");
   System.out.println("\n\nHere is the trophy for the winner😁\n\n\n");
        String trophy =new String(Base64.getDecoder().decode("ICAgICAgICAgICAgIF9fX19fX19fX19fCiAgICAgICAgICAgICcuXz09Xz09Xz1fLicKICAgICAgICAgICAgLi1cOiAgICAgIC8tLgogICAgICAgICAgIHwgKHw6LiAgICAgfCkgfAogICAgICAgICAgICAnLXw6LiAgICAgfC0nCiAgICAgICAgICAgICAgXDo6LiAgICAvCiAgICAgICAgICAgICAgICc6Oi4gLicKICAgICAgICAgICAgICAgICApICgKICAgICAgICAgICAgICAgXy4nICcuXwogICAgICAgICAgICAgIGAiIiIiIiIiYA=="));
        System.out.println(trophy);
  }
   else
{
   System.out.println("\nDraw🙂🙂");
   }
}
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("You chose to "+a+"\n\n");
        play(a);
        
    }
}