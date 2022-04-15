// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleErrorActionKinesis {
    /**
     * The partition key.
     * 
     */
    private final @Nullable String partitionKey;
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
     */
    private final String roleArn;
    /**
     * The name of the Amazon Kinesis stream.
     * 
     */
    private final String streamName;

    @CustomType.Constructor
    private TopicRuleErrorActionKinesis(
        @CustomType.Parameter("partitionKey") @Nullable String partitionKey,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("streamName") String streamName) {
        this.partitionKey = partitionKey;
        this.roleArn = roleArn;
        this.streamName = streamName;
    }

    /**
     * The partition key.
     * 
    */
    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
     * 
    */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * The name of the Amazon Kinesis stream.
     * 
    */
    public String streamName() {
        return this.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionKinesis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partitionKey;
        private String roleArn;
        private String streamName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionKinesis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKey = defaults.partitionKey;
    	      this.roleArn = defaults.roleArn;
    	      this.streamName = defaults.streamName;
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder streamName(String streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }        public TopicRuleErrorActionKinesis build() {
            return new TopicRuleErrorActionKinesis(partitionKey, roleArn, streamName);
        }
    }
}
