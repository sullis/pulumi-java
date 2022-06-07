// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentMetadataInSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssessmentMetadataInSubscriptionArgs Empty = new GetAssessmentMetadataInSubscriptionArgs();

    /**
     * The Assessment Key - Unique key for the assessment type
     * 
     */
    @Import(name="assessmentMetadataName", required=true)
    private Output<String> assessmentMetadataName;

    /**
     * @return The Assessment Key - Unique key for the assessment type
     * 
     */
    public Output<String> assessmentMetadataName() {
        return this.assessmentMetadataName;
    }

    private GetAssessmentMetadataInSubscriptionArgs() {}

    private GetAssessmentMetadataInSubscriptionArgs(GetAssessmentMetadataInSubscriptionArgs $) {
        this.assessmentMetadataName = $.assessmentMetadataName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssessmentMetadataInSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssessmentMetadataInSubscriptionArgs $;

        public Builder() {
            $ = new GetAssessmentMetadataInSubscriptionArgs();
        }

        public Builder(GetAssessmentMetadataInSubscriptionArgs defaults) {
            $ = new GetAssessmentMetadataInSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type
         * 
         * @return builder
         * 
         */
        public Builder assessmentMetadataName(Output<String> assessmentMetadataName) {
            $.assessmentMetadataName = assessmentMetadataName;
            return this;
        }

        /**
         * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type
         * 
         * @return builder
         * 
         */
        public Builder assessmentMetadataName(String assessmentMetadataName) {
            return assessmentMetadataName(Output.of(assessmentMetadataName));
        }

        public GetAssessmentMetadataInSubscriptionArgs build() {
            $.assessmentMetadataName = Objects.requireNonNull($.assessmentMetadataName, "expected parameter 'assessmentMetadataName' to be non-null");
            return $;
        }
    }

}
