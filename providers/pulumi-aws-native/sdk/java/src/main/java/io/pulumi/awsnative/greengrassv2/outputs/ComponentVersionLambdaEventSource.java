// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaEventSourceType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComponentVersionLambdaEventSource {
    private final @Nullable String topic;
    private final @Nullable ComponentVersionLambdaEventSourceType type;

    @CustomType.Constructor
    private ComponentVersionLambdaEventSource(
        @CustomType.Parameter("topic") @Nullable String topic,
        @CustomType.Parameter("type") @Nullable ComponentVersionLambdaEventSourceType type) {
        this.topic = topic;
        this.type = type;
    }

    public Optional<String> getTopic() {
        return Optional.ofNullable(this.topic);
    }
    public Optional<ComponentVersionLambdaEventSourceType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaEventSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String topic;
        private @Nullable ComponentVersionLambdaEventSourceType type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaEventSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
    	      this.type = defaults.type;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = topic;
            return this;
        }
        public Builder type(@Nullable ComponentVersionLambdaEventSourceType type) {
            this.type = type;
            return this;
        }        public ComponentVersionLambdaEventSource build() {
            return new ComponentVersionLambdaEventSource(topic, type);
        }
    }
}
