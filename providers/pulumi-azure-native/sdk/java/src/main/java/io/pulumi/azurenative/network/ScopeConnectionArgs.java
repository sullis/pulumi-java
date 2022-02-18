// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScopeConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeConnectionArgs Empty = new ScopeConnectionArgs();

    /**
     * A description of the scope connection.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
    private final Input<String> networkManagerName;

    public Input<String> getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Name for the cross-tenant connection.
     * 
     */
    @InputImport(name="scopeConnectionName")
    private final @Nullable Input<String> scopeConnectionName;

    public Input<String> getScopeConnectionName() {
        return this.scopeConnectionName == null ? Input.empty() : this.scopeConnectionName;
    }

    /**
     * Tenant ID.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public ScopeConnectionArgs(
        @Nullable Input<String> description,
        Input<String> networkManagerName,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceId,
        @Nullable Input<String> scopeConnectionName,
        @Nullable Input<String> tenantId) {
        this.description = description;
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.scopeConnectionName = scopeConnectionName;
        this.tenantId = tenantId;
    }

    private ScopeConnectionArgs() {
        this.description = Input.empty();
        this.networkManagerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceId = Input.empty();
        this.scopeConnectionName = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> networkManagerName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<String> scopeConnectionName;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.scopeConnectionName = defaults.scopeConnectionName;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setNetworkManagerName(Input<String> networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Input.of(Objects.requireNonNull(networkManagerName));
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

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setScopeConnectionName(@Nullable Input<String> scopeConnectionName) {
            this.scopeConnectionName = scopeConnectionName;
            return this;
        }

        public Builder setScopeConnectionName(@Nullable String scopeConnectionName) {
            this.scopeConnectionName = Input.ofNullable(scopeConnectionName);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public ScopeConnectionArgs build() {
            return new ScopeConnectionArgs(description, networkManagerName, resourceGroupName, resourceId, scopeConnectionName, tenantId);
        }
    }
}
