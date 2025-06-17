public class Main {

    public static void main(String[] args) {

        String[] daftarKota = {
                "Paris (France)", "Brussels (Belgium)", "Zurich (Switzerland)", "Amsterdam (Netherlands)", "Vienna (Austria)",
                "Prague (Czechia / Republik Ceko)", "Hamburg (Jerman)", "Warsaw (Poland)", "Budapest (Hungary)"
        };

        AdjacencyList map = new AdjacencyList(daftarKota.length);

        for (String kota : daftarKota) {
            map.tambahKota(kota);
        }

        map.tambahJalur("Paris (France)", "Brussels (Belgium)");
        map.tambahJalur("Paris (France)", "Zurich (Switzerland)");
        map.tambahJalur("Brussels (Belgium)", "Zurich (Switzerland)");
        map.tambahJalur("Brussels (Belgium)", "Amsterdam (Netherlands)");
        map.tambahJalur("Zurich (Switzerland)", "Vienna (Austria)");
        map.tambahJalur("Zurich (Switzerland)", "Prague (Czechia / Republik Ceko)");
        map.tambahJalur("Amsterdam (Netherlands)", "Prague (Czechia / Republik Ceko)");
        map.tambahJalur("Vienna (Austria)", "Prague (Czechia / Republik Ceko)");
        map.tambahJalur("Amsterdam (Netherlands)", "Hamburg (Jerman)");
        map.tambahJalur("Hamburg (Jerman)", "Prague (Czechia / Republik Ceko)");
        map.tambahJalur("Hamburg (Jerman)", "Warsaw (Poland)");
        map.tambahJalur("Prague (Czechia / Republik Ceko)", "Warsaw (Poland)");
        map.tambahJalur("Vienna (Austria)", "Budapest (Hungary)");
        map.tambahJalur("Budapest (Hungary)", "Warsaw (Poland)");

        System.out.println();
        map.bfs("Paris (France)");
        System.out.println();
        map.dfs("Paris (France)");
    }
}