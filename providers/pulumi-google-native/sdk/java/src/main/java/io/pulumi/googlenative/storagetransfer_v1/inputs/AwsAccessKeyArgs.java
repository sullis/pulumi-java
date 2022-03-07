// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * AWS access key (see [AWS Security Credentials](https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html)). For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
 * 
 */
public final class AwsAccessKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsAccessKeyArgs Empty = new AwsAccessKeyArgs();

    /**
     * AWS access key ID.
     * 
     */
    @InputImport(name="accessKeyId", required=true)
      private final Input<String> accessKeyId;

    public Input<String> getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS secret access key. This field is not returned in RPC responses.
     * 
     */
    @InputImport(name="secretAccessKey", required=true)
      private final Input<String> secretAccessKey;

    public Input<String> getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public AwsAccessKeyArgs(
        Input<String> accessKeyId,
        Input<String> secretAccessKey) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
    }

    private AwsAccessKeyArgs() {
        this.accessKeyId = Input.empty();
        this.secretAccessKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsAccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessKeyId;
        private Input<String> secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsAccessKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder setAccessKeyId(Input<String> accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder setAccessKeyId(String accessKeyId) {
            this.accessKeyId = Input.of(Objects.requireNonNull(accessKeyId));
            return this;
        }

        public Builder setSecretAccessKey(Input<String> secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }

        public Builder setSecretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Input.of(Objects.requireNonNull(secretAccessKey));
            return this;
        }
        public AwsAccessKeyArgs build() {
            return new AwsAccessKeyArgs(accessKeyId, secretAccessKey);
        }
    }
}