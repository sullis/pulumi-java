// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of the link mapping of prediction.
 * 
 */
public final class PredictionResponseMappings extends com.pulumi.resources.InvokeArgs {

    public static final PredictionResponseMappings Empty = new PredictionResponseMappings();

    /**
     * The grade of the link mapping.
     * 
     */
    @Import(name="grade", required=true)
    private String grade;

    /**
     * @return The grade of the link mapping.
     * 
     */
    public String grade() {
        return this.grade;
    }

    /**
     * The reason of the link mapping.
     * 
     */
    @Import(name="reason", required=true)
    private String reason;

    /**
     * @return The reason of the link mapping.
     * 
     */
    public String reason() {
        return this.reason;
    }

    /**
     * The score of the link mapping.
     * 
     */
    @Import(name="score", required=true)
    private String score;

    /**
     * @return The score of the link mapping.
     * 
     */
    public String score() {
        return this.score;
    }

    private PredictionResponseMappings() {}

    private PredictionResponseMappings(PredictionResponseMappings $) {
        this.grade = $.grade;
        this.reason = $.reason;
        this.score = $.score;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PredictionResponseMappings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PredictionResponseMappings $;

        public Builder() {
            $ = new PredictionResponseMappings();
        }

        public Builder(PredictionResponseMappings defaults) {
            $ = new PredictionResponseMappings(Objects.requireNonNull(defaults));
        }

        /**
         * @param grade The grade of the link mapping.
         * 
         * @return builder
         * 
         */
        public Builder grade(String grade) {
            $.grade = grade;
            return this;
        }

        /**
         * @param reason The reason of the link mapping.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param score The score of the link mapping.
         * 
         * @return builder
         * 
         */
        public Builder score(String score) {
            $.score = score;
            return this;
        }

        public PredictionResponseMappings build() {
            $.grade = Objects.requireNonNull($.grade, "expected parameter 'grade' to be non-null");
            $.reason = Objects.requireNonNull($.reason, "expected parameter 'reason' to be non-null");
            $.score = Objects.requireNonNull($.score, "expected parameter 'score' to be non-null");
            return $;
        }
    }

}
