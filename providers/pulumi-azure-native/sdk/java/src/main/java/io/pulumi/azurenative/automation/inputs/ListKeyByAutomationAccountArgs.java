// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListKeyByAutomationAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListKeyByAutomationAccountArgs Empty = new ListKeyByAutomationAccountArgs();

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

    public ListKeyByAutomationAccountArgs(
        String automationAccountName,
        String resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListKeyByAutomationAccountArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListKeyByAutomationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListKeyByAutomationAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListKeyByAutomationAccountArgs build() {
            return new ListKeyByAutomationAccountArgs(automationAccountName, resourceGroupName);
        }
    }
}
