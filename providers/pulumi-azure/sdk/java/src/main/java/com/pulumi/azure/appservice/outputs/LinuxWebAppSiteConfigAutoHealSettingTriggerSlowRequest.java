// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest {
    /**
     * @return The number of Slow Requests in the time `interval` to trigger this rule.
     * 
     */
    private final Integer count;
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    private final String interval;
    /**
     * @return The path for which this slow request rule applies.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The threshold of time passed to qualify as a Slow Request in `hh:mm:ss`.
     * 
     */
    private final String timeTaken;

    @CustomType.Constructor
    private LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("interval") String interval,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("timeTaken") String timeTaken) {
        this.count = count;
        this.interval = interval;
        this.path = path;
        this.timeTaken = timeTaken;
    }

    /**
     * @return The number of Slow Requests in the time `interval` to trigger this rule.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The path for which this slow request rule applies.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The threshold of time passed to qualify as a Slow Request in `hh:mm:ss`.
     * 
     */
    public String timeTaken() {
        return this.timeTaken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String interval;
        private @Nullable String path;
        private String timeTaken;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.timeTaken = defaults.timeTaken;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder timeTaken(String timeTaken) {
            this.timeTaken = Objects.requireNonNull(timeTaken);
            return this;
        }        public LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest build() {
            return new LinuxWebAppSiteConfigAutoHealSettingTriggerSlowRequest(count, interval, path, timeTaken);
        }
    }
}
