// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.TopicRulePayloadArgs;
import io.pulumi.awsnative.iot.inputs.TopicRuleTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleArgs Empty = new TopicRuleArgs();

    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> ruleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    @Import(name="tags")
      private final @Nullable Output<List<TopicRuleTagArgs>> tags;

    public Output<List<TopicRuleTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="topicRulePayload", required=true)
      private final Output<TopicRulePayloadArgs> topicRulePayload;

    public Output<TopicRulePayloadArgs> topicRulePayload() {
        return this.topicRulePayload;
    }

    public TopicRuleArgs(
        @Nullable Output<String> ruleName,
        @Nullable Output<List<TopicRuleTagArgs>> tags,
        Output<TopicRulePayloadArgs> topicRulePayload) {
        this.ruleName = ruleName;
        this.tags = tags;
        this.topicRulePayload = Objects.requireNonNull(topicRulePayload, "expected parameter 'topicRulePayload' to be non-null");
    }

    private TopicRuleArgs() {
        this.ruleName = Codegen.empty();
        this.tags = Codegen.empty();
        this.topicRulePayload = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ruleName;
        private @Nullable Output<List<TopicRuleTagArgs>> tags;
        private Output<TopicRulePayloadArgs> topicRulePayload;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleName = defaults.ruleName;
    	      this.tags = defaults.tags;
    	      this.topicRulePayload = defaults.topicRulePayload;
        }

        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder tags(@Nullable Output<List<TopicRuleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<TopicRuleTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(TopicRuleTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder topicRulePayload(Output<TopicRulePayloadArgs> topicRulePayload) {
            this.topicRulePayload = Objects.requireNonNull(topicRulePayload);
            return this;
        }
        public Builder topicRulePayload(TopicRulePayloadArgs topicRulePayload) {
            this.topicRulePayload = Output.of(Objects.requireNonNull(topicRulePayload));
            return this;
        }        public TopicRuleArgs build() {
            return new TopicRuleArgs(ruleName, tags, topicRulePayload);
        }
    }
}
