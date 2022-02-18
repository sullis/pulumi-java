// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeTemplateNodeTypeFlexibility {
    /**
     * Number of virtual CPUs to use.
     * 
     */
    private final @Nullable String cpus;
    /**
     * - 
     * Use local SSD
     * 
     */
    private final @Nullable String localSsd;
    /**
     * Physical memory available to the node, defined in MB.
     * 
     */
    private final @Nullable String memory;

    @OutputCustomType.Constructor({"cpus","localSsd","memory"})
    private NodeTemplateNodeTypeFlexibility(
        @Nullable String cpus,
        @Nullable String localSsd,
        @Nullable String memory) {
        this.cpus = cpus;
        this.localSsd = localSsd;
        this.memory = memory;
    }

    /**
     * Number of virtual CPUs to use.
     * 
     */
    public Optional<String> getCpus() {
        return Optional.ofNullable(this.cpus);
    }
    /**
     * - 
     * Use local SSD
     * 
     */
    public Optional<String> getLocalSsd() {
        return Optional.ofNullable(this.localSsd);
    }
    /**
     * Physical memory available to the node, defined in MB.
     * 
     */
    public Optional<String> getMemory() {
        return Optional.ofNullable(this.memory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateNodeTypeFlexibility defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpus;
        private @Nullable String localSsd;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateNodeTypeFlexibility defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpus = defaults.cpus;
    	      this.localSsd = defaults.localSsd;
    	      this.memory = defaults.memory;
        }

        public Builder setCpus(@Nullable String cpus) {
            this.cpus = cpus;
            return this;
        }

        public Builder setLocalSsd(@Nullable String localSsd) {
            this.localSsd = localSsd;
            return this;
        }

        public Builder setMemory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }

        public NodeTemplateNodeTypeFlexibility build() {
            return new NodeTemplateNodeTypeFlexibility(cpus, localSsd, memory);
        }
    }
}
