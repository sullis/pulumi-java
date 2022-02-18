// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapDefaultRouteActionFaultInjectionPolicyDelay {
    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    private final @Nullable Double percentage;

    @OutputCustomType.Constructor({"fixedDelay","percentage"})
    private URLMapDefaultRouteActionFaultInjectionPolicyDelay(
        @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay,
        @Nullable Double percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay> getFixedDelay() {
        return Optional.ofNullable(this.fixedDelay);
    }
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    public Optional<Double> getPercentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyDelay defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay;
        private @Nullable Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyDelay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyDelayFixedDelay fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = percentage;
            return this;
        }

        public URLMapDefaultRouteActionFaultInjectionPolicyDelay build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyDelay(fixedDelay, percentage);
        }
    }
}
