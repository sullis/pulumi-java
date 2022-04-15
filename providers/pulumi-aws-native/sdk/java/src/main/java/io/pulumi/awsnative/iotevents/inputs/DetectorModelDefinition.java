// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelState;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information that defines how a detector operates.
 * 
 */
public final class DetectorModelDefinition extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelDefinition Empty = new DetectorModelDefinition();

    /**
     * The state that is entered at the creation of each detector (instance).
     * 
     */
    @Import(name="initialStateName", required=true)
      private final String initialStateName;

    public String initialStateName() {
        return this.initialStateName;
    }

    /**
     * Information about the states of the detector.
     * 
     */
    @Import(name="states", required=true)
      private final List<DetectorModelState> states;

    public List<DetectorModelState> states() {
        return this.states;
    }

    public DetectorModelDefinition(
        String initialStateName,
        List<DetectorModelState> states) {
        this.initialStateName = Objects.requireNonNull(initialStateName, "expected parameter 'initialStateName' to be non-null");
        this.states = Objects.requireNonNull(states, "expected parameter 'states' to be non-null");
    }

    private DetectorModelDefinition() {
        this.initialStateName = null;
        this.states = List.of();
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
