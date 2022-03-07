// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineJobErrorResponse {
    /**
     * The error code.
     * 
     */
    private final @Nullable String code;
    /**
     * The error message.
     * 
     */
    private final @Nullable String message;

    @OutputCustomType.Constructor({"code","message"})
    private PipelineJobErrorResponse(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * The error code.
     * 
    */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * The error message.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineJobErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineJobErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }
        public PipelineJobErrorResponse build() {
            return new PipelineJobErrorResponse(code, message);
        }
    }
}