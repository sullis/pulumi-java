// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetActionRuleByNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetActionRuleByNameArgs Empty = new GetActionRuleByNameArgs();

    /**
     * The name of action rule that needs to be fetched
     * 
     */
    @Import(name="actionRuleName", required=true)
    private Output<String> actionRuleName;

    /**
     * @return The name of action rule that needs to be fetched
     * 
     */
    public Output<String> actionRuleName() {
        return this.actionRuleName;
    }

    /**
     * Resource group name where the resource is created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource group name where the resource is created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetActionRuleByNameArgs() {}

    private GetActionRuleByNameArgs(GetActionRuleByNameArgs $) {
        this.actionRuleName = $.actionRuleName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetActionRuleByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetActionRuleByNameArgs $;

        public Builder() {
            $ = new GetActionRuleByNameArgs();
        }

        public Builder(GetActionRuleByNameArgs defaults) {
            $ = new GetActionRuleByNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionRuleName The name of action rule that needs to be fetched
         * 
         * @return builder
         * 
         */
        public Builder actionRuleName(Output<String> actionRuleName) {
            $.actionRuleName = actionRuleName;
            return this;
        }

        /**
         * @param actionRuleName The name of action rule that needs to be fetched
         * 
         * @return builder
         * 
         */
        public Builder actionRuleName(String actionRuleName) {
            return actionRuleName(Output.of(actionRuleName));
        }

        /**
         * @param resourceGroupName Resource group name where the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group name where the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetActionRuleByNameArgs build() {
            $.actionRuleName = Objects.requireNonNull($.actionRuleName, "expected parameter 'actionRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
