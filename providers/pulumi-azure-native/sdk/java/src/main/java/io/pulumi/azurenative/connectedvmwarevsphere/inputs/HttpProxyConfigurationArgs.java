// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HTTP Proxy configuration for the VM.
 * 
 */
public final class HttpProxyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpProxyConfigurationArgs Empty = new HttpProxyConfigurationArgs();

    /**
     * Gets or sets httpsProxy url.
     * 
     */
    @InputImport(name="httpsProxy")
    private final @Nullable Input<String> httpsProxy;

    public Input<String> getHttpsProxy() {
        return this.httpsProxy == null ? Input.empty() : this.httpsProxy;
    }

    public HttpProxyConfigurationArgs(@Nullable Input<String> httpsProxy) {
        this.httpsProxy = httpsProxy;
    }

    private HttpProxyConfigurationArgs() {
        this.httpsProxy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpProxyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpsProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpProxyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpsProxy = defaults.httpsProxy;
        }

        public Builder setHttpsProxy(@Nullable Input<String> httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder setHttpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = Input.ofNullable(httpsProxy);
            return this;
        }

        public HttpProxyConfigurationArgs build() {
            return new HttpProxyConfigurationArgs(httpsProxy);
        }
    }
}
