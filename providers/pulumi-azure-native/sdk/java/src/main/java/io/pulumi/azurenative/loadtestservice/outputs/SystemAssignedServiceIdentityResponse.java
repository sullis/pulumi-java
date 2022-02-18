// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.loadtestservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SystemAssignedServiceIdentityResponse {
    /**
     * The service principal ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * Type of managed service identity (either system assigned, or none).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private SystemAssignedServiceIdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The service principal ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Type of managed service identity (either system assigned, or none).
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemAssignedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemAssignedServiceIdentityResponse defaults) {
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

        public SystemAssignedServiceIdentityResponse build() {
            return new SystemAssignedServiceIdentityResponse(principalId, tenantId, type);
        }
    }
}
