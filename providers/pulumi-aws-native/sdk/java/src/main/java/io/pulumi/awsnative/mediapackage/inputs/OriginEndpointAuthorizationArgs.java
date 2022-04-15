// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * CDN Authorization credentials
 * 
 */
public final class OriginEndpointAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointAuthorizationArgs Empty = new OriginEndpointAuthorizationArgs();

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
     * 
     */
    @Import(name="cdnIdentifierSecret", required=true)
      private final Output<String> cdnIdentifierSecret;

    public Output<String> cdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    @Import(name="secretsRoleArn", required=true)
      private final Output<String> secretsRoleArn;

    public Output<String> secretsRoleArn() {
        return this.secretsRoleArn;
    }

    public OriginEndpointAuthorizationArgs(
        Output<String> cdnIdentifierSecret,
        Output<String> secretsRoleArn) {
        this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret, "expected parameter 'cdnIdentifierSecret' to be non-null");
        this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn, "expected parameter 'secretsRoleArn' to be non-null");
    }

    private OriginEndpointAuthorizationArgs() {
        this.cdnIdentifierSecret = Codegen.empty();
        this.secretsRoleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cdnIdentifierSecret;
        private Output<String> secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder cdnIdentifierSecret(Output<String> cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }
        public Builder cdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Output.of(Objects.requireNonNull(cdnIdentifierSecret));
            return this;
        }
        public Builder secretsRoleArn(Output<String> secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }
        public Builder secretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Output.of(Objects.requireNonNull(secretsRoleArn));
            return this;
        }        public OriginEndpointAuthorizationArgs build() {
            return new OriginEndpointAuthorizationArgs(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
