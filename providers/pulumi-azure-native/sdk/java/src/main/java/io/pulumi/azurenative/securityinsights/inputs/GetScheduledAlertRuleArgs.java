// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScheduledAlertRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScheduledAlertRuleArgs Empty = new GetScheduledAlertRuleArgs();

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @InputImport(name="ruleId", required=true)
    private final String ruleId;

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetScheduledAlertRuleArgs(
        String resourceGroupName,
        String ruleId,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetScheduledAlertRuleArgs() {
        this.resourceGroupName = null;
        this.ruleId = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String ruleId;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetScheduledAlertRuleArgs build() {
            return new GetScheduledAlertRuleArgs(resourceGroupName, ruleId, workspaceName);
        }
    }
}
