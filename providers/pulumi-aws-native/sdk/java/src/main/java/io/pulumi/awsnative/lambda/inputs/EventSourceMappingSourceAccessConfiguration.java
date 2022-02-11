// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.enums.EventSourceMappingSourceAccessConfigurationType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSourceMappingSourceAccessConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final EventSourceMappingSourceAccessConfiguration Empty = new EventSourceMappingSourceAccessConfiguration();

    @InputImport(name="type")
    private final @Nullable EventSourceMappingSourceAccessConfigurationType type;

    public Optional<EventSourceMappingSourceAccessConfigurationType> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="uRI")
    private final @Nullable String uRI;

    public Optional<String> getURI() {
        return this.uRI == null ? Optional.empty() : Optional.ofNullable(this.uRI);
    }

    public EventSourceMappingSourceAccessConfiguration(
        @Nullable EventSourceMappingSourceAccessConfigurationType type,
        @Nullable String uRI) {
        this.type = type;
        this.uRI = uRI;
    }

    private EventSourceMappingSourceAccessConfiguration() {
        this.type = null;
        this.uRI = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSourceAccessConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventSourceMappingSourceAccessConfigurationType type;
        private @Nullable String uRI;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSourceAccessConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uRI = defaults.uRI;
        }

        public Builder setType(@Nullable EventSourceMappingSourceAccessConfigurationType type) {
            this.type = type;
            return this;
        }

        public Builder setURI(@Nullable String uRI) {
            this.uRI = uRI;
            return this;
        }

        public EventSourceMappingSourceAccessConfiguration build() {
            return new EventSourceMappingSourceAccessConfiguration(type, uRI);
        }
    }
}
