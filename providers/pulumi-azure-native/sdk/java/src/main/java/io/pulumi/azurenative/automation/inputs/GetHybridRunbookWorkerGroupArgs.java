// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetHybridRunbookWorkerGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHybridRunbookWorkerGroupArgs Empty = new GetHybridRunbookWorkerGroupArgs();

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
     * The hybrid runbook worker group name
     * 
     */
    @InputImport(name="hybridRunbookWorkerGroupName", required=true)
    private final String hybridRunbookWorkerGroupName;

    public String getHybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
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

    public GetHybridRunbookWorkerGroupArgs(
        String automationAccountName,
        String hybridRunbookWorkerGroupName,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetHybridRunbookWorkerGroupArgs() {
        this.automationAccountName = null;
        this.hybridRunbookWorkerGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridRunbookWorkerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String hybridRunbookWorkerGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridRunbookWorkerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.hybridRunbookWorkerGroupName = defaults.hybridRunbookWorkerGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setHybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            this.hybridRunbookWorkerGroupName = Objects.requireNonNull(hybridRunbookWorkerGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetHybridRunbookWorkerGroupArgs build() {
            return new GetHybridRunbookWorkerGroupArgs(automationAccountName, hybridRunbookWorkerGroupName, resourceGroupName);
        }
    }
}
