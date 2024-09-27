### 생성자
```java
HouseDog dog = new HouseDog();
System.out.println(dog.name); // null
```
`dog.setName`을 하지 않았기 때문에, `null`이 출력된다.<br>
객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제할 수 있는 방법이 바로 `생성자(Constructor)`이다.<br>

생성자명은 클래스명이어야 하고, 리턴 타입은 정의하지 않는다.
생성자는 객체가 생성될 때 호출된다.<br>
즉, `new`키워드가 사용될 때 호출된다.<br>
또한, `생성자 오버로딩`도 가능하다.<br>
```java
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + ": 쿨쿨...");
    }
}

class HouseDog extends Dog {
    HouseDog() { // 디폴트 생성자
    }

    HouseDog(String name) { // 생성자 오버로딩
        this.setName(name);
    }

    void sleep() { // Dog의 sleep을 오버라이딩 했다.
        System.out.println(this.name + ": 꿀꿀꿀...");
    }

    void sleep(int hour) { // sleep함수를 오버로딩했다.
        System.out.println(this.name + ": 꿀꿀꿀... " + hour + "시간동안");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        HouseDog nullDog = new HouseDog();
        HouseDog houseDog = new HouseDog("진돗개");

        nullDog.sleep(); // null: 꿀꿀꿀...
        houseDog.sleep(2); // 진돗개: 꿀꿀꿀... 2시간동안
    }
}
```

### 디폴트 생성자
아무것도 받지 않고, 아무 코드도 없는 생성자를 `디폴트 생성자(Default constructor)`라고 부른다.<br>
클래스에 생성자가 없다면, 컴파일러에서 자동으로 `디폴트 생성자`를 추가한다.<br>
> 컴파일러가 `C++`에서는 자동으로 `OCCF`를 만들어줬는데, `Java`에서는 `디폴트 생성자`만 만드는 것 같다. (복사 생성자 테스트 시 컴파일 에러가 났다...)
```java
class ImDefault {
  ImDefault() {
  }
}
```

### Reference
[05-06 생성자](https://wikidocs.net/281)<br>
