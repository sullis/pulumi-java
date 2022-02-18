// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRoleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleArgs Empty = new GetRoleArgs();

    /**
     * A name for the IAM role, up to 64 characters in length.
     * 
     */
    @InputImport(name="roleName", required=true)
    private final String roleName;

    public String getRoleName() {
        return this.roleName;
    }

    public GetRoleArgs(String roleName) {
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private GetRoleArgs() {
        this.roleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleName = defaults.roleName;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }

        public GetRoleArgs build() {
            return new GetRoleArgs(roleName);
        }
    }
}
