// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSourceMappingFilter {
    /**
     * @return The filter pattern that defines which events should be passed for invocations.
     * 
     */
    private final @Nullable String pattern;

    @CustomType.Constructor
    private EventSourceMappingFilter(@CustomType.Parameter("pattern") @Nullable String pattern) {
        this.pattern = pattern;
    }

    /**
     * @return The filter pattern that defines which events should be passed for invocations.
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }        public EventSourceMappingFilter build() {
            return new EventSourceMappingFilter(pattern);
        }
    }
}
