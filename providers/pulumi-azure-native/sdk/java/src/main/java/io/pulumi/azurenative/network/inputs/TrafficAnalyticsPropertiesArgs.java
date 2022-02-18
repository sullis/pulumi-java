// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.TrafficAnalyticsConfigurationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that define the configuration of traffic analytics.
 * 
 */
public final class TrafficAnalyticsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficAnalyticsPropertiesArgs Empty = new TrafficAnalyticsPropertiesArgs();

    /**
     * Parameters that define the configuration of traffic analytics.
     * 
     */
    @InputImport(name="networkWatcherFlowAnalyticsConfiguration")
    private final @Nullable Input<TrafficAnalyticsConfigurationPropertiesArgs> networkWatcherFlowAnalyticsConfiguration;

    public Input<TrafficAnalyticsConfigurationPropertiesArgs> getNetworkWatcherFlowAnalyticsConfiguration() {
        return this.networkWatcherFlowAnalyticsConfiguration == null ? Input.empty() : this.networkWatcherFlowAnalyticsConfiguration;
    }

    public TrafficAnalyticsPropertiesArgs(@Nullable Input<TrafficAnalyticsConfigurationPropertiesArgs> networkWatcherFlowAnalyticsConfiguration) {
        this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
    }

    private TrafficAnalyticsPropertiesArgs() {
        this.networkWatcherFlowAnalyticsConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficAnalyticsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TrafficAnalyticsConfigurationPropertiesArgs> networkWatcherFlowAnalyticsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficAnalyticsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkWatcherFlowAnalyticsConfiguration = defaults.networkWatcherFlowAnalyticsConfiguration;
        }

        public Builder setNetworkWatcherFlowAnalyticsConfiguration(@Nullable Input<TrafficAnalyticsConfigurationPropertiesArgs> networkWatcherFlowAnalyticsConfiguration) {
            this.networkWatcherFlowAnalyticsConfiguration = networkWatcherFlowAnalyticsConfiguration;
            return this;
        }

        public Builder setNetworkWatcherFlowAnalyticsConfiguration(@Nullable TrafficAnalyticsConfigurationPropertiesArgs networkWatcherFlowAnalyticsConfiguration) {
            this.networkWatcherFlowAnalyticsConfiguration = Input.ofNullable(networkWatcherFlowAnalyticsConfiguration);
            return this;
        }

        public TrafficAnalyticsPropertiesArgs build() {
            return new TrafficAnalyticsPropertiesArgs(networkWatcherFlowAnalyticsConfiguration);
        }
    }
}
