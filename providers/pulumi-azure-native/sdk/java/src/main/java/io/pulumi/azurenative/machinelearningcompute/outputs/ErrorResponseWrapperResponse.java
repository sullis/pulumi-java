// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.ErrorResponseResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ErrorResponseWrapperResponse {
    /**
     * The error response.
     * 
     */
    private final @Nullable ErrorResponseResponse error;

    @OutputCustomType.Constructor({"error"})
    private ErrorResponseWrapperResponse(@Nullable ErrorResponseResponse error) {
        this.error = error;
    }

    /**
     * The error response.
     * 
     */
    public Optional<ErrorResponseResponse> getError() {
        return Optional.ofNullable(this.error);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseWrapperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorResponseResponse error;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseWrapperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
        }

        public Builder setError(@Nullable ErrorResponseResponse error) {
            this.error = error;
            return this;
        }

        public ErrorResponseWrapperResponse build() {
            return new ErrorResponseWrapperResponse(error);
        }
    }
}
