package org.particleframework.inject.lifecycle.beanwithpredestroy

import org.particleframework.context.BeanContext
import org.particleframework.context.DefaultBeanContext
import spock.lang.Specification

class BeanWithPreDestroySpec extends Specification{

    void "test that a bean with a pre-destroy hook works"() {
        given:
        BeanContext context = new DefaultBeanContext()
        context.start()

        when:
        B b = context.getBean(B)

        then:
        b.a != null
        !b.noArgsDestroyCalled
        !b.injectedDestroyCalled

        when:
        context.destroyBean(B)

        then:
        b.noArgsDestroyCalled
        b.injectedDestroyCalled
    }

    void "test that a bean with a pre-destroy hook works closed on close"() {
        given:
        BeanContext context = new DefaultBeanContext()
        context.start()

        when:
        B b = context.getBean(B)

        then:
        b.a != null
        !b.noArgsDestroyCalled
        !b.injectedDestroyCalled

        when:
        context.close()

        then:
        b.noArgsDestroyCalled
        b.injectedDestroyCalled
    }
}