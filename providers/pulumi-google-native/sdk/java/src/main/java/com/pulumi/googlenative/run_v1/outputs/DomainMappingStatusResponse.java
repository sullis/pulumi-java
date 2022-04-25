// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1.outputs.GoogleCloudRunV1ConditionResponse;
import com.pulumi.googlenative.run_v1.outputs.ResourceRecordResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DomainMappingStatusResponse {
    /**
     * @return Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
     */
    private final List<GoogleCloudRunV1ConditionResponse> conditions;
    /**
     * @return The name of the route that the mapping currently points to.
     * 
     */
    private final String mappedRouteName;
    /**
     * @return ObservedGeneration is the &#39;Generation&#39; of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
     */
    private final Integer observedGeneration;
    /**
     * @return The resource records required to configure this domain mapping. These records must be added to the domain&#39;s DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    private final List<ResourceRecordResponse> resourceRecords;
    /**
     * @return Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private DomainMappingStatusResponse(
        @CustomType.Parameter("conditions") List<GoogleCloudRunV1ConditionResponse> conditions,
        @CustomType.Parameter("mappedRouteName") String mappedRouteName,
        @CustomType.Parameter("observedGeneration") Integer observedGeneration,
        @CustomType.Parameter("resourceRecords") List<ResourceRecordResponse> resourceRecords,
        @CustomType.Parameter("url") String url) {
        this.conditions = conditions;
        this.mappedRouteName = mappedRouteName;
        this.observedGeneration = observedGeneration;
        this.resourceRecords = resourceRecords;
        this.url = url;
    }

    /**
     * @return Array of observed DomainMappingConditions, indicating the current state of the DomainMapping.
     * 
     */
    public List<GoogleCloudRunV1ConditionResponse> conditions() {
        return this.conditions;
    }
    /**
     * @return The name of the route that the mapping currently points to.
     * 
     */
    public String mappedRouteName() {
        return this.mappedRouteName;
    }
    /**
     * @return ObservedGeneration is the &#39;Generation&#39; of the DomainMapping that was last processed by the controller. Clients polling for completed reconciliation should poll until observedGeneration = metadata.generation and the Ready condition&#39;s status is True or False.
     * 
     */
    public Integer observedGeneration() {
        return this.observedGeneration;
    }
    /**
     * @return The resource records required to configure this domain mapping. These records must be added to the domain&#39;s DNS configuration in order to serve the application via this domain mapping.
     * 
     */
    public List<ResourceRecordResponse> resourceRecords() {
        return this.resourceRecords;
    }
    /**
     * @return Optional. Cloud Run fully managed: not supported Cloud Run on GKE: supported Holds the URL that will serve the traffic of the DomainMapping.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRunV1ConditionResponse> conditions;
        private String mappedRouteName;
        private Integer observedGeneration;
        private List<ResourceRecordResponse> resourceRecords;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.mappedRouteName = defaults.mappedRouteName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.resourceRecords = defaults.resourceRecords;
    	      this.url = defaults.url;
        }

        public Builder conditions(List<GoogleCloudRunV1ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(GoogleCloudRunV1ConditionResponse... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder mappedRouteName(String mappedRouteName) {
            this.mappedRouteName = Objects.requireNonNull(mappedRouteName);
            return this;
        }
        public Builder observedGeneration(Integer observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
            return this;
        }
        public Builder resourceRecords(List<ResourceRecordResponse> resourceRecords) {
            this.resourceRecords = Objects.requireNonNull(resourceRecords);
            return this;
        }
        public Builder resourceRecords(ResourceRecordResponse... resourceRecords) {
            return resourceRecords(List.of(resourceRecords));
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public DomainMappingStatusResponse build() {
            return new DomainMappingStatusResponse(conditions, mappedRouteName, observedGeneration, resourceRecords, url);
        }
    }
}
