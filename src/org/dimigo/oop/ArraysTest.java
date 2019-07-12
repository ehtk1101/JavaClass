package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울", "의왕", "시흥", "남양주"};

        // 배열 출력
        System.out.println(Arrays.toString(src));

        // 배열 복사
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        System.out.println(src == dest);
        System.out.println(Arrays.equals(src, dest));

        // 배열 정렬
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        // 배열 검색 (정렬을 먼저 해야함)
        System.out.println(Arrays.binarySearch(dest, "서울"));

    }
}
