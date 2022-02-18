// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigKinesisStreamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigKinesisStreamConfigArgs Empty = new RealtimeLogConfigKinesisStreamConfigArgs();

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="streamArn", required=true)
    private final Input<String> streamArn;

    public Input<String> getStreamArn() {
        return this.streamArn;
    }

    public RealtimeLogConfigKinesisStreamConfigArgs(
        Input<String> roleArn,
        Input<String> streamArn) {
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamArn = Objects.requireNonNull(streamArn, "expected parameter 'streamArn' to be non-null");
    }

    private RealtimeLogConfigKinesisStreamConfigArgs() {
        this.roleArn = Input.empty();
        this.streamArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigKinesisStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> roleArn;
        private Input<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigKinesisStreamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setStreamArn(Input<String> streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }

        public Builder setStreamArn(String streamArn) {
            this.streamArn = Input.of(Objects.requireNonNull(streamArn));
            return this;
        }

        public RealtimeLogConfigKinesisStreamConfigArgs build() {
            return new RealtimeLogConfigKinesisStreamConfigArgs(roleArn, streamArn);
        }
    }
}
