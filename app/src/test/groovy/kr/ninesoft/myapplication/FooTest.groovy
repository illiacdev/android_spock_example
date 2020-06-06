package kr.ninesoft.myapplication

import org.mockito.Mock

import spock.lang.*

class FooTest2 extends Specification {
    @Mock
    Foo foo

    def setup() {
        MockitoAnnotations.initMocks(this);

    }

    def "test f1"() {
        when:
        String result = foo.f1()

        then:
        result == "replaceMeWithExpectedResult"
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme