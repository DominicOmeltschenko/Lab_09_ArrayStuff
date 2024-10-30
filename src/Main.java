import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner pipe = new Scanner(System.in);
        int val = rnd.nextInt(100) + 1;
        int[] dataPoints;
        dataPoints = new int[100];
        double average = 0.00;
        double sum = 0.00;
        int valueToFind = 0;
        int sameAsValue = 0;
        boolean valueFound = false;
        int low = 0;
        int high = 100;

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = val;
            val = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.println("Location:"+ i + " " + dataPoints[i]);
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
            average = sum / dataPoints.length;

        }
        System.out.println();
        System.out.println("The average of the random Array dataPoints is: " + average + " and the sum is: " + sum);

        valueToFind = SafeInput.getRangedInt(pipe, "Enter an integer" + " [" + low + "-" + high + "]", low, high);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == valueToFind)
            {
                sameAsValue += 1;
            }
        }
        System.out.println("The number " + valueToFind + " was found " + sameAsValue + " times in the random array");

        valueToFind = SafeInput.getRangedInt(pipe, "Enter an integer" + " [" + low + "-" + high + "]", low, high);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == valueToFind)
            {
                valueFound = true;
                System.out.println("The value " + valueToFind + " was found at array index " + i + " in the random array");
                break;
            }
        }
        if (!valueFound)
        {
            System.out.println("That value was not found anywhere in the array index");
        }
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++)
        {

            if (dataPoints[i] < minValue)
            {
                minValue = dataPoints[i];
            }
            else if (dataPoints[i] > maxValue)
            {
                maxValue = dataPoints[i];
            }

        }

        System.out.println("the minimum value found in the index is " + minValue + " and the maximum value found in the index is " + maxValue);

        System.out.println("The average of the data points is: " + getAverage(dataPoints));
    }


    public static double getAverage(int values[])
    {
        double average = 0;
        double sum = 0;
        {
            for (int i = 0; i < values.length; i++)
            {
                sum += values[i];
                average = sum / values.length;

            }
        }
        return average;
    }

}