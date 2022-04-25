// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationMetricDescriptionResponse {
    /**
     * @return The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is greater than this value, Service Fabric will limit the total load of services within the application on each node to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * 
     */
    private final @Nullable Double maximumCapacity;
    /**
     * @return The name of the metric.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal to MaximumCapacity for each metric.
     * 
     */
    private final @Nullable Double reservationCapacity;
    /**
     * @return The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and MaximumCapacity must always be smaller than or equal to this value.
     * 
     */
    private final @Nullable Double totalApplicationCapacity;

    @CustomType.Constructor
    private ApplicationMetricDescriptionResponse(
        @CustomType.Parameter("maximumCapacity") @Nullable Double maximumCapacity,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("reservationCapacity") @Nullable Double reservationCapacity,
        @CustomType.Parameter("totalApplicationCapacity") @Nullable Double totalApplicationCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.name = name;
        this.reservationCapacity = reservationCapacity;
        this.totalApplicationCapacity = totalApplicationCapacity;
    }

    /**
     * @return The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is greater than this value, Service Fabric will limit the total load of services within the application on each node to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * 
     */
    public Optional<Double> maximumCapacity() {
        return Optional.ofNullable(this.maximumCapacity);
    }
    /**
     * @return The name of the metric.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal to MaximumCapacity for each metric.
     * 
     */
    public Optional<Double> reservationCapacity() {
        return Optional.ofNullable(this.reservationCapacity);
    }
    /**
     * @return The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and MaximumCapacity must always be smaller than or equal to this value.
     * 
     */
    public Optional<Double> totalApplicationCapacity() {
        return Optional.ofNullable(this.totalApplicationCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maximumCapacity;
        private @Nullable String name;
        private @Nullable Double reservationCapacity;
        private @Nullable Double totalApplicationCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationMetricDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCapacity = defaults.maximumCapacity;
    	      this.name = defaults.name;
    	      this.reservationCapacity = defaults.reservationCapacity;
    	      this.totalApplicationCapacity = defaults.totalApplicationCapacity;
        }

        public Builder maximumCapacity(@Nullable Double maximumCapacity) {
            this.maximumCapacity = maximumCapacity;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder reservationCapacity(@Nullable Double reservationCapacity) {
            this.reservationCapacity = reservationCapacity;
            return this;
        }
        public Builder totalApplicationCapacity(@Nullable Double totalApplicationCapacity) {
            this.totalApplicationCapacity = totalApplicationCapacity;
            return this;
        }        public ApplicationMetricDescriptionResponse build() {
            return new ApplicationMetricDescriptionResponse(maximumCapacity, name, reservationCapacity, totalApplicationCapacity);
        }
    }
}
