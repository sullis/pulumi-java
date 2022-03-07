// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ManualArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ScheduleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * What event needs to occur for a new job to be started.
 * 
 */
public final class GooglePrivacyDlpV2TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TriggerArgs Empty = new GooglePrivacyDlpV2TriggerArgs();

    /**
     * For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    @InputImport(name="manual")
      private final @Nullable Input<GooglePrivacyDlpV2ManualArgs> manual;

    public Input<GooglePrivacyDlpV2ManualArgs> getManual() {
        return this.manual == null ? Input.empty() : this.manual;
    }

    /**
     * Create a job on a repeating basis based on the elapse of time.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<GooglePrivacyDlpV2ScheduleArgs> schedule;

    public Input<GooglePrivacyDlpV2ScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    public GooglePrivacyDlpV2TriggerArgs(
        @Nullable Input<GooglePrivacyDlpV2ManualArgs> manual,
        @Nullable Input<GooglePrivacyDlpV2ScheduleArgs> schedule) {
        this.manual = manual;
        this.schedule = schedule;
    }

    private GooglePrivacyDlpV2TriggerArgs() {
        this.manual = Input.empty();
        this.schedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2ManualArgs> manual;
        private @Nullable Input<GooglePrivacyDlpV2ScheduleArgs> schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manual = defaults.manual;
    	      this.schedule = defaults.schedule;
        }

        public Builder setManual(@Nullable Input<GooglePrivacyDlpV2ManualArgs> manual) {
            this.manual = manual;
            return this;
        }

        public Builder setManual(@Nullable GooglePrivacyDlpV2ManualArgs manual) {
            this.manual = Input.ofNullable(manual);
            return this;
        }

        public Builder setSchedule(@Nullable Input<GooglePrivacyDlpV2ScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable GooglePrivacyDlpV2ScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }
        public GooglePrivacyDlpV2TriggerArgs build() {
            return new GooglePrivacyDlpV2TriggerArgs(manual, schedule);
        }
    }
}