// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.awsnative.lambda.outputs.EventSourceMappingEndpoints;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingSelfManagedEventSource {
    /**
     * The endpoints for a self-managed event source.
     * 
     */
    private final @Nullable EventSourceMappingEndpoints endpoints;

    @OutputCustomType.Constructor({"endpoints"})
    private EventSourceMappingSelfManagedEventSource(@Nullable EventSourceMappingEndpoints endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * The endpoints for a self-managed event source.
     * 
     */
    public Optional<EventSourceMappingEndpoints> getEndpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSelfManagedEventSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventSourceMappingEndpoints endpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSelfManagedEventSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
        }

        public Builder setEndpoints(@Nullable EventSourceMappingEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public EventSourceMappingSelfManagedEventSource build() {
            return new EventSourceMappingSelfManagedEventSource(endpoints);
        }
    }
}
