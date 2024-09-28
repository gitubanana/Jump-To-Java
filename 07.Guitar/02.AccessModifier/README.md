### 접근 제어자
`접근 제어자(access modifier`)는 변수나 메서드의 사용 권한을 설정한다.<br>
`private < default < protected < public`순으로 보다 많은 접근을 허용한다.<br>

### private
`private`이 붙은 변수나 메서드는 해당 클래스 내에서만 접근이 가능하다.<br>
```java
public class Sample {
  private String secret;

  private String getSecret() {
    return this.secret;
  }
}
```

### default
접근 제어자를 별도로 설정하지 않는다면, `default` 접근 제어자가 설정되며,<br>
동일한 패키지 안에서만 접근이 가능하다.<br>
```java
/* house/HouseKim.java */
package house; // 패키지가 동일하다.

public class HouseKim {
  String lastname = "kim"; // default 접근제어자로 설정된다.
}
```
```java
/* house/HousePark.java */
package house; // 패키지 동일

public class HousePark {
  String lastname = "park";

  public static void main(String[] args) {
    HouseKim kim = new HouseKim();

    System.out.println(kim.lastname); // Housekim 클래스의 lastname 변수 사용 가능
  }
}
```

### protected
동일 패키지 클래스 또는 해당 클래스를 상속받은 클래스에서만 접근 가능하다.<br>
```java
/* house/HousePark.java */
package house; // 패키지가 다르다.

public class HousePark {
  protected String lastname = "park";
}
```
```java
/* house/person/Euiclee.java */
package house.person; // 패키지가 다르다.

import house.HousePark;

public class Euiclee extends HousePark { // HousePark을 상속받았다.
  public static void main(String[] args) {
    Euiclee euiclee = new Euiclee();

    System.out.println(euiclee.lastname); // protected이고, 상속을 받았기 때문에 접근이 가능하다.
  }
}
```

### public
어떤 클래스에서도 접근이 가능하다.<br>
```java
package house;

public class HousePark {
    protected String lastname = "park";
    public String info = "this is public message.";
}
```
```java
import house.HousePark;

public class Sample {
    public static void main(String[] args) {
        HousePark housePark = new HousePark();
        System.out.println(housePark.info);
    }
}
```
> [!NOTE]
> `private`은 클래스 내에서만<br>
> `default`는 패키지 내에서만<br>
> `protected`는 패키지 내 + 상속받은 클래스에서만<br>
> `public`은 모두 다 접근이 가능하다.

### Reference
[07-02 접근 제어자](https://wikidocs.net/232)<br>
