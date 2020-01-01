package tibi.springtest.configuration

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration

/**
 *
 */
@Configuration
class JerseyConfiguration: ResourceConfig() {
    init {
        packages("tibi.springtest.resource")
    }
}
