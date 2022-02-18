// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityPropertiesResponse {
    /**
     * The client secret URL of the identity.
     * 
     */
    private final @Nullable String clientSecretUrl;
    /**
     * The principal id of resource identity.
     * 
     */
    private final @Nullable String principalId;
    /**
     * The tenant identifier of resource.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Managed identity.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"clientSecretUrl","principalId","tenantId","type"})
    private IdentityPropertiesResponse(
        @Nullable String clientSecretUrl,
        @Nullable String principalId,
        @Nullable String tenantId,
        @Nullable String type) {
        this.clientSecretUrl = clientSecretUrl;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The client secret URL of the identity.
     * 
     */
    public Optional<String> getClientSecretUrl() {
        return Optional.ofNullable(this.clientSecretUrl);
    }
    /**
     * The principal id of resource identity.
     * 
     */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * The tenant identifier of resource.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Managed identity.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
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
