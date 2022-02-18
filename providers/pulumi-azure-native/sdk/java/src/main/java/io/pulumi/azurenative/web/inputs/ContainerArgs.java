// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ContainerResourcesArgs;
import io.pulumi.azurenative.web.inputs.EnvironmentVarArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container definition.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * Container start command arguments.
     * 
     */
    @InputImport(name="args")
    private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * Container start command.
     * 
     */
    @InputImport(name="command")
    private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    /**
     * Container environment variables.
     * 
     */
    @InputImport(name="env")
    private final @Nullable Input<List<EnvironmentVarArgs>> env;

    public Input<List<EnvironmentVarArgs>> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    /**
     * Container image tag.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Custom container name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Container resource requirements.
     * 
     */
    @InputImport(name="resources")
    private final @Nullable Input<ContainerResourcesArgs> resources;

    public Input<ContainerResourcesArgs> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    public ContainerArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> command,
        @Nullable Input<List<EnvironmentVarArgs>> env,
        @Nullable Input<String> image,
        @Nullable Input<String> name,
        @Nullable Input<ContainerResourcesArgs> resources) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.image = image;
        this.name = name;
        this.resources = resources;
    }

    private ContainerArgs() {
        this.args = Input.empty();
        this.command = Input.empty();
        this.env = Input.empty();
        this.image = Input.empty();
        this.name = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> command;
        private @Nullable Input<List<EnvironmentVarArgs>> env;
        private @Nullable Input<String> image;
        private @Nullable Input<String> name;
        private @Nullable Input<ContainerResourcesArgs> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.resources = defaults.resources;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setCommand(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder setEnv(@Nullable Input<List<EnvironmentVarArgs>> env) {
            this.env = env;
            return this;
        }

        public Builder setEnv(@Nullable List<EnvironmentVarArgs> env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResources(@Nullable Input<ContainerResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable ContainerResourcesArgs resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public ContainerArgs build() {
            return new ContainerArgs(args, command, env, image, name, resources);
        }
    }
}
