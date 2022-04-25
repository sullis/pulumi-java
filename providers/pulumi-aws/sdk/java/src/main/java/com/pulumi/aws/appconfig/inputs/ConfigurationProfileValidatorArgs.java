// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationProfileValidatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileValidatorArgs Empty = new ConfigurationProfileValidatorArgs();

    /**
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ConfigurationProfileValidatorArgs() {}

    private ConfigurationProfileValidatorArgs(ConfigurationProfileValidatorArgs $) {
        this.content = $.content;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationProfileValidatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationProfileValidatorArgs $;

        public Builder() {
            $ = new ConfigurationProfileValidatorArgs();
        }

        public Builder(ConfigurationProfileValidatorArgs defaults) {
            $ = new ConfigurationProfileValidatorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param type The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of validator. Valid values: `JSON_SCHEMA` and `LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConfigurationProfileValidatorArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
