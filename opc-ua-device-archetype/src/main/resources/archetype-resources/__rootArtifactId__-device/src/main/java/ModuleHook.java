package ${package};

import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;
import com.inductiveautomation.ignition.gateway.opcua.server.api.AbstractDeviceModuleHook;
import com.inductiveautomation.ignition.gateway.opcua.server.api.DeviceType;
import org.jetbrains.annotations.NotNull;


public class ModuleHook extends AbstractDeviceModuleHook {

    @Override
    public void setup(@NotNull GatewayContext context) {
        super.setup(context);

        // TODO add something to BundleUtil?
    }

    @Override
    public void startup(@NotNull LicenseState activationState) {
        super.startup(activationState);

        // TODO startup stuff?
    }

    @Override
    public void shutdown() {
        super.shutdown();

        // TODO remove something from BundleUtil?
    }

    @Nonnull
    @Override
    protected List<DeviceType> getDeviceTypes() {
        // TODO return a non-empty list

        return Collections.emptyList();
    }

}
