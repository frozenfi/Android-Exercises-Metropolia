package com.example.lab06;

import java.util.ArrayList;
import java.util.List;

public class ListOfPresidents {
    private static final ListOfPresidents presidentInstance = new ListOfPresidents();

    public static ListOfPresidents getInstance() {
        return presidentInstance;
    }

    private List<President> presidents;

    private ListOfPresidents() {
        presidents = new ArrayList<President>();
        presidents.add(new President("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"));
        presidents.add(new President("Relander, Lauri Kristian", 1925, 1931, "Reissulasse"));
        presidents.add(new President("Svinhufvud, Pehr, Evind", 1931, 1937, "Ukko-Pekka"));
        presidents.add(new President("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"));
        presidents.add(new President("Ryti, Risto Heikki", 1940, 1944, "Nuorena Kustu Kalliokangas"));
        presidents.add(new President("Mannerheim, Carl Gustav", 1944, 1946, "Marski"));
        presidents.add(new President("Paasikivi, Juho Kusti", 1946, 1956, "Äkäinen ukko"));
        presidents.add(new President("Kekkonen, Urho Kaleva", 1956, 1982, "Pelimies"));
        presidents.add(new President("Koivisto, Mauno Henrik", 1982, 1994, "Manu"));
        presidents.add(new President("Ahtisaari, Martti Oiva", 1994, 2000, "Mahtisaari"));
        presidents.add(new President("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispressa"));
        presidents.add(new President("Niinistö, Sauli Väinämö", 2012, 2024, "Owner of Lennu, the First Dog"));
        presidents.add(new President("Bhandari, Bidhya devi", 2016, 2021, "First female president of Nepal"));

    }

    public List<President> getAllPresident() {
        return this.presidents;
    }

    public President getListOfPresidents(int indexOfPresident) {
        return this.presidents.get(indexOfPresident);
    }

    public void addPresident(President president) {
        this.presidents.add(president);
    }
}
