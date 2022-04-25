// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesInstanceGetArgs;
import com.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesSubnetworkGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourcesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesGetArgs Empty = new PacketMirroringMirroredResourcesGetArgs();

    /**
     * All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances;

    /**
     * @return All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    @Import(name="subnetworks")
    private @Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks;

    /**
     * @return All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>>> subnetworks() {
        return Optional.ofNullable(this.subnetworks);
    }

    /**
     * All instances with these tags will be mirrored.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return All instances with these tags will be mirrored.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PacketMirroringMirroredResourcesGetArgs() {}

    private PacketMirroringMirroredResourcesGetArgs(PacketMirroringMirroredResourcesGetArgs $) {
        this.instances = $.instances;
        this.subnetworks = $.subnetworks;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringMirroredResourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringMirroredResourcesGetArgs $;

        public Builder() {
            $ = new PacketMirroringMirroredResourcesGetArgs();
        }

        public Builder(PacketMirroringMirroredResourcesGetArgs defaults) {
            $ = new PacketMirroringMirroredResourcesGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instances All the listed instances will be mirrored.  Specify at most 50.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances All the listed instances will be mirrored.  Specify at most 50.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder instances(List<PacketMirroringMirroredResourcesInstanceGetArgs> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances All the listed instances will be mirrored.  Specify at most 50.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder instances(PacketMirroringMirroredResourcesInstanceGetArgs... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param subnetworks All instances in one of these subnetworks will be mirrored.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetworks(@Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks) {
            $.subnetworks = subnetworks;
            return this;
        }

        /**
         * @param subnetworks All instances in one of these subnetworks will be mirrored.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetworks(List<PacketMirroringMirroredResourcesSubnetworkGetArgs> subnetworks) {
            return subnetworks(Output.of(subnetworks));
        }

        /**
         * @param subnetworks All instances in one of these subnetworks will be mirrored.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder subnetworks(PacketMirroringMirroredResourcesSubnetworkGetArgs... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }

        /**
         * @param tags All instances with these tags will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags All instances with these tags will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags All instances with these tags will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public PacketMirroringMirroredResourcesGetArgs build() {
            return $;
        }
    }

}
