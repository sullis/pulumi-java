// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration of logging on a NAT.
 * 
 */
public final class RouterNatLogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterNatLogConfigResponse Empty = new RouterNatLogConfigResponse();

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    @InputImport(name="enable", required=true)
      private final Boolean enable;

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    @InputImport(name="filter", required=true)
      private final String filter;

    public String getFilter() {
        return this.filter;
    }

    public RouterNatLogConfigResponse(
        Boolean enable,
        String filter) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
    }

    private RouterNatLogConfigResponse() {
        this.enable = null;
        this.filter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public RouterNatLogConfigResponse build() {
            return new RouterNatLogConfigResponse(enable, filter);
        }
    }
}