// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScopeElementResponse {
    /**
     * The alert entity type to suppress by.
     * 
     */
    private final @Nullable String field;

    @OutputCustomType.Constructor({"field"})
    private ScopeElementResponse(@Nullable String field) {
        this.field = field;
    }

    /**
     * The alert entity type to suppress by.
     * 
     */
    public Optional<String> getField() {
        return Optional.ofNullable(this.field);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public ScopeElementResponse build() {
            return new ScopeElementResponse(field);
        }
    }
}
