// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.composer_v1.inputs.AllowedIpRangeArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network-level access control policy for the Airflow web server.
 * 
 */
public final class WebServerNetworkAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServerNetworkAccessControlArgs Empty = new WebServerNetworkAccessControlArgs();

    /**
     * A collection of allowed IP ranges with descriptions.
     * 
     */
    @InputImport(name="allowedIpRanges")
      private final @Nullable Input<List<AllowedIpRangeArgs>> allowedIpRanges;

    public Input<List<AllowedIpRangeArgs>> getAllowedIpRanges() {
        return this.allowedIpRanges == null ? Input.empty() : this.allowedIpRanges;
    }

    public WebServerNetworkAccessControlArgs(@Nullable Input<List<AllowedIpRangeArgs>> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    private WebServerNetworkAccessControlArgs() {
        this.allowedIpRanges = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerNetworkAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AllowedIpRangeArgs>> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerNetworkAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder setAllowedIpRanges(@Nullable Input<List<AllowedIpRangeArgs>> allowedIpRanges) {
            this.allowedIpRanges = allowedIpRanges;
            return this;
        }

        public Builder setAllowedIpRanges(@Nullable List<AllowedIpRangeArgs> allowedIpRanges) {
            this.allowedIpRanges = Input.ofNullable(allowedIpRanges);
            return this;
        }
        public WebServerNetworkAccessControlArgs build() {
            return new WebServerNetworkAccessControlArgs(allowedIpRanges);
        }
    }
}