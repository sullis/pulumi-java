// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ManualResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ScheduleResponse;
import java.util.Objects;


/**
 * What event needs to occur for a new job to be started.
 * 
 */
public final class GooglePrivacyDlpV2TriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TriggerResponse Empty = new GooglePrivacyDlpV2TriggerResponse();

    /**
     * For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    @Import(name="manual", required=true)
      private final GooglePrivacyDlpV2ManualResponse manual;

    public GooglePrivacyDlpV2ManualResponse getManual() {
        return this.manual;
    }

    /**
     * Create a job on a repeating basis based on the elapse of time.
     * 
     */
    @Import(name="schedule", required=true)
      private final GooglePrivacyDlpV2ScheduleResponse schedule;

    public GooglePrivacyDlpV2ScheduleResponse getSchedule() {
        return this.schedule;
    }

    public GooglePrivacyDlpV2TriggerResponse(
        GooglePrivacyDlpV2ManualResponse manual,
        GooglePrivacyDlpV2ScheduleResponse schedule) {
        this.manual = Objects.requireNonNull(manual, "expected parameter 'manual' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private GooglePrivacyDlpV2TriggerResponse() {
        this.manual = null;
        this.schedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ManualResponse manual;
        private GooglePrivacyDlpV2ScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manual = defaults.manual;
    	      this.schedule = defaults.schedule;
        }

        public Builder manual(GooglePrivacyDlpV2ManualResponse manual) {
            this.manual = Objects.requireNonNull(manual);
            return this;
        }
        public Builder schedule(GooglePrivacyDlpV2ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }        public GooglePrivacyDlpV2TriggerResponse build() {
            return new GooglePrivacyDlpV2TriggerResponse(manual, schedule);
        }
    }
}
