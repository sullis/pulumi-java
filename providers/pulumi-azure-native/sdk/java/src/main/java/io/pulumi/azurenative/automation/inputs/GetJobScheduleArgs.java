// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetJobScheduleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetJobScheduleArgs Empty = new GetJobScheduleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
    private final String automationAccountName;

    public String getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The job schedule name.
     * 
     */
    @InputImport(name="jobScheduleId", required=true)
    private final String jobScheduleId;

    public String getJobScheduleId() {
        return this.jobScheduleId;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetJobScheduleArgs(
        String automationAccountName,
        String jobScheduleId,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.jobScheduleId = Objects.requireNonNull(jobScheduleId, "expected parameter 'jobScheduleId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetJobScheduleArgs() {
        this.automationAccountName = null;
        this.jobScheduleId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String jobScheduleId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.jobScheduleId = defaults.jobScheduleId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setJobScheduleId(String jobScheduleId) {
            this.jobScheduleId = Objects.requireNonNull(jobScheduleId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetJobScheduleArgs build() {
            return new GetJobScheduleArgs(automationAccountName, jobScheduleId, resourceGroupName);
        }
    }
}
