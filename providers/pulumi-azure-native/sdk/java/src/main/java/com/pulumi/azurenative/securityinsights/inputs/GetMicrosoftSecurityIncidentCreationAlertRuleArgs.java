// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMicrosoftSecurityIncidentCreationAlertRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMicrosoftSecurityIncidentCreationAlertRuleArgs Empty = new GetMicrosoftSecurityIncidentCreationAlertRuleArgs();

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId", required=true)
    private String ruleId;

    /**
     * @return Alert rule ID
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetMicrosoftSecurityIncidentCreationAlertRuleArgs() {}

    private GetMicrosoftSecurityIncidentCreationAlertRuleArgs(GetMicrosoftSecurityIncidentCreationAlertRuleArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.ruleId = $.ruleId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMicrosoftSecurityIncidentCreationAlertRuleArgs $;

        public Builder() {
            $ = new GetMicrosoftSecurityIncidentCreationAlertRuleArgs();
        }

        public Builder(GetMicrosoftSecurityIncidentCreationAlertRuleArgs defaults) {
            $ = new GetMicrosoftSecurityIncidentCreationAlertRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param ruleId Alert rule ID
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetMicrosoftSecurityIncidentCreationAlertRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
