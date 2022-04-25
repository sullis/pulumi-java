// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringNetworkInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketMirroringNetworkInfoResponse Empty = new PacketMirroringNetworkInfoResponse();

    /**
     * Unique identifier for the network; defined by the server.
     * 
     */
    @Import(name="canonicalUrl", required=true)
    private String canonicalUrl;

    /**
     * @return Unique identifier for the network; defined by the server.
     * 
     */
    public String canonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * URL of the network resource.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    /**
     * @return URL of the network resource.
     * 
     */
    public String url() {
        return this.url;
    }

    private PacketMirroringNetworkInfoResponse() {}

    private PacketMirroringNetworkInfoResponse(PacketMirroringNetworkInfoResponse $) {
        this.canonicalUrl = $.canonicalUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringNetworkInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringNetworkInfoResponse $;

        public Builder() {
            $ = new PacketMirroringNetworkInfoResponse();
        }

        public Builder(PacketMirroringNetworkInfoResponse defaults) {
            $ = new PacketMirroringNetworkInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonicalUrl Unique identifier for the network; defined by the server.
         * 
         * @return builder
         * 
         */
        public Builder canonicalUrl(String canonicalUrl) {
            $.canonicalUrl = canonicalUrl;
            return this;
        }

        /**
         * @param url URL of the network resource.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public PacketMirroringNetworkInfoResponse build() {
            $.canonicalUrl = Objects.requireNonNull($.canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
