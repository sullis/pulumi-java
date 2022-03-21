// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3VersionVariantsVariantResponse {
    /**
     * Whether the variant is for the control group.
     * 
     */
    private final Boolean isControlGroup;
    /**
     * Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
     * 
     */
    private final Double trafficAllocation;
    /**
     * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3VersionVariantsVariantResponse(
        @CustomType.Parameter("isControlGroup") Boolean isControlGroup,
        @CustomType.Parameter("trafficAllocation") Double trafficAllocation,
        @CustomType.Parameter("version") String version) {
        this.isControlGroup = isControlGroup;
        this.trafficAllocation = trafficAllocation;
        this.version = version;
    }

    /**
     * Whether the variant is for the control group.
     * 
    */
    public Boolean getIsControlGroup() {
        return this.isControlGroup;
    }
    /**
     * Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
     * 
    */
    public Double getTrafficAllocation() {
        return this.trafficAllocation;
    }
    /**
     * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VersionVariantsVariantResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isControlGroup;
        private Double trafficAllocation;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VersionVariantsVariantResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isControlGroup = defaults.isControlGroup;
    	      this.trafficAllocation = defaults.trafficAllocation;
    	      this.version = defaults.version;
        }

        public Builder isControlGroup(Boolean isControlGroup) {
            this.isControlGroup = Objects.requireNonNull(isControlGroup);
            return this;
        }
        public Builder trafficAllocation(Double trafficAllocation) {
            this.trafficAllocation = Objects.requireNonNull(trafficAllocation);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GoogleCloudDialogflowCxV3VersionVariantsVariantResponse build() {
            return new GoogleCloudDialogflowCxV3VersionVariantsVariantResponse(isControlGroup, trafficAllocation, version);
        }
    }
}
