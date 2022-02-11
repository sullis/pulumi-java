// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSourceMappingOnFailure extends io.pulumi.resources.InvokeArgs {

    public static final EventSourceMappingOnFailure Empty = new EventSourceMappingOnFailure();

    @InputImport(name="destination")
    private final @Nullable String destination;

    public Optional<String> getDestination() {
        return this.destination == null ? Optional.empty() : Optional.ofNullable(this.destination);
    }

    public EventSourceMappingOnFailure(@Nullable String destination) {
        this.destination = destination;
    }

    private EventSourceMappingOnFailure() {
        this.destination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingOnFailure defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public EventSourceMappingOnFailure build() {
            return new EventSourceMappingOnFailure(destination);
        }
    }
}
