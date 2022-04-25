// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FailureInfoResponse {
    /**
     * @return Explains the failure issue in more detail using hard-coded text.
     * 
     */
    private final String detail;
    /**
     * @return The name of the failure.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FailureInfoResponse(
        @CustomType.Parameter("detail") String detail,
        @CustomType.Parameter("type") String type) {
        this.detail = detail;
        this.type = type;
    }

    /**
     * @return Explains the failure issue in more detail using hard-coded text.
     * 
     */
    public String detail() {
        return this.detail;
    }
    /**
     * @return The name of the failure.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detail;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FailureInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detail = defaults.detail;
    	      this.type = defaults.type;
        }

        public Builder detail(String detail) {
            this.detail = Objects.requireNonNull(detail);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FailureInfoResponse build() {
            return new FailureInfoResponse(detail, type);
        }
    }
}
