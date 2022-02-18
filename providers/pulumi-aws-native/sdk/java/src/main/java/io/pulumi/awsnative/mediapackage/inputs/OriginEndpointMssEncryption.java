// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProvider;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * A Microsoft Smooth Streaming (MSS) encryption configuration.
 * 
 */
public final class OriginEndpointMssEncryption extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointMssEncryption Empty = new OriginEndpointMssEncryption();

    @InputImport(name="spekeKeyProvider", required=true)
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    public OriginEndpointSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointMssEncryption(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointMssEncryption() {
        this.spekeKeyProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointMssEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointMssEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public OriginEndpointMssEncryption build() {
            return new OriginEndpointMssEncryption(spekeKeyProvider);
        }
    }
}
