// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DetectorModelResetTimer {
    /**
     * The name of the timer to reset.
     * 
     */
    private final String timerName;

    @CustomType.Constructor
    private DetectorModelResetTimer(@CustomType.Parameter("timerName") String timerName) {
        this.timerName = timerName;
    }

    /**
     * The name of the timer to reset.
     * 
    */
    public String timerName() {
        return this.timerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelResetTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelResetTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timerName = defaults.timerName;
        }

        public Builder timerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }        public DetectorModelResetTimer build() {
            return new DetectorModelResetTimer(timerName);
        }
    }
}
