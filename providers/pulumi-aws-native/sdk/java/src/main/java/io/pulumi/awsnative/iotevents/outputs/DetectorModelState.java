// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelOnEnter;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelOnExit;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelOnInput;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelState {
    private final @Nullable DetectorModelOnEnter onEnter;
    private final @Nullable DetectorModelOnExit onExit;
    private final @Nullable DetectorModelOnInput onInput;
    private final String stateName;

    @OutputCustomType.Constructor({"onEnter","onExit","onInput","stateName"})
    private DetectorModelState(
        @Nullable DetectorModelOnEnter onEnter,
        @Nullable DetectorModelOnExit onExit,
        @Nullable DetectorModelOnInput onInput,
        String stateName) {
        this.onEnter = onEnter;
        this.onExit = onExit;
        this.onInput = onInput;
        this.stateName = Objects.requireNonNull(stateName);
    }

    public Optional<DetectorModelOnEnter> getOnEnter() {
        return Optional.ofNullable(this.onEnter);
    }
    public Optional<DetectorModelOnExit> getOnExit() {
        return Optional.ofNullable(this.onExit);
    }
    public Optional<DetectorModelOnInput> getOnInput() {
        return Optional.ofNullable(this.onInput);
    }
    public String getStateName() {
        return this.stateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelOnEnter onEnter;
        private @Nullable DetectorModelOnExit onExit;
        private @Nullable DetectorModelOnInput onInput;
        private String stateName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onEnter = defaults.onEnter;
    	      this.onExit = defaults.onExit;
    	      this.onInput = defaults.onInput;
    	      this.stateName = defaults.stateName;
        }

        public Builder setOnEnter(@Nullable DetectorModelOnEnter onEnter) {
            this.onEnter = onEnter;
            return this;
        }

        public Builder setOnExit(@Nullable DetectorModelOnExit onExit) {
            this.onExit = onExit;
            return this;
        }

        public Builder setOnInput(@Nullable DetectorModelOnInput onInput) {
            this.onInput = onInput;
            return this;
        }

        public Builder setStateName(String stateName) {
            this.stateName = Objects.requireNonNull(stateName);
            return this;
        }

        public DetectorModelState build() {
            return new DetectorModelState(onEnter, onExit, onInput, stateName);
        }
    }
}
