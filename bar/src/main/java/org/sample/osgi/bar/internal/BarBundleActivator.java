package org.sample.osgi.bar.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.sample.osgi.bar.service.BarService;

/**
 * Created by shameera on 7/30/14.
 */
public class BarBundleActivator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Bar bundle activator starting ");
        bundleContext.registerService("org.sample.osgi.util.api.bar.IBarService", new BarService(), null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Bar bundle activator stopping");
    }
}
