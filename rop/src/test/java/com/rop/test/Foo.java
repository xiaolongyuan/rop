package com.rop.test;


import org.springframework.context.ApplicationEvent;

import java.lang.reflect.TypeVariable;

/**
 * Created by LongYuan on 2015/5/30.
 */
public class Foo<E extends FooRopEvent> {

    public boolean com(ApplicationEvent event){

        if(event instanceof FooRopEvent){
            TypeVariable<? extends Class<? extends Foo>>[] types = this.getClass().getTypeParameters();
            for (int i = 0; i < types.length; i++) {
                TypeVariable<? extends Class<? extends Foo>> type = types[i];



                if(event.getClass().equals( type.getGenericDeclaration())){
                    return true;
                }
            }
        }


        return false;
    }

    public static void main(String[] args) {
        Foo<Foo1> foo = new Foo<Foo1>();
        System.out.println( foo.com(new Foo1(new Object())));


    }


}

 class FooRopEvent extends ApplicationEvent {

    public FooRopEvent(Object source) {
        super(source);
    }
}

 class Foo1 extends FooRopEvent {

    public Foo1(Object source) {
        super(source);
    }
}
 class Foo2 extends FooRopEvent {

    public Foo2(Object source) {
        super(source);
    }
}