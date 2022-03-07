// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectAllRequestsToProtocol;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketRedirectAllRequestsTo {
    /**
     * Name of the host where requests are redirected.
     * 
     */
    private final String hostName;
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    private final @Nullable BucketRedirectAllRequestsToProtocol protocol;

    @OutputCustomType.Constructor({"hostName","protocol"})
    private BucketRedirectAllRequestsTo(
        String hostName,
        @Nullable BucketRedirectAllRequestsToProtocol protocol) {
        this.hostName = Objects.requireNonNull(hostName);
        this.protocol = protocol;
    }

    /**
     * Name of the host where requests are redirected.
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
    */
    public Optional<BucketRedirectAllRequestsToProtocol> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectAllRequestsTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private @Nullable BucketRedirectAllRequestsToProtocol protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectAllRequestsTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.protocol = defaults.protocol;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setProtocol(@Nullable BucketRedirectAllRequestsToProtocol protocol) {
            this.protocol = protocol;
            return this;
        }
        public BucketRedirectAllRequestsTo build() {
            return new BucketRedirectAllRequestsTo(hostName, protocol);
        }
    }
}