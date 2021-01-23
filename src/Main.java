public class Main {
    public static void main(String[] args) {
        int refill = 211;
        int clientAvG = 1000;
        int clientAv;
        if (refill >= 211) {
            int bonus = 18;
            int totalBonus = refill / bonus;
            int finalBonus = (int) totalBonus;
            System.out.println("Bonus: " + finalBonus);
            clientAv = clientAvG + refill;
            System.out.println("Client Av: " + clientAv);}
        else {
            clientAv = clientAvG + refill;
            System.out.println("Client Av: " + clientAv);
        }
    }
}