// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTdeCertificatesSqlTaskOutputResponse {
    /**
     * @return Mapping from certificate name to base 64 encoded format.
     * 
     */
    private final Map<String,List<String>> base64EncodedCertificates;
    /**
     * @return Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @CustomType.Constructor
    private GetTdeCertificatesSqlTaskOutputResponse(
        @CustomType.Parameter("base64EncodedCertificates") Map<String,List<String>> base64EncodedCertificates,
        @CustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.base64EncodedCertificates = base64EncodedCertificates;
        this.validationErrors = validationErrors;
    }

    /**
     * @return Mapping from certificate name to base 64 encoded format.
     * 
     */
    public Map<String,List<String>> base64EncodedCertificates() {
        return this.base64EncodedCertificates;
    }
    /**
     * @return Validation errors
     * 
     */
    public List<ReportableExceptionResponse> validationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTdeCertificatesSqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,List<String>> base64EncodedCertificates;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTdeCertificatesSqlTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64EncodedCertificates = defaults.base64EncodedCertificates;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder base64EncodedCertificates(Map<String,List<String>> base64EncodedCertificates) {
            this.base64EncodedCertificates = Objects.requireNonNull(base64EncodedCertificates);
            return this;
        }
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }        public GetTdeCertificatesSqlTaskOutputResponse build() {
            return new GetTdeCertificatesSqlTaskOutputResponse(base64EncodedCertificates, validationErrors);
        }
    }
}
