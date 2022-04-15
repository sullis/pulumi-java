// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information needed to clear the timer.
 * 
 */
public final class DetectorModelClearTimer extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelClearTimer Empty = new DetectorModelClearTimer();

    @Import(name="timerName", required=true)
      private final String timerName;

    public String timerName() {
        return this.timerName;
    }

    public DetectorModelClearTimer(String timerName) {
        this.timerName = Objects.requireNonNull(timerName, "expected parameter 'timerName' to be non-null");
    }

    private DetectorModelClearTimer() {
        this.timerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelClearTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelClearTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timerName = defaults.timerName;
        }

        public Builder timerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }        public DetectorModelClearTimer build() {
            return new DetectorModelClearTimer(timerName);
        }
    }
}
