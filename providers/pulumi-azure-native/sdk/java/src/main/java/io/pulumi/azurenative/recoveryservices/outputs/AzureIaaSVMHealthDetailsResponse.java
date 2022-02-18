// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AzureIaaSVMHealthDetailsResponse {
    /**
     * Health Code
     * 
     */
    private final Integer code;
    /**
     * Health Message
     * 
     */
    private final String message;
    /**
     * Health Recommended Actions
     * 
     */
    private final List<String> recommendations;
    /**
     * Health Title
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"code","message","recommendations","title"})
    private AzureIaaSVMHealthDetailsResponse(
        Integer code,
        String message,
        List<String> recommendations,
        String title) {
        this.code = Objects.requireNonNull(code);
        this.message = Objects.requireNonNull(message);
        this.recommendations = Objects.requireNonNull(recommendations);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Health Code
     * 
     */
    public Integer getCode() {
        return this.code;
    }
    /**
     * Health Message
     * 
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * Health Recommended Actions
     * 
     */
    public List<String> getRecommendations() {
        return this.recommendations;
    }
    /**
     * Health Title
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private String message;
        private List<String> recommendations;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.recommendations = defaults.recommendations;
    	      this.title = defaults.title;
        }

        public Builder setCode(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setRecommendations(List<String> recommendations) {
            this.recommendations = Objects.requireNonNull(recommendations);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public AzureIaaSVMHealthDetailsResponse build() {
            return new AzureIaaSVMHealthDetailsResponse(code, message, recommendations, title);
        }
    }
}
