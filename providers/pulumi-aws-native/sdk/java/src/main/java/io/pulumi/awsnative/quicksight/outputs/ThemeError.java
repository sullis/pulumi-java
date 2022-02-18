// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.ThemeErrorType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeError {
    /**
     * <p>The error message.</p>
     * 
     */
    private final @Nullable String message;
    private final @Nullable ThemeErrorType type;

    @OutputCustomType.Constructor({"message","type"})
    private ThemeError(
        @Nullable String message,
        @Nullable ThemeErrorType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * <p>The error message.</p>
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<ThemeErrorType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable ThemeErrorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setType(@Nullable ThemeErrorType type) {
            this.type = type;
            return this;
        }

        public ThemeError build() {
            return new ThemeError(message, type);
        }
    }
}
