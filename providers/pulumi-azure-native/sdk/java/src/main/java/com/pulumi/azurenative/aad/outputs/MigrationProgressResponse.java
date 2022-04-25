// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrationProgressResponse {
    /**
     * @return Completion Percentage
     * 
     */
    private final @Nullable Double completionPercentage;
    /**
     * @return Progress Message
     * 
     */
    private final @Nullable String progressMessage;

    @CustomType.Constructor
    private MigrationProgressResponse(
        @CustomType.Parameter("completionPercentage") @Nullable Double completionPercentage,
        @CustomType.Parameter("progressMessage") @Nullable String progressMessage) {
        this.completionPercentage = completionPercentage;
        this.progressMessage = progressMessage;
    }

    /**
     * @return Completion Percentage
     * 
     */
    public Optional<Double> completionPercentage() {
        return Optional.ofNullable(this.completionPercentage);
    }
    /**
     * @return Progress Message
     * 
     */
    public Optional<String> progressMessage() {
        return Optional.ofNullable(this.progressMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double completionPercentage;
        private @Nullable String progressMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionPercentage = defaults.completionPercentage;
    	      this.progressMessage = defaults.progressMessage;
        }

        public Builder completionPercentage(@Nullable Double completionPercentage) {
            this.completionPercentage = completionPercentage;
            return this;
        }
        public Builder progressMessage(@Nullable String progressMessage) {
            this.progressMessage = progressMessage;
            return this;
        }        public MigrationProgressResponse build() {
            return new MigrationProgressResponse(completionPercentage, progressMessage);
        }
    }
}
