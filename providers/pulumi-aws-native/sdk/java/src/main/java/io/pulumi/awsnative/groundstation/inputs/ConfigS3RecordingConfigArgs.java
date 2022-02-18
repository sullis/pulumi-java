// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigS3RecordingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigS3RecordingConfigArgs Empty = new ConfigS3RecordingConfigArgs();

    @InputImport(name="bucketArn")
    private final @Nullable Input<String> bucketArn;

    public Input<String> getBucketArn() {
        return this.bucketArn == null ? Input.empty() : this.bucketArn;
    }

    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public ConfigS3RecordingConfigArgs(
        @Nullable Input<String> bucketArn,
        @Nullable Input<String> prefix,
        @Nullable Input<String> roleArn) {
        this.bucketArn = bucketArn;
        this.prefix = prefix;
        this.roleArn = roleArn;
    }

    private ConfigS3RecordingConfigArgs() {
        this.bucketArn = Input.empty();
        this.prefix = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigS3RecordingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucketArn;
        private @Nullable Input<String> prefix;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigS3RecordingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.prefix = defaults.prefix;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setBucketArn(@Nullable Input<String> bucketArn) {
            this.bucketArn = bucketArn;
            return this;
        }

        public Builder setBucketArn(@Nullable String bucketArn) {
            this.bucketArn = Input.ofNullable(bucketArn);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public ConfigS3RecordingConfigArgs build() {
            return new ConfigS3RecordingConfigArgs(bucketArn, prefix, roleArn);
        }
    }
}
