// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketRedirectRuleProtocol;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketRedirectRule {
    /**
     * The host name to use in the redirect request.
     * 
     */
    private final @Nullable String hostName;
    /**
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    private final @Nullable String httpRedirectCode;
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    private final @Nullable BucketRedirectRuleProtocol protocol;
    /**
     * The object key prefix to use in the redirect request.
     * 
     */
    private final @Nullable String replaceKeyPrefixWith;
    /**
     * The specific object key to use in the redirect request.d
     * 
     */
    private final @Nullable String replaceKeyWith;

    @OutputCustomType.Constructor({"hostName","httpRedirectCode","protocol","replaceKeyPrefixWith","replaceKeyWith"})
    private BucketRedirectRule(
        @Nullable String hostName,
        @Nullable String httpRedirectCode,
        @Nullable BucketRedirectRuleProtocol protocol,
        @Nullable String replaceKeyPrefixWith,
        @Nullable String replaceKeyWith) {
        this.hostName = hostName;
        this.httpRedirectCode = httpRedirectCode;
        this.protocol = protocol;
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
        this.replaceKeyWith = replaceKeyWith;
    }

    /**
     * The host name to use in the redirect request.
     * 
     */
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
     * 
     */
    public Optional<String> getHttpRedirectCode() {
        return Optional.ofNullable(this.httpRedirectCode);
    }
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    public Optional<BucketRedirectRuleProtocol> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The object key prefix to use in the redirect request.
     * 
     */
    public Optional<String> getReplaceKeyPrefixWith() {
        return Optional.ofNullable(this.replaceKeyPrefixWith);
    }
    /**
     * The specific object key to use in the redirect request.d
     * 
     */
    public Optional<String> getReplaceKeyWith() {
        return Optional.ofNullable(this.replaceKeyWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostName;
        private @Nullable String httpRedirectCode;
        private @Nullable BucketRedirectRuleProtocol protocol;
        private @Nullable String replaceKeyPrefixWith;
        private @Nullable String replaceKeyWith;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.httpRedirectCode = defaults.httpRedirectCode;
    	      this.protocol = defaults.protocol;
    	      this.replaceKeyPrefixWith = defaults.replaceKeyPrefixWith;
    	      this.replaceKeyWith = defaults.replaceKeyWith;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setHttpRedirectCode(@Nullable String httpRedirectCode) {
            this.httpRedirectCode = httpRedirectCode;
            return this;
        }

        public Builder setProtocol(@Nullable BucketRedirectRuleProtocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setReplaceKeyPrefixWith(@Nullable String replaceKeyPrefixWith) {
            this.replaceKeyPrefixWith = replaceKeyPrefixWith;
            return this;
        }

        public Builder setReplaceKeyWith(@Nullable String replaceKeyWith) {
            this.replaceKeyWith = replaceKeyWith;
            return this;
        }

        public BucketRedirectRule build() {
            return new BucketRedirectRule(hostName, httpRedirectCode, protocol, replaceKeyPrefixWith, replaceKeyWith);
        }
    }
}
