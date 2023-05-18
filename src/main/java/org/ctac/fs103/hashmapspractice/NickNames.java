package org.ctac.fs103.hashmapspractice;

import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println("Matthew's nickname is " + nicknames.get("matthew"));
    }
}
