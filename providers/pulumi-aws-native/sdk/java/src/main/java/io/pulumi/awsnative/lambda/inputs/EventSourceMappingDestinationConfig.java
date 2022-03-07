// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.inputs.EventSourceMappingOnFailure;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
 * 
 */
public final class EventSourceMappingDestinationConfig extends io.pulumi.resources.InvokeArgs {

    public static final EventSourceMappingDestinationConfig Empty = new EventSourceMappingDestinationConfig();

    /**
     * The destination configuration for failed invocations.
     * 
     */
    @InputImport(name="onFailure")
      private final @Nullable EventSourceMappingOnFailure onFailure;

    public Optional<EventSourceMappingOnFailure> getOnFailure() {
        return this.onFailure == null ? Optional.empty() : Optional.ofNullable(this.onFailure);
    }

    public EventSourceMappingDestinationConfig(@Nullable EventSourceMappingOnFailure onFailure) {
        this.onFailure = onFailure;
    }

    private EventSourceMappingDestinationConfig() {
        this.onFailure = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventSourceMappingOnFailure onFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
        }

        public Builder setOnFailure(@Nullable EventSourceMappingOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        public EventSourceMappingDestinationConfig build() {
            return new EventSourceMappingDestinationConfig(onFailure);
        }
    }
}