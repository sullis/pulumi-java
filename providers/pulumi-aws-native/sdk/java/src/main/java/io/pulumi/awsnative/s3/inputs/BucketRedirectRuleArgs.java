// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectRuleProtocol;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how requests are redirected. In the event of an error, you can specify a different error code to return.
 * 
 */
public final class BucketRedirectRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketRedirectRuleArgs Empty = new BucketRedirectRuleArgs();

    /**
     * The host name to use in the redirect request.
     * 
     */
    @Import(name="hostName")
      private final @Nullable Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName == null ? Output.empty() : this.hostName;
    }

    /**
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    @Import(name="httpRedirectCode")
      private final @Nullable Output<String> httpRedirectCode;

    public Output<String> getHttpRedirectCode() {
        return this.httpRedirectCode == null ? Output.empty() : this.httpRedirectCode;
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<BucketRedirectRuleProtocol> protocol;

    public Output<BucketRedirectRuleProtocol> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * The object key prefix to use in the redirect request.
     * 
     */
    @Import(name="replaceKeyPrefixWith")
      private final @Nullable Output<String> replaceKeyPrefixWith;

    public Output<String> getReplaceKeyPrefixWith() {
        return this.replaceKeyPrefixWith == null ? Output.empty() : this.replaceKeyPrefixWith;
    }

    /**
     * The specific object key to use in the redirect request.d
     * 
     */
    @Import(name="replaceKeyWith")
      private final @Nullable Output<String> replaceKeyWith;

    public Output<String> getReplaceKeyWith() {
        return this.replaceKeyWith == null ? Output.empty() : this.replaceKeyWith;
    }

    public BucketRedirectRuleArgs(
        @Nullable Output<String> hostName,
        @Nullable Output<String> httpRedirectCode,
        @Nullable Output<BucketRedirectRuleProtocol> protocol,
        @Nullable Output<String> replaceKeyPrefixWith,
        @Nullable Output<String> replaceKeyWith) {
        this.hostName = hostName;
        this.httpRedirectCode = httpRedirectCode;
        this.protocol = protocol;
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        this.replaceKeyWith = replaceKeyWith;
    }

    private BucketRedirectRuleArgs() {
        this.hostName = Output.empty();
        this.httpRedirectCode = Output.empty();
        this.protocol = Output.empty();
        this.replaceKeyPrefixWith = Output.empty();
        this.replaceKeyWith = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostName;
        private @Nullable Output<String> httpRedirectCode;
        private @Nullable Output<BucketRedirectRuleProtocol> protocol;
        private @Nullable Output<String> replaceKeyPrefixWith;
        private @Nullable Output<String> replaceKeyWith;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpRedirectCode = defaults.httpRedirectCode;
    	      this.protocol = defaults.protocol;
    	      this.replaceKeyPrefixWith = defaults.replaceKeyPrefixWith;
    	      this.replaceKeyWith = defaults.replaceKeyWith;
        }

        public Builder hostName(@Nullable Output<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = Output.ofNullable(hostName);
            return this;
        }
        public Builder httpRedirectCode(@Nullable Output<String> httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }
        public Builder httpRedirectCode(@Nullable String httpRedirectCode) {
            this.httpRedirectCode = Output.ofNullable(httpRedirectCode);
            return this;
        }
        public Builder protocol(@Nullable Output<BucketRedirectRuleProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable BucketRedirectRuleProtocol protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public Builder replaceKeyPrefixWith(@Nullable Output<String> replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }
        public Builder replaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = Output.ofNullable(replaceKeyPrefixWith);
            return this;
        }
        public Builder replaceKeyWith(@Nullable Output<String> replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }
        public Builder replaceKeyWith(@Nullable String replaceKeyWith) {
            this.replaceKeyWith = Output.ofNullable(replaceKeyWith);
            return this;
        }        public BucketRedirectRuleArgs build() {
            return new BucketRedirectRuleArgs(hostName, httpRedirectCode, protocol, replaceKeyPrefixWith, replaceKeyWith);
        }
    }
}
