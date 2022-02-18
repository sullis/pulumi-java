// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRulePayload;
import io.pulumi.awsnative.iot.outputs.TopicRuleTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTopicRuleResult {
    private final @Nullable String arn;
    private final @Nullable List<TopicRuleTag> tags;
    private final @Nullable TopicRulePayload topicRulePayload;

    @OutputCustomType.Constructor({"arn","tags","topicRulePayload"})
    private GetTopicRuleResult(
        @Nullable String arn,
        @Nullable List<TopicRuleTag> tags,
        @Nullable TopicRulePayload topicRulePayload) {
        this.arn = arn;
        this.tags = tags;
        this.topicRulePayload = topicRulePayload;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<TopicRuleTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<TopicRulePayload> getTopicRulePayload() {
        return Optional.ofNullable(this.topicRulePayload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<TopicRuleTag> tags;
        private @Nullable TopicRulePayload topicRulePayload;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
    	      this.topicRulePayload = defaults.topicRulePayload;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<TopicRuleTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTopicRulePayload(@Nullable TopicRulePayload topicRulePayload) {
            this.topicRulePayload = topicRulePayload;
            return this;
        }

        public GetTopicRuleResult build() {
            return new GetTopicRuleResult(arn, tags, topicRulePayload);
        }
    }
}
