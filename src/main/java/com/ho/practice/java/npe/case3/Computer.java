package com.ho.practice.java.npe.case3;

import java.util.Optional;

import lombok.Getter;

@Getter
public class Computer {

    // Solve.1 객체 선언시 인스턴스를 생성하면 NPE이슈에서 해결된다.
    // 하지만 인스턴스의 생명주기를 Computer 인스턴스의 생명주기와 동일하게 가져가는 특성이 생긴다.
    // 그리고 객체를 사용하지 않는 상황에서도 메모리를 점유하는 특성도 가진다.
    // 그리고 인스턴스를 외부에서 null 처리하면 NPE 이슈는 남게 된다.
    // private Soundcard soundcard = new Soundcard();

    // Solve.2 객체를 선언시 Optional로 wrapping하면 클래스를 Serialize할 수 없다.
    // Serialize에 대한 참고자료 (https://woowabros.github.io/experience/2017/10/17/java-serialize.html)
    // 또한 solve.1 처럼 사용전에 초기화하지 않으면 NPE가 발생한다.
    // 반면에 Optional을 사용하면 Stream을 사용할 수 있다는 특징이 있다.
    // private Optional<Soundcard> soundcard;

    // Solve.3 `Optional`로 반환하는 Getter를 추가한다.
    private Soundcard soundcard;

    public Optional<Soundcard> getSoundcardAsOptional() {
        return Optional.ofNullable(soundcard);
    }

}