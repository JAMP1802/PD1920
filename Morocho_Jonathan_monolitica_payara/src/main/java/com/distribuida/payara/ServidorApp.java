package com.distribuida.payara;

import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationScoped
@ApplicationPath("/")
public class ServidorApp extends Application {

//	@Override
//	public Set<Class<?>> getClasses() {
//        return Set.of(
//                AlbumRest.class
//        );
//    }
//	
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(AlbumRest.class);
        resources.add(SingerRest.class);
    }
}
