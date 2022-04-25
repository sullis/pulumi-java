// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.aws.iot.outputs.TopicRuleErrorActionDynamodbv2PutItem;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleErrorActionDynamodbv2 {
    /**
     * @return Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    private final @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem;
    /**
     * @return The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private TopicRuleErrorActionDynamodbv2(
        @CustomType.Parameter("putItem") @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.putItem = putItem;
        this.roleArn = roleArn;
    }

    /**
     * @return Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * 
     */
    public Optional<TopicRuleErrorActionDynamodbv2PutItem> putItem() {
        return Optional.ofNullable(this.putItem);
    }
    /**
     * @return The IAM role ARN that allows access to the CloudWatch alarm.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionDynamodbv2 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRuleErrorActionDynamodbv2PutItem putItem;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionDynamodbv2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable TopicRuleErrorActionDynamodbv2PutItem putItem) {
            this.putItem = putItem;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public TopicRuleErrorActionDynamodbv2 build() {
            return new TopicRuleErrorActionDynamodbv2(putItem, roleArn);
        }
    }
}
