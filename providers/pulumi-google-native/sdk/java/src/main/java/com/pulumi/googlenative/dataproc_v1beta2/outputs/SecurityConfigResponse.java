// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.KerberosConfigResponse;
import java.util.Objects;

@CustomType
public final class SecurityConfigResponse {
    /**
     * @return Optional. Kerberos related configuration.
     * 
     */
    private final KerberosConfigResponse kerberosConfig;

    @CustomType.Constructor
    private SecurityConfigResponse(@CustomType.Parameter("kerberosConfig") KerberosConfigResponse kerberosConfig) {
        this.kerberosConfig = kerberosConfig;
    }

    /**
     * @return Optional. Kerberos related configuration.
     * 
     */
    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KerberosConfigResponse kerberosConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosConfig = defaults.kerberosConfig;
        }

        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }        public SecurityConfigResponse build() {
            return new SecurityConfigResponse(kerberosConfig);
        }
    }
}
