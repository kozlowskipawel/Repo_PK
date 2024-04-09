public class Zadanie {
    
    public static void main(String[] args) {
        int n = 100;
        boolean[] pierwsze = new boolean[n + 1];//tworzenie tablicy
        
        sito(pierwsze);
        wyswietl(pierwsze);
    }
    
    static void sito(boolean[] pierwsze) {
        int n = pierwsze.length - 1;
        double sqrtN = Math.sqrt(n);
        
        // Inicjalizacja tablicy
        for (int i = 0; i <= n; i++) {
            pierwsze[i] = true;
        }
        
        // sortowanie sitem Eratostenesa
        for (int i = 2; i <= sqrtN; i++) {
            if (pierwsze[i]) {
                for (int j = i * i; j <= n; j += i) {
                    pierwsze[j] = false;
                }
            }
        }
    }
    
    static void wyswietl(boolean[] pierwsze) {
        System.out.println("Liczby pierwsze od  2 do 100:");
        for (int i = 2; i < pierwsze.length; i++) {
            if (pierwsze[i]) {
                System.out.print(i + ",");
            }
        }
    }
}