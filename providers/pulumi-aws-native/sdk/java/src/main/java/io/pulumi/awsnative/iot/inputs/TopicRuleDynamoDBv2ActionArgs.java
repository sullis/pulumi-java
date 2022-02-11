// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRulePutItemInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDynamoDBv2ActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamoDBv2ActionArgs Empty = new TopicRuleDynamoDBv2ActionArgs();

    @InputImport(name="putItem")
    private final @Nullable Input<TopicRulePutItemInputArgs> putItem;

    public Input<TopicRulePutItemInputArgs> getPutItem() {
        return this.putItem == null ? Input.empty() : this.putItem;
    }

    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    public TopicRuleDynamoDBv2ActionArgs(
        @Nullable Input<TopicRulePutItemInputArgs> putItem,
        @Nullable Input<String> roleArn) {
        this.putItem = putItem;
        this.roleArn = roleArn;
    }

    private TopicRuleDynamoDBv2ActionArgs() {
        this.putItem = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamoDBv2ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TopicRulePutItemInputArgs> putItem;
        private @Nullable Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamoDBv2ActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setPutItem(@Nullable Input<TopicRulePutItemInputArgs> putItem) {
            this.putItem = putItem;
            return this;
        }

        public Builder setPutItem(@Nullable TopicRulePutItemInputArgs putItem) {
            this.putItem = Input.ofNullable(putItem);
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

        public TopicRuleDynamoDBv2ActionArgs build() {
            return new TopicRuleDynamoDBv2ActionArgs(putItem, roleArn);
        }
    }
}
