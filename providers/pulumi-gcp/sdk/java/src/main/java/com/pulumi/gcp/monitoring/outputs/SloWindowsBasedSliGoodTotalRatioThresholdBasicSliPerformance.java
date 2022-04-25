// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability;
import com.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance {
    /**
     * @return Availability based SLI, dervied from count of requests made to this service that return successfully.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability availability;
    /**
     * @return Parameters for a latency threshold SLI.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency latency;
    /**
     * @return An optional set of locations to which this SLI is relevant.
     * Telemetry from other locations will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * locations in which the Service has activity. For service types
     * that don&#39;t support breaking down by location, setting this
     * field will result in an error.
     * 
     */
    private final @Nullable List<String> locations;
    /**
     * @return An optional set of RPCs to which this SLI is relevant.
     * Telemetry from other methods will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * the Service&#39;s methods. For service types that don&#39;t support
     * breaking down by method, setting this field will result in an
     * error.
     * 
     */
    private final @Nullable List<String> methods;
    /**
     * @return The set of API versions to which this SLI is relevant.
     * Telemetry from other API versions will not be used to
     * calculate performance for this SLI. If omitted,
     * this SLI applies to all API versions. For service types
     * that don&#39;t support breaking down by version, setting this
     * field will result in an error.
     * 
     */
    private final @Nullable List<String> versions;

    @CustomType.Constructor
    private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance(
        @CustomType.Parameter("availability") @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability availability,
        @CustomType.Parameter("latency") @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency latency,
        @CustomType.Parameter("locations") @Nullable List<String> locations,
        @CustomType.Parameter("methods") @Nullable List<String> methods,
        @CustomType.Parameter("versions") @Nullable List<String> versions) {
        this.availability = availability;
        this.latency = latency;
        this.locations = locations;
        this.methods = methods;
        this.versions = versions;
    }

    /**
     * @return Availability based SLI, dervied from count of requests made to this service that return successfully.
     * Structure is documented below.
     * 
     */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability> availability() {
        return Optional.ofNullable(this.availability);
    }
    /**
     * @return Parameters for a latency threshold SLI.
     * Structure is documented below.
     * 
     */
    public Optional<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency> latency() {
        return Optional.ofNullable(this.latency);
    }
    /**
     * @return An optional set of locations to which this SLI is relevant.
     * Telemetry from other locations will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * locations in which the Service has activity. For service types
     * that don&#39;t support breaking down by location, setting this
     * field will result in an error.
     * 
     */
    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * @return An optional set of RPCs to which this SLI is relevant.
     * Telemetry from other methods will not be used to calculate
     * performance for this SLI. If omitted, this SLI applies to all
     * the Service&#39;s methods. For service types that don&#39;t support
     * breaking down by method, setting this field will result in an
     * error.
     * 
     */
    public List<String> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * @return The set of API versions to which this SLI is relevant.
     * Telemetry from other API versions will not be used to
     * calculate performance for this SLI. If omitted,
     * this SLI applies to all API versions. For service types
     * that don&#39;t support breaking down by version, setting this
     * field will result in an error.
     * 
     */
    public List<String> versions() {
        return this.versions == null ? List.of() : this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability availability;
        private @Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency latency;
        private @Nullable List<String> locations;
        private @Nullable List<String> methods;
        private @Nullable List<String> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.locations = defaults.locations;
    	      this.methods = defaults.methods;
    	      this.versions = defaults.versions;
        }

        public Builder availability(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability availability) {
            this.availability = availability;
            return this;
        }
        public Builder latency(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatency latency) {
            this.latency = latency;
            return this;
        }
        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder versions(@Nullable List<String> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(String... versions) {
            return versions(List.of(versions));
        }        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformance(availability, latency, locations, methods, versions);
        }
    }
}
