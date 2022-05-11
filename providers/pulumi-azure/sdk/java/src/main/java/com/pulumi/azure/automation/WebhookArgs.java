// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Controls if Webhook is enabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Controls if Webhook is enabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Timestamp when the webhook expires. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="expiryTime", required=true)
    private Output<String> expiryTime;

    /**
     * @return Timestamp when the webhook expires. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> expiryTime() {
        return this.expiryTime;
    }

    /**
     * Specifies the name of the Webhook. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Webhook. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Map of input parameters passed to runbook.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Map of input parameters passed to runbook.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the hybrid worker group the Webhook job will run on.
     * 
     */
    @Import(name="runOnWorkerGroup")
    private @Nullable Output<String> runOnWorkerGroup;

    /**
     * @return Name of the hybrid worker group the Webhook job will run on.
     * 
     */
    public Optional<Output<String>> runOnWorkerGroup() {
        return Optional.ofNullable(this.runOnWorkerGroup);
    }

    /**
     * Name of the Automation Runbook to execute by Webhook.
     * 
     */
    @Import(name="runbookName", required=true)
    private Output<String> runbookName;

    /**
     * @return Name of the Automation Runbook to execute by Webhook.
     * 
     */
    public Output<String> runbookName() {
        return this.runbookName;
    }

    /**
     * URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.enabled = $.enabled;
        this.expiryTime = $.expiryTime;
        this.name = $.name;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.runOnWorkerGroup = $.runOnWorkerGroup;
        this.runbookName = $.runbookName;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param enabled Controls if Webhook is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Controls if Webhook is enabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expiryTime Timestamp when the webhook expires. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder expiryTime(Output<String> expiryTime) {
            $.expiryTime = expiryTime;
            return this;
        }

        /**
         * @param expiryTime Timestamp when the webhook expires. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder expiryTime(String expiryTime) {
            return expiryTime(Output.of(expiryTime));
        }

        /**
         * @param name Specifies the name of the Webhook. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Webhook. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Map of input parameters passed to runbook.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Map of input parameters passed to runbook.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param runOnWorkerGroup Name of the hybrid worker group the Webhook job will run on.
         * 
         * @return builder
         * 
         */
        public Builder runOnWorkerGroup(@Nullable Output<String> runOnWorkerGroup) {
            $.runOnWorkerGroup = runOnWorkerGroup;
            return this;
        }

        /**
         * @param runOnWorkerGroup Name of the hybrid worker group the Webhook job will run on.
         * 
         * @return builder
         * 
         */
        public Builder runOnWorkerGroup(String runOnWorkerGroup) {
            return runOnWorkerGroup(Output.of(runOnWorkerGroup));
        }

        /**
         * @param runbookName Name of the Automation Runbook to execute by Webhook.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(Output<String> runbookName) {
            $.runbookName = runbookName;
            return this;
        }

        /**
         * @param runbookName Name of the Automation Runbook to execute by Webhook.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(String runbookName) {
            return runbookName(Output.of(runbookName));
        }

        /**
         * @param uri URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public WebhookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.expiryTime = Objects.requireNonNull($.expiryTime, "expected parameter 'expiryTime' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runbookName = Objects.requireNonNull($.runbookName, "expected parameter 'runbookName' to be non-null");
            return $;
        }
    }

}
