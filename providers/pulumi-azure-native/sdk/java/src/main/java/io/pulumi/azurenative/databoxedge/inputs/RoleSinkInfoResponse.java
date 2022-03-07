// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Compute role against which events will be raised.
 * 
 */
public final class RoleSinkInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoleSinkInfoResponse Empty = new RoleSinkInfoResponse();

    /**
     * Compute role ID.
     * 
     */
    @InputImport(name="roleId", required=true)
      private final String roleId;

    public String getRoleId() {
        return this.roleId;
    }

    public RoleSinkInfoResponse(String roleId) {
        this.roleId = Objects.requireNonNull(roleId, "expected parameter 'roleId' to be non-null");
    }

    private RoleSinkInfoResponse() {
        this.roleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleSinkInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleId;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleSinkInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleId = defaults.roleId;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public RoleSinkInfoResponse build() {
            return new RoleSinkInfoResponse(roleId);
        }
    }
}