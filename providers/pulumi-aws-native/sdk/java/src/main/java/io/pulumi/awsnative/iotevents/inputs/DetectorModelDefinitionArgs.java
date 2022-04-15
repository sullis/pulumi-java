// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information that defines how a detector operates.
 * 
 */
public final class DetectorModelDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelDefinitionArgs Empty = new DetectorModelDefinitionArgs();

    /**
     * The state that is entered at the creation of each detector (instance).
     * 
     */
    @Import(name="initialStateName", required=true)
      private final Output<String> initialStateName;

    public Output<String> initialStateName() {
        return this.initialStateName;
    }

    /**
     * Information about the states of the detector.
     * 
     */
    @Import(name="states", required=true)
      private final Output<List<DetectorModelStateArgs>> states;

    public Output<List<DetectorModelStateArgs>> states() {
        return this.states;
    }

    public DetectorModelDefinitionArgs(
        Output<String> initialStateName,
        Output<List<DetectorModelStateArgs>> states) {
        this.initialStateName = Objects.requireNonNull(initialStateName, "expected parameter 'initialStateName' to be non-null");
        this.states = Objects.requireNonNull(states, "expected parameter 'states' to be non-null");
    }

    private DetectorModelDefinitionArgs() {
        this.initialStateName = Codegen.empty();
        this.states = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> initialStateName;
        private Output<List<DetectorModelStateArgs>> states;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialStateName = defaults.initialStateName;
    	      this.states = defaults.states;
        }

        public Builder initialStateName(Output<String> initialStateName) {
            this.initialStateName = Objects.requireNonNull(initialStateName);
            return this;
        }
        public Builder initialStateName(String initialStateName) {
            this.initialStateName = Output.of(Objects.requireNonNull(initialStateName));
            return this;
        }
        public Builder states(Output<List<DetectorModelStateArgs>> states) {
            this.states = Objects.requireNonNull(states);
            return this;
        }
        public Builder states(List<DetectorModelStateArgs> states) {
            this.states = Output.of(Objects.requireNonNull(states));
            return this;
        }
        public Builder states(DetectorModelStateArgs... states) {
            return states(List.of(states));
        }        public DetectorModelDefinitionArgs build() {
            return new DetectorModelDefinitionArgs(initialStateName, states);
        }
    }
}
