// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebhookArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebhookArgs Empty = new GetWebhookArgs();

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
     * The webhook name.
     * 
     */
    @InputImport(name="webhookName", required=true)
    private final String webhookName;

    public String getWebhookName() {
        return this.webhookName;
    }

    public GetWebhookArgs(
        String automationAccountName,
        String resourceGroupName,
        String webhookName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.webhookName = Objects.requireNonNull(webhookName, "expected parameter 'webhookName' to be non-null");
    }

    private GetWebhookArgs() {
        this.automationAccountName = null;
        this.resourceGroupName = null;
        this.webhookName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationAccountName;
        private String resourceGroupName;
        private String webhookName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.webhookName = defaults.webhookName;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWebhookName(String webhookName) {
            this.webhookName = Objects.requireNonNull(webhookName);
            return this;
        }

        public GetWebhookArgs build() {
            return new GetWebhookArgs(automationAccountName, resourceGroupName, webhookName);
        }
    }
}
