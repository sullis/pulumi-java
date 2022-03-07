// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesInsufficientDataHealthStatus;
import io.pulumi.awsnative.route53.enums.HealthCheckConfigPropertiesType;
import io.pulumi.awsnative.route53.inputs.HealthCheckAlarmIdentifierArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A complex type that contains information about the health check.
 * 
 */
public final class HealthCheckConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckConfigPropertiesArgs Empty = new HealthCheckConfigPropertiesArgs();

    @InputImport(name="alarmIdentifier")
      private final @Nullable Input<HealthCheckAlarmIdentifierArgs> alarmIdentifier;

    public Input<HealthCheckAlarmIdentifierArgs> getAlarmIdentifier() {
        return this.alarmIdentifier == null ? Input.empty() : this.alarmIdentifier;
    }

    @InputImport(name="childHealthChecks")
      private final @Nullable Input<List<String>> childHealthChecks;

    public Input<List<String>> getChildHealthChecks() {
        return this.childHealthChecks == null ? Input.empty() : this.childHealthChecks;
    }

    @InputImport(name="enableSNI")
      private final @Nullable Input<Boolean> enableSNI;

    public Input<Boolean> getEnableSNI() {
        return this.enableSNI == null ? Input.empty() : this.enableSNI;
    }

    @InputImport(name="failureThreshold")
      private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    @InputImport(name="fullyQualifiedDomainName")
      private final @Nullable Input<String> fullyQualifiedDomainName;

    public Input<String> getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName == null ? Input.empty() : this.fullyQualifiedDomainName;
    }

    @InputImport(name="healthThreshold")
      private final @Nullable Input<Integer> healthThreshold;

    public Input<Integer> getHealthThreshold() {
        return this.healthThreshold == null ? Input.empty() : this.healthThreshold;
    }

    @InputImport(name="iPAddress")
      private final @Nullable Input<String> iPAddress;

    public Input<String> getIPAddress() {
        return this.iPAddress == null ? Input.empty() : this.iPAddress;
    }

    @InputImport(name="insufficientDataHealthStatus")
      private final @Nullable Input<HealthCheckConfigPropertiesInsufficientDataHealthStatus> insufficientDataHealthStatus;

    public Input<HealthCheckConfigPropertiesInsufficientDataHealthStatus> getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus == null ? Input.empty() : this.insufficientDataHealthStatus;
    }

    @InputImport(name="inverted")
      private final @Nullable Input<Boolean> inverted;

    public Input<Boolean> getInverted() {
        return this.inverted == null ? Input.empty() : this.inverted;
    }

    @InputImport(name="measureLatency")
      private final @Nullable Input<Boolean> measureLatency;

    public Input<Boolean> getMeasureLatency() {
        return this.measureLatency == null ? Input.empty() : this.measureLatency;
    }

    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="regions")
      private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    @InputImport(name="requestInterval")
      private final @Nullable Input<Integer> requestInterval;

    public Input<Integer> getRequestInterval() {
        return this.requestInterval == null ? Input.empty() : this.requestInterval;
    }

    @InputImport(name="resourcePath")
      private final @Nullable Input<String> resourcePath;

    public Input<String> getResourcePath() {
        return this.resourcePath == null ? Input.empty() : this.resourcePath;
    }

    @InputImport(name="routingControlArn")
      private final @Nullable Input<String> routingControlArn;

    public Input<String> getRoutingControlArn() {
        return this.routingControlArn == null ? Input.empty() : this.routingControlArn;
    }

    @InputImport(name="searchString")
      private final @Nullable Input<String> searchString;

    public Input<String> getSearchString() {
        return this.searchString == null ? Input.empty() : this.searchString;
    }

    @InputImport(name="type", required=true)
      private final Input<HealthCheckConfigPropertiesType> type;

    public Input<HealthCheckConfigPropertiesType> getType() {
        return this.type;
    }

    public HealthCheckConfigPropertiesArgs(
        @Nullable Input<HealthCheckAlarmIdentifierArgs> alarmIdentifier,
        @Nullable Input<List<String>> childHealthChecks,
        @Nullable Input<Boolean> enableSNI,
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<String> fullyQualifiedDomainName,
        @Nullable Input<Integer> healthThreshold,
        @Nullable Input<String> iPAddress,
        @Nullable Input<HealthCheckConfigPropertiesInsufficientDataHealthStatus> insufficientDataHealthStatus,
        @Nullable Input<Boolean> inverted,
        @Nullable Input<Boolean> measureLatency,
        @Nullable Input<Integer> port,
        @Nullable Input<List<String>> regions,
        @Nullable Input<Integer> requestInterval,
        @Nullable Input<String> resourcePath,
        @Nullable Input<String> routingControlArn,
        @Nullable Input<String> searchString,
        Input<HealthCheckConfigPropertiesType> type) {
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

    private HealthCheckConfigPropertiesArgs() {
        this.alarmIdentifier = Input.empty();
        this.childHealthChecks = Input.empty();
        this.enableSNI = Input.empty();
        this.failureThreshold = Input.empty();
        this.fullyQualifiedDomainName = Input.empty();
        this.healthThreshold = Input.empty();
        this.iPAddress = Input.empty();
        this.insufficientDataHealthStatus = Input.empty();
        this.inverted = Input.empty();
        this.measureLatency = Input.empty();
        this.port = Input.empty();
        this.regions = Input.empty();
        this.requestInterval = Input.empty();
        this.resourcePath = Input.empty();
        this.routingControlArn = Input.empty();
        this.searchString = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HealthCheckAlarmIdentifierArgs> alarmIdentifier;
        private @Nullable Input<List<String>> childHealthChecks;
        private @Nullable Input<Boolean> enableSNI;
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<String> fullyQualifiedDomainName;
        private @Nullable Input<Integer> healthThreshold;
        private @Nullable Input<String> iPAddress;
        private @Nullable Input<HealthCheckConfigPropertiesInsufficientDataHealthStatus> insufficientDataHealthStatus;
        private @Nullable Input<Boolean> inverted;
        private @Nullable Input<Boolean> measureLatency;
        private @Nullable Input<Integer> port;
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<Integer> requestInterval;
        private @Nullable Input<String> resourcePath;
        private @Nullable Input<String> routingControlArn;
        private @Nullable Input<String> searchString;
        private Input<HealthCheckConfigPropertiesType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckConfigPropertiesArgs defaults) {
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

        public Builder setAlarmIdentifier(@Nullable Input<HealthCheckAlarmIdentifierArgs> alarmIdentifier) {
            this.alarmIdentifier = alarmIdentifier;
            return this;
        }

        public Builder setAlarmIdentifier(@Nullable HealthCheckAlarmIdentifierArgs alarmIdentifier) {
            this.alarmIdentifier = Input.ofNullable(alarmIdentifier);
            return this;
        }

        public Builder setChildHealthChecks(@Nullable Input<List<String>> childHealthChecks) {
            this.childHealthChecks = childHealthChecks;
            return this;
        }

        public Builder setChildHealthChecks(@Nullable List<String> childHealthChecks) {
            this.childHealthChecks = Input.ofNullable(childHealthChecks);
            return this;
        }

        public Builder setEnableSNI(@Nullable Input<Boolean> enableSNI) {
            this.enableSNI = enableSNI;
            return this;
        }

        public Builder setEnableSNI(@Nullable Boolean enableSNI) {
            this.enableSNI = Input.ofNullable(enableSNI);
            return this;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setFullyQualifiedDomainName(@Nullable Input<String> fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = fullyQualifiedDomainName;
            return this;
        }

        public Builder setFullyQualifiedDomainName(@Nullable String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = Input.ofNullable(fullyQualifiedDomainName);
            return this;
        }

        public Builder setHealthThreshold(@Nullable Input<Integer> healthThreshold) {
            this.healthThreshold = healthThreshold;
            return this;
        }

        public Builder setHealthThreshold(@Nullable Integer healthThreshold) {
            this.healthThreshold = Input.ofNullable(healthThreshold);
            return this;
        }

        public Builder setIPAddress(@Nullable Input<String> iPAddress) {
            this.iPAddress = iPAddress;
            return this;
        }

        public Builder setIPAddress(@Nullable String iPAddress) {
            this.iPAddress = Input.ofNullable(iPAddress);
            return this;
        }

        public Builder setInsufficientDataHealthStatus(@Nullable Input<HealthCheckConfigPropertiesInsufficientDataHealthStatus> insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = insufficientDataHealthStatus;
            return this;
        }

        public Builder setInsufficientDataHealthStatus(@Nullable HealthCheckConfigPropertiesInsufficientDataHealthStatus insufficientDataHealthStatus) {
            this.insufficientDataHealthStatus = Input.ofNullable(insufficientDataHealthStatus);
            return this;
        }

        public Builder setInverted(@Nullable Input<Boolean> inverted) {
            this.inverted = inverted;
            return this;
        }

        public Builder setInverted(@Nullable Boolean inverted) {
            this.inverted = Input.ofNullable(inverted);
            return this;
        }

        public Builder setMeasureLatency(@Nullable Input<Boolean> measureLatency) {
            this.measureLatency = measureLatency;
            return this;
        }

        public Builder setMeasureLatency(@Nullable Boolean measureLatency) {
            this.measureLatency = Input.ofNullable(measureLatency);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder setRequestInterval(@Nullable Input<Integer> requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setRequestInterval(@Nullable Integer requestInterval) {
            this.requestInterval = Input.ofNullable(requestInterval);
            return this;
        }

        public Builder setResourcePath(@Nullable Input<String> resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setResourcePath(@Nullable String resourcePath) {
            this.resourcePath = Input.ofNullable(resourcePath);
            return this;
        }

        public Builder setRoutingControlArn(@Nullable Input<String> routingControlArn) {
            this.routingControlArn = routingControlArn;
            return this;
        }

        public Builder setRoutingControlArn(@Nullable String routingControlArn) {
            this.routingControlArn = Input.ofNullable(routingControlArn);
            return this;
        }

        public Builder setSearchString(@Nullable Input<String> searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder setSearchString(@Nullable String searchString) {
            this.searchString = Input.ofNullable(searchString);
            return this;
        }

        public Builder setType(Input<HealthCheckConfigPropertiesType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(HealthCheckConfigPropertiesType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public HealthCheckConfigPropertiesArgs build() {
            return new HealthCheckConfigPropertiesArgs(alarmIdentifier, childHealthChecks, enableSNI, failureThreshold, fullyQualifiedDomainName, healthThreshold, iPAddress, insufficientDataHealthStatus, inverted, measureLatency, port, regions, requestInterval, resourcePath, routingControlArn, searchString, type);
        }
    }
}