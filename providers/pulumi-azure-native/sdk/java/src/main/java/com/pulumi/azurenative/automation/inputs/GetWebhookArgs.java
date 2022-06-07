// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebhookArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebhookArgs Empty = new GetWebhookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The webhook name.
     * 
     */
    @Import(name="webhookName", required=true)
    private Output<String> webhookName;

    /**
     * @return The webhook name.
     * 
     */
    public Output<String> webhookName() {
        return this.webhookName;
    }

    private GetWebhookArgs() {}

    private GetWebhookArgs(GetWebhookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.resourceGroupName = $.resourceGroupName;
        this.webhookName = $.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebhookArgs $;

        public Builder() {
            $ = new GetWebhookArgs();
        }

        public Builder(GetWebhookArgs defaults) {
            $ = new GetWebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param webhookName The webhook name.
         * 
         * @return builder
         * 
         */
        public Builder webhookName(Output<String> webhookName) {
            $.webhookName = webhookName;
            return this;
        }

        /**
         * @param webhookName The webhook name.
         * 
         * @return builder
         * 
         */
        public Builder webhookName(String webhookName) {
            return webhookName(Output.of(webhookName));
        }

        public GetWebhookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.webhookName = Objects.requireNonNull($.webhookName, "expected parameter 'webhookName' to be non-null");
            return $;
        }
    }

}
