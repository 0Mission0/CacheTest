package idv.mission.example.CacheTest.Spring;

import org.springframework.cache.annotation.Cacheable;

public class AccountService {

    // @Cacheable(value = "accountCache")
    @Cacheable(value = "accountCache", key = "#name")
    public Account getFromCache(String name) {
        return getFromDB(name);
    }

    public Account getFromDB(String name) {
        int randomId = (int) (Math.random() * 100);
        Account account = new Account(randomId, name);
        return account;
    }
}