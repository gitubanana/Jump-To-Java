> `Map`은 사전과 비슷하게, 키와 값을 한 쌍으로 갖는 자료형이다.
> `Map` 자료형에는 `HashMap`, `LinkedHashMap`, `TreeMap` 등이 있다.<br>

### HashMap
`Map`자료형 중 가장 기본이 된다.<br>
> [!NOTE]
> `HashMap`을 사용하기 위해서는 `import java.util.HashMap;`을 해야 한다.<br>
> 아래 코드는 `main`메서드 안의 코드이다.<br>
- **put**<br>
  `key`와 `value`를 추가할 수 있다.<br>
  `HashMap` 역시 제네릭스를 이용한다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  ```
- **get**<br>
  `key`에 해당하는 `value`를 얻을 때 사용한다.<br>
  `key`에 해당하는 `value`가 없을 때는 `null`을 반환한다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  System.out.println(enDict.get("people"));               // 사람
  System.out.println(enDict.get("hi"));                   // null
  System.out.println(enDict.getOrDefault("hi", "안녕"));  // 안녕
  ```
  > `key`에 해당하는 `value`가 없을 때, 기본값을 얻고 싶다면<br>
  > `getOrDefault`메서드에 첫 번째 인자는 `key`, 두 번째 인자는 기본값을 넣으면 된다.<br>
- **containsKey**<br>
  맵에 해당 `key`가 있는지 여부를 반환한다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  System.out.println(enDict.containsKey("people")); // true
  System.out.println(enDict.containsKey("hi"));     // false
  ```
- **remove**<br>
  `key`에 해당하는 항목을 삭제한 후, `value`를 반환한다.<br>
  `key`가 없다면, `null`이 반환된다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  System.out.println(enDict.remove("people")); // 사람
  System.out.println(enDict.remove("hi"));     // null
  ```
- **size**<br>
  맵 요소의 개수를 반환한다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  System.out.println(enDict.size()); // 2
  ```
- **keySet**<br>
  맵의 모든 `key`를 모아서 반환한다.<br>
  ```java
  HashMap<String, String> enDict = new HashMap<>();
  enDict.put("people", "사람");
  enDict.put("baseball", "야구");
  System.out.println(enDict.keySet()); // [baseball, people]
  ```
> [!NOTE]
> `HashMap`은 순서에 의존하지 않고, 데이터를 저장한다.<br>
> `LinkedHashMap`은 입력된 순서대로 데이터를 저장한다.<br>
> `TreeMap`은 입력된 `key`의 오름차순으로 데이터를 저장한다.<br>

### Reference
[03-08 맵](https://wikidocs.net/208)<br>
