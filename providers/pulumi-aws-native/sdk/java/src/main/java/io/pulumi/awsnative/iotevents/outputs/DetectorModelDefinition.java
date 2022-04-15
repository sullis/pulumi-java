// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelState;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DetectorModelDefinition {
    /**
     * The state that is entered at the creation of each detector (instance).
     * 
     */
    private final String initialStateName;
    /**
     * Information about the states of the detector.
     * 
     */
    private final List<DetectorModelState> states;

    @CustomType.Constructor
    private DetectorModelDefinition(
        @CustomType.Parameter("initialStateName") String initialStateName,
        @CustomType.Parameter("states") List<DetectorModelState> states) {
        this.initialStateName = initialStateName;
        this.states = states;
    }

    /**
     * The state that is entered at the creation of each detector (instance).
     * 
    */
    public String initialStateName() {
        return this.initialStateName;
    }
    /**
     * Information about the states of the detector.
     * 
    */
    public List<DetectorModelState> states() {
        return this.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String initialStateName;
        private List<DetectorModelState> states;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialStateName = defaults.initialStateName;
    	      this.states = defaults.states;
        }

        public Builder initialStateName(String initialStateName) {
            this.initialStateName = Objects.requireNonNull(initialStateName);
            return this;
        }
        public Builder states(List<DetectorModelState> states) {
            this.states = Objects.requireNonNull(states);
            return this;
        }
        public Builder states(DetectorModelState... states) {
            return states(List.of(states));
        }        public DetectorModelDefinition build() {
            return new DetectorModelDefinition(initialStateName, states);
        }
    }
}
