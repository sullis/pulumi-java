// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserRuleArgs Empty = new GetUserRuleArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName", required=true)
    private Output<String> configurationName;

    /**
     * @return The name of the network manager security Configuration.
     * 
     */
    public Output<String> configurationName() {
        return this.configurationName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Output<String> networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the network manager security Configuration rule collection.
     * 
     */
    @Import(name="ruleCollectionName", required=true)
    private Output<String> ruleCollectionName;

    /**
     * @return The name of the network manager security Configuration rule collection.
     * 
     */
    public Output<String> ruleCollectionName() {
        return this.ruleCollectionName;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="ruleName", required=true)
    private Output<String> ruleName;

    /**
     * @return The name of the rule.
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    private GetUserRuleArgs() {}

    private GetUserRuleArgs(GetUserRuleArgs $) {
        this.configurationName = $.configurationName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.ruleCollectionName = $.ruleCollectionName;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserRuleArgs $;

        public Builder() {
            $ = new GetUserRuleArgs();
        }

        public Builder(GetUserRuleArgs defaults) {
            $ = new GetUserRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The name of the network manager security Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName The name of the network manager security Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param ruleCollectionName The name of the network manager security Configuration rule collection.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollectionName(Output<String> ruleCollectionName) {
            $.ruleCollectionName = ruleCollectionName;
            return this;
        }

        /**
         * @param ruleCollectionName The name of the network manager security Configuration rule collection.
         * 
         * @return builder
         * 
         */
        public Builder ruleCollectionName(String ruleCollectionName) {
            return ruleCollectionName(Output.of(ruleCollectionName));
        }

        /**
         * @param ruleName The name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName The name of the rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public GetUserRuleArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleCollectionName = Objects.requireNonNull($.ruleCollectionName, "expected parameter 'ruleCollectionName' to be non-null");
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            return $;
        }
    }

}
