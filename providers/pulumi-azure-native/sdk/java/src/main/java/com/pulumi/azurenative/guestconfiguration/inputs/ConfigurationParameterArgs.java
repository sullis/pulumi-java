// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a configuration parameter.
 * 
 */
public final class ConfigurationParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationParameterArgs Empty = new ConfigurationParameterArgs();

    /**
     * Name of the configuration parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the configuration parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the configuration parameter.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the configuration parameter.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ConfigurationParameterArgs() {}

    private ConfigurationParameterArgs(ConfigurationParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationParameterArgs $;

        public Builder() {
            $ = new ConfigurationParameterArgs();
        }

        public Builder(ConfigurationParameterArgs defaults) {
            $ = new ConfigurationParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the configuration parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the configuration parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the configuration parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the configuration parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConfigurationParameterArgs build() {
            return $;
        }
    }

}
