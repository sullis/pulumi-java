// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay {
    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
    /**
     * @return The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    private final @Nullable Double percentage;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay(
        @CustomType.Parameter("fixedDelay") @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay,
        @CustomType.Parameter("percentage") @Nullable Double percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay> fixedDelay() {
        return Optional.ofNullable(this.fixedDelay);
    }
    /**
     * @return The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    public Optional<Double> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
        private @Nullable Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = percentage;
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelay(fixedDelay, percentage);
        }
    }
}
