// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPermissionSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPermissionSetArgs Empty = new GetPermissionSetArgs();

    @InputImport(name="instanceArn", required=true)
    private final String instanceArn;

    public String getInstanceArn() {
        return this.instanceArn;
    }

    @InputImport(name="permissionSetArn", required=true)
    private final String permissionSetArn;

    public String getPermissionSetArn() {
        return this.permissionSetArn;
    }

    public GetPermissionSetArgs(
        String instanceArn,
        String permissionSetArn) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
    }

    private GetPermissionSetArgs() {
        this.instanceArn = null;
        this.permissionSetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceArn;
        private String permissionSetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setPermissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }

        public GetPermissionSetArgs build() {
            return new GetPermissionSetArgs(instanceArn, permissionSetArn);
        }
    }
}
