// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnclaveCertificateIamRoleAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEnclaveCertificateIamRoleAssociationArgs Empty = new GetEnclaveCertificateIamRoleAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the ACM certificate with which to associate the IAM role.
     * 
     */
    @Import(name="certificateArn", required=true)
      private final String certificateArn;

    public String certificateArn() {
        return this.certificateArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with the ACM certificate. You can associate up to 16 IAM roles with an ACM certificate.
     * 
     */
    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    public GetEnclaveCertificateIamRoleAssociationArgs(
        String certificateArn,
        String roleArn) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private GetEnclaveCertificateIamRoleAssociationArgs() {
        this.certificateArn = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnclaveCertificateIamRoleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnclaveCertificateIamRoleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public GetEnclaveCertificateIamRoleAssociationArgs build() {
            return new GetEnclaveCertificateIamRoleAssociationArgs(certificateArn, roleArn);
        }
    }
}
