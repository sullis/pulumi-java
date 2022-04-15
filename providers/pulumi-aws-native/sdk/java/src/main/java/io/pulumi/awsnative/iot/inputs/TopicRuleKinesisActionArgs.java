// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleKinesisActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleKinesisActionArgs Empty = new TopicRuleKinesisActionArgs();

    @Import(name="partitionKey")
      private final @Nullable Output<String> partitionKey;

    public Output<String> partitionKey() {
        return this.partitionKey == null ? Codegen.empty() : this.partitionKey;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="streamName", required=true)
      private final Output<String> streamName;

    public Output<String> streamName() {
        return this.streamName;
    }

    public TopicRuleKinesisActionArgs(
        @Nullable Output<String> partitionKey,
        Output<String> roleArn,
        Output<String> streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.streamName = Objects.requireNonNull(streamName, "expected parameter 'streamName' to be non-null");
    }

    private TopicRuleKinesisActionArgs() {
        this.partitionKey = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.streamName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleKinesisActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> partitionKey;
        private Output<String> roleArn;
        private Output<String> streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleKinesisActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Codegen.ofNullable(partitionKey);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder streamName(Output<String> streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }
        public Builder streamName(String streamName) {
            this.streamName = Output.of(Objects.requireNonNull(streamName));
            return this;
        }        public TopicRuleKinesisActionArgs build() {
            return new TopicRuleKinesisActionArgs(partitionKey, roleArn, streamName);
        }
    }
}
