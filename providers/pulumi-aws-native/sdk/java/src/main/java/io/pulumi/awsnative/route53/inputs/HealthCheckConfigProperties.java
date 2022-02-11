// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesInsufficientDataHealthStatus;
import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesType;
import io.pulumi.awsnative.route53.inputs.HealthCheckAlarmIdentifier;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckConfigProperties extends io.pulumi.resources.InvokeArgs {

    public static final HealthCheckConfigProperties Empty = new HealthCheckConfigProperties();

    @InputImport(name="alarmIdentifier")
    private final @Nullable HealthCheckAlarmIdentifier alarmIdentifier;

    public Optional<HealthCheckAlarmIdentifier> getAlarmIdentifier() {
        return this.alarmIdentifier == null ? Optional.empty() : Optional.ofNullable(this.alarmIdentifier);
    }

    @InputImport(name="childHealthChecks")
    private final @Nullable List<String> childHealthChecks;

    public List<String> getChildHealthChecks() {
        return this.childHealthChecks == null ? List.of() : this.childHealthChecks;
    }

    @InputImport(name="enableSNI")
    private final @Nullable Boolean enableSNI;

    public Optional<Boolean> getEnableSNI() {
        return this.enableSNI == null ? Optional.empty() : Optional.ofNullable(this.enableSNI);
    }

    @InputImport(name="failureThreshold")
    private final @Nullable Integer failureThreshold;

    public Optional<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Optional.empty() : Optional.ofNullable(this.failureThreshold);
    }

    @InputImport(name="fullyQualifiedDomainName")
    private final @Nullable String fullyQualifiedDomainName;

    public Optional<String> getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName == null ? Optional.empty() : Optional.ofNullable(this.fullyQualifiedDomainName);
    }

    @InputImport(name="healthThreshold")
    private final @Nullable Integer healthThreshold;

    public Optional<Integer> getHealthThreshold() {
        return this.healthThreshold == null ? Optional.empty() : Optional.ofNullable(this.healthThreshold);
    }

    @InputImport(name="iPAddress")
    private final @Nullable String iPAddress;

    public Optional<String> getIPAddress() {
        return this.iPAddress == null ? Optional.empty() : Optional.ofNullable(this.iPAddress);
    }

    @InputImport(name="insufficientDataHealthStatus")
    private final @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus;

    public Optional<HealthCheckConfigPropertiesInsufficientDataHealthStatus> getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus == null ? Optional.empty() : Optional.ofNullable(this.insufficientDataHealthStatus);
    }

    @InputImport(name="inverted")
    private final @Nullable Boolean inverted;

    public Optional<Boolean> getInverted() {
        return this.inverted == null ? Optional.empty() : Optional.ofNullable(this.inverted);
    }

    @InputImport(name="measureLatency")
    private final @Nullable Boolean measureLatency;

    public Optional<Boolean> getMeasureLatency() {
        return this.measureLatency == null ? Optional.empty() : Optional.ofNullable(this.measureLatency);
    }

    @InputImport(name="port")
    private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    @InputImport(name="regions")
    private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }

    @InputImport(name="requestInterval")
    private final @Nullable Integer requestInterval;

    public Optional<Integer> getRequestInterval() {
        return this.requestInterval == null ? Optional.empty() : Optional.ofNullable(this.requestInterval);
    }

    @InputImport(name="resourcePath")
    private final @Nullable String resourcePath;

    public Optional<String> getResourcePath() {
        return this.resourcePath == null ? Optional.empty() : Optional.ofNullable(this.resourcePath);
    }

    @InputImport(name="routingControlArn")
    private final @Nullable String routingControlArn;

    public Optional<String> getRoutingControlArn() {
        return this.routingControlArn == null ? Optional.empty() : Optional.ofNullable(this.routingControlArn);
    }

    @InputImport(name="searchString")
    private final @Nullable String searchString;

    public Optional<String> getSearchString() {
        return this.searchString == null ? Optional.empty() : Optional.ofNullable(this.searchString);
    }

    @InputImport(name="type", required=true)
    private final HealthCheckConfigPropertiesType type;

    public HealthCheckConfigPropertiesType getType() {
        return this.type;
    }

    public HealthCheckConfigProperties(
        @Nullable HealthCheckAlarmIdentifier alarmIdentifier,
        @Nullable List<String> childHealthChecks,
        @Nullable Boolean enableSNI,
        @Nullable Integer failureThreshold,
        @Nullable String fullyQualifiedDomainName,
        @Nullable Integer healthThreshold,
        @Nullable String iPAddress,
        @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus,
        @Nullable Boolean inverted,
        @Nullable Boolean measureLatency,
        @Nullable Integer port,
        @Nullable List<String> regions,
        @Nullable Integer requestInterval,
        @Nullable String resourcePath,
        @Nullable String routingControlArn,
        @Nullable String searchString,
        HealthCheckConfigPropertiesType type) {
        this.alarmIdentifier = alarmIdentifier;
        this.childHealthChecks = childHealthChecks;
        this.enableSNI = enableSNI;
        this.failureThreshold = failureThreshold;
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        this.healthThreshold = healthThreshold;
        this.iPAddress = iPAddress;
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
        this.inverted = inverted;
        this.measureLatency = measureLatency;
        this.port = port;
        this.regions = regions;
        this.requestInterval = requestInterval;
        this.resourcePath = resourcePath;
        this.routingControlArn = routingControlArn;
        this.searchString = searchString;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HealthCheckConfigProperties() {
        this.alarmIdentifier = null;
        this.childHealthChecks = List.of();
        this.enableSNI = null;
        this.failureThreshold = null;
        this.fullyQualifiedDomainName = null;
        this.healthThreshold = null;
        this.iPAddress = null;
        this.insufficientDataHealthStatus = null;
        this.inverted = null;
        this.measureLatency = null;
        this.port = null;
        this.regions = List.of();
        this.requestInterval = null;
        this.resourcePath = null;
        this.routingControlArn = null;
        this.searchString = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthCheckAlarmIdentifier alarmIdentifier;
        private @Nullable List<String> childHealthChecks;
        private @Nullable Boolean enableSNI;
        private @Nullable Integer failureThreshold;
        private @Nullable String fullyQualifiedDomainName;
        private @Nullable Integer healthThreshold;
        private @Nullable String iPAddress;
        private @Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus;
        private @Nullable Boolean inverted;
        private @Nullable Boolean measureLatency;
        private @Nullable Integer port;
        private @Nullable List<String> regions;
        private @Nullable Integer requestInterval;
        private @Nullable String resourcePath;
        private @Nullable String routingControlArn;
        private @Nullable String searchString;
        private HealthCheckConfigPropertiesType type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmIdentifier = defaults.alarmIdentifier;
    	      this.childHealthChecks = defaults.childHealthChecks;
    	      this.enableSNI = defaults.enableSNI;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.healthThreshold = defaults.healthThreshold;
    	      this.iPAddress = defaults.iPAddress;
    	      this.insufficientDataHealthStatus = defaults.insufficientDataHealthStatus;
    	      this.inverted = defaults.inverted;
    	      this.measureLatency = defaults.measureLatency;
    	      this.port = defaults.port;
    	      this.regions = defaults.regions;
    	      this.requestInterval = defaults.requestInterval;
    	      this.resourcePath = defaults.resourcePath;
    	      this.routingControlArn = defaults.routingControlArn;
    	      this.searchString = defaults.searchString;
    	      this.type = defaults.type;
        }

        public Builder setAlarmIdentifier(@Nullable HealthCheckAlarmIdentifier alarmIdentifier) {
            this.alarmIdentifier = alarmIdentifier;
            return this;
        }

        public Builder setChildHealthChecks(@Nullable List<String> childHealthChecks) {
            this.childHealthChecks = childHealthChecks;
            return this;
        }

        public Builder setEnableSNI(@Nullable Boolean enableSNI) {
            this.enableSNI = enableSNI;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFullyQualifiedDomainName(@Nullable String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = fullyQualifiedDomainName;
            return this;
        }

        public Builder setHealthThreshold(@Nullable Integer healthThreshold) {
            this.healthThreshold = healthThreshold;
            return this;
        }

        public Builder setIPAddress(@Nullable String iPAddress) {
            this.iPAddress = iPAddress;
            return this;
        }

        public Builder setInsufficientDataHealthStatus(@Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }

        public Builder setInverted(@Nullable Boolean inverted) {
            this.inverted = inverted;
            return this;
        }

        public Builder setMeasureLatency(@Nullable Boolean measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRequestInterval(@Nullable Integer requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setResourcePath(@Nullable String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setRoutingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }

        public Builder setSearchString(@Nullable String searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder setType(HealthCheckConfigPropertiesType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public HealthCheckConfigProperties build() {
            return new HealthCheckConfigProperties(alarmIdentifier, childHealthChecks, enableSNI, failureThreshold, fullyQualifiedDomainName, healthThreshold, iPAddress, insufficientDataHealthStatus, inverted, measureLatency, port, regions, requestInterval, resourcePath, routingControlArn, searchString, type);
        }
    }
}
