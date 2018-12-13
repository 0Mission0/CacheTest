package idv.mission.example.CacheTest.NoSpring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheManager<T> {
    private Map<String, T> cache = new ConcurrentHashMap<String, T>();

    public T getValue(Object key) {
        return cache.get(key);
    }

    public void save(String key, T value) {
        cache.put(key, value);
    }

    public void delete(String key) {
        if( cache.containsKey(key) ) {
            cache.remove(key);
        }
    }

    public void clear() {
        cache.clear();
    }

}
