import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plakatowanie {
    public static void main(String[] args) {
        int p=0;
        Scanner scanner = new Scanner(System.in);
        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++)
        {
            width.add(scanner.nextInt());
            height.add(scanner.nextInt());
        }

        List<Integer> posterLength = new ArrayList<>();

        for(int i=0;i<n;i++) {
            while(!posterLength.isEmpty() && posterLength.get(posterLength.size()-1) > height.get(i))posterLength.remove(posterLength.size()-1);

            if (posterLength.isEmpty() || posterLength.get(posterLength.size()-1) < height.get(i)){
                posterLength.add(height.get(i));
                p++;
            }
        }
        System.out.println(p);
    }
}
