package de.fhe.ai.diashowgenerator;

import de.fhe.ai.diashowgenerator.resources.HelloResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kiddolocke on 25.11.2016.
 */

@ApplicationPath("api")
public class ApplicationConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        classes.add(HelloResource.class);

        return super.getClasses();
    }
}
