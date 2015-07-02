package ${package};

import java.util.List;

import com.google.common.collect.Lists;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;
import com.inductiveautomation.xopc.driver.api.DriverAPI;
import com.inductiveautomation.xopc.driver.api.configuration.DriverType;
import com.inductiveautomation.xopc.driver.common.AbstractDriverModuleHook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverHook extends AbstractDriverModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void setup(GatewayContext context) {
        super.setup(context);
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    protected List<DriverType> getDriverTypes() {
        return Lists.newArrayList(); // TODO
    }

    @Override
    protected int getExpectedAPIVersion() {
        return DriverAPI.VERSION;
    }

}
