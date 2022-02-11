// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DetectorModelResetTimer {
    private final String timerName;

    @OutputCustomType.Constructor({"timerName"})
    private DetectorModelResetTimer(String timerName) {
        this.timerName = Objects.requireNonNull(timerName);
    }

    public String getTimerName() {
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

        public Builder setTimerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }

        public DetectorModelResetTimer build() {
            return new DetectorModelResetTimer(timerName);
        }
    }
}
