// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity provider details.
 * 
 */
public final class IdentityProviderDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityProviderDetailsResponse Empty = new IdentityProviderDetailsResponse();

    /**
     * The base authority for Azure Active Directory authentication.
     * 
     */
    @InputImport(name="aadAuthority")
      private final @Nullable String aadAuthority;

    public Optional<String> getAadAuthority() {
        return this.aadAuthority == null ? Optional.empty() : Optional.ofNullable(this.aadAuthority);
    }

    /**
     * The application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    /**
     * The intended Audience of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable String audience;

    public Optional<String> getAudience() {
        return this.audience == null ? Optional.empty() : Optional.ofNullable(this.audience);
    }

    /**
     * The object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="objectId")
      private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * The tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public IdentityProviderDetailsResponse(
        @Nullable String aadAuthority,
        @Nullable String applicationId,
        @Nullable String audience,
        @Nullable String objectId,
        @Nullable String tenantId) {
        this.aadAuthority = aadAuthority;
        this.applicationId = applicationId;
        this.audience = audience;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    private IdentityProviderDetailsResponse() {
        this.aadAuthority = null;
        this.applicationId = null;
        this.audience = null;
        this.objectId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAuthority;
        private @Nullable String applicationId;
        private @Nullable String audience;
        private @Nullable String objectId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthority = defaults.aadAuthority;
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAadAuthority(@Nullable String aadAuthority) {
            this.aadAuthority = aadAuthority;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public IdentityProviderDetailsResponse build() {
            return new IdentityProviderDetailsResponse(aadAuthority, applicationId, audience, objectId, tenantId);
        }
    }
}