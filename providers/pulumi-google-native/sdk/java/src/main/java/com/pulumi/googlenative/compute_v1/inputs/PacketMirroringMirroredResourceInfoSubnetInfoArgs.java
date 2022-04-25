// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourceInfoSubnetInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourceInfoSubnetInfoArgs Empty = new PacketMirroringMirroredResourceInfoSubnetInfoArgs();

    /**
     * Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private PacketMirroringMirroredResourceInfoSubnetInfoArgs() {}

    private PacketMirroringMirroredResourceInfoSubnetInfoArgs(PacketMirroringMirroredResourceInfoSubnetInfoArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringMirroredResourceInfoSubnetInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringMirroredResourceInfoSubnetInfoArgs $;

        public Builder() {
            $ = new PacketMirroringMirroredResourceInfoSubnetInfoArgs();
        }

        public Builder(PacketMirroringMirroredResourceInfoSubnetInfoArgs defaults) {
            $ = new PacketMirroringMirroredResourceInfoSubnetInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param url Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Resource URL to the subnetwork for which traffic from/to all VM instances will be mirrored.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PacketMirroringMirroredResourceInfoSubnetInfoArgs build() {
            return $;
        }
    }

}
