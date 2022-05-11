// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WindowsWebAppSiteConfigAutoHealSettingTriggerRequests {
    /**
     * @return The number of requests in the specified `interval` to trigger this rule.
     * 
     */
    private final Integer count;
    /**
     * @return The interval in `hh:mm:ss`.
     * 
     */
    private final String interval;

    @CustomType.Constructor
    private WindowsWebAppSiteConfigAutoHealSettingTriggerRequests(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("interval") String interval) {
        this.count = count;
        this.interval = interval;
    }

    /**
     * @return The number of requests in the specified `interval` to trigger this rule.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The interval in `hh:mm:ss`.
     * 
     */
    public String interval() {
        return this.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSiteConfigAutoHealSettingTriggerRequests defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String interval;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSiteConfigAutoHealSettingTriggerRequests defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }        public WindowsWebAppSiteConfigAutoHealSettingTriggerRequests build() {
            return new WindowsWebAppSiteConfigAutoHealSettingTriggerRequests(count, interval);
        }
    }
}
