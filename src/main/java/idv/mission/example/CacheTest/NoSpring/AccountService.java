package idv.mission.example.CacheTest.NoSpring;

public class AccountService {
    private CacheManager<Account> cacheManager;

    public AccountService() {
        cacheManager = new CacheManager<Account>();
    }

    public Account getAccountByName(String name) {
        Account account = getFromCache(name);
        if( account == null ) {
            account = getFromDB(name);
            cacheManager.save(name, account);
        }
        return account;
    }

    public void clear() {
        cacheManager.clear();
    }

    private Account getFromCache(String name) {
        Account account = cacheManager.getValue(name);
        return account;
    }

    private Account getFromDB(String name) {
        int randomId = (int) (Math.random() * 100);
        Account account = new Account(randomId, name);
        return account;
    }
}