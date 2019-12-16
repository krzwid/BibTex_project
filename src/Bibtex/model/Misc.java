package Bibtex.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Misc extends Entry {

    public Map<String, String> fieldMap = new HashMap<>();

    //private static String name = "MISC";

    public Misc() {
        super.name = "MISC";
    }

    @Override
    public List<String> getRequiredFields() {
        return Arrays.asList("");
    }

    @Override
    public List<String> getOptionalFields() {
        return Arrays.asList("author", "title", "howpublished", "month", "year", "note", "key");
    }
}
