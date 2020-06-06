package kr.ninesoft.myapplication

import spock.lang.*

class FooTest2 extends Specification {
    Foo foo = new Foo()

    def "test f1"() {
        when:
        String result = foo.f1()

        then:
        result == "hi!"fit

    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme