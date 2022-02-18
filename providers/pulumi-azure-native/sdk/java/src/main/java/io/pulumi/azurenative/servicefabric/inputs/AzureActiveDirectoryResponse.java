// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings to enable AAD authentication on the cluster.
 * 
 */
public final class AzureActiveDirectoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureActiveDirectoryResponse Empty = new AzureActiveDirectoryResponse();

    /**
     * Azure active directory client application id.
     * 
     */
    @InputImport(name="clientApplication")
    private final @Nullable String clientApplication;

    public Optional<String> getClientApplication() {
        return this.clientApplication == null ? Optional.empty() : Optional.ofNullable(this.clientApplication);
    }

    /**
     * Azure active directory cluster application id.
     * 
     */
    @InputImport(name="clusterApplication")
    private final @Nullable String clusterApplication;

    public Optional<String> getClusterApplication() {
        return this.clusterApplication == null ? Optional.empty() : Optional.ofNullable(this.clusterApplication);
    }

    /**
     * Azure active directory tenant id.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public AzureActiveDirectoryResponse(
        @Nullable String clientApplication,
        @Nullable String clusterApplication,
        @Nullable String tenantId) {
        this.clientApplication = clientApplication;
        this.clusterApplication = clusterApplication;
        this.tenantId = tenantId;
    }

    private AzureActiveDirectoryResponse() {
        this.clientApplication = null;
        this.clusterApplication = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientApplication;
        private @Nullable String clusterApplication;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientApplication = defaults.clientApplication;
    	      this.clusterApplication = defaults.clusterApplication;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientApplication(@Nullable String clientApplication) {
            this.clientApplication = clientApplication;
            return this;
        }

        public Builder setClusterApplication(@Nullable String clusterApplication) {
            this.clusterApplication = clusterApplication;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public AzureActiveDirectoryResponse build() {
            return new AzureActiveDirectoryResponse(clientApplication, clusterApplication, tenantId);
        }
    }
}
