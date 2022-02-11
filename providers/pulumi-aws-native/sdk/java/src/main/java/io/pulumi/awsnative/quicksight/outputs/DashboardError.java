// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.DashboardErrorType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DashboardError {
    private final @Nullable String message;
    private final @Nullable DashboardErrorType type;

    @OutputCustomType.Constructor({"message","type"})
    private DashboardError(
        @Nullable String message,
        @Nullable DashboardErrorType type) {
        this.message = message;
        this.type = type;
    }

    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<DashboardErrorType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable DashboardErrorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setType(@Nullable DashboardErrorType type) {
            this.type = type;
            return this;
        }

        public DashboardError build() {
            return new DashboardError(message, type);
        }
    }
}
