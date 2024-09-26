> 집합(set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 것으로,<br>
> `HashSet`, `TreeSet`, `LinkedHashSet` 등이 있다.<br>

### 집합 자료형의 2가지 특징
```java
import java.util.Arrays;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));

        System.out.println(set); // [e, H, l, o]
    }
}
```
1. 중복을 허용하지 않는다. (따라서, `"l"`이 하나밖에 안 보이는 것이다.)<br>
2. 순서가 없다. (순서가 없기 때문에, 인덱싱으로 값을 얻을 수 없다.)<br>

### 교집합 구하기
```java
import java.util.Arrays;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> intersection = new HashSet<>(s1);

        intersection.retainAll(s2);
        System.out.println(intersection); // [4, 5, 6]
    }
}
```
`retainAll`메서드를 이용하면, 교집합을 구할 수 있다.<br>

### 합집합 구하기
```java
import java.util.Arrays;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> union = new HashSet<>(s1);

        union.addAll(s2);
        System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
```
`addAll`메서드로 합집합을 구할 수 있다.<br>

### 차집합 구하기
```java
import java.util.Arrays;
import java.util.HashSet;

public class HelloWorld {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> subtract = new HashSet<>(s1);

        subtract.removeAll(s2);
        System.out.println(subtract); // [1, 2, 3]
    }
}
```
`subtract`메서드로 차집합을 구할 수 있다.<br>

### 집합 자료형 메서드
- **add**<br>
  집합 자료형에 값을 추가할 때 사용한다.<br>
  ```java
  import java.util.Arrays;
  import java.util.HashSet;
  
  public class HelloWorld {
      public static void main(String[] args) {
          HashSet<String> friends = new HashSet<>();
          friends.add("euiclee");
          friends.add("hyeoan");
          friends.add("euiclee");
          System.out.println(friends); // [euiclee, hyeoan]
      }
  }
  ```
- **addAll**<br>
  값을 한 꺼번에 여러 개 추가할 때 사용한다.<br>
  합집합 구할 때 사용했다.<br>
  ```java
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.HashSet;
  
  public class HelloWorld {
      public static void main(String[] args) {
          HashSet<String> friends = new HashSet<>();
          friends.addAll(Arrays.asList("euiclee", "hyeoan", "euiclee"));
          System.out.println(friends); // [euiclee, hyeoan]
      }
  }
  ```
- **remove**<br>
  특정 값을 제거할 때 사용한다.<br>
  ```java
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.HashSet;
  
  public class HelloWorld {
      public static void main(String[] args) {
          HashSet<String> friends = new HashSet<>(Arrays.asList("euiclee", "hyeoan", "euiclee"));
          friends.remove("euiclee");
          System.out.println(friends); // [hyeoan]
      }
  }

  ```

> [!NOTE]
> `HashSet`은 순서에 의존하지 않고, 데이터를 저장한다.<br>
> `LinkedHashSet`은 입력된 순서대로 데이터를 저장한다.<br>
> `TreeSet`은 입력된 `key`의 오름차순으로 데이터를 저장한다.<br>

### Reference
[03-09 집합](https://wikidocs.net/157108)<br>
