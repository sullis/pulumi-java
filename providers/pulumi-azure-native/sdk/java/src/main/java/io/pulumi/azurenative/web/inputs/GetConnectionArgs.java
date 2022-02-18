// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * Connection name
     * 
     */
    @InputImport(name="connectionName", required=true)
    private final String connectionName;

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * The resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @InputImport(name="subscriptionId")
    private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    public GetConnectionArgs(
        String connectionName,
        String resourceGroupName,
        @Nullable String subscriptionId) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subscriptionId = subscriptionId;
    }

    private GetConnectionArgs() {
        this.connectionName = null;
        this.resourceGroupName = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private String resourceGroupName;
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public GetConnectionArgs build() {
            return new GetConnectionArgs(connectionName, resourceGroupName, subscriptionId);
        }
    }
}
