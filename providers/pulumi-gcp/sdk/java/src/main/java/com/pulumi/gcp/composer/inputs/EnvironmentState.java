// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.composer.inputs.EnvironmentConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

    /**
     * Configuration parameters for this environment.
     * 
     */
    @Import(name="config")
    private @Nullable Output<EnvironmentConfigGetArgs> config;

    /**
     * @return Configuration parameters for this environment.
     * 
     */
    public Optional<Output<EnvironmentConfigGetArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
     * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
     * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
     * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
     * associated with a given environment. Both keys and values must be &lt;= 128 bytes in size.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
     * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
     * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
     * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
     * associated with a given environment. Both keys and values must be &lt;= 128 bytes in size.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The location or Compute Engine region for the environment.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The location or Compute Engine region for the environment.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private EnvironmentState() {}

    private EnvironmentState(EnvironmentState $) {
        this.config = $.config;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentState $;

        public Builder() {
            $ = new EnvironmentState();
        }

        public Builder(EnvironmentState defaults) {
            $ = new EnvironmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config Configuration parameters for this environment.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<EnvironmentConfigGetArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config Configuration parameters for this environment.
         * 
         * @return builder
         * 
         */
        public Builder config(EnvironmentConfigGetArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param labels User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
         * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
         * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
         * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
         * associated with a given environment. Both keys and values must be &lt;= 128 bytes in size.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map
         * are UTF8 strings that comply with the following restrictions: Label keys must be between 1 and 63 characters long and
         * must conform to the following regular expression: [a-z]([-a-z0-9]*[a-z0-9])?. Label values must be between 0 and 63
         * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?. No more than 64 labels can be
         * associated with a given environment. Both keys and values must be &lt;= 128 bytes in size.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name Name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The location or Compute Engine region for the environment.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The location or Compute Engine region for the environment.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public EnvironmentState build() {
            return $;
        }
    }

}
