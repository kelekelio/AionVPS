package pl.aionpb.aion.db.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import pl.aionpb.aion.db.object.Settings;

/**
 * @author Grzegorz Nowakowski
 */
public class ServerRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        return Settings.getServerId();

    }

}
