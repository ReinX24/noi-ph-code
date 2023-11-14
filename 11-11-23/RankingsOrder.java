import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingsOrder {
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

        for (Contestant contestant : contestants) {
            System.out.println(contestant);
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
