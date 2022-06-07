// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIpFirewallRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpFirewallRuleArgs Empty = new GetIpFirewallRuleArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The IP firewall rule name
     * 
     */
    @Import(name="ruleName", required=true)
    private Output<String> ruleName;

    /**
     * @return The IP firewall rule name
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetIpFirewallRuleArgs() {}

    private GetIpFirewallRuleArgs(GetIpFirewallRuleArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.ruleName = $.ruleName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpFirewallRuleArgs $;

        public Builder() {
            $ = new GetIpFirewallRuleArgs();
        }

        public Builder(GetIpFirewallRuleArgs defaults) {
            $ = new GetIpFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param ruleName The IP firewall rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName The IP firewall rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetIpFirewallRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
