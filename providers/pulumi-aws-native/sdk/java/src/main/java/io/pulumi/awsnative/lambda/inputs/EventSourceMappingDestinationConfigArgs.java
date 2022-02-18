// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.inputs.EventSourceMappingOnFailureArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
 * 
 */
public final class EventSourceMappingDestinationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingDestinationConfigArgs Empty = new EventSourceMappingDestinationConfigArgs();

    /**
     * The destination configuration for failed invocations.
     * 
     */
    @InputImport(name="onFailure")
    private final @Nullable Input<EventSourceMappingOnFailureArgs> onFailure;

    public Input<EventSourceMappingOnFailureArgs> getOnFailure() {
        return this.onFailure == null ? Input.empty() : this.onFailure;
    }

    public EventSourceMappingDestinationConfigArgs(@Nullable Input<EventSourceMappingOnFailureArgs> onFailure) {
        this.onFailure = onFailure;
    }

    private EventSourceMappingDestinationConfigArgs() {
        this.onFailure = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EventSourceMappingOnFailureArgs> onFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
        }

        public Builder setOnFailure(@Nullable Input<EventSourceMappingOnFailureArgs> onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        public Builder setOnFailure(@Nullable EventSourceMappingOnFailureArgs onFailure) {
            this.onFailure = Input.ofNullable(onFailure);
            return this;
        }

        public EventSourceMappingDestinationConfigArgs build() {
            return new EventSourceMappingDestinationConfigArgs(onFailure);
        }
    }
}
