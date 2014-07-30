package org.sample.osgi.foo.service;

import org.sample.osgi.util.api.foo.IFooService;

/**
 * Created by shameera on 7/29/14.
 */


public class FooService implements IFooService {
    @Override
    public void sayHello() {
        System.out.println( this.getClass().getName() + ":  Hello! ");
    }
}
