package com.cultivation.javaBasic;

import com.cultivation.javaBasic.util.AnonymousClassUpdateField;
import com.cultivation.javaBasic.util.InnerClassUpdateField;
import com.cultivation.javaBasic.util.LocalClassUpdateField;
import com.cultivation.javaBasic.util.StaticInnerClass;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InnerClassTest {

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_access_instance_field_of_parent_class() {

    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_refer_inner_class_from_outside() {
        InnerClassUpdateField instance = new InnerClassUpdateField();
        InnerClassUpdateField.InnerClass innerClass = instance.new InnerClass();

        innerClass.method();
        assertEquals(2020,instance.getYear());
    }

    @Test
    void should_test_inner() {
        InnerClassUpdateField instance  =new InnerClassUpdateField(2018);
        InnerClassUpdateField.InnerClass innerClass = instance.new InnerClass(2);

        assertEquals(2020,instance.getYear());
    }

    @Test
    void should_test_inner_add() {
        InnerClassUpdateField instance  =new InnerClassUpdateField(2018);
        InnerClassUpdateField.InnerClass innerClass = instance.new InnerClass(2);

        innerClass.add();

        assertEquals(2020,instance.getYear());
    }

    @Test
    void should_test_outer_add() {
        InnerClassUpdateField instance  =new InnerClassUpdateField(2018);
        instance.add();

        assertEquals(2020,instance.getYear());
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_update_field_using_local_class() {
        LocalClassUpdateField instance = new LocalClassUpdateField();
        instance.somethingHappen();

        // TODO: please modify the following code to pass the test
        // <--start
        final Optional<Integer> expected = Optional.of(2019);
        // --end-->

        assertEquals(expected.get().intValue(), instance.getYear());
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void should_update_field_using_anonymous_class() {
        AnonymousClassUpdateField instance = new AnonymousClassUpdateField();
        instance.somethingHappen();

        // TODO: please modify the following code to pass the test
        // <--start
        final Optional<Integer> expected = Optional.of(2019);
        // --end-->

        assertEquals(expected.get().intValue(), instance.getYear());
    }

    @Test
    void should_create_instance_for_static_inner_class() {
        StaticInnerClass instance = new StaticInnerClass();
        StaticInnerClass.Inner inner = instance.createInner();

        // TODO: please modify the following code to pass the test
        // <--start
        final String expected = "Hello";
        // --end-->

        assertEquals(expected, inner.getName());
    }
}
