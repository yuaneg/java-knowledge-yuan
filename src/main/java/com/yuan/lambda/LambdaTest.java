package com.yuan.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** lambda
 * Created by 袁恩光 on 2017/4/19.
 */
public class LambdaTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "yuaneg");
        map.put("gender", "男");
        map.put("age", "18");
        map.forEach((String K, Object V) -> {
            if (K.equals("gender")) {
                System.out.println(V);
            }
        });

        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("gender");
        list.add("age");
        list.forEach((String value) -> {
            System.out.println(value);
        });
        list.forEach(value -> System.out.println(value));
    }


}
