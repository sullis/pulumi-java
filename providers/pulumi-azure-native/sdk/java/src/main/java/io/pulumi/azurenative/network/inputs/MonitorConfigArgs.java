// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.MonitorProtocol;
import io.pulumi.azurenative.network.enums.ProfileMonitorStatus;
import io.pulumi.azurenative.network.inputs.MonitorConfigCustomHeadersArgs;
import io.pulumi.azurenative.network.inputs.MonitorConfigExpectedStatusCodeRangesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 * 
 */
public final class MonitorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitorConfigArgs Empty = new MonitorConfigArgs();

    /**
     * List of custom headers.
     * 
     */
    @InputImport(name="customHeaders")
    private final @Nullable Input<List<MonitorConfigCustomHeadersArgs>> customHeaders;

    public Input<List<MonitorConfigCustomHeadersArgs>> getCustomHeaders() {
        return this.customHeaders == null ? Input.empty() : this.customHeaders;
    }

    /**
     * List of expected status code ranges.
     * 
     */
    @InputImport(name="expectedStatusCodeRanges")
    private final @Nullable Input<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges;

    public Input<List<MonitorConfigExpectedStatusCodeRangesArgs>> getExpectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges == null ? Input.empty() : this.expectedStatusCodeRanges;
    }

    /**
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
     */
    @InputImport(name="intervalInSeconds")
    private final @Nullable Input<Double> intervalInSeconds;

    public Input<Double> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Input.empty() : this.intervalInSeconds;
    }

    /**
     * The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The TCP port used to probe for endpoint health.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Double> port;

    public Input<Double> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * 
     */
    @InputImport(name="profileMonitorStatus")
    private final @Nullable Input<Either<String,ProfileMonitorStatus>> profileMonitorStatus;

    public Input<Either<String,ProfileMonitorStatus>> getProfileMonitorStatus() {
        return this.profileMonitorStatus == null ? Input.empty() : this.profileMonitorStatus;
    }

    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,MonitorProtocol>> protocol;

    public Input<Either<String,MonitorProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     */
    @InputImport(name="timeoutInSeconds")
    private final @Nullable Input<Double> timeoutInSeconds;

    public Input<Double> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    /**
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     */
    @InputImport(name="toleratedNumberOfFailures")
    private final @Nullable Input<Double> toleratedNumberOfFailures;

    public Input<Double> getToleratedNumberOfFailures() {
        return this.toleratedNumberOfFailures == null ? Input.empty() : this.toleratedNumberOfFailures;
    }

    public MonitorConfigArgs(
        @Nullable Input<List<MonitorConfigCustomHeadersArgs>> customHeaders,
        @Nullable Input<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges,
        @Nullable Input<Double> intervalInSeconds,
        @Nullable Input<String> path,
        @Nullable Input<Double> port,
        @Nullable Input<Either<String,ProfileMonitorStatus>> profileMonitorStatus,
        @Nullable Input<Either<String,MonitorProtocol>> protocol,
        @Nullable Input<Double> timeoutInSeconds,
        @Nullable Input<Double> toleratedNumberOfFailures) {
        this.customHeaders = customHeaders;
        this.expectedStatusCodeRanges = expectedStatusCodeRanges;
        this.intervalInSeconds = intervalInSeconds;
        this.path = path;
        this.port = port;
        this.profileMonitorStatus = profileMonitorStatus;
        this.protocol = protocol;
        this.timeoutInSeconds = timeoutInSeconds;
        this.toleratedNumberOfFailures = toleratedNumberOfFailures;
    }

    private MonitorConfigArgs() {
        this.customHeaders = Input.empty();
        this.expectedStatusCodeRanges = Input.empty();
        this.intervalInSeconds = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.profileMonitorStatus = Input.empty();
        this.protocol = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.toleratedNumberOfFailures = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MonitorConfigCustomHeadersArgs>> customHeaders;
        private @Nullable Input<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges;
        private @Nullable Input<Double> intervalInSeconds;
        private @Nullable Input<String> path;
        private @Nullable Input<Double> port;
        private @Nullable Input<Either<String,ProfileMonitorStatus>> profileMonitorStatus;
        private @Nullable Input<Either<String,MonitorProtocol>> protocol;
        private @Nullable Input<Double> timeoutInSeconds;
        private @Nullable Input<Double> toleratedNumberOfFailures;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.expectedStatusCodeRanges = defaults.expectedStatusCodeRanges;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.profileMonitorStatus = defaults.profileMonitorStatus;
    	      this.protocol = defaults.protocol;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.toleratedNumberOfFailures = defaults.toleratedNumberOfFailures;
        }

        public Builder setCustomHeaders(@Nullable Input<List<MonitorConfigCustomHeadersArgs>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setCustomHeaders(@Nullable List<MonitorConfigCustomHeadersArgs> customHeaders) {
            this.customHeaders = Input.ofNullable(customHeaders);
            return this;
        }

        public Builder setExpectedStatusCodeRanges(@Nullable Input<List<MonitorConfigExpectedStatusCodeRangesArgs>> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = expectedStatusCodeRanges;
            return this;
        }

        public Builder setExpectedStatusCodeRanges(@Nullable List<MonitorConfigExpectedStatusCodeRangesArgs> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = Input.ofNullable(expectedStatusCodeRanges);
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Input<Double> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Double intervalInSeconds) {
            this.intervalInSeconds = Input.ofNullable(intervalInSeconds);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPort(@Nullable Input<Double> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Double port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProfileMonitorStatus(@Nullable Input<Either<String,ProfileMonitorStatus>> profileMonitorStatus) {
            this.profileMonitorStatus = profileMonitorStatus;
            return this;
        }

        public Builder setProfileMonitorStatus(@Nullable Either<String,ProfileMonitorStatus> profileMonitorStatus) {
            this.profileMonitorStatus = Input.ofNullable(profileMonitorStatus);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,MonitorProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,MonitorProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Input<Double> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder setToleratedNumberOfFailures(@Nullable Input<Double> toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = toleratedNumberOfFailures;
            return this;
        }

        public Builder setToleratedNumberOfFailures(@Nullable Double toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = Input.ofNullable(toleratedNumberOfFailures);
            return this;
        }

        public MonitorConfigArgs build() {
            return new MonitorConfigArgs(customHeaders, expectedStatusCodeRanges, intervalInSeconds, path, port, profileMonitorStatus, protocol, timeoutInSeconds, toleratedNumberOfFailures);
        }
    }
}
