// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateDiskArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerInstanceConfigPreservedStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigPreservedStateArgs Empty = new PerInstanceConfigPreservedStateArgs();

    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="disks")
      private final @Nullable Input<List<PerInstanceConfigPreservedStateDiskArgs>> disks;

    public Input<List<PerInstanceConfigPreservedStateDiskArgs>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    /**
     * Preserved metadata defined for this instance. This is a list of key->value pairs.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public PerInstanceConfigPreservedStateArgs(
        @Nullable Input<List<PerInstanceConfigPreservedStateDiskArgs>> disks,
        @Nullable Input<Map<String,String>> metadata) {
        this.disks = disks;
        this.metadata = metadata;
    }

    private PerInstanceConfigPreservedStateArgs() {
        this.disks = Input.empty();
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerInstanceConfigPreservedStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PerInstanceConfigPreservedStateDiskArgs>> disks;
        private @Nullable Input<Map<String,String>> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(PerInstanceConfigPreservedStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.metadata = defaults.metadata;
        }

        public Builder setDisks(@Nullable Input<List<PerInstanceConfigPreservedStateDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setDisks(@Nullable List<PerInstanceConfigPreservedStateDiskArgs> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }
        public PerInstanceConfigPreservedStateArgs build() {
            return new PerInstanceConfigPreservedStateArgs(disks, metadata);
        }
    }
}