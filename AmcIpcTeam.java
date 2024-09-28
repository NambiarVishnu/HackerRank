import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AmcIpcTeam {

    public static int[] acmTeam(String[] topic) {

        int n = topic.length;
        BigInteger[] bi = new BigInteger[n];

        for (int i = 0; i < n; i++)
            bi[i] = new BigInteger(topic[i], 2);

        int maxTopic = 0;
        int teamCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger iuj = bi[i].or(bi[j]);
                int bitCount = iuj.bitCount();
                if (bitCount > maxTopic) {
                    maxTopic = bitCount;
                    teamCount = 1;
                } else if (bitCount == maxTopic) {
                    teamCount++;
                }
            }
        }

        int result[] = { maxTopic, teamCount };
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for (int topic_i = 0; topic_i < n; topic_i++) {
            topic[topic_i] = in.next();
        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
        System.out.println("");

        in.close();
    }
}
