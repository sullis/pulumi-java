// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserAssessmentComparisonPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserAssessmentComparisonPlainArgs Empty = new GetUserAssessmentComparisonPlainArgs();

    /**
     * The OCID of the baseline user assessment.
     * 
     */
    @Import(name="comparisonUserAssessmentId", required=true)
    private String comparisonUserAssessmentId;

    /**
     * @return The OCID of the baseline user assessment.
     * 
     */
    public String comparisonUserAssessmentId() {
        return this.comparisonUserAssessmentId;
    }

    /**
     * The OCID of the user assessment.
     * 
     */
    @Import(name="userAssessmentId", required=true)
    private String userAssessmentId;

    /**
     * @return The OCID of the user assessment.
     * 
     */
    public String userAssessmentId() {
        return this.userAssessmentId;
    }

    private GetUserAssessmentComparisonPlainArgs() {}

    private GetUserAssessmentComparisonPlainArgs(GetUserAssessmentComparisonPlainArgs $) {
        this.comparisonUserAssessmentId = $.comparisonUserAssessmentId;
        this.userAssessmentId = $.userAssessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserAssessmentComparisonPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserAssessmentComparisonPlainArgs $;

        public Builder() {
            $ = new GetUserAssessmentComparisonPlainArgs();
        }

        public Builder(GetUserAssessmentComparisonPlainArgs defaults) {
            $ = new GetUserAssessmentComparisonPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonUserAssessmentId The OCID of the baseline user assessment.
         * 
         * @return builder
         * 
         */
        public Builder comparisonUserAssessmentId(String comparisonUserAssessmentId) {
            $.comparisonUserAssessmentId = comparisonUserAssessmentId;
            return this;
        }

        /**
         * @param userAssessmentId The OCID of the user assessment.
         * 
         * @return builder
         * 
         */
        public Builder userAssessmentId(String userAssessmentId) {
            $.userAssessmentId = userAssessmentId;
            return this;
        }

        public GetUserAssessmentComparisonPlainArgs build() {
            $.comparisonUserAssessmentId = Objects.requireNonNull($.comparisonUserAssessmentId, "expected parameter 'comparisonUserAssessmentId' to be non-null");
            $.userAssessmentId = Objects.requireNonNull($.userAssessmentId, "expected parameter 'userAssessmentId' to be non-null");
            return $;
        }
    }

}
