// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourcesInstanceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesInstanceGetArgs Empty = new PacketMirroringMirroredResourcesInstanceGetArgs();

    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL of the instances where this rule should be active.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private PacketMirroringMirroredResourcesInstanceGetArgs() {}

    private PacketMirroringMirroredResourcesInstanceGetArgs(PacketMirroringMirroredResourcesInstanceGetArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringMirroredResourcesInstanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringMirroredResourcesInstanceGetArgs $;

        public Builder() {
            $ = new PacketMirroringMirroredResourcesInstanceGetArgs();
        }

        public Builder(PacketMirroringMirroredResourcesInstanceGetArgs defaults) {
            $ = new PacketMirroringMirroredResourcesInstanceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param url The URL of the instances where this rule should be active.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the instances where this rule should be active.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PacketMirroringMirroredResourcesInstanceGetArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
