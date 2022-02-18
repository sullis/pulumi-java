// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that determine the run agent configuration.
 * 
 */
public final class AgentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentPropertiesArgs Empty = new AgentPropertiesArgs();

    /**
     * The CPU configuration in terms of number of cores required for the run.
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Input<Integer> cpu;

    public Input<Integer> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    public AgentPropertiesArgs(@Nullable Input<Integer> cpu) {
        this.cpu = cpu;
    }

    private AgentPropertiesArgs() {
        this.cpu = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cpu;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
        }

        public Builder setCpu(@Nullable Input<Integer> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public AgentPropertiesArgs build() {
            return new AgentPropertiesArgs(cpu);
        }
    }
}
