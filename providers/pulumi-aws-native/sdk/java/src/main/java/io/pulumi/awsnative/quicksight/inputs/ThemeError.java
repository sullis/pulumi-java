// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.ThemeErrorType;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeError extends io.pulumi.resources.InvokeArgs {

    public static final ThemeError Empty = new ThemeError();

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="type")
    private final @Nullable ThemeErrorType type;

    public Optional<ThemeErrorType> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ThemeError(
        @Nullable String message,
        @Nullable ThemeErrorType type) {
        this.message = message;
        this.type = type;
    }

    private ThemeError() {
        this.message = null;
        this.type = null;
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
