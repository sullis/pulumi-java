// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LinkAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkAssociationArgs Empty = new LinkAssociationArgs();

    /**
     * The ID of the device
     * 
     */
    @InputImport(name="deviceId", required=true)
    private final Input<String> deviceId;

    public Input<String> getDeviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
    private final Input<String> globalNetworkId;

    public Input<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @InputImport(name="linkId", required=true)
    private final Input<String> linkId;

    public Input<String> getLinkId() {
        return this.linkId;
    }

    public LinkAssociationArgs(
        Input<String> deviceId,
        Input<String> globalNetworkId,
        Input<String> linkId) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.linkId = Objects.requireNonNull(linkId, "expected parameter 'linkId' to be non-null");
    }

    private LinkAssociationArgs() {
        this.deviceId = Input.empty();
        this.globalNetworkId = Input.empty();
        this.linkId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceId;
        private Input<String> globalNetworkId;
        private Input<String> linkId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.linkId = defaults.linkId;
        }

        public Builder setDeviceId(Input<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }

        public Builder setDeviceId(String deviceId) {
            this.deviceId = Input.of(Objects.requireNonNull(deviceId));
            return this;
        }

        public Builder setGlobalNetworkId(Input<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Input.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }

        public Builder setLinkId(Input<String> linkId) {
            this.linkId = Objects.requireNonNull(linkId);
            return this;
        }

        public Builder setLinkId(String linkId) {
            this.linkId = Input.of(Objects.requireNonNull(linkId));
            return this;
        }

        public LinkAssociationArgs build() {
            return new LinkAssociationArgs(deviceId, globalNetworkId, linkId);
        }
    }
}
