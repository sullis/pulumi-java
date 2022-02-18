// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourcesSubnetworkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesSubnetworkGetArgs Empty = new PacketMirroringMirroredResourcesSubnetworkGetArgs();

    /**
     * The URL of the instances where this rule should be active.
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public PacketMirroringMirroredResourcesSubnetworkGetArgs(Input<String> url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringMirroredResourcesSubnetworkGetArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesSubnetworkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourcesSubnetworkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public PacketMirroringMirroredResourcesSubnetworkGetArgs build() {
            return new PacketMirroringMirroredResourcesSubnetworkGetArgs(url);
        }
    }
}
