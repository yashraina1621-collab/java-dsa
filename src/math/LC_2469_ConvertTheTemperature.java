package math;

public class LC_2469_ConvertTheTemperature {
    /* Platform: LeetCode
 * Problem: 2469. Convert the Temperature
 * Difficulty: Easy
 * Topic: Math
     */

        public double[] convertTemperature(double celsius) {
            return new double[] {celsius + 273.15, celsius * 1.8 + 32.00};
        }
    }
