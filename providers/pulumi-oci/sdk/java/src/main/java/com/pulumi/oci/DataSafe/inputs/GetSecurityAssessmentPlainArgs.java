// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityAssessmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityAssessmentPlainArgs Empty = new GetSecurityAssessmentPlainArgs();

    /**
     * The OCID of the security assessment.
     * 
     */
    @Import(name="securityAssessmentId", required=true)
    private String securityAssessmentId;

    /**
     * @return The OCID of the security assessment.
     * 
     */
    public String securityAssessmentId() {
        return this.securityAssessmentId;
    }

    private GetSecurityAssessmentPlainArgs() {}

    private GetSecurityAssessmentPlainArgs(GetSecurityAssessmentPlainArgs $) {
        this.securityAssessmentId = $.securityAssessmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityAssessmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityAssessmentPlainArgs $;

        public Builder() {
            $ = new GetSecurityAssessmentPlainArgs();
        }

        public Builder(GetSecurityAssessmentPlainArgs defaults) {
            $ = new GetSecurityAssessmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityAssessmentId The OCID of the security assessment.
         * 
         * @return builder
         * 
         */
        public Builder securityAssessmentId(String securityAssessmentId) {
            $.securityAssessmentId = securityAssessmentId;
            return this;
        }

        public GetSecurityAssessmentPlainArgs build() {
            $.securityAssessmentId = Objects.requireNonNull($.securityAssessmentId, "expected parameter 'securityAssessmentId' to be non-null");
            return $;
        }
    }

}
