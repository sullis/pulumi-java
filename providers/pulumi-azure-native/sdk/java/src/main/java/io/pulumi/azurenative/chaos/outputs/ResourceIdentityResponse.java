// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceIdentityResponse {
    /**
     * GUID that represents the principal ID of this resource identity.
     * 
     */
    private final String principalId;
    /**
     * GUID that represents the tenant ID of this resource identity.
     * 
     */
    private final String tenantId;
    /**
     * String of the resource identity type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private ResourceIdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * GUID that represents the principal ID of this resource identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * GUID that represents the tenant ID of this resource identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * String of the resource identity type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityResponse defaults) {
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceIdentityResponse build() {
            return new ResourceIdentityResponse(principalId, tenantId, type);
        }
    }
}