package de.fhe.ai.mcdiashow;

import de.fhe.ai.mcdiashow.resources.HelloResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kiddolocke on 02.12.2016.
 */

@ApplicationPath("api")
public class ApplicationConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        classes.add(HelloResource.class);

        return classes;
    }
}
