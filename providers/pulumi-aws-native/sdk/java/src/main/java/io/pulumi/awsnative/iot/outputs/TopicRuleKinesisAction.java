// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleKinesisAction {
    private final @Nullable String partitionKey;
    private final String roleArn;
    private final String streamName;

    @OutputCustomType.Constructor({"partitionKey","roleArn","streamName"})
    private TopicRuleKinesisAction(
        @Nullable String partitionKey,
        String roleArn,
        String streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = Objects.requireNonNull(roleArn);
        this.streamName = Objects.requireNonNull(streamName);
    }

    public Optional<String> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    public String getRoleArn() {
        return this.roleArn;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleKinesisAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partitionKey;
        private String roleArn;
        private String streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleKinesisAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setStreamName(String streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }

        public TopicRuleKinesisAction build() {
            return new TopicRuleKinesisAction(partitionKey, roleArn, streamName);
        }
    }
}
