package org.sample.osgi.lamda.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.sample.osgi.lamda.service.LamdaService;

/**
 * Created by shameera on 7/30/14.
 */
public class LamdaBundleActivator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Lamda bundle activator starting ");
        bundleContext.registerService("org.sample.osgi.util.api.bar.IBarService", new LamdaService(), null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Lamda bundle activator stopping");
    }
}
