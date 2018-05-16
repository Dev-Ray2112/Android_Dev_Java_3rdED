package net.androidbootcamp.snapfitness.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();



    static {
        addItem(new DummyItem("1", "Web Site", "https://www.snapfitness.com/"));
        addItem(new DummyItem("2", "Info"));
        addItem(new DummyItem("3", "Photos"));

    }
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    public static class DummyItem {
        public String id;
        public String content;
        public String item_name;
        public String item_url;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        public DummyItem(String id, String item_name, String item_url) {
            this.id = id;
            this.item_name = item_url;
            this.item_url = item_name;
            content = item_name;
        }

        @Override
        public String toString () {
            return content;
        }

    }
}



