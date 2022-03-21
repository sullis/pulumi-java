// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkAssociationArgs Empty = new GetLinkAssociationArgs();

    /**
     * The ID of the device
     * 
     */
    @Import(name="deviceId", required=true)
      private final String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
      private final String globalNetworkId;

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @Import(name="linkId", required=true)
      private final String linkId;

    public String getLinkId() {
        return this.linkId;
    }

    public GetLinkAssociationArgs(
        String deviceId,
        String globalNetworkId,
        String linkId) {
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.linkId = Objects.requireNonNull(linkId, "expected parameter 'linkId' to be non-null");
    }

    private GetLinkAssociationArgs() {
        this.deviceId = null;
        this.globalNetworkId = null;
        this.linkId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceId;
        private String globalNetworkId;
        private String linkId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceId = defaults.deviceId;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.linkId = defaults.linkId;
        }

        public Builder deviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder globalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }
        public Builder linkId(String linkId) {
            this.linkId = Objects.requireNonNull(linkId);
            return this;
        }        public GetLinkAssociationArgs build() {
            return new GetLinkAssociationArgs(deviceId, globalNetworkId, linkId);
        }
    }
}
