// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DetectorModelResetTimerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelResetTimerArgs Empty = new DetectorModelResetTimerArgs();

    @InputImport(name="timerName", required=true)
    private final Input<String> timerName;

    public Input<String> getTimerName() {
        return this.timerName;
    }

    public DetectorModelResetTimerArgs(Input<String> timerName) {
        this.timerName = Objects.requireNonNull(timerName, "expected parameter 'timerName' to be non-null");
    }

    private DetectorModelResetTimerArgs() {
        this.timerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelResetTimerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelResetTimerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timerName = defaults.timerName;
        }

        public Builder setTimerName(Input<String> timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }

        public Builder setTimerName(String timerName) {
            this.timerName = Input.of(Objects.requireNonNull(timerName));
            return this;
        }

        public DetectorModelResetTimerArgs build() {
            return new DetectorModelResetTimerArgs(timerName);
        }
    }
}
