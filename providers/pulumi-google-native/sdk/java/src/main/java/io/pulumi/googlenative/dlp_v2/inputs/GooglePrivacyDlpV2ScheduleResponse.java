// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Schedule for inspect job triggers.
 * 
 */
public final class GooglePrivacyDlpV2ScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ScheduleResponse Empty = new GooglePrivacyDlpV2ScheduleResponse();

    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds). A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs. This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * 
     */
    @InputImport(name="recurrencePeriodDuration", required=true)
      private final String recurrencePeriodDuration;

    public String getRecurrencePeriodDuration() {
        return this.recurrencePeriodDuration;
    }

    public GooglePrivacyDlpV2ScheduleResponse(String recurrencePeriodDuration) {
        this.recurrencePeriodDuration = Objects.requireNonNull(recurrencePeriodDuration, "expected parameter 'recurrencePeriodDuration' to be non-null");
    }

    private GooglePrivacyDlpV2ScheduleResponse() {
        this.recurrencePeriodDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recurrencePeriodDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrencePeriodDuration = defaults.recurrencePeriodDuration;
        }

        public Builder setRecurrencePeriodDuration(String recurrencePeriodDuration) {
            this.recurrencePeriodDuration = Objects.requireNonNull(recurrencePeriodDuration);
            return this;
        }
        public GooglePrivacyDlpV2ScheduleResponse build() {
            return new GooglePrivacyDlpV2ScheduleResponse(recurrencePeriodDuration);
        }
    }
}