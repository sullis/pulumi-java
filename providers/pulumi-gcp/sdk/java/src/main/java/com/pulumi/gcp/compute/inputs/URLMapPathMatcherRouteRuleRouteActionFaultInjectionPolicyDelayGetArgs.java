// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay")
    private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;

    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs>> fixedDelay() {
        return Optional.ofNullable(this.fixedDelay);
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Double> percentage;

    /**
     * @return The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    public Optional<Output<Double>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs() {}

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs $) {
        this.fixedDelay = $.fixedDelay;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs $;

        public Builder() {
            $ = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs();
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
            $ = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedDelay Specifies the value of the fixed delay interval.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay) {
            $.fixedDelay = fixedDelay;
            return this;
        }

        /**
         * @param fixedDelay Specifies the value of the fixed delay interval.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs fixedDelay) {
            return fixedDelay(Output.of(fixedDelay));
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
         * The value must be between 0.0 and 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
         * The value must be between 0.0 and 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs build() {
            return $;
        }
    }

}
