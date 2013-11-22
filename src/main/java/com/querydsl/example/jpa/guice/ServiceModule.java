package com.querydsl.example.jpa.guice;

import com.google.inject.AbstractModule;
import com.google.inject.persist.jpa.JpaPersistModule;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new JpaPersistModule("h2").properties(System.getProperties()));
        bind(JpaInitializer.class).asEagerSingleton();
    }
}
