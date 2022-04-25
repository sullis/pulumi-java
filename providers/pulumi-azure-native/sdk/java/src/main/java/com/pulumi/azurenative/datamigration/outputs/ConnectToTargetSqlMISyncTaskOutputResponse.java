// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConnectToTargetSqlMISyncTaskOutputResponse {
    /**
     * @return Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * @return Target server version
     * 
     */
    private final String targetServerVersion;
    /**
     * @return Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @CustomType.Constructor
    private ConnectToTargetSqlMISyncTaskOutputResponse(
        @CustomType.Parameter("targetServerBrandVersion") String targetServerBrandVersion,
        @CustomType.Parameter("targetServerVersion") String targetServerVersion,
        @CustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.targetServerBrandVersion = targetServerBrandVersion;
        this.targetServerVersion = targetServerVersion;
        this.validationErrors = validationErrors;
    }

    /**
     * @return Target server brand version
     * 
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * @return Target server version
     * 
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
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

    public static Builder builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetServerBrandVersion;
        private String targetServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }
        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }        public ConnectToTargetSqlMISyncTaskOutputResponse build() {
            return new ConnectToTargetSqlMISyncTaskOutputResponse(targetServerBrandVersion, targetServerVersion, validationErrors);
        }
    }
}
