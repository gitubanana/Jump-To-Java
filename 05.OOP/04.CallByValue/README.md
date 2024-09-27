> `call by value`와 `call by reference`가 둘 다 있는 `C++`로 설명하겠다.

### Call by Value
값을 복사해 처리한다.<br>
변수의 복사본이 전달되며, 원래 값은 수정 안 된다.<br>
실제 매개변수는 다른 메모리 위치에 생성된다.<br>
```cpp
#include <iostream>

void callByValue(int *arr) { // arr는 main의 arr과는 다른 주소를 가지고 있는 다른 변수이다.
    arr = new int[3];
    for (int i = 0; i < 3; ++i) {
        arr[i] = (i + 2);
    }
}

int main() {
    int *arr = new int[3];
    for (int i = 0; i < 3; ++i) {
        arr[i] = (i + 1);
    }

    callByValue(arr);

    /* 1 2 3 */
    // callByValue의 arr은 main의 arr과 다르기 때문에, 영향을 주지 않는다.
    for (int i = 0; i < 3; ++i) {
        std::cout << arr[i] << ' ';
    }
    std::cout << '\n';
    return 0;
}
```

### Call by Reference
값의 주소를 참조해 직접 값에 영향을 준다.<br>
변수 자체가 전달되고, 원래 값도 수정된다.<br>
실제 매개변수는 인자로 받은 변수이다.<br>
```cpp
#include <iostream>

void callByReference(int *&arr) { // arr은 main의 arr과 같다.
    arr = new int[3];
    for (int i = 0; i < 3; ++i) {
        arr[i] = (i + 2);
    }
}

int main() {
    int *arr = new int[3];
    for (int i = 0; i < 3; ++i) {
        arr[i] = (i + 1);
    }

    callByReference(arr);

    /* 2 3 4 */
    // callByReference에서 arr을 바꿨기 때문에, arr의 값이 바뀌었다. (다른 배열을 가리킨다.)
    for (int i = 0; i < 3; ++i) {
        std::cout << arr[i] << ' ';
    }
    std::cout << '\n';
    return 0;
}
```
> [!NOTE]
> 테스트를 위해서 작성했기 때문에, 메모리 릭은 눈을 감아주세요...

### 그래서 Java는?
`Java`는 `Call by Value`방식만이 있다.<br>
- **JVM 메모리에 변수가 저장되는 위치**<br>
  `원시 타입`은 `Stack`영역에 그 값이 저장되고,<br>
  `참조 타입`은 `Stack`영역에는 포인터가 있고, 그 포인터가 `Heap`영역에 있는 실제 값을 가리키고 있다.<br>
  (그래서, `new`를 사용해야 했던 거 같다.)<br>
  > 사실 이것만 안다면, 아래 내용은 자동으로 이해가 될 것이다.<br>
  > (`Call By Value`만 있는 `C`랑 똑같은 거 같다. 포인터를 넘기면, 포인터가 가리키는 값을 변경할 수 있다!)<br>
- **원시 타입**<br>
  `Call by Value`니까 값 복사가 되어서 못 바꾼다.<br>
  ```java
  public class HelloWorld {
    public static void makeItThree(int toChange) {
        toChange = 3;
    }

    public static void main(String[] args) {
        int makeMeThree = 1;

        makeItThree(makeMeThree);
        System.out.println(makeMeThree); // 1
    }
  }
  ```
- **참조 타입**<br>
  `Call by value`니까 포인터가 복사되고, 그 포인터가 가리키는 값을 바꾸니까 바뀐다.<br>
  ```java
  class Int {
    int num;

    public Int(int num) {
        this.num = num;
    }
  }
  
  public class HelloWorld {
      public static void makeItThree(Int toChange) {
          toChange.num = 3;
      }
  
      public static void main(String[] args) {
          Int makeMeThree = new Int(1);
  
          makeItThree(makeMeThree);
          System.out.println(makeMeThree.num); // 3
      }
  }
  ```



### Reference
[05-04 값에 의한 호출과 객체에 의한 호출](https://wikidocs.net/265)<br>
[[Java] 자바가 Call by Value 방식인 이유](https://dev-coco.tistory.com/189)<br>
[Java 의 Call by Value, Call by Reference](https://bcp0109.tistory.com/360)<br>
