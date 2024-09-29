`Java 8`부터 함수형 프로그래밍을 지원하기 위해 `람다(lambda)`와 `스트림(stream)`이 도입되었다.<br>
람다와 스트림을 사용하면, 작성하는 코드의 양이 줄어들고 읽기 쉬운 코드를 만들 수 있다.<br>

### 함다
`람다(lambda)`는 `익명 함수(anonymous function)`를 의미한다.<br>
- **일반적인 코드**<br>
  ```java
  interface Calculator {
    int sum(int a, int b);
  }
  
  class MyCalculator implements Calculator {
      public int sum(int a, int b) {
          return a + b;
      }
  }
  
  public class Main {
      public static void main(String[] args) {
          MyCalculator mc = new MyCalculator();
          int result = mc.sum(3, 4);
          System.out.println(result); // 7
      }
  }
  ```
- **람다를 적용한 코드**<br>
  ```java
  @FunctionalInterface
  interface Calculator {
      int sum(int a, int b);
  
  //    int mul(int a, int b); // FunctionalInterface는 하나의 메서드만 가져야 한다.
  }
  
  public class Main {
      public static void main(String[] args) {
          Calculator mc = (int a, int b) -> a+b; // -> 앞이 입력값이고, 뒤가 리턴값을 의미한다.
          int result = mc.sum(3, 4);
          System.out.println(result); // 7
      }
  }
  ```
  > 일반적인 코드보다 훨씬 간단해졌다.
> [!NOTE]
> 인터페이스의 메서드가 2개 이상이라면, 람다 함수를 사용할 수 없다.<br>
> `@FunctionalInterface`어노테이션을 사용하면, 단 하나의 메서드만 가질 수 있게 한다.
- **람다 축약하기**<br>
  위 코드에서 인터페이스 메서드에 대한 타입이 정해져 있기 때문에, `int`를 생략할 수 있다.
  ```java
  Calculator mc = (a, b) -> a+b;
  ```

  두 수를 더하여 결과를 리턴하는 함수는 `(a, b) -> a+b`는 `Integer.sum(int a, int b)`와 돌일하기 때문에, 축약이 가능하다.
  어떤 클래스의 메서드를 사용할 때는 `::`기호를 사용한다.<br>
  ```java
  Calculator mc = Integer::sum;
  ```

### 스트림
데이터가 물결처럼 흘러가면서 필터링 과정을 통해 여러 번 변경되어 반환되기 때문에 `스트림(stream)`이라는 이름을 갖게 되었다.<br>

배열에서 짝수만 뽑아, 중복을 제거한 후에 역순으로 정렬하는 프로그램을 만들어보자.
- **스트림을 사용하지 않은 코드**<br>
  ```java
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.HashSet;
  
  public class Main {
      public static void main(String[] args) {
          int[] data = {5, 6, 4, 2, 42, 48, 33, 333, 3};
  
          // 짝수만 포함하는 ArrayList 생성
          ArrayList<Integer> evenList = new ArrayList<>();
          for (int i = 0; i < data.length; ++i) {
              if ((data[i] & 1) == 0) {
                  evenList.add(data[i]);
              }
          }
  
          // Set을 이용해 중복 제거
          HashSet<Integer> dataSet = new HashSet<>(evenList);
  
          // Set을 다시 List로 변경
          ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
  
          // 역순으로 정렬
          distinctList.sort(Comparator.reverseOrder());
  
          // Integer 리스트를 정수 배열로 변환
          int[] result = new int[distinctList.size()];
          for (int i = 0; i < distinctList.size(); ++i) {
              result[i] = distinctList.get(i);
          }
      }
  }
  ```
- **스트림을 사용한 코드**<br>
  ```java
  import java.util.Arrays;
  import java.util.Comparator;
  
  public class Main {
      public static void main(String[] args) {
          int[] data = {5, 6, 4, 2, 42, 48, 33, 333, 3};
          int[] result = Arrays.stream(data)
                  .boxed() // IntStream을 Stream<Integer>로 변경
                  .filter((a) -> (a & 1) == 0) // 짝수만 뽑기
                  .distinct() // 중복을 제거한다.
                  .sorted(Comparator.reverseOrder()) // 역순으로 정렬
                  .mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변경
                  .toArray() // int[] 배열로 변환
                  ;
      }
  }
  ```
  > 훨씬 간결해졌다.

### Reference
[07-06 함수형 프로그래밍](https://wikidocs.net/157858#_6)<br>
