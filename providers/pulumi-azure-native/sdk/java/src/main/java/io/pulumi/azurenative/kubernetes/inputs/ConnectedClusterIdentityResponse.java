// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Identity for the connected cluster.
 * 
 */
public final class ConnectedClusterIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectedClusterIdentityResponse Empty = new ConnectedClusterIdentityResponse();

    /**
     * The principal id of connected cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant id associated with the connected cluster. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the connected cluster. The type 'SystemAssigned, includes a system created identity. The type 'None' means no identity is assigned to the connected cluster.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ConnectedClusterIdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = type == null ? "SystemAssigned" : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConnectedClusterIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterIdentityResponse defaults) {
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

        public ConnectedClusterIdentityResponse build() {
            return new ConnectedClusterIdentityResponse(principalId, tenantId, type);
        }
    }
}
