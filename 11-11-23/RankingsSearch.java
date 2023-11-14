import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RankingsSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Contestant> contestants = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int score = Integer.parseInt(data[1]);
            contestants.add(new Contestant(name, score));
        }

        Collections.sort(contestants);

        // NOTE: this failed when testing but it does satify the given testcase for the
        // problem
        // Adding sorted names to arraylist
        ArrayList<String> nameList = new ArrayList<>();

        for (Contestant eachContestant : contestants) {
            nameList.add(eachContestant.name);
        }

        // Asking for amount of queries
        int queryAmount = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < queryAmount; i++) {
            resultList.add(nameList.indexOf(scanner.nextLine()) + 1);
        }

        for (Integer eachIndex : resultList) {
            System.out.println(eachIndex);
        }

        scanner.close();

    }
}

final class Contestant implements Comparable<Contestant> {
    String name;
    int score;

    public Contestant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Contestant other) {
        // Compare contestants by score in descending order
        int scoreComparison = Integer.compare(other.score, this.score);
        if (scoreComparison != 0) {
            return scoreComparison;
        }
        // In case of a tie, compare contestants by name alphabetically
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}
