// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ManualResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ScheduleResponse;
import java.util.Objects;


/**
 * What event needs to occur for a new job to be started.
 * 
 */
public final class GooglePrivacyDlpV2TriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TriggerResponse Empty = new GooglePrivacyDlpV2TriggerResponse();

    /**
     * For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    @Import(name="manual", required=true)
    private GooglePrivacyDlpV2ManualResponse manual;

    /**
     * @return For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    public GooglePrivacyDlpV2ManualResponse manual() {
        return this.manual;
    }

    /**
     * Create a job on a repeating basis based on the elapse of time.
     * 
     */
    @Import(name="schedule", required=true)
    private GooglePrivacyDlpV2ScheduleResponse schedule;

    /**
     * @return Create a job on a repeating basis based on the elapse of time.
     * 
     */
    public GooglePrivacyDlpV2ScheduleResponse schedule() {
        return this.schedule;
    }

    private GooglePrivacyDlpV2TriggerResponse() {}

    private GooglePrivacyDlpV2TriggerResponse(GooglePrivacyDlpV2TriggerResponse $) {
        this.manual = $.manual;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2TriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2TriggerResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2TriggerResponse();
        }

        public Builder(GooglePrivacyDlpV2TriggerResponse defaults) {
            $ = new GooglePrivacyDlpV2TriggerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param manual For use with hybrid jobs. Jobs must be manually created and finished.
         * 
         * @return builder
         * 
         */
        public Builder manual(GooglePrivacyDlpV2ManualResponse manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param schedule Create a job on a repeating basis based on the elapse of time.
         * 
         * @return builder
         * 
         */
        public Builder schedule(GooglePrivacyDlpV2ScheduleResponse schedule) {
            $.schedule = schedule;
            return this;
        }

        public GooglePrivacyDlpV2TriggerResponse build() {
            $.manual = Objects.requireNonNull($.manual, "expected parameter 'manual' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
