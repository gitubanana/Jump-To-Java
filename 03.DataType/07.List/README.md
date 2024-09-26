> 자료형의 개수가 계속 변한다면, 리스트를 사용해야 한다.<br>

### ArrayList
`ArrayList`는 리스트 자료형에서 가장 일반적으로 사용한다.<br>
리스트 자료형에는 ArrayList, Vector, LinkedList 등이 있다.<br>
> [!NOTE]
> `ArrayList`를 사용하려면, `import java.util.ArrayList`와 같은 `import`문을 작성해야 한다.<br>
> 아래 코드에서는 `main`함수 내의 코드만이 있다.<br>
- **add**<br>
  요솟값을 추가할 수 있다.<br>
  ```java
  ArrayList scores = new ArrayList();

  scores.add(100);
  scores.add(10);
  scores.add(1, 80); // 인덱스 1에 80삽입

  // scores는 100 80 1를 가지고 있다.
  ```
- **get**<br>
  특정 인덱스의 값을 추출할 수 있다.<br>
  ```java
  ArrayList scores = new ArrayList();

  scores.add(100);
  scores.add(10);
  scores.add(1, 80);
  System.out.println(scores.get(1)); // 80
  ```
- **size**<br>
  `ArrayList`의 요소의 개수를 리턴한다.<br>
  ```java
  ArrayList scores = new ArrayList();

  scores.add(100);
  scores.add(10);
  scores.add(1, 80);
  for (int i = 0; i < scores.size(); ++i) {
      System.out.println(scores.get(i));
  }
  ```
- **contains**<br>
  리스트 안에 해당 항목이 있는지 여부를 반환한다.<br>
  ```java
  ArrayList scores = new ArrayList();

  scores.add(100);
  scores.add(10);
  scores.add(1, 80);
  System.out.println(scores.contains(0)); // false
  System.out.println(scores.contains(100)); // true
  ```
- **remove**<br>
  `remove(객체)`는 리스트에서 객체에 해당하는 첫 번째 항목으로 삭제한 뒤, 그 결과를 `true`/`false`로 반환한다.<br>
  `remove(인덱스)`는 인덱스에 해당하는 항목을 삭제한 뒤, 그 항목을 리턴한다.<br>
  ```java
  ArrayList names = new ArrayList();

  names.add("euiclee");
  names.add(0, "hyeoan");
  names.add("euiclee");
  System.out.println(names.remove("euiclee")); // true
  System.out.println(names.remove(0));         // hyeoan
  System.out.println(names.remove(0));         // euiclee
  ```

### 제네릭스
J2SET 5.0 버전 이후에 도입된 개념으로, 제네릭스를 사용하면 자료형을 강제로 바꿀 때 생기는 캐스팅 오류를 줄일 수 있다.<br>
따라서, 제네릭스 사용을 권고하고 있다.<br>
- **제네릭스를 사용하지 않았을 때**<br>
  `names`에 `String`외의 다른 객체도 넣을 수 있어서 형변환 오류가 발생할 수 있다.<br>
  ```java
  ArrayList<> names = new ArrayList<>();
  names.add("euiclee");
  names.add("hyeoan");

  String one = (String) names.get(0); // Object 자료형을 String 자료형으로 형 변환
  ```
- **제네릭스를 사용했을 때**<br>
  제네릭스를 사용하면, `String`자료형만 추가되어야 한다는 걸 컴파일이 알기 때문에 형변환이 필요없다.<br>
  ```java
  ArrayList<String> names = new ArrayList<>();
  names.add("euiclee");
  names.add("hyeoan");

  String one = names.get(0); // 형변환이 필요없다.
  ```

### 다양한 방법으로 ArrayList 만들기
이미 배열이 있으면, `ArrayList`를 편하게 생성할 수 있다.<br>
```java
String[] data = {"euiclee", "hyeoan"};
ArrayList<String> names = new ArrayList<>(Arrays.asList(data));

System.out.println(names); // [euiclee, hyeoan]
```
배열 대신, 해당 자료형으로 여러 개 전달해 생성할 수도 있다.<br>
```java
ArrayList<String> names = new ArrayList<>(Arrays.asList("euiclee", "hyeoan"));

System.out.println(names); // [euiclee, hyeoan]
```
> [!NOTE]
> `Arrays.asList`를 사용하기 위해서는 `import java.util.Arrays;`를 해야 한다.<br>

### String.join
`String.join("구분자", 리스트 객체)`를 이용하면, 각 요소에 구분자를 넣어 하나의 문자열로 만들 수 있다.<br>
```java
ArrayList<String> names = new ArrayList<>(Arrays.asList("euiclee", "hyeoan", "jinheo"));

System.out.println(String.join(",", names)); // euiclee,hyeoan,jinheo
```

### 리스트 정렬하기
`ArrayList`를 정렬하기 위해서는 `sort`메서드를 사용하면 된다.<br>
`sort`메서드에는 정렬 기준을 넝어줘야 한다.<br>
`Comparator.naturalOrder()`는 오름차순,<br>
`Comparator.reverseOrder()`는 내림차순으로 정렬기준이 된다.<br>
```java
ArrayList<String> names = new ArrayList<>(Arrays.asList("sejokim", "jaehjoo", "jinhyeok"));

names.sort(Comparator.naturalOrder());
System.out.println(String.join(",", names)); // jaehjoo,jinhyeok,sejokim
```

> [!NOTE]
> `Comparator`를 사용하기 위해서는 `import java.util.Comparator;`를 해야 한다.<br>

### Reference
[03-07 리스트](https://wikidocs.net/207)<br>
