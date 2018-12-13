package idv.mission.example.CacheTest.NoSpring;

public class Main {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        Account account1 = service.getAccountByName("Mission");
        Account account2 = service.getAccountByName("Mission");

        System.out.println("Before refresh the cache起");
        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);

        System.out.println("After refresh the cache起");
        service.clear();
        Account account3 = service.getAccountByName("Mission");
        System.out.println("account3 = " + account3);
    }
}
