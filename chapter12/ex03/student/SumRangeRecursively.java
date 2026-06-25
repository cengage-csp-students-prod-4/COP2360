import java.util.Scanner;
public class SumRangeRecursively{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    int[] numbers = {3, 5, 7, 4, 2, 9, 8, 2, 1, 6,
                     7, 4, 5, 6, 3, 8, 3, 6, 9, 1};

                     int start;
                     int end;

                     do
                     {
                        System.out.print("Enter a start position >> ");
                        start = input.nextInt();
                     } while(start < 0 ? true : start >= numbers.length);

                     do
                     {
                        System.out.print("Enter an end position >> ");
                        end = input.nextInt();
                     }
                     while(end < start ? true : end >= numbers.length);

                     System.out.print("The values in the sublist are: ");
                     for(int i = start; i <= end; i++)
                     {
                        System.out.print(numbers[i] + " ");
                     }
                     System.out.println();
                     int sum = sumRange(numbers, start, end);

                     System.out.println("The sum of all the numbers between position " + start + " and position " + end + " is " + sum);
                    }
                    public static int sumRange(int[] array, int start, int end)
                    {
                        if(start > end)
                            return 0;  
                        else
                            return array[start] + sumRange(array, start + 1, end);                
                          }

}
