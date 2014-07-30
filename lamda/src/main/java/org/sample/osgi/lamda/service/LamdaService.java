package org.sample.osgi.lamda.service;

/**
 * Created by shameera on 7/30/14.
 */

import org.sample.osgi.util.api.bar.IBarService;

public class LamdaService implements IBarService{

    public void sayHello() {
        System.out.println( this.getClass().getName() + ":  Hello! ");
    }
}
