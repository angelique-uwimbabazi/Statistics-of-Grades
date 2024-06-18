import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students in total");
       int n = scanner.nextInt();
       int[] scores = new int[n];
       for (int i = 0; i < n; i++) {
           System.out.print("Enter score for student " + (i + 1) + ": ");
           scores[i] = scanner.nextInt();
       }
       int []stats = new int[5];
       for(int score : scores) {
           if(score > 80) {
               stats[4]++;
           } else if(score >=61) {
               stats[3]++;
           } else if (score>=41) {
               stats[2]++;

           } else if (score>=21) {
               stats[1]++;
           } else  {
               stats[0]++;
           }

       }
        System.out.println("Number of grades in each range:");
        System.out.println("0-20: " + stats[0]);
        System.out.println("21-40: " + stats[1]);
        System.out.println("41-60: " + stats[2]);
        System.out.println("61-80: " + stats[3]);
        System.out.println("Above 80: " + stats[4]);
       for (int i = 0; i < n; i++) {
           System.out.println(scores[i]);
       }
       int max = scores[0];
       int min = scores[0];
       int sum = scores[0];
       for (int i = 1; i < n; i++) {
           if (scores[i] > max) {
               max = scores[i];
           }
           if (scores[i] < min) {
               min = scores[i];
           }
           sum = sum + scores[i];
       }
      double average =( double ) sum / n;
        // Print the maximum, minimum, and average scores
        System.out.println("The maximum grade is " + max);
        System.out.println("The minimum grade is " + min);
        System.out.println("The average grade is " + average);

        // Print the bar graph
        System.out.println("\nGraph:\n");

        // Determine the maximum value in stats array for the graph scale
        int maxCount = 0;
        for (int count : stats) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        for (int i = maxCount; i > 0; i--) {
            System.out.print("   " + i + "  >");
            for (int stat : stats) {
                if (stat >= i) {
                    System.out.print("   #######");
                } else {
                    System.out.print("          ");
                }
            }
            System.out.println();
        }

        System.out.println("      +-----------+---------+---------+---------+---------+");
        System.out.println("      I    0-20   I  21-40  I  41-60  I  61-80  I  81-100 I");
    }
    }