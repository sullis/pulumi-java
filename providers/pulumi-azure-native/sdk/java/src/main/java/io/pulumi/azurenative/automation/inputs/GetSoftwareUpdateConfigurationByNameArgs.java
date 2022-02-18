// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSoftwareUpdateConfigurationByNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSoftwareUpdateConfigurationByNameArgs Empty = new GetSoftwareUpdateConfigurationByNameArgs();

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
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the software update configuration to be created.
     * 
     */
    @InputImport(name="softwareUpdateConfigurationName", required=true)
    private final String softwareUpdateConfigurationName;

    public String getSoftwareUpdateConfigurationName() {
        return this.softwareUpdateConfigurationName;
    }

    public GetSoftwareUpdateConfigurationByNameArgs(
        String automationAccountName,
        String resourceGroupName,
        String softwareUpdateConfigurationName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.softwareUpdateConfigurationName = Objects.requireNonNull(softwareUpdateConfigurationName, "expected parameter 'softwareUpdateConfigurationName' to be non-null");
    }

    private GetSoftwareUpdateConfigurationByNameArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.softwareUpdateConfigurationName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSoftwareUpdateConfigurationByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String softwareUpdateConfigurationName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSoftwareUpdateConfigurationByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.softwareUpdateConfigurationName = defaults.softwareUpdateConfigurationName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSoftwareUpdateConfigurationName(String softwareUpdateConfigurationName) {
            this.softwareUpdateConfigurationName = Objects.requireNonNull(softwareUpdateConfigurationName);
            return this;
        }

        public GetSoftwareUpdateConfigurationByNameArgs build() {
            return new GetSoftwareUpdateConfigurationByNameArgs(automationAccountName, resourceGroupName, softwareUpdateConfigurationName);
        }
    }
}
