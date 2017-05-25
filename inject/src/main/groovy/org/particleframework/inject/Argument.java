package org.particleframework.inject;

import java.lang.annotation.Annotation;

/**
 * Represents an argument to a method or constructor
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface Argument<T> {
    /**
     * @return The name of the argument
     */
    String getName();

    /**
     * @return The type of the argument
     */
    Class<T> getType();

    /**
     * @return The generic types for the type. For example for Iterable<Foo> this would return an array containing Foo
     */
    Class[] getGenericTypes();

    /**
     * @return The qualifier
     */
    Annotation getQualifier();
}