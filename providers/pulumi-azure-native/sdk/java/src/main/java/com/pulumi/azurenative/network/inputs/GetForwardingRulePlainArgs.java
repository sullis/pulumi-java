// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetForwardingRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetForwardingRulePlainArgs Empty = new GetForwardingRulePlainArgs();

    /**
     * The name of the DNS forwarding ruleset.
     * 
     */
    @Import(name="dnsForwardingRulesetName", required=true)
    private String dnsForwardingRulesetName;

    /**
     * @return The name of the DNS forwarding ruleset.
     * 
     */
    public String dnsForwardingRulesetName() {
        return this.dnsForwardingRulesetName;
    }

    /**
     * The name of the forwarding rule.
     * 
     */
    @Import(name="forwardingRuleName", required=true)
    private String forwardingRuleName;

    /**
     * @return The name of the forwarding rule.
     * 
     */
    public String forwardingRuleName() {
        return this.forwardingRuleName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetForwardingRulePlainArgs() {}

    private GetForwardingRulePlainArgs(GetForwardingRulePlainArgs $) {
        this.dnsForwardingRulesetName = $.dnsForwardingRulesetName;
        this.forwardingRuleName = $.forwardingRuleName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetForwardingRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetForwardingRulePlainArgs $;

        public Builder() {
            $ = new GetForwardingRulePlainArgs();
        }

        public Builder(GetForwardingRulePlainArgs defaults) {
            $ = new GetForwardingRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsForwardingRulesetName The name of the DNS forwarding ruleset.
         * 
         * @return builder
         * 
         */
        public Builder dnsForwardingRulesetName(String dnsForwardingRulesetName) {
            $.dnsForwardingRulesetName = dnsForwardingRulesetName;
            return this;
        }

        /**
         * @param forwardingRuleName The name of the forwarding rule.
         * 
         * @return builder
         * 
         */
        public Builder forwardingRuleName(String forwardingRuleName) {
            $.forwardingRuleName = forwardingRuleName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetForwardingRulePlainArgs build() {
            $.dnsForwardingRulesetName = Objects.requireNonNull($.dnsForwardingRulesetName, "expected parameter 'dnsForwardingRulesetName' to be non-null");
            $.forwardingRuleName = Objects.requireNonNull($.forwardingRuleName, "expected parameter 'forwardingRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
