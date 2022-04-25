// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of JobOutput errors.
 * 
 */
public final class JobErrorDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobErrorDetailResponse Empty = new JobErrorDetailResponse();

    /**
     * Code describing the error detail.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return Code describing the error detail.
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * A human-readable representation of the error.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    /**
     * @return A human-readable representation of the error.
     * 
     */
    public String message() {
        return this.message;
    }

    private JobErrorDetailResponse() {}

    private JobErrorDetailResponse(JobErrorDetailResponse $) {
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobErrorDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobErrorDetailResponse $;

        public Builder() {
            $ = new JobErrorDetailResponse();
        }

        public Builder(JobErrorDetailResponse defaults) {
            $ = new JobErrorDetailResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Code describing the error detail.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param message A human-readable representation of the error.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public JobErrorDetailResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            return $;
        }
    }

}
