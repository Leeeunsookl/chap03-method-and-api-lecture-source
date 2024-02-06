package com.ojiraffers.section03.math;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* 필기.
        *   난수의 활용
        *   Math.random() 을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수를 반환한다.
        *   필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재한다.
        *   */

        /* 필기.
        *   원하는 범위의 난수를 구하는 공식
        *   (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값
        *   */

        /* 목차. 1. 0 ~ 9 까지의 난수 발생 */
        // 0- 0.999999
        // 0 - 9.99999
        // 0-9
        int random1 = (int)(Math.random()*10);      //Math 앞에 괄호를 치는 이유는 0~0.999999를 정수형으로 만들어서 0이 나와버리기 때문
        System.out.println("random1 = " + random1);

        /* 목차. 2. 1 ~ 10 까지의 난수 발생 */

        int random2 = (int)(Math.random()*10)+1;
        System.out.println("random2는 "+ random2);

        /* 목차. 3. 10 ~ 15 까지의 난수 발생 */
        int random3 = (int)(Math.random()*6)+10;
        System.out.println("random3는 "+ random3);

        /* 목차. 4. -128 ~ 127 까지의 난수 발생 */
        int random4 = (int)(Math.random()*256)-128;
        // 0을 카운트 하기 때문에
        // 0 - 255
        System.out.println("random4는 " + random4);

    }

}
