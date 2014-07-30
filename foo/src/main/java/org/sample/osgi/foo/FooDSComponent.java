package org.sample.osgi.foo;

/**
 * Created by shameera on 7/29/14.
 */

import org.osgi.service.component.ComponentContext;
import org.sample.osgi.util.api.bar.IBarService;

/**
 * @scr.component name="org.sample.osgi.foo.component" immediate="true"
 * @scr.reference name="org.sample.osgi.service"
 * interface="org.sample.osgi.util.api.bar.IBarService"
 * cardinality="1..1" policy="dynamic" bind="setBarService"
 * unbind="unsetBarService"
 */
public class FooDSComponent {

    protected void activate(ComponentContext ctxt){
        System.out.println("Activating " + this.getClass().getName());
    }

    protected void deactivate(ComponentContext ctxt) {
        System.out.println("Deactivating " + this.getClass().getName());
    }

    public void setBarService(IBarService barService) {
        System.out.println("Declarative Service " + barService.getClass().getName() + " is available");
        barService.sayHello();

    }

    public void unsetBarService(IBarService barService) {
        System.out.println("Declarative Service " + barService.getClass().getName() + " unregistered");
    }

}
