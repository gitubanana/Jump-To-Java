### 형 변환
```java
public class HelloWorld {
    public static void main(String[] args) {
        /* 문자열 -> 정수 */
        {
            String num = "123";
            int n = Integer.parseInt(num);
            System.out.println(n); // 123
        }

        /* 정수 -> 문자열 */
        {
            int n = 123;
            String num = "" + n;
            String num1 = String.valueOf(n);
            String num2 = Integer.toString(n);
            System.out.println(num); // 123
            System.out.println(num1); // 123
            System.out.println(num2); // 123
        }

        /* 정수 <-> 실수 */
        {
            int n1 = 123;
            double d1 = n1; // 캐스팅이 필요없다.
            System.out.println(d1); // 123.0

            double d2 = 123.456;
            int n2 = (int) d2; // 실수를 정수로 바꿀 때는 캐스팅해줘야 한다.
            System.out.println(n2); // 123
        }
    }
}
```
> 실수는 `Double.parseDouble`이나 `Float.parseFloat`을 이용해 형 변환할 수 있다.<br>
> ~~나는 우리 형이 좋기 때문에, 형 변환은 안 한다...~~

### final
자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드이다.<br>
값을 한 번 설정하면 그 값을 다시 설정할 수 없다.<br>
> `C/C++`의 `const`와 비슷한 거 같다.
```java
public class Sample {
    public static void main(String[] args) {
        final int n = 123;  // final로 설정하면 값을 바꿀 수 없다.
        n = 456;  // 컴파일 오류 발생
    }
}
```

### Reference
[03-11 형 변환과 final](https://wikidocs.net/158529)<br>
