package com.algorithm.obamazzz;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        // 如果字符串的长度为奇数，则不可能为有效的字符串
        if ((s.length() & 1) != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else {
                // 如果遇到了左括号以外的字符
                if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                    return false;
                }
                // 消去一个括号
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
