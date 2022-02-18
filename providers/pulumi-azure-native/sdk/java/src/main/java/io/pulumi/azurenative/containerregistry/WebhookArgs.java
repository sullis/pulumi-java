// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.enums.WebhookAction;
import io.pulumi.azurenative.containerregistry.enums.WebhookStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The list of actions that trigger the webhook to post notifications.
     * 
     */
    @InputImport(name="actions", required=true)
    private final Input<List<Either<String,WebhookAction>>> actions;

    public Input<List<Either<String,WebhookAction>>> getActions() {
        return this.actions;
    }

    /**
     * Custom headers that will be added to the webhook notifications.
     * 
     */
    @InputImport(name="customHeaders")
    private final @Nullable Input<Map<String,String>> customHeaders;

    public Input<Map<String,String>> getCustomHeaders() {
        return this.customHeaders == null ? Input.empty() : this.customHeaders;
    }

    /**
     * The location of the webhook. This cannot be changed after the resource is created.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
    private final Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * The service URI for the webhook to post notifications.
     * 
     */
    @InputImport(name="serviceUri", required=true)
    private final Input<String> serviceUri;

    public Input<String> getServiceUri() {
        return this.serviceUri;
    }

    /**
     * The status of the webhook at the time the operation was called.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Either<String,WebhookStatus>> status;

    public Input<Either<String,WebhookStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The tags for the webhook.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the webhook.
     * 
     */
    @InputImport(name="webhookName")
    private final @Nullable Input<String> webhookName;

    public Input<String> getWebhookName() {
        return this.webhookName == null ? Input.empty() : this.webhookName;
    }

    public WebhookArgs(
        Input<List<Either<String,WebhookAction>>> actions,
        @Nullable Input<Map<String,String>> customHeaders,
        @Nullable Input<String> location,
        Input<String> registryName,
        Input<String> resourceGroupName,
        @Nullable Input<String> scope,
        Input<String> serviceUri,
        @Nullable Input<Either<String,WebhookStatus>> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> webhookName) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.customHeaders = customHeaders;
        this.location = location;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = scope;
        this.serviceUri = Objects.requireNonNull(serviceUri, "expected parameter 'serviceUri' to be non-null");
        this.status = status;
        this.tags = tags;
        this.webhookName = webhookName;
    }

    private WebhookArgs() {
        this.actions = Input.empty();
        this.customHeaders = Input.empty();
        this.location = Input.empty();
        this.registryName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.serviceUri = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.webhookName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Either<String,WebhookAction>>> actions;
        private @Nullable Input<Map<String,String>> customHeaders;
        private @Nullable Input<String> location;
        private Input<String> registryName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scope;
        private Input<String> serviceUri;
        private @Nullable Input<Either<String,WebhookStatus>> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> webhookName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.customHeaders = defaults.customHeaders;
    	      this.location = defaults.location;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.serviceUri = defaults.serviceUri;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.webhookName = defaults.webhookName;
        }

        public Builder setActions(Input<List<Either<String,WebhookAction>>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<Either<String,WebhookAction>> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setCustomHeaders(@Nullable Input<Map<String,String>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setCustomHeaders(@Nullable Map<String,String> customHeaders) {
            this.customHeaders = Input.ofNullable(customHeaders);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setRegistryName(Input<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Input.of(Objects.requireNonNull(registryName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setServiceUri(Input<String> serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }

        public Builder setServiceUri(String serviceUri) {
            this.serviceUri = Input.of(Objects.requireNonNull(serviceUri));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,WebhookStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,WebhookStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWebhookName(@Nullable Input<String> webhookName) {
            this.webhookName = webhookName;
            return this;
        }

        public Builder setWebhookName(@Nullable String webhookName) {
            this.webhookName = Input.ofNullable(webhookName);
            return this;
        }

        public WebhookArgs build() {
            return new WebhookArgs(actions, customHeaders, location, registryName, resourceGroupName, scope, serviceUri, status, tags, webhookName);
        }
    }
}
