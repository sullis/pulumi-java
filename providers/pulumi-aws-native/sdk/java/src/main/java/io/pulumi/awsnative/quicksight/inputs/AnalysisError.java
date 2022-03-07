// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.AnalysisErrorType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>A metadata error structure for an analysis.</p>
 * 
 */
public final class AnalysisError extends io.pulumi.resources.InvokeArgs {

    public static final AnalysisError Empty = new AnalysisError();

    /**
     * <p>The message associated with the analysis error.</p>
     * 
     */
    @InputImport(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="type")
      private final @Nullable AnalysisErrorType type;

    public Optional<AnalysisErrorType> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AnalysisError(
        @Nullable String message,
        @Nullable AnalysisErrorType type) {
        this.message = message;
        this.type = type;
    }

    private AnalysisError() {
        this.message = null;
        this.type = null;
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