// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobErrorDetailResponse {
    /**
     * @return Code describing the error detail.
     * 
     */
    private final String code;
    /**
     * @return A human-readable representation of the error.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private JobErrorDetailResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Code describing the error detail.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return A human-readable representation of the error.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(JobErrorDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public JobErrorDetailResponse build() {
            return new JobErrorDetailResponse(code, message);
        }
    }
}
