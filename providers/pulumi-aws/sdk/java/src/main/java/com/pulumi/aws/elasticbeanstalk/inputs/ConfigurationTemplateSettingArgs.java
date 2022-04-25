// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticbeanstalk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationTemplateSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationTemplateSettingArgs Empty = new ConfigurationTemplateSettingArgs();

    /**
     * A unique name for this Template.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A unique name for this Template.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    @Import(name="resource")
    private @Nullable Output<String> resource;

    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ConfigurationTemplateSettingArgs() {}

    private ConfigurationTemplateSettingArgs(ConfigurationTemplateSettingArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
        this.resource = $.resource;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationTemplateSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationTemplateSettingArgs $;

        public Builder() {
            $ = new ConfigurationTemplateSettingArgs();
        }

        public Builder(ConfigurationTemplateSettingArgs defaults) {
            $ = new ConfigurationTemplateSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A unique name for this Template.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for this Template.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConfigurationTemplateSettingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
