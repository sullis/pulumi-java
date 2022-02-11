// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnclaveCertificateIamRoleAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnclaveCertificateIamRoleAssociationArgs Empty = new EnclaveCertificateIamRoleAssociationArgs();

    @InputImport(name="certificateArn", required=true)
    private final Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn;
    }

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public EnclaveCertificateIamRoleAssociationArgs(
        Input<String> certificateArn,
        Input<String> roleArn) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private EnclaveCertificateIamRoleAssociationArgs() {
        this.certificateArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnclaveCertificateIamRoleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateArn;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EnclaveCertificateIamRoleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setCertificateArn(Input<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }

        public Builder setCertificateArn(String certificateArn) {
            this.certificateArn = Input.of(Objects.requireNonNull(certificateArn));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public EnclaveCertificateIamRoleAssociationArgs build() {
            return new EnclaveCertificateIamRoleAssociationArgs(certificateArn, roleArn);
        }
    }
}
