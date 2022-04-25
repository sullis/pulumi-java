// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionBaseEjectionTimeGetArgs;
import com.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionIntervalGetArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceOutlierDetectionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceOutlierDetectionGetArgs Empty = new BackendServiceOutlierDetectionGetArgs();

    /**
     * The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * 
     */
    @Import(name="baseEjectionTime")
    private @Nullable Output<BackendServiceOutlierDetectionBaseEjectionTimeGetArgs> baseEjectionTime;

    /**
     * @return The base time that a host is ejected for. The real time is equal to the base
     * time multiplied by the number of times the host has been ejected. Defaults to
     * 30000ms or 30s.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackendServiceOutlierDetectionBaseEjectionTimeGetArgs>> baseEjectionTime() {
        return Optional.ofNullable(this.baseEjectionTime);
    }

    /**
     * Number of errors before a host is ejected from the connection pool. When the
     * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
     * Defaults to 5.
     * 
     */
    @Import(name="consecutiveErrors")
    private @Nullable Output<Integer> consecutiveErrors;

    /**
     * @return Number of errors before a host is ejected from the connection pool. When the
     * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
     * Defaults to 5.
     * 
     */
    public Optional<Output<Integer>> consecutiveErrors() {
        return Optional.ofNullable(this.consecutiveErrors);
    }

    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection
     * errors that are mapped to one of those status codes) before a consecutive
     * gateway failure ejection occurs. Defaults to 5.
     * 
     */
    @Import(name="consecutiveGatewayFailure")
    private @Nullable Output<Integer> consecutiveGatewayFailure;

    /**
     * @return The number of consecutive gateway failures (502, 503, 504 status or connection
     * errors that are mapped to one of those status codes) before a consecutive
     * gateway failure ejection occurs. Defaults to 5.
     * 
     */
    public Optional<Output<Integer>> consecutiveGatewayFailure() {
        return Optional.ofNullable(this.consecutiveGatewayFailure);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive 5xx. This setting can be used to disable
     * ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @Import(name="enforcingConsecutiveErrors")
    private @Nullable Output<Integer> enforcingConsecutiveErrors;

    /**
     * @return The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive 5xx. This setting can be used to disable
     * ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    public Optional<Output<Integer>> enforcingConsecutiveErrors() {
        return Optional.ofNullable(this.enforcingConsecutiveErrors);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive gateway failures. This setting can be
     * used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    @Import(name="enforcingConsecutiveGatewayFailure")
    private @Nullable Output<Integer> enforcingConsecutiveGatewayFailure;

    /**
     * @return The percentage chance that a host will be actually ejected when an outlier
     * status is detected through consecutive gateway failures. This setting can be
     * used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    public Optional<Output<Integer>> enforcingConsecutiveGatewayFailure() {
        return Optional.ofNullable(this.enforcingConsecutiveGatewayFailure);
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier
     * status is detected through success rate statistics. This setting can be used to
     * disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @Import(name="enforcingSuccessRate")
    private @Nullable Output<Integer> enforcingSuccessRate;

    /**
     * @return The percentage chance that a host will be actually ejected when an outlier
     * status is detected through success rate statistics. This setting can be used to
     * disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    public Optional<Output<Integer>> enforcingSuccessRate() {
        return Optional.ofNullable(this.enforcingSuccessRate);
    }

    /**
     * Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<BackendServiceOutlierDetectionIntervalGetArgs> interval;

    /**
     * @return Time interval between ejection sweep analysis. This can result in both new
     * ejections as well as hosts being returned to service. Defaults to 10 seconds.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackendServiceOutlierDetectionIntervalGetArgs>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service
     * that can be ejected. Defaults to 10%.
     * 
     */
    @Import(name="maxEjectionPercent")
    private @Nullable Output<Integer> maxEjectionPercent;

    /**
     * @return Maximum percentage of hosts in the load balancing pool for the backend service
     * that can be ejected. Defaults to 10%.
     * 
     */
    public Optional<Output<Integer>> maxEjectionPercent() {
        return Optional.ofNullable(this.maxEjectionPercent);
    }

    /**
     * The number of hosts in a cluster that must have enough request volume to detect
     * success rate outliers. If the number of hosts is less than this setting, outlier
     * detection via success rate statistics is not performed for any host in the
     * cluster. Defaults to 5.
     * 
     */
    @Import(name="successRateMinimumHosts")
    private @Nullable Output<Integer> successRateMinimumHosts;

    /**
     * @return The number of hosts in a cluster that must have enough request volume to detect
     * success rate outliers. If the number of hosts is less than this setting, outlier
     * detection via success rate statistics is not performed for any host in the
     * cluster. Defaults to 5.
     * 
     */
    public Optional<Output<Integer>> successRateMinimumHosts() {
        return Optional.ofNullable(this.successRateMinimumHosts);
    }

    /**
     * The minimum number of total requests that must be collected in one interval (as
     * defined by the interval duration above) to include this host in success rate
     * based outlier detection. If the volume is lower than this setting, outlier
     * detection via success rate statistics is not performed for that host. Defaults
     * to 100.
     * 
     */
    @Import(name="successRateRequestVolume")
    private @Nullable Output<Integer> successRateRequestVolume;

    /**
     * @return The minimum number of total requests that must be collected in one interval (as
     * defined by the interval duration above) to include this host in success rate
     * based outlier detection. If the volume is lower than this setting, outlier
     * detection via success rate statistics is not performed for that host. Defaults
     * to 100.
     * 
     */
    public Optional<Output<Integer>> successRateRequestVolume() {
        return Optional.ofNullable(this.successRateRequestVolume);
    }

    /**
     * This factor is used to determine the ejection threshold for success rate outlier
     * ejection. The ejection threshold is the difference between the mean success
     * rate, and the product of this factor and the standard deviation of the mean
     * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
     * by a thousand to get a double. That is, if the desired factor is 1.9, the
     * runtime value should be 1900. Defaults to 1900.
     * 
     */
    @Import(name="successRateStdevFactor")
    private @Nullable Output<Integer> successRateStdevFactor;

    /**
     * @return This factor is used to determine the ejection threshold for success rate outlier
     * ejection. The ejection threshold is the difference between the mean success
     * rate, and the product of this factor and the standard deviation of the mean
     * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
     * by a thousand to get a double. That is, if the desired factor is 1.9, the
     * runtime value should be 1900. Defaults to 1900.
     * 
     */
    public Optional<Output<Integer>> successRateStdevFactor() {
        return Optional.ofNullable(this.successRateStdevFactor);
    }

    private BackendServiceOutlierDetectionGetArgs() {}

    private BackendServiceOutlierDetectionGetArgs(BackendServiceOutlierDetectionGetArgs $) {
        this.baseEjectionTime = $.baseEjectionTime;
        this.consecutiveErrors = $.consecutiveErrors;
        this.consecutiveGatewayFailure = $.consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = $.enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = $.enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = $.enforcingSuccessRate;
        this.interval = $.interval;
        this.maxEjectionPercent = $.maxEjectionPercent;
        this.successRateMinimumHosts = $.successRateMinimumHosts;
        this.successRateRequestVolume = $.successRateRequestVolume;
        this.successRateStdevFactor = $.successRateStdevFactor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceOutlierDetectionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceOutlierDetectionGetArgs $;

        public Builder() {
            $ = new BackendServiceOutlierDetectionGetArgs();
        }

        public Builder(BackendServiceOutlierDetectionGetArgs defaults) {
            $ = new BackendServiceOutlierDetectionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseEjectionTime The base time that a host is ejected for. The real time is equal to the base
         * time multiplied by the number of times the host has been ejected. Defaults to
         * 30000ms or 30s.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baseEjectionTime(@Nullable Output<BackendServiceOutlierDetectionBaseEjectionTimeGetArgs> baseEjectionTime) {
            $.baseEjectionTime = baseEjectionTime;
            return this;
        }

        /**
         * @param baseEjectionTime The base time that a host is ejected for. The real time is equal to the base
         * time multiplied by the number of times the host has been ejected. Defaults to
         * 30000ms or 30s.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baseEjectionTime(BackendServiceOutlierDetectionBaseEjectionTimeGetArgs baseEjectionTime) {
            return baseEjectionTime(Output.of(baseEjectionTime));
        }

        /**
         * @param consecutiveErrors Number of errors before a host is ejected from the connection pool. When the
         * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
         * Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveErrors(@Nullable Output<Integer> consecutiveErrors) {
            $.consecutiveErrors = consecutiveErrors;
            return this;
        }

        /**
         * @param consecutiveErrors Number of errors before a host is ejected from the connection pool. When the
         * backend host is accessed over HTTP, a 5xx return code qualifies as an error.
         * Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveErrors(Integer consecutiveErrors) {
            return consecutiveErrors(Output.of(consecutiveErrors));
        }

        /**
         * @param consecutiveGatewayFailure The number of consecutive gateway failures (502, 503, 504 status or connection
         * errors that are mapped to one of those status codes) before a consecutive
         * gateway failure ejection occurs. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveGatewayFailure(@Nullable Output<Integer> consecutiveGatewayFailure) {
            $.consecutiveGatewayFailure = consecutiveGatewayFailure;
            return this;
        }

        /**
         * @param consecutiveGatewayFailure The number of consecutive gateway failures (502, 503, 504 status or connection
         * errors that are mapped to one of those status codes) before a consecutive
         * gateway failure ejection occurs. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder consecutiveGatewayFailure(Integer consecutiveGatewayFailure) {
            return consecutiveGatewayFailure(Output.of(consecutiveGatewayFailure));
        }

        /**
         * @param enforcingConsecutiveErrors The percentage chance that a host will be actually ejected when an outlier
         * status is detected through consecutive 5xx. This setting can be used to disable
         * ejection or to ramp it up slowly. Defaults to 100.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutiveErrors(@Nullable Output<Integer> enforcingConsecutiveErrors) {
            $.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
            return this;
        }

        /**
         * @param enforcingConsecutiveErrors The percentage chance that a host will be actually ejected when an outlier
         * status is detected through consecutive 5xx. This setting can be used to disable
         * ejection or to ramp it up slowly. Defaults to 100.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutiveErrors(Integer enforcingConsecutiveErrors) {
            return enforcingConsecutiveErrors(Output.of(enforcingConsecutiveErrors));
        }

        /**
         * @param enforcingConsecutiveGatewayFailure The percentage chance that a host will be actually ejected when an outlier
         * status is detected through consecutive gateway failures. This setting can be
         * used to disable ejection or to ramp it up slowly. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutiveGatewayFailure(@Nullable Output<Integer> enforcingConsecutiveGatewayFailure) {
            $.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
            return this;
        }

        /**
         * @param enforcingConsecutiveGatewayFailure The percentage chance that a host will be actually ejected when an outlier
         * status is detected through consecutive gateway failures. This setting can be
         * used to disable ejection or to ramp it up slowly. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutiveGatewayFailure(Integer enforcingConsecutiveGatewayFailure) {
            return enforcingConsecutiveGatewayFailure(Output.of(enforcingConsecutiveGatewayFailure));
        }

        /**
         * @param enforcingSuccessRate The percentage chance that a host will be actually ejected when an outlier
         * status is detected through success rate statistics. This setting can be used to
         * disable ejection or to ramp it up slowly. Defaults to 100.
         * 
         * @return builder
         * 
         */
        public Builder enforcingSuccessRate(@Nullable Output<Integer> enforcingSuccessRate) {
            $.enforcingSuccessRate = enforcingSuccessRate;
            return this;
        }

        /**
         * @param enforcingSuccessRate The percentage chance that a host will be actually ejected when an outlier
         * status is detected through success rate statistics. This setting can be used to
         * disable ejection or to ramp it up slowly. Defaults to 100.
         * 
         * @return builder
         * 
         */
        public Builder enforcingSuccessRate(Integer enforcingSuccessRate) {
            return enforcingSuccessRate(Output.of(enforcingSuccessRate));
        }

        /**
         * @param interval Time interval between ejection sweep analysis. This can result in both new
         * ejections as well as hosts being returned to service. Defaults to 10 seconds.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<BackendServiceOutlierDetectionIntervalGetArgs> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Time interval between ejection sweep analysis. This can result in both new
         * ejections as well as hosts being returned to service. Defaults to 10 seconds.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interval(BackendServiceOutlierDetectionIntervalGetArgs interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param maxEjectionPercent Maximum percentage of hosts in the load balancing pool for the backend service
         * that can be ejected. Defaults to 10%.
         * 
         * @return builder
         * 
         */
        public Builder maxEjectionPercent(@Nullable Output<Integer> maxEjectionPercent) {
            $.maxEjectionPercent = maxEjectionPercent;
            return this;
        }

        /**
         * @param maxEjectionPercent Maximum percentage of hosts in the load balancing pool for the backend service
         * that can be ejected. Defaults to 10%.
         * 
         * @return builder
         * 
         */
        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            return maxEjectionPercent(Output.of(maxEjectionPercent));
        }

        /**
         * @param successRateMinimumHosts The number of hosts in a cluster that must have enough request volume to detect
         * success rate outliers. If the number of hosts is less than this setting, outlier
         * detection via success rate statistics is not performed for any host in the
         * cluster. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder successRateMinimumHosts(@Nullable Output<Integer> successRateMinimumHosts) {
            $.successRateMinimumHosts = successRateMinimumHosts;
            return this;
        }

        /**
         * @param successRateMinimumHosts The number of hosts in a cluster that must have enough request volume to detect
         * success rate outliers. If the number of hosts is less than this setting, outlier
         * detection via success rate statistics is not performed for any host in the
         * cluster. Defaults to 5.
         * 
         * @return builder
         * 
         */
        public Builder successRateMinimumHosts(Integer successRateMinimumHosts) {
            return successRateMinimumHosts(Output.of(successRateMinimumHosts));
        }

        /**
         * @param successRateRequestVolume The minimum number of total requests that must be collected in one interval (as
         * defined by the interval duration above) to include this host in success rate
         * based outlier detection. If the volume is lower than this setting, outlier
         * detection via success rate statistics is not performed for that host. Defaults
         * to 100.
         * 
         * @return builder
         * 
         */
        public Builder successRateRequestVolume(@Nullable Output<Integer> successRateRequestVolume) {
            $.successRateRequestVolume = successRateRequestVolume;
            return this;
        }

        /**
         * @param successRateRequestVolume The minimum number of total requests that must be collected in one interval (as
         * defined by the interval duration above) to include this host in success rate
         * based outlier detection. If the volume is lower than this setting, outlier
         * detection via success rate statistics is not performed for that host. Defaults
         * to 100.
         * 
         * @return builder
         * 
         */
        public Builder successRateRequestVolume(Integer successRateRequestVolume) {
            return successRateRequestVolume(Output.of(successRateRequestVolume));
        }

        /**
         * @param successRateStdevFactor This factor is used to determine the ejection threshold for success rate outlier
         * ejection. The ejection threshold is the difference between the mean success
         * rate, and the product of this factor and the standard deviation of the mean
         * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
         * by a thousand to get a double. That is, if the desired factor is 1.9, the
         * runtime value should be 1900. Defaults to 1900.
         * 
         * @return builder
         * 
         */
        public Builder successRateStdevFactor(@Nullable Output<Integer> successRateStdevFactor) {
            $.successRateStdevFactor = successRateStdevFactor;
            return this;
        }

        /**
         * @param successRateStdevFactor This factor is used to determine the ejection threshold for success rate outlier
         * ejection. The ejection threshold is the difference between the mean success
         * rate, and the product of this factor and the standard deviation of the mean
         * success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided
         * by a thousand to get a double. That is, if the desired factor is 1.9, the
         * runtime value should be 1900. Defaults to 1900.
         * 
         * @return builder
         * 
         */
        public Builder successRateStdevFactor(Integer successRateStdevFactor) {
            return successRateStdevFactor(Output.of(successRateStdevFactor));
        }

        public BackendServiceOutlierDetectionGetArgs build() {
            return $;
        }
    }

}
