// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.azurenative.guestconfiguration.outputs.AssignmentReportResourceComplianceReasonResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssignmentReportResourceResponse {
    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    private final String complianceStatus;
    /**
     * Properties of a guest configuration assignment resource.
     * 
     */
    private final Object properties;
    /**
     * Compliance reason and reason code for a resource.
     * 
     */
    private final @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons;
    /**
     * Name of the guest configuration assignment resource setting.
     * 
     */
    private final String resourceId;

    @OutputCustomType.Constructor({"complianceStatus","properties","reasons","resourceId"})
    private AssignmentReportResourceResponse(
        String complianceStatus,
        Object properties,
        @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons,
        String resourceId) {
        this.complianceStatus = Objects.requireNonNull(complianceStatus);
        this.properties = Objects.requireNonNull(properties);
        this.reasons = reasons;
        this.resourceId = Objects.requireNonNull(resourceId);
    }

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    public String getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Properties of a guest configuration assignment resource.
     * 
     */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * Compliance reason and reason code for a resource.
     * 
     */
    public List<AssignmentReportResourceComplianceReasonResponse> getReasons() {
        return this.reasons == null ? List.of() : this.reasons;
    }
    /**
     * Name of the guest configuration assignment resource setting.
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceStatus;
        private Object properties;
        private @Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.properties = defaults.properties;
    	      this.reasons = defaults.reasons;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setComplianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setReasons(@Nullable List<AssignmentReportResourceComplianceReasonResponse> reasons) {
            this.reasons = reasons;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public AssignmentReportResourceResponse build() {
            return new AssignmentReportResourceResponse(complianceStatus, properties, reasons, resourceId);
        }
    }
}
