// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.FrontDoorEnabledState;
import io.pulumi.azurenative.network.inputs.BackendPoolArgs;
import io.pulumi.azurenative.network.inputs.BackendPoolsSettingsArgs;
import io.pulumi.azurenative.network.inputs.FrontendEndpointArgs;
import io.pulumi.azurenative.network.inputs.HealthProbeSettingsModelArgs;
import io.pulumi.azurenative.network.inputs.LoadBalancingSettingsModelArgs;
import io.pulumi.azurenative.network.inputs.RoutingRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FrontDoorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorArgs Empty = new FrontDoorArgs();

    /**
     * Backend pools available to routing rules.
     * 
     */
    @InputImport(name="backendPools")
    private final @Nullable Input<List<BackendPoolArgs>> backendPools;

    public Input<List<BackendPoolArgs>> getBackendPools() {
        return this.backendPools == null ? Input.empty() : this.backendPools;
    }

    /**
     * Settings for all backendPools
     * 
     */
    @InputImport(name="backendPoolsSettings")
    private final @Nullable Input<BackendPoolsSettingsArgs> backendPoolsSettings;

    public Input<BackendPoolsSettingsArgs> getBackendPoolsSettings() {
        return this.backendPoolsSettings == null ? Input.empty() : this.backendPoolsSettings;
    }

    /**
     * Operational status of the Front Door load balancer. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,FrontDoorEnabledState>> enabledState;

    public Input<Either<String,FrontDoorEnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * A friendly name for the frontDoor
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Name of the Front Door which is globally unique.
     * 
     */
    @InputImport(name="frontDoorName")
    private final @Nullable Input<String> frontDoorName;

    public Input<String> getFrontDoorName() {
        return this.frontDoorName == null ? Input.empty() : this.frontDoorName;
    }

    /**
     * Frontend endpoints available to routing rules.
     * 
     */
    @InputImport(name="frontendEndpoints")
    private final @Nullable Input<List<FrontendEndpointArgs>> frontendEndpoints;

    public Input<List<FrontendEndpointArgs>> getFrontendEndpoints() {
        return this.frontendEndpoints == null ? Input.empty() : this.frontendEndpoints;
    }

    /**
     * Health probe settings associated with this Front Door instance.
     * 
     */
    @InputImport(name="healthProbeSettings")
    private final @Nullable Input<List<HealthProbeSettingsModelArgs>> healthProbeSettings;

    public Input<List<HealthProbeSettingsModelArgs>> getHealthProbeSettings() {
        return this.healthProbeSettings == null ? Input.empty() : this.healthProbeSettings;
    }

    /**
     * Load balancing settings associated with this Front Door instance.
     * 
     */
    @InputImport(name="loadBalancingSettings")
    private final @Nullable Input<List<LoadBalancingSettingsModelArgs>> loadBalancingSettings;

    public Input<List<LoadBalancingSettingsModelArgs>> getLoadBalancingSettings() {
        return this.loadBalancingSettings == null ? Input.empty() : this.loadBalancingSettings;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Routing rules associated with this Front Door.
     * 
     */
    @InputImport(name="routingRules")
    private final @Nullable Input<List<RoutingRuleArgs>> routingRules;

    public Input<List<RoutingRuleArgs>> getRoutingRules() {
        return this.routingRules == null ? Input.empty() : this.routingRules;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FrontDoorArgs(
        @Nullable Input<List<BackendPoolArgs>> backendPools,
        @Nullable Input<BackendPoolsSettingsArgs> backendPoolsSettings,
        @Nullable Input<Either<String,FrontDoorEnabledState>> enabledState,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> frontDoorName,
        @Nullable Input<List<FrontendEndpointArgs>> frontendEndpoints,
        @Nullable Input<List<HealthProbeSettingsModelArgs>> healthProbeSettings,
        @Nullable Input<List<LoadBalancingSettingsModelArgs>> loadBalancingSettings,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<List<RoutingRuleArgs>> routingRules,
        @Nullable Input<Map<String,String>> tags) {
        this.backendPools = backendPools;
        this.backendPoolsSettings = backendPoolsSettings;
        this.enabledState = enabledState;
        this.friendlyName = friendlyName;
        this.frontDoorName = frontDoorName;
        this.frontendEndpoints = frontendEndpoints;
        this.healthProbeSettings = healthProbeSettings;
        this.loadBalancingSettings = loadBalancingSettings;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingRules = routingRules;
        this.tags = tags;
    }

    private FrontDoorArgs() {
        this.backendPools = Input.empty();
        this.backendPoolsSettings = Input.empty();
        this.enabledState = Input.empty();
        this.friendlyName = Input.empty();
        this.frontDoorName = Input.empty();
        this.frontendEndpoints = Input.empty();
        this.healthProbeSettings = Input.empty();
        this.loadBalancingSettings = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routingRules = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BackendPoolArgs>> backendPools;
        private @Nullable Input<BackendPoolsSettingsArgs> backendPoolsSettings;
        private @Nullable Input<Either<String,FrontDoorEnabledState>> enabledState;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> frontDoorName;
        private @Nullable Input<List<FrontendEndpointArgs>> frontendEndpoints;
        private @Nullable Input<List<HealthProbeSettingsModelArgs>> healthProbeSettings;
        private @Nullable Input<List<LoadBalancingSettingsModelArgs>> loadBalancingSettings;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<RoutingRuleArgs>> routingRules;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPools = defaults.backendPools;
    	      this.backendPoolsSettings = defaults.backendPoolsSettings;
    	      this.enabledState = defaults.enabledState;
    	      this.friendlyName = defaults.friendlyName;
    	      this.frontDoorName = defaults.frontDoorName;
    	      this.frontendEndpoints = defaults.frontendEndpoints;
    	      this.healthProbeSettings = defaults.healthProbeSettings;
    	      this.loadBalancingSettings = defaults.loadBalancingSettings;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingRules = defaults.routingRules;
    	      this.tags = defaults.tags;
        }

        public Builder setBackendPools(@Nullable Input<List<BackendPoolArgs>> backendPools) {
            this.backendPools = backendPools;
            return this;
        }

        public Builder setBackendPools(@Nullable List<BackendPoolArgs> backendPools) {
            this.backendPools = Input.ofNullable(backendPools);
            return this;
        }

        public Builder setBackendPoolsSettings(@Nullable Input<BackendPoolsSettingsArgs> backendPoolsSettings) {
            this.backendPoolsSettings = backendPoolsSettings;
            return this;
        }

        public Builder setBackendPoolsSettings(@Nullable BackendPoolsSettingsArgs backendPoolsSettings) {
            this.backendPoolsSettings = Input.ofNullable(backendPoolsSettings);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,FrontDoorEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,FrontDoorEnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setFrontDoorName(@Nullable Input<String> frontDoorName) {
            this.frontDoorName = frontDoorName;
            return this;
        }

        public Builder setFrontDoorName(@Nullable String frontDoorName) {
            this.frontDoorName = Input.ofNullable(frontDoorName);
            return this;
        }

        public Builder setFrontendEndpoints(@Nullable Input<List<FrontendEndpointArgs>> frontendEndpoints) {
            this.frontendEndpoints = frontendEndpoints;
            return this;
        }

        public Builder setFrontendEndpoints(@Nullable List<FrontendEndpointArgs> frontendEndpoints) {
            this.frontendEndpoints = Input.ofNullable(frontendEndpoints);
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable Input<List<HealthProbeSettingsModelArgs>> healthProbeSettings) {
            this.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder setHealthProbeSettings(@Nullable List<HealthProbeSettingsModelArgs> healthProbeSettings) {
            this.healthProbeSettings = Input.ofNullable(healthProbeSettings);
            return this;
        }

        public Builder setLoadBalancingSettings(@Nullable Input<List<LoadBalancingSettingsModelArgs>> loadBalancingSettings) {
            this.loadBalancingSettings = loadBalancingSettings;
            return this;
        }

        public Builder setLoadBalancingSettings(@Nullable List<LoadBalancingSettingsModelArgs> loadBalancingSettings) {
            this.loadBalancingSettings = Input.ofNullable(loadBalancingSettings);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoutingRules(@Nullable Input<List<RoutingRuleArgs>> routingRules) {
            this.routingRules = routingRules;
            return this;
        }

        public Builder setRoutingRules(@Nullable List<RoutingRuleArgs> routingRules) {
            this.routingRules = Input.ofNullable(routingRules);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FrontDoorArgs build() {
            return new FrontDoorArgs(backendPools, backendPoolsSettings, enabledState, friendlyName, frontDoorName, frontendEndpoints, healthProbeSettings, loadBalancingSettings, location, resourceGroupName, routingRules, tags);
        }
    }
}
