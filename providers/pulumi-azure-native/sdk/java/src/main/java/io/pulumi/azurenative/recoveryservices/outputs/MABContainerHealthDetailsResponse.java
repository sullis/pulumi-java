// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MABContainerHealthDetailsResponse {
    /**
     * Health Code
     * 
     */
    private final @Nullable Integer code;
    /**
     * Health Message
     * 
     */
    private final @Nullable String message;
    /**
     * Health Recommended Actions
     * 
     */
    private final @Nullable List<String> recommendations;
    /**
     * Health Title
     * 
     */
    private final @Nullable String title;

    @OutputCustomType.Constructor({"code","message","recommendations","title"})
    private MABContainerHealthDetailsResponse(
        @Nullable Integer code,
        @Nullable String message,
        @Nullable List<String> recommendations,
        @Nullable String title) {
        this.code = code;
        this.message = message;
        this.recommendations = recommendations;
        this.title = title;
    }

    /**
     * Health Code
     * 
    */
    public Optional<Integer> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Health Message
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Health Recommended Actions
     * 
    */
    public List<String> getRecommendations() {
        return this.recommendations == null ? List.of() : this.recommendations;
    }
    /**
     * Health Title
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MABContainerHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String message;
        private @Nullable List<String> recommendations;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(MABContainerHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.recommendations = defaults.recommendations;
    	      this.title = defaults.title;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setRecommendations(@Nullable List<String> recommendations) {
            this.recommendations = recommendations;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }
        public MABContainerHealthDetailsResponse build() {
            return new MABContainerHealthDetailsResponse(code, message, recommendations, title);
        }
    }
}