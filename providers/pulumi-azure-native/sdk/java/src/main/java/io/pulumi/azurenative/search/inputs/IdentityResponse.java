// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * The principal ID of resource identity.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public IdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
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
        private String type;

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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type);
        }
    }
}
