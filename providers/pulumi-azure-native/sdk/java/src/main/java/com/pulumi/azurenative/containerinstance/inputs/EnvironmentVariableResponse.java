// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The environment variable to set within the container instance.
 * 
 */
public final class EnvironmentVariableResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentVariableResponse Empty = new EnvironmentVariableResponse();

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the environment variable.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The value of the secure environment variable.
     * 
     */
    @Import(name="secureValue")
    private @Nullable String secureValue;

    /**
     * @return The value of the secure environment variable.
     * 
     */
    public Optional<String> secureValue() {
        return Optional.ofNullable(this.secureValue);
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private EnvironmentVariableResponse() {}

    private EnvironmentVariableResponse(EnvironmentVariableResponse $) {
        this.name = $.name;
        this.secureValue = $.secureValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableResponse $;

        public Builder() {
            $ = new EnvironmentVariableResponse();
        }

        public Builder(EnvironmentVariableResponse defaults) {
            $ = new EnvironmentVariableResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param secureValue The value of the secure environment variable.
         * 
         * @return builder
         * 
         */
        public Builder secureValue(@Nullable String secureValue) {
            $.secureValue = secureValue;
            return this;
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public EnvironmentVariableResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
