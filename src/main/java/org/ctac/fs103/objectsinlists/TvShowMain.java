package org.ctac.fs103.objectsinlists;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShowList = new ArrayList<>();

        while (true) {
            System.out.println("Name of the show:");
            String name = scanner.nextLine();

            if (name.equals("")) break;

            System.out.println("How many episodes?");
            int numEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            tvShowList.add(new TvShow(name, numEpisodes, genre));
        }

        if (tvShowList.size() > 0) {
            for (TvShow show : tvShowList) {
                System.out.println(show.toString());
            }
        } else {
            System.out.println("There are no tv shows in the list.");
        }
    }
}
