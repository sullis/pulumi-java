// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The spec for modifying the path before sending the request to the matched backend service.
 * 
 */
public final class UrlRewriteResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlRewriteResponse Empty = new UrlRewriteResponse();

    /**
     * Before forwarding the request to the selected service, the request's host header is replaced with contents of hostRewrite. The value must be from 1 to 255 characters.
     * 
     */
    @InputImport(name="hostRewrite", required=true)
      private final String hostRewrite;

    public String getHostRewrite() {
        return this.hostRewrite;
    }

    /**
     * Before forwarding the request to the selected backend service, the matching portion of the request's path is replaced by pathPrefixRewrite. The value must be from 1 to 1024 characters.
     * 
     */
    @InputImport(name="pathPrefixRewrite", required=true)
      private final String pathPrefixRewrite;

    public String getPathPrefixRewrite() {
        return this.pathPrefixRewrite;
    }

    public UrlRewriteResponse(
        String hostRewrite,
        String pathPrefixRewrite) {
        this.hostRewrite = Objects.requireNonNull(hostRewrite, "expected parameter 'hostRewrite' to be non-null");
        this.pathPrefixRewrite = Objects.requireNonNull(pathPrefixRewrite, "expected parameter 'pathPrefixRewrite' to be non-null");
    }

    private UrlRewriteResponse() {
        this.hostRewrite = null;
        this.pathPrefixRewrite = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostRewrite;
        private String pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder setHostRewrite(String hostRewrite) {
            this.hostRewrite = Objects.requireNonNull(hostRewrite);
            return this;
        }

        public Builder setPathPrefixRewrite(String pathPrefixRewrite) {
            this.pathPrefixRewrite = Objects.requireNonNull(pathPrefixRewrite);
            return this;
        }
        public UrlRewriteResponse build() {
            return new UrlRewriteResponse(hostRewrite, pathPrefixRewrite);
        }
    }
}