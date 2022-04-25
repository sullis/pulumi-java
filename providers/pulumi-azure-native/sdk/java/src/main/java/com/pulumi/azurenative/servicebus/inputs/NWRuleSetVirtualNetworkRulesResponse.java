// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.azurenative.servicebus.inputs.SubnetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of VirtualNetworkRules - NetworkRules resource.
 * 
 */
public final class NWRuleSetVirtualNetworkRulesResponse extends com.pulumi.resources.InvokeArgs {

    public static final NWRuleSetVirtualNetworkRulesResponse Empty = new NWRuleSetVirtualNetworkRulesResponse();

    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
    private @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    /**
     * @return Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    public Optional<Boolean> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * Subnet properties
     * 
     */
    @Import(name="subnet")
    private @Nullable SubnetResponse subnet;

    /**
     * @return Subnet properties
     * 
     */
    public Optional<SubnetResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    private NWRuleSetVirtualNetworkRulesResponse() {}

    private NWRuleSetVirtualNetworkRulesResponse(NWRuleSetVirtualNetworkRulesResponse $) {
        this.ignoreMissingVnetServiceEndpoint = $.ignoreMissingVnetServiceEndpoint;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NWRuleSetVirtualNetworkRulesResponse $;

        public Builder() {
            $ = new NWRuleSetVirtualNetworkRulesResponse();
        }

        public Builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
            $ = new NWRuleSetVirtualNetworkRulesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Value that indicates whether to ignore missing VNet Service Endpoint
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            $.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        /**
         * @param subnet Subnet properties
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable SubnetResponse subnet) {
            $.subnet = subnet;
            return this;
        }

        public NWRuleSetVirtualNetworkRulesResponse build() {
            return $;
        }
    }

}
