public class Codec {
    Map<String, String> map = new HashMap<>();
    String base = "http://tinyurl.com/";

    public String encode(String longUrl) {
        String key = String.valueOf(longUrl.hashCode()); // simple hash
        String shortUrl = base + key;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));