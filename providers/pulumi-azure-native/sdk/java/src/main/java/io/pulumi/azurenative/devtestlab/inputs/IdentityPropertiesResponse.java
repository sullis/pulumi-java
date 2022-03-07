// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a managed identity
 * 
 */
public final class IdentityPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityPropertiesResponse Empty = new IdentityPropertiesResponse();

    /**
     * The client secret URL of the identity.
     * 
     */
    @InputImport(name="clientSecretUrl")
      private final @Nullable String clientSecretUrl;

    public Optional<String> getClientSecretUrl() {
        return this.clientSecretUrl == null ? Optional.empty() : Optional.ofNullable(this.clientSecretUrl);
    }

    /**
     * The principal id of resource identity.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> getPrincipalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    /**
     * The tenant identifier of resource.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * Managed identity.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public IdentityPropertiesResponse(
        @Nullable String clientSecretUrl,
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type) {
        this.clientSecretUrl = clientSecretUrl;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    private IdentityPropertiesResponse() {
        this.clientSecretUrl = null;
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientSecretUrl;
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientSecretUrl = defaults.clientSecretUrl;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setClientSecretUrl(@Nullable String clientSecretUrl) {
            this.clientSecretUrl = clientSecretUrl;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public IdentityPropertiesResponse build() {
            return new IdentityPropertiesResponse(clientSecretUrl, principalId, tenantId, type);
        }
    }
}