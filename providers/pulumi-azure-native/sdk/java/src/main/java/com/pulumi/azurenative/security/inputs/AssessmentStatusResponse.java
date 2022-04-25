// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The result of the assessment
 * 
 */
public final class AssessmentStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssessmentStatusResponse Empty = new AssessmentStatusResponse();

    /**
     * Programmatic code for the cause of the assessment status
     * 
     */
    @Import(name="cause")
    private @Nullable String cause;

    /**
     * @return Programmatic code for the cause of the assessment status
     * 
     */
    public Optional<String> cause() {
        return Optional.ofNullable(this.cause);
    }

    /**
     * Programmatic code for the status of the assessment
     * 
     */
    @Import(name="code", required=true)
    private String code;

    /**
     * @return Programmatic code for the status of the assessment
     * 
     */
    public String code() {
        return this.code;
    }

    /**
     * Human readable description of the assessment status
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Human readable description of the assessment status
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    private AssessmentStatusResponse() {}

    private AssessmentStatusResponse(AssessmentStatusResponse $) {
        this.cause = $.cause;
        this.code = $.code;
        this.description = $.description;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentStatusResponse $;

        public Builder() {
            $ = new AssessmentStatusResponse();
        }

        public Builder(AssessmentStatusResponse defaults) {
            $ = new AssessmentStatusResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param cause Programmatic code for the cause of the assessment status
         * 
         * @return builder
         * 
         */
        public Builder cause(@Nullable String cause) {
            $.cause = cause;
            return this;
        }

        /**
         * @param code Programmatic code for the status of the assessment
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            $.code = code;
            return this;
        }

        /**
         * @param description Human readable description of the assessment status
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public AssessmentStatusResponse build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            return $;
        }
    }

}
