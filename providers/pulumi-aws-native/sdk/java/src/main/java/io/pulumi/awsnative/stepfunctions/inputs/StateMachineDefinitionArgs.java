// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import java.util.Objects;


public final class StateMachineDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineDefinitionArgs Empty = new StateMachineDefinitionArgs();

    public StateMachineDefinitionArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public StateMachineDefinitionArgs build() {
            return new StateMachineDefinitionArgs();
        }
    }
}