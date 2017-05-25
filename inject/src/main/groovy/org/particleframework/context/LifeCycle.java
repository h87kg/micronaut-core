package org.particleframework.context;

import java.io.Closeable;

/**
 * A life cycle interface providing a start method and extending Closeable which provides a close() method for termination
 *
 * Components can implement this interface
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface LifeCycle extends Closeable {
    /**
     * Starts the lifecyle component
     */
    void start();
}