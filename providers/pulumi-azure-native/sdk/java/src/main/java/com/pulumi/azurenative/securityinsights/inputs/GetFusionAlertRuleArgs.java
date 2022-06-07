// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFusionAlertRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFusionAlertRuleArgs Empty = new GetFusionAlertRuleArgs();

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId", required=true)
    private Output<String> ruleId;

    /**
     * @return Alert rule ID
     * 
     */
    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private GetFusionAlertRuleArgs() {}

    private GetFusionAlertRuleArgs(GetFusionAlertRuleArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.ruleId = $.ruleId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFusionAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFusionAlertRuleArgs $;

        public Builder() {
            $ = new GetFusionAlertRuleArgs();
        }

        public Builder(GetFusionAlertRuleArgs defaults) {
            $ = new GetFusionAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param ruleId Alert rule ID
         * 
         * @return builder
         * 
         */
        public Builder ruleId(Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId Alert rule ID
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public GetFusionAlertRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
