// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CollectorBodyAgentSpnPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CollectorBodyAgentSpnPropertiesResponse Empty = new CollectorBodyAgentSpnPropertiesResponse();

    /**
     * Application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="applicationId")
    private final @Nullable String applicationId;

    public Optional<String> getApplicationId() {
        return this.applicationId == null ? Optional.empty() : Optional.ofNullable(this.applicationId);
    }

    /**
     * Intended audience for the service principal.
     * 
     */
    @InputImport(name="audience")
    private final @Nullable String audience;

    public Optional<String> getAudience() {
        return this.audience == null ? Optional.empty() : Optional.ofNullable(this.audience);
    }

    /**
     * AAD Authority URL which was used to request the token for the service principal.
     * 
     */
    @InputImport(name="authority")
    private final @Nullable String authority;

    public Optional<String> getAuthority() {
        return this.authority == null ? Optional.empty() : Optional.ofNullable(this.authority);
    }

    /**
     * Object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="objectId")
    private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * Tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    @InputImport(name="tenantId")
    private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public CollectorBodyAgentSpnPropertiesResponse(
        @Nullable String applicationId,
        @Nullable String audience,
        @Nullable String authority,
        @Nullable String objectId,
        @Nullable String tenantId) {
        this.applicationId = applicationId;
        this.audience = audience;
        this.authority = authority;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    private CollectorBodyAgentSpnPropertiesResponse() {
        this.applicationId = null;
        this.audience = null;
        this.authority = null;
        this.objectId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectorBodyAgentSpnPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationId;
        private @Nullable String audience;
        private @Nullable String authority;
        private @Nullable String objectId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectorBodyAgentSpnPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.authority = defaults.authority;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAuthority(@Nullable String authority) {
            this.authority = authority;
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

        public CollectorBodyAgentSpnPropertiesResponse build() {
            return new CollectorBodyAgentSpnPropertiesResponse(applicationId, audience, authority, objectId, tenantId);
        }
    }
}
