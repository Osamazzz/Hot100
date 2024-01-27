package com.algorithm.obamazzz;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。
 * 可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 创建字符串键值对，k为排序后的字符串，v为一个list，用于存放String数组中的字母异位词
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] strArr = str.toCharArray();
            // 对字符数组进行排序，这样排序后，异位词都会变得一样
            Arrays.sort(strArr);
            String key = new String(strArr);
            // 在map中找是否有该字符串的异位词存在
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            // 更新map
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
