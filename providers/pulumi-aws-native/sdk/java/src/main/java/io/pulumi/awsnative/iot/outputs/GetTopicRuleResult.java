// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRulePayload;
import io.pulumi.awsnative.iot.outputs.TopicRuleTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicRuleResult {
    private final @Nullable String arn;
    private final @Nullable List<TopicRuleTag> tags;
    private final @Nullable TopicRulePayload topicRulePayload;

    @CustomType.Constructor
    private GetTopicRuleResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("tags") @Nullable List<TopicRuleTag> tags,
        @CustomType.Parameter("topicRulePayload") @Nullable TopicRulePayload topicRulePayload) {
        this.arn = arn;
        this.tags = tags;
        this.topicRulePayload = topicRulePayload;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public List<TopicRuleTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<TopicRulePayload> topicRulePayload() {
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

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder tags(@Nullable List<TopicRuleTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TopicRuleTag... tags) {
            return tags(List.of(tags));
        }
        public Builder topicRulePayload(@Nullable TopicRulePayload topicRulePayload) {
            this.topicRulePayload = topicRulePayload;
            return this;
        }        public GetTopicRuleResult build() {
            return new GetTopicRuleResult(arn, tags, topicRulePayload);
        }
    }
}
