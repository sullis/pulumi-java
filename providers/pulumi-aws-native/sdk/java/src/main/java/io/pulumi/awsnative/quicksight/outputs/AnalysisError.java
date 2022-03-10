// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.enums.AnalysisErrorType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AnalysisError {
    /**
     * <p>The message associated with the analysis error.</p>
     * 
     */
    private final @Nullable String message;
    private final @Nullable AnalysisErrorType type;

    @OutputCustomType.Constructor
    private AnalysisError(
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("type") @Nullable AnalysisErrorType type) {
        this.message = message;
        this.type = type;
    }

    /**
     * <p>The message associated with the analysis error.</p>
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<AnalysisErrorType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable AnalysisErrorType type;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setType(@Nullable AnalysisErrorType type) {
            this.type = type;
            return this;
        }
        public AnalysisError build() {
            return new AnalysisError(message, type);
        }
    }
}
