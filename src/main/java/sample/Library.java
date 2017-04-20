package sample;

import net.arnx.jsonic.JSON;
import java.util.Map;
import java.util.HashMap;

class Library {
    public static void main(String[] args) {
        try {
            Map<String, Object> hm = new HashMap<>();

            hm.put("001", "いちご");
            hm.put("002", "にかん");
            hm.put("003", "みかん");

            String json = JSON.encode(hm);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}
