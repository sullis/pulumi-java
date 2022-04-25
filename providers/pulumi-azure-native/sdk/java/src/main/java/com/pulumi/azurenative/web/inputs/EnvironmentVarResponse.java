// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container environment variable.
 * 
 */
public final class EnvironmentVarResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentVarResponse Empty = new EnvironmentVarResponse();

    /**
     * Environment variable name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Environment variable name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the Container App secret from which to pull the environment variable value.
     * 
     */
    @Import(name="secretRef")
    private @Nullable String secretRef;

    /**
     * @return Name of the Container App secret from which to pull the environment variable value.
     * 
     */
    public Optional<String> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * Non-secret environment variable value.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Non-secret environment variable value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private EnvironmentVarResponse() {}

    private EnvironmentVarResponse(EnvironmentVarResponse $) {
        this.name = $.name;
        this.secretRef = $.secretRef;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVarResponse $;

        public Builder() {
            $ = new EnvironmentVarResponse();
        }

        public Builder(EnvironmentVarResponse defaults) {
            $ = new EnvironmentVarResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Environment variable name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param secretRef Name of the Container App secret from which to pull the environment variable value.
         * 
         * @return builder
         * 
         */
        public Builder secretRef(@Nullable String secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        /**
         * @param value Non-secret environment variable value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public EnvironmentVarResponse build() {
            return $;
        }
    }

}
