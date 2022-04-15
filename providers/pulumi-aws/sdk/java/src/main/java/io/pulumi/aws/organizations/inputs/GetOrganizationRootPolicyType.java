// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationRootPolicyType extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationRootPolicyType Empty = new GetOrganizationRootPolicyType();

    /**
     * The status of the policy type as it relates to the associated root
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GetOrganizationRootPolicyType(
        String status,
        String type) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetOrganizationRootPolicyType() {
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRootPolicyType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRootPolicyType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetOrganizationRootPolicyType build() {
            return new GetOrganizationRootPolicyType(status, type);
        }
    }
}
