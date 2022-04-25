// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Control over the rate of notifications sent to this alert policy&#39;s notification channels.
 * 
 */
public final class NotificationRateLimitResponse extends com.pulumi.resources.InvokeArgs {

    public static final NotificationRateLimitResponse Empty = new NotificationRateLimitResponse();

    /**
     * Not more than one notification per period.
     * 
     */
    @Import(name="period", required=true)
    private String period;

    /**
     * @return Not more than one notification per period.
     * 
     */
    public String period() {
        return this.period;
    }

    private NotificationRateLimitResponse() {}

    private NotificationRateLimitResponse(NotificationRateLimitResponse $) {
        this.period = $.period;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRateLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRateLimitResponse $;

        public Builder() {
            $ = new NotificationRateLimitResponse();
        }

        public Builder(NotificationRateLimitResponse defaults) {
            $ = new NotificationRateLimitResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param period Not more than one notification per period.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            $.period = period;
            return this;
        }

        public NotificationRateLimitResponse build() {
            $.period = Objects.requireNonNull($.period, "expected parameter 'period' to be non-null");
            return $;
        }
    }

}
