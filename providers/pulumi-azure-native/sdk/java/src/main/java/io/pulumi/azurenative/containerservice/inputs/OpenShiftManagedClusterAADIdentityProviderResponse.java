// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Identity provider for MS AAD.
 * 
 */
public final class OpenShiftManagedClusterAADIdentityProviderResponse extends io.pulumi.resources.InvokeArgs {

    public static final OpenShiftManagedClusterAADIdentityProviderResponse Empty = new OpenShiftManagedClusterAADIdentityProviderResponse();

    /**
     * The clientId password associated with the provider.
     * 
     */
    @InputImport(name="clientId")
    private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The groupId to be granted cluster admin role.
     * 
     */
    @InputImport(name="customerAdminGroupId")
    private final @Nullable String customerAdminGroupId;

    public Optional<String> getCustomerAdminGroupId() {
        return this.customerAdminGroupId == null ? Optional.empty() : Optional.ofNullable(this.customerAdminGroupId);
    }

    /**
     * The kind of the provider.
     * Expected value is 'AADIdentityProvider'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The secret password associated with the provider.
     * 
     */
    @InputImport(name="secret")
    private final @Nullable String secret;

    public Optional<String> getSecret() {
        return this.secret == null ? Optional.empty() : Optional.ofNullable(this.secret);
    }

    /**
     * The tenantId associated with the provider.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public OpenShiftManagedClusterAADIdentityProviderResponse(
        @Nullable String clientId,
        @Nullable String customerAdminGroupId,
        String kind,
        @Nullable String secret,
        @Nullable String tenantId) {
        this.clientId = clientId;
        this.customerAdminGroupId = customerAdminGroupId;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.secret = secret;
        this.tenantId = tenantId;
    }

    private OpenShiftManagedClusterAADIdentityProviderResponse() {
        this.clientId = null;
        this.customerAdminGroupId = null;
        this.kind = null;
        this.secret = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String customerAdminGroupId;
        private String kind;
        private @Nullable String secret;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.customerAdminGroupId = defaults.customerAdminGroupId;
    	      this.kind = defaults.kind;
    	      this.secret = defaults.secret;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setCustomerAdminGroupId(@Nullable String customerAdminGroupId) {
            this.customerAdminGroupId = customerAdminGroupId;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public OpenShiftManagedClusterAADIdentityProviderResponse build() {
            return new OpenShiftManagedClusterAADIdentityProviderResponse(clientId, customerAdminGroupId, kind, secret, tenantId);
        }
    }
}
