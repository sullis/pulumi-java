// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelCustomerManagedS3 extends io.pulumi.resources.InvokeArgs {

    public static final ChannelCustomerManagedS3 Empty = new ChannelCustomerManagedS3();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="keyPrefix")
      private final @Nullable String keyPrefix;

    public Optional<String> keyPrefix() {
        return this.keyPrefix == null ? Optional.empty() : Optional.ofNullable(this.keyPrefix);
    }

    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    public ChannelCustomerManagedS3(
        String bucket,
        @Nullable String keyPrefix,
        String roleArn) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.keyPrefix = keyPrefix;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ChannelCustomerManagedS3() {
        this.bucket = null;
        this.keyPrefix = null;
        this.roleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelCustomerManagedS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String keyPrefix;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelCustomerManagedS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.keyPrefix = defaults.keyPrefix;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder keyPrefix(@Nullable String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public ChannelCustomerManagedS3 build() {
            return new ChannelCustomerManagedS3(bucket, keyPrefix, roleArn);
        }
    }
}
