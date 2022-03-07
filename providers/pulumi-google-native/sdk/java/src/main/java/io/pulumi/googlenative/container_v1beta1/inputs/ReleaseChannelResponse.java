// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * ReleaseChannel indicates which release channel a cluster is subscribed to. Release channels are arranged in order of risk. When a cluster is subscribed to a release channel, Google maintains both the master version and the node version. Node auto-upgrade defaults to true and cannot be disabled.
 * 
 */
public final class ReleaseChannelResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReleaseChannelResponse Empty = new ReleaseChannelResponse();

    /**
     * channel specifies which release channel the cluster is subscribed to.
     * 
     */
    @InputImport(name="channel", required=true)
      private final String channel;

    public String getChannel() {
        return this.channel;
    }

    public ReleaseChannelResponse(String channel) {
        this.channel = Objects.requireNonNull(channel, "expected parameter 'channel' to be non-null");
    }

    private ReleaseChannelResponse() {
        this.channel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        public Builder setChannel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public ReleaseChannelResponse build() {
            return new ReleaseChannelResponse(channel);
        }
    }
}