package com.leetcode;

/**
 * Created by qiudeyang on 11/06/17.
 */
class StringIterator {
    char[] cs;
    int i;
    int rep;
    char ch;

    public StringIterator(String compressedString) {
        cs = compressedString.toCharArray();
    }

    public char next() {
        if (rep > 0) {
            rep--;
            return ch;
        } else if (i < cs.length) {
            ch = cs[i];
            int j = i + 1;
            while (j < cs.length && Character.isDigit(cs[j])) {
                rep = rep * 10 + cs[j] - '0';
                j++;
            }
            rep--;
            i = j;
            return ch;
        } else {
            return ' ';
        }
    }

    public boolean hasNext() {
        return rep > 0 || i < cs.length;
    }
}

public class DesignCompressedStringIterator {
    public static void main(String[] args) {
        StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
