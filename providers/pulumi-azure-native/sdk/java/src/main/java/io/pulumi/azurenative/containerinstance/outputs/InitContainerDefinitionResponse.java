// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.containerinstance.outputs.InitContainerPropertiesDefinitionResponseInstanceView;
import io.pulumi.azurenative.containerinstance.outputs.VolumeMountResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InitContainerDefinitionResponse {
    /**
     * The command to execute within the init container in exec form.
     * 
     */
    private final @Nullable List<String> command;
    /**
     * The environment variables to set in the init container.
     * 
     */
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * The image of the init container.
     * 
     */
    private final @Nullable String image;
    /**
     * The instance view of the init container. Only valid in response.
     * 
     */
    private final InitContainerPropertiesDefinitionResponseInstanceView instanceView;
    /**
     * The name for the init container.
     * 
     */
    private final String name;
    /**
     * The volume mounts available to the init container.
     * 
     */
    private final @Nullable List<VolumeMountResponse> volumeMounts;

    @OutputCustomType.Constructor({"command","environmentVariables","image","instanceView","name","volumeMounts"})
    private InitContainerDefinitionResponse(
        @Nullable List<String> command,
        @Nullable List<EnvironmentVariableResponse> environmentVariables,
        @Nullable String image,
        InitContainerPropertiesDefinitionResponseInstanceView instanceView,
        String name,
        @Nullable List<VolumeMountResponse> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = image;
        this.instanceView = Objects.requireNonNull(instanceView);
        this.name = Objects.requireNonNull(name);
        this.volumeMounts = volumeMounts;
    }

    /**
     * The command to execute within the init container in exec form.
     * 
     */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * The environment variables to set in the init container.
     * 
     */
    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * The image of the init container.
     * 
     */
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }
    /**
     * The instance view of the init container. Only valid in response.
     * 
     */
    public InitContainerPropertiesDefinitionResponseInstanceView getInstanceView() {
        return this.instanceView;
    }
    /**
     * The name for the init container.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The volume mounts available to the init container.
     * 
     */
    public List<VolumeMountResponse> getVolumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitContainerDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private @Nullable String image;
        private InitContainerPropertiesDefinitionResponseInstanceView instanceView;
        private String name;
        private @Nullable List<VolumeMountResponse> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(InitContainerDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.instanceView = defaults.instanceView;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder setInstanceView(InitContainerPropertiesDefinitionResponseInstanceView instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountResponse> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public InitContainerDefinitionResponse build() {
            return new InitContainerDefinitionResponse(command, environmentVariables, image, instanceView, name, volumeMounts);
        }
    }
}
