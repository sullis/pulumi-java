// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegistryTaskRegistryCredentialSource {
    /**
     * @return The login mode for the source registry. Possible values are `None` and `Default`.
     * 
     */
    private final String loginMode;

    @CustomType.Constructor
    private RegistryTaskRegistryCredentialSource(@CustomType.Parameter("loginMode") String loginMode) {
        this.loginMode = loginMode;
    }

    /**
     * @return The login mode for the source registry. Possible values are `None` and `Default`.
     * 
     */
    public String loginMode() {
        return this.loginMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryTaskRegistryCredentialSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loginMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryTaskRegistryCredentialSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginMode = defaults.loginMode;
        }

        public Builder loginMode(String loginMode) {
            this.loginMode = Objects.requireNonNull(loginMode);
            return this;
        }        public RegistryTaskRegistryCredentialSource build() {
            return new RegistryTaskRegistryCredentialSource(loginMode);
        }
    }
}
