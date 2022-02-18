// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PackagingGroupAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingGroupAuthorizationArgs Empty = new PackagingGroupAuthorizationArgs();

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     * 
     */
    @InputImport(name="cdnIdentifierSecret", required=true)
    private final Input<String> cdnIdentifierSecret;

    public Input<String> getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    @InputImport(name="secretsRoleArn", required=true)
    private final Input<String> secretsRoleArn;

    public Input<String> getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    public PackagingGroupAuthorizationArgs(
        Input<String> cdnIdentifierSecret,
        Input<String> secretsRoleArn) {
        this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret, "expected parameter 'cdnIdentifierSecret' to be non-null");
        this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn, "expected parameter 'secretsRoleArn' to be non-null");
    }

    private PackagingGroupAuthorizationArgs() {
        this.cdnIdentifierSecret = Input.empty();
        this.secretsRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingGroupAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cdnIdentifierSecret;
        private Input<String> secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingGroupAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder setCdnIdentifierSecret(Input<String> cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }

        public Builder setCdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Input.of(Objects.requireNonNull(cdnIdentifierSecret));
            return this;
        }

        public Builder setSecretsRoleArn(Input<String> secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }

        public Builder setSecretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Input.of(Objects.requireNonNull(secretsRoleArn));
            return this;
        }

        public PackagingGroupAuthorizationArgs build() {
            return new PackagingGroupAuthorizationArgs(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
