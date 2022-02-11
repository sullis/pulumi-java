// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketNotificationFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketTopicConfiguration {
    private final String event;
    private final @Nullable BucketNotificationFilter filter;
    private final String topic;

    @OutputCustomType.Constructor({"event","filter","topic"})
    private BucketTopicConfiguration(
        String event,
        @Nullable BucketNotificationFilter filter,
        String topic) {
        this.event = Objects.requireNonNull(event);
        this.filter = filter;
        this.topic = Objects.requireNonNull(topic);
    }

    public String getEvent() {
        return this.event;
    }
    public Optional<BucketNotificationFilter> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTopicConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private @Nullable BucketNotificationFilter filter;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTopicConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public BucketTopicConfiguration build() {
            return new BucketTopicConfiguration(event, filter, topic);
        }
    }
}
