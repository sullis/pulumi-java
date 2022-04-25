// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficAnalyticsConfigurationPropertiesResponse {
    /**
     * @return Flag to enable/disable traffic analytics.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The interval in minutes which would decide how frequently TA service should do flow analytics.
     * 
     */
    private final @Nullable Integer trafficAnalyticsInterval;
    /**
     * @return The resource guid of the attached workspace.
     * 
     */
    private final @Nullable String workspaceId;
    /**
     * @return The location of the attached workspace.
     * 
     */
    private final @Nullable String workspaceRegion;
    /**
     * @return Resource Id of the attached workspace.
     * 
     */
    private final @Nullable String workspaceResourceId;

    @CustomType.Constructor
    private TrafficAnalyticsConfigurationPropertiesResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("trafficAnalyticsInterval") @Nullable Integer trafficAnalyticsInterval,
        @CustomType.Parameter("workspaceId") @Nullable String workspaceId,
        @CustomType.Parameter("workspaceRegion") @Nullable String workspaceRegion,
        @CustomType.Parameter("workspaceResourceId") @Nullable String workspaceResourceId) {
        this.enabled = enabled;
        this.trafficAnalyticsInterval = trafficAnalyticsInterval;
        this.workspaceId = workspaceId;
        this.workspaceRegion = workspaceRegion;
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * @return Flag to enable/disable traffic analytics.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The interval in minutes which would decide how frequently TA service should do flow analytics.
     * 
     */
    public Optional<Integer> trafficAnalyticsInterval() {
        return Optional.ofNullable(this.trafficAnalyticsInterval);
    }
    /**
     * @return The resource guid of the attached workspace.
     * 
     */
    public Optional<String> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }
    /**
     * @return The location of the attached workspace.
     * 
     */
    public Optional<String> workspaceRegion() {
        return Optional.ofNullable(this.workspaceRegion);
    }
    /**
     * @return Resource Id of the attached workspace.
     * 
     */
    public Optional<String> workspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficAnalyticsConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer trafficAnalyticsInterval;
        private @Nullable String workspaceId;
        private @Nullable String workspaceRegion;
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficAnalyticsConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.trafficAnalyticsInterval = defaults.trafficAnalyticsInterval;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceRegion = defaults.workspaceRegion;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder trafficAnalyticsInterval(@Nullable Integer trafficAnalyticsInterval) {
            this.trafficAnalyticsInterval = trafficAnalyticsInterval;
            return this;
        }
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Builder workspaceRegion(@Nullable String workspaceRegion) {
            this.workspaceRegion = workspaceRegion;
            return this;
        }
        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }        public TrafficAnalyticsConfigurationPropertiesResponse build() {
            return new TrafficAnalyticsConfigurationPropertiesResponse(enabled, trafficAnalyticsInterval, workspaceId, workspaceRegion, workspaceResourceId);
        }
    }
}
