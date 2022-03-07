// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.ApplicationScopedVolumeResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerInstanceViewResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerLabelResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.EndpointPropertiesResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.EnvironmentVariableResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ImageRegistryCredentialResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ReliableCollectionsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ResourceRequirementsResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.SettingResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.VolumeReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerCodePackagePropertiesResponse {
    /**
     * Command array to execute within the container in exec form.
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    private final @Nullable DiagnosticsRefResponse diagnostics;
    /**
     * The endpoints exposed by this container.
     * 
     */
    private final @Nullable List<EndpointPropertiesResponse> endpoints;
    /**
     * Override for the default entry point in the container.
     * 
     */
    private final @Nullable String entrypoint;
    /**
     * The environment variables to set in this container
     * 
     */
    private final @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * The Container image to use.
     * 
     */
    private final String image;
    /**
     * Image registry credential.
     * 
     */
    private final @Nullable ImageRegistryCredentialResponse imageRegistryCredential;
    /**
     * Runtime information of a container instance.
     * 
     */
    private final ContainerInstanceViewResponse instanceView;
    /**
     * The labels to set in this container.
     * 
     */
    private final @Nullable List<ContainerLabelResponse> labels;
    /**
     * The name of the code package.
     * 
     */
    private final String name;
    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
     */
    private final @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs;
    /**
     * The resources required by this container.
     * 
     */
    private final ResourceRequirementsResponse resources;
    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is "/var/secrets".
     * 
     */
    private final @Nullable List<SettingResponse> settings;
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's lifetime.
     * 
     */
    private final @Nullable List<VolumeReferenceResponse> volumeRefs;
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     * 
     */
    private final @Nullable List<ApplicationScopedVolumeResponse> volumes;

    @OutputCustomType.Constructor({"commands","diagnostics","endpoints","entrypoint","environmentVariables","image","imageRegistryCredential","instanceView","labels","name","reliableCollectionsRefs","resources","settings","volumeRefs","volumes"})
    private ContainerCodePackagePropertiesResponse(
        @Nullable List<String> commands,
        @Nullable DiagnosticsRefResponse diagnostics,
        @Nullable List<EndpointPropertiesResponse> endpoints,
        @Nullable String entrypoint,
        @Nullable List<EnvironmentVariableResponse> environmentVariables,
        String image,
        @Nullable ImageRegistryCredentialResponse imageRegistryCredential,
        ContainerInstanceViewResponse instanceView,
        @Nullable List<ContainerLabelResponse> labels,
        String name,
        @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs,
        ResourceRequirementsResponse resources,
        @Nullable List<SettingResponse> settings,
        @Nullable List<VolumeReferenceResponse> volumeRefs,
        @Nullable List<ApplicationScopedVolumeResponse> volumes) {
        this.commands = commands;
        this.diagnostics = diagnostics;
        this.endpoints = endpoints;
        this.entrypoint = entrypoint;
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image);
        this.imageRegistryCredential = imageRegistryCredential;
        this.instanceView = Objects.requireNonNull(instanceView);
        this.labels = labels;
        this.name = Objects.requireNonNull(name);
        this.reliableCollectionsRefs = reliableCollectionsRefs;
        this.resources = Objects.requireNonNull(resources);
        this.settings = settings;
        this.volumeRefs = volumeRefs;
        this.volumes = volumes;
    }

    /**
     * Command array to execute within the container in exec form.
     * 
    */
    public List<String> getCommands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
    */
    public Optional<DiagnosticsRefResponse> getDiagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * The endpoints exposed by this container.
     * 
    */
    public List<EndpointPropertiesResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    /**
     * Override for the default entry point in the container.
     * 
    */
    public Optional<String> getEntrypoint() {
        return Optional.ofNullable(this.entrypoint);
    }
    /**
     * The environment variables to set in this container
     * 
    */
    public List<EnvironmentVariableResponse> getEnvironmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * The Container image to use.
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * Image registry credential.
     * 
    */
    public Optional<ImageRegistryCredentialResponse> getImageRegistryCredential() {
        return Optional.ofNullable(this.imageRegistryCredential);
    }
    /**
     * Runtime information of a container instance.
     * 
    */
    public ContainerInstanceViewResponse getInstanceView() {
        return this.instanceView;
    }
    /**
     * The labels to set in this container.
     * 
    */
    public List<ContainerLabelResponse> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The name of the code package.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
    */
    public List<ReliableCollectionsRefResponse> getReliableCollectionsRefs() {
        return this.reliableCollectionsRefs == null ? List.of() : this.reliableCollectionsRefs;
    }
    /**
     * The resources required by this container.
     * 
    */
    public ResourceRequirementsResponse getResources() {
        return this.resources;
    }
    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is "/var/secrets".
     * 
    */
    public List<SettingResponse> getSettings() {
        return this.settings == null ? List.of() : this.settings;
    }
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's lifetime.
     * 
    */
    public List<VolumeReferenceResponse> getVolumeRefs() {
        return this.volumeRefs == null ? List.of() : this.volumeRefs;
    }
    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     * 
    */
    public List<ApplicationScopedVolumeResponse> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCodePackagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> commands;
        private @Nullable DiagnosticsRefResponse diagnostics;
        private @Nullable List<EndpointPropertiesResponse> endpoints;
        private @Nullable String entrypoint;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private String image;
        private @Nullable ImageRegistryCredentialResponse imageRegistryCredential;
        private ContainerInstanceViewResponse instanceView;
        private @Nullable List<ContainerLabelResponse> labels;
        private String name;
        private @Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs;
        private ResourceRequirementsResponse resources;
        private @Nullable List<SettingResponse> settings;
        private @Nullable List<VolumeReferenceResponse> volumeRefs;
        private @Nullable List<ApplicationScopedVolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerCodePackagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.diagnostics = defaults.diagnostics;
    	      this.endpoints = defaults.endpoints;
    	      this.entrypoint = defaults.entrypoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.imageRegistryCredential = defaults.imageRegistryCredential;
    	      this.instanceView = defaults.instanceView;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.reliableCollectionsRefs = defaults.reliableCollectionsRefs;
    	      this.resources = defaults.resources;
    	      this.settings = defaults.settings;
    	      this.volumeRefs = defaults.volumeRefs;
    	      this.volumes = defaults.volumes;
        }

        public Builder setCommands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }

        public Builder setDiagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setEndpoints(@Nullable List<EndpointPropertiesResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEntrypoint(@Nullable String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImageRegistryCredential(@Nullable ImageRegistryCredentialResponse imageRegistryCredential) {
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }

        public Builder setInstanceView(ContainerInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setLabels(@Nullable List<ContainerLabelResponse> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReliableCollectionsRefs(@Nullable List<ReliableCollectionsRefResponse> reliableCollectionsRefs) {
            this.reliableCollectionsRefs = reliableCollectionsRefs;
            return this;
        }

        public Builder setResources(ResourceRequirementsResponse resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setSettings(@Nullable List<SettingResponse> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setVolumeRefs(@Nullable List<VolumeReferenceResponse> volumeRefs) {
            this.volumeRefs = volumeRefs;
            return this;
        }

        public Builder setVolumes(@Nullable List<ApplicationScopedVolumeResponse> volumes) {
            this.volumes = volumes;
            return this;
        }
        public ContainerCodePackagePropertiesResponse build() {
            return new ContainerCodePackagePropertiesResponse(commands, diagnostics, endpoints, entrypoint, environmentVariables, image, imageRegistryCredential, instanceView, labels, name, reliableCollectionsRefs, resources, settings, volumeRefs, volumes);
        }
    }
}