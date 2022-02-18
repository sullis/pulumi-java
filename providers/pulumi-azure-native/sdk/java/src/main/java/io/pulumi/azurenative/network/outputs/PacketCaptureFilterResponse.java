// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PacketCaptureFilterResponse {
    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    private final @Nullable String localIPAddress;
    /**
     * Local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    private final @Nullable String localPort;
    /**
     * Protocol to be filtered on.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    private final @Nullable String remoteIPAddress;
    /**
     * Remote port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    private final @Nullable String remotePort;

    @OutputCustomType.Constructor({"localIPAddress","localPort","protocol","remoteIPAddress","remotePort"})
    private PacketCaptureFilterResponse(
        @Nullable String localIPAddress,
        @Nullable String localPort,
        @Nullable String protocol,
        @Nullable String remoteIPAddress,
        @Nullable String remotePort) {
        this.localIPAddress = localIPAddress;
        this.localPort = localPort;
        this.protocol = protocol;
        this.remoteIPAddress = remoteIPAddress;
        this.remotePort = remotePort;
    }

    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    public Optional<String> getLocalIPAddress() {
        return Optional.ofNullable(this.localIPAddress);
    }
    /**
     * Local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    public Optional<String> getLocalPort() {
        return Optional.ofNullable(this.localPort);
    }
    /**
     * Protocol to be filtered on.
     * 
     */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry. "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    public Optional<String> getRemoteIPAddress() {
        return Optional.ofNullable(this.remoteIPAddress);
    }
    /**
     * Remote port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently supported. Default = null.
     * 
     */
    public Optional<String> getRemotePort() {
        return Optional.ofNullable(this.remotePort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String localIPAddress;
        private @Nullable String localPort;
        private @Nullable String protocol;
        private @Nullable String remoteIPAddress;
        private @Nullable String remotePort;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localIPAddress = defaults.localIPAddress;
    	      this.localPort = defaults.localPort;
    	      this.protocol = defaults.protocol;
    	      this.remoteIPAddress = defaults.remoteIPAddress;
    	      this.remotePort = defaults.remotePort;
        }

        public Builder setLocalIPAddress(@Nullable String localIPAddress) {
            this.localIPAddress = localIPAddress;
            return this;
        }

        public Builder setLocalPort(@Nullable String localPort) {
            this.localPort = localPort;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setRemoteIPAddress(@Nullable String remoteIPAddress) {
            this.remoteIPAddress = remoteIPAddress;
            return this;
        }

        public Builder setRemotePort(@Nullable String remotePort) {
            this.remotePort = remotePort;
            return this;
        }

        public PacketCaptureFilterResponse build() {
            return new PacketCaptureFilterResponse(localIPAddress, localPort, protocol, remoteIPAddress, remotePort);
        }
    }
}
