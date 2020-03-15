public class MinimumReplacementsToOne
{
//Function to calculate minimum number of replacements needed to make given number to 1
public static int minimumReplacements(int number)
{
//count of replacements
int replacements=0;

//if number is 0, 1 is added and replaced-it takes one replacement
if(number==0)
return 1;

//perform replacements till number>1
while(number>1)
{

//checks if number is even
if(number&1==0)
{
number/=2;
}
else
{
number-=1;
}
replacements+=1;
}
return replacements;
}
public static void main(String args[])
{
 int[] inputvalues = new int[5];
        int expectedout[] = new int[5];
        int errors = 0 ;

        //test cases: Input values
        
        //testcase:1
        inputvalues[0]=8;
        expectedout[0]=3;
        
        //testcase:2
       inputvalues[1]=14;
        expectedout[1]=5;
        
        //testcase:3
        inputvalues[2]=0;
        expectedout[2]=1;
        
        //testcase:4
        inputvalues[3]=1;
        expectedout[3]=0;
        
        //testcase:5
        inputvalues[4]=2;
        expectedout[4]=1;


        for (int i=0; i<5; i++)
        {

            if(expectedout[i] != minimunReplacements(inputvalues[i]))
            {
                errors++;
            }
        }
      if(errors>0)
        {
            System.out.println(errors + " Errors");
        }
        else
        {
            System.out.println("Passed all cases");
        }
        }
        }
