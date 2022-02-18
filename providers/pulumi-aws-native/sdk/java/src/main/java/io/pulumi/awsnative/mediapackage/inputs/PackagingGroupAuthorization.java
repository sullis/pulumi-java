// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PackagingGroupAuthorization extends io.pulumi.resources.InvokeArgs {

    public static final PackagingGroupAuthorization Empty = new PackagingGroupAuthorization();

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     * 
     */
    @InputImport(name="cdnIdentifierSecret", required=true)
    private final String cdnIdentifierSecret;

    public String getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    @InputImport(name="secretsRoleArn", required=true)
    private final String secretsRoleArn;

    public String getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    public PackagingGroupAuthorization(
        String cdnIdentifierSecret,
        String secretsRoleArn) {
        this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret, "expected parameter 'cdnIdentifierSecret' to be non-null");
        this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn, "expected parameter 'secretsRoleArn' to be non-null");
    }

    private PackagingGroupAuthorization() {
        this.cdnIdentifierSecret = null;
        this.secretsRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingGroupAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cdnIdentifierSecret;
        private String secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingGroupAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder setCdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }

        public Builder setSecretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }

        public PackagingGroupAuthorization build() {
            return new PackagingGroupAuthorization(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
