// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an environment variable for the container.
 * 
 */
public final class EnvironmentVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableArgs Empty = new EnvironmentVariableArgs();

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment variable.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EnvironmentVariableArgs() {}

    private EnvironmentVariableArgs(EnvironmentVariableArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableArgs $;

        public Builder() {
            $ = new EnvironmentVariableArgs();
        }

        public Builder(EnvironmentVariableArgs defaults) {
            $ = new EnvironmentVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentVariableArgs build() {
            return $;
        }
    }

}
