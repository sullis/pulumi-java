// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityResponse {
    /**
     * Service principal object Id
     * 
     */
    private final String principalId;
    /**
     * Tenant Id
     * 
     */
    private final String tenantId;
    /**
     * Identity Type
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private IdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = type;
    }

    /**
     * Service principal object Id
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Tenant Id
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Identity Type
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type);
        }
    }
}
