package alg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Class3 {

    private static List<Double> movingAverage(int n, List<Integer> arr, int windowSize) {
        List<Double> list = new ArrayList<>();
        double sum = 0;

        for (int i = 0; i < windowSize; i++) {
            sum += arr.get(i);
        }
        list.add(sum / windowSize);

        for (int i = 1; i <= n - windowSize; i++) {
            sum -= arr.get(i - 1);
            sum += arr.get(i + windowSize - 1);
            list.add(sum / windowSize);
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = readInt(reader);
            List<Integer> arr = readList(reader);
            int windowSize = readInt(reader);
            List<Double> result = movingAverage(n, arr, windowSize);
            for (double elem : result) {
                writer.write(elem + " ");
            }
        }
    }


    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());
    }
}
