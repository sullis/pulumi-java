// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateDiskGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PerInstanceConfigPreservedStateGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigPreservedStateGetArgs Empty = new PerInstanceConfigPreservedStateGetArgs();

    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    @Import(name="disks")
    private @Nullable Output<List<PerInstanceConfigPreservedStateDiskGetArgs>> disks;

    /**
     * @return Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PerInstanceConfigPreservedStateDiskGetArgs>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private PerInstanceConfigPreservedStateGetArgs() {}

    private PerInstanceConfigPreservedStateGetArgs(PerInstanceConfigPreservedStateGetArgs $) {
        this.disks = $.disks;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PerInstanceConfigPreservedStateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PerInstanceConfigPreservedStateGetArgs $;

        public Builder() {
            $ = new PerInstanceConfigPreservedStateGetArgs();
        }

        public Builder(PerInstanceConfigPreservedStateGetArgs defaults) {
            $ = new PerInstanceConfigPreservedStateGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable Output<List<PerInstanceConfigPreservedStateDiskGetArgs>> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(List<PerInstanceConfigPreservedStateDiskGetArgs> disks) {
            return disks(Output.of(disks));
        }

        /**
         * @param disks Stateful disks for the instance.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder disks(PerInstanceConfigPreservedStateDiskGetArgs... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param metadata Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public PerInstanceConfigPreservedStateGetArgs build() {
            return $;
        }
    }

}
