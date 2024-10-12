package utilities;

import redis.clients.jedis.Jedis;

public class RedisUtil {
    private static final Jedis jedis = new Jedis("localhost");

    public static String getData(String key) {
        return jedis.get(key);
    }

    public static void setData(String key, String value) {
        jedis.set(key, value);
    }
}
