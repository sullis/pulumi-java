// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapEnvSourceResponse;
import com.pulumi.googlenative.run_v1alpha1.inputs.SecretEnvSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Not supported by Cloud Run EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
public final class EnvFromSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvFromSourceResponse Empty = new EnvFromSourceResponse();

    /**
     * (Optional) The ConfigMap to select from
     * 
     */
    @Import(name="configMapRef", required=true)
    private ConfigMapEnvSourceResponse configMapRef;

    /**
     * @return (Optional) The ConfigMap to select from
     * 
     */
    public ConfigMapEnvSourceResponse configMapRef() {
        return this.configMapRef;
    }

    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="prefix", required=true)
    private String prefix;

    /**
     * @return (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * (Optional) The Secret to select from
     * 
     */
    @Import(name="secretRef", required=true)
    private SecretEnvSourceResponse secretRef;

    /**
     * @return (Optional) The Secret to select from
     * 
     */
    public SecretEnvSourceResponse secretRef() {
        return this.secretRef;
    }

    private EnvFromSourceResponse() {}

    private EnvFromSourceResponse(EnvFromSourceResponse $) {
        this.configMapRef = $.configMapRef;
        this.prefix = $.prefix;
        this.secretRef = $.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvFromSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvFromSourceResponse $;

        public Builder() {
            $ = new EnvFromSourceResponse();
        }

        public Builder(EnvFromSourceResponse defaults) {
            $ = new EnvFromSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapRef (Optional) The ConfigMap to select from
         * 
         * @return builder
         * 
         */
        public Builder configMapRef(ConfigMapEnvSourceResponse configMapRef) {
            $.configMapRef = configMapRef;
            return this;
        }

        /**
         * @param prefix (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param secretRef (Optional) The Secret to select from
         * 
         * @return builder
         * 
         */
        public Builder secretRef(SecretEnvSourceResponse secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        public EnvFromSourceResponse build() {
            $.configMapRef = Objects.requireNonNull($.configMapRef, "expected parameter 'configMapRef' to be non-null");
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            $.secretRef = Objects.requireNonNull($.secretRef, "expected parameter 'secretRef' to be non-null");
            return $;
        }
    }

}
