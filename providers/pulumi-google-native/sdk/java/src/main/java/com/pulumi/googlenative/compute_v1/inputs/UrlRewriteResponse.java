// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The spec for modifying the path before sending the request to the matched backend service.
 * 
 */
public final class UrlRewriteResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlRewriteResponse Empty = new UrlRewriteResponse();

    /**
     * Before forwarding the request to the selected service, the request&#39;s host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * 
     */
    @Import(name="hostRewrite", required=true)
    private String hostRewrite;

    /**
     * @return Before forwarding the request to the selected service, the request&#39;s host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * 
     */
    public String hostRewrite() {
        return this.hostRewrite;
    }

    /**
     * Before forwarding the request to the selected backend service, the matching portion of the request&#39;s path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * 
     */
    @Import(name="pathPrefixRewrite", required=true)
    private String pathPrefixRewrite;

    /**
     * @return Before forwarding the request to the selected backend service, the matching portion of the request&#39;s path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * 
     */
    public String pathPrefixRewrite() {
        return this.pathPrefixRewrite;
    }

    private UrlRewriteResponse() {}

    private UrlRewriteResponse(UrlRewriteResponse $) {
        this.hostRewrite = $.hostRewrite;
        this.pathPrefixRewrite = $.pathPrefixRewrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlRewriteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlRewriteResponse $;

        public Builder() {
            $ = new UrlRewriteResponse();
        }

        public Builder(UrlRewriteResponse defaults) {
            $ = new UrlRewriteResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRewrite Before forwarding the request to the selected service, the request&#39;s host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder hostRewrite(String hostRewrite) {
            $.hostRewrite = hostRewrite;
            return this;
        }

        /**
         * @param pathPrefixRewrite Before forwarding the request to the selected backend service, the matching portion of the request&#39;s path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefixRewrite(String pathPrefixRewrite) {
            $.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        public UrlRewriteResponse build() {
            $.hostRewrite = Objects.requireNonNull($.hostRewrite, "expected parameter 'hostRewrite' to be non-null");
            $.pathPrefixRewrite = Objects.requireNonNull($.pathPrefixRewrite, "expected parameter 'pathPrefixRewrite' to be non-null");
            return $;
        }
    }

}
