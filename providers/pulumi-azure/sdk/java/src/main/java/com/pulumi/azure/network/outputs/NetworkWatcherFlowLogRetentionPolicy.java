// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NetworkWatcherFlowLogRetentionPolicy {
    /**
     * @return The number of days to retain flow log records.
     * 
     */
    private final Integer days;
    /**
     * @return Boolean flag to enable/disable traffic analytics.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private NetworkWatcherFlowLogRetentionPolicy(
        @CustomType.Parameter("days") Integer days,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.days = days;
        this.enabled = enabled;
    }

    /**
     * @return The number of days to retain flow log records.
     * 
     */
    public Integer days() {
        return this.days;
    }
    /**
     * @return Boolean flag to enable/disable traffic analytics.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkWatcherFlowLogRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer days;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkWatcherFlowLogRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public NetworkWatcherFlowLogRetentionPolicy build() {
            return new NetworkWatcherFlowLogRetentionPolicy(days, enabled);
        }
    }
}
