// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.ApplicationScopedVolumeArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.ContainerLabelArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.DiagnosticsRefArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.EndpointPropertiesArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.ImageRegistryCredentialArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.ReliableCollectionsRefArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.ResourceRequirementsArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.SettingArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.VolumeReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a container and its runtime properties.
 * 
 */
public final class ContainerCodePackagePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerCodePackagePropertiesArgs Empty = new ContainerCodePackagePropertiesArgs();

    /**
     * Command array to execute within the container in exec form.
     * 
     */
    @Import(name="commands")
      private final @Nullable Output<List<String>> commands;

    public Output<List<String>> getCommands() {
        return this.commands == null ? Output.empty() : this.commands;
    }

    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    @Import(name="diagnostics")
      private final @Nullable Output<DiagnosticsRefArgs> diagnostics;

    public Output<DiagnosticsRefArgs> getDiagnostics() {
        return this.diagnostics == null ? Output.empty() : this.diagnostics;
    }

    /**
     * The endpoints exposed by this container.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<EndpointPropertiesArgs>> endpoints;

    public Output<List<EndpointPropertiesArgs>> getEndpoints() {
        return this.endpoints == null ? Output.empty() : this.endpoints;
    }

    /**
     * Override for the default entry point in the container.
     * 
     */
    @Import(name="entrypoint")
      private final @Nullable Output<String> entrypoint;

    public Output<String> getEntrypoint() {
        return this.entrypoint == null ? Output.empty() : this.entrypoint;
    }

    /**
     * The environment variables to set in this container
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    public Output<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * The Container image to use.
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * Image registry credential.
     * 
     */
    @Import(name="imageRegistryCredential")
      private final @Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential;

    public Output<ImageRegistryCredentialArgs> getImageRegistryCredential() {
        return this.imageRegistryCredential == null ? Output.empty() : this.imageRegistryCredential;
    }

    /**
     * The labels to set in this container.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<ContainerLabelArgs>> labels;

    public Output<List<ContainerLabelArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The name of the code package.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * A list of ReliableCollection resources used by this particular code package. Please refer to ReliableCollectionsRef for more details.
     * 
     */
    @Import(name="reliableCollectionsRefs")
      private final @Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs;

    public Output<List<ReliableCollectionsRefArgs>> getReliableCollectionsRefs() {
        return this.reliableCollectionsRefs == null ? Output.empty() : this.reliableCollectionsRefs;
    }

    /**
     * The resources required by this container.
     * 
     */
    @Import(name="resources", required=true)
      private final Output<ResourceRequirementsArgs> resources;

    public Output<ResourceRequirementsArgs> getResources() {
        return this.resources;
    }

    /**
     * The settings to set in this container. The setting file path can be fetched from environment variable "Fabric_SettingPath". The path for Windows container is "C:\\secrets". The path for Linux container is "/var/secrets".
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<List<SettingArgs>> settings;

    public Output<List<SettingArgs>> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * Volumes to be attached to the container. The lifetime of these volumes is independent of the application's lifetime.
     * 
     */
    @Import(name="volumeRefs")
      private final @Nullable Output<List<VolumeReferenceArgs>> volumeRefs;

    public Output<List<VolumeReferenceArgs>> getVolumeRefs() {
        return this.volumeRefs == null ? Output.empty() : this.volumeRefs;
    }

    /**
     * Volumes to be attached to the container. The lifetime of these volumes is scoped to the application's lifetime.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<ApplicationScopedVolumeArgs>> volumes;

    public Output<List<ApplicationScopedVolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public ContainerCodePackagePropertiesArgs(
        @Nullable Output<List<String>> commands,
        @Nullable Output<DiagnosticsRefArgs> diagnostics,
        @Nullable Output<List<EndpointPropertiesArgs>> endpoints,
        @Nullable Output<String> entrypoint,
        @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables,
        Output<String> image,
        @Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential,
        @Nullable Output<List<ContainerLabelArgs>> labels,
        Output<String> name,
        @Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs,
        Output<ResourceRequirementsArgs> resources,
        @Nullable Output<List<SettingArgs>> settings,
        @Nullable Output<List<VolumeReferenceArgs>> volumeRefs,
        @Nullable Output<List<ApplicationScopedVolumeArgs>> volumes) {
        this.commands = commands;
        this.diagnostics = diagnostics;
        this.endpoints = endpoints;
        this.entrypoint = entrypoint;
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.imageRegistryCredential = imageRegistryCredential;
        this.labels = labels;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reliableCollectionsRefs = reliableCollectionsRefs;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.settings = settings;
        this.volumeRefs = volumeRefs;
        this.volumes = volumes;
    }

    private ContainerCodePackagePropertiesArgs() {
        this.commands = Output.empty();
        this.diagnostics = Output.empty();
        this.endpoints = Output.empty();
        this.entrypoint = Output.empty();
        this.environmentVariables = Output.empty();
        this.image = Output.empty();
        this.imageRegistryCredential = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.reliableCollectionsRefs = Output.empty();
        this.resources = Output.empty();
        this.settings = Output.empty();
        this.volumeRefs = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerCodePackagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> commands;
        private @Nullable Output<DiagnosticsRefArgs> diagnostics;
        private @Nullable Output<List<EndpointPropertiesArgs>> endpoints;
        private @Nullable Output<String> entrypoint;
        private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;
        private Output<String> image;
        private @Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential;
        private @Nullable Output<List<ContainerLabelArgs>> labels;
        private Output<String> name;
        private @Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs;
        private Output<ResourceRequirementsArgs> resources;
        private @Nullable Output<List<SettingArgs>> settings;
        private @Nullable Output<List<VolumeReferenceArgs>> volumeRefs;
        private @Nullable Output<List<ApplicationScopedVolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerCodePackagePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.diagnostics = defaults.diagnostics;
    	      this.endpoints = defaults.endpoints;
    	      this.entrypoint = defaults.entrypoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.imageRegistryCredential = defaults.imageRegistryCredential;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.reliableCollectionsRefs = defaults.reliableCollectionsRefs;
    	      this.resources = defaults.resources;
    	      this.settings = defaults.settings;
    	      this.volumeRefs = defaults.volumeRefs;
    	      this.volumes = defaults.volumes;
        }

        public Builder commands(@Nullable Output<List<String>> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(@Nullable List<String> commands) {
            this.commands = Output.ofNullable(commands);
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder diagnostics(@Nullable Output<DiagnosticsRefArgs> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public Builder diagnostics(@Nullable DiagnosticsRefArgs diagnostics) {
            this.diagnostics = Output.ofNullable(diagnostics);
            return this;
        }
        public Builder endpoints(@Nullable Output<List<EndpointPropertiesArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<EndpointPropertiesArgs> endpoints) {
            this.endpoints = Output.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(EndpointPropertiesArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder entrypoint(@Nullable Output<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public Builder entrypoint(@Nullable String entrypoint) {
            this.entrypoint = Output.ofNullable(entrypoint);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }
        public Builder environmentVariables(EnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
            return this;
        }
        public Builder imageRegistryCredential(@Nullable Output<ImageRegistryCredentialArgs> imageRegistryCredential) {
            this.imageRegistryCredential = imageRegistryCredential;
            return this;
        }
        public Builder imageRegistryCredential(@Nullable ImageRegistryCredentialArgs imageRegistryCredential) {
            this.imageRegistryCredential = Output.ofNullable(imageRegistryCredential);
            return this;
        }
        public Builder labels(@Nullable Output<List<ContainerLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<ContainerLabelArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(ContainerLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder reliableCollectionsRefs(@Nullable Output<List<ReliableCollectionsRefArgs>> reliableCollectionsRefs) {
            this.reliableCollectionsRefs = reliableCollectionsRefs;
            return this;
        }
        public Builder reliableCollectionsRefs(@Nullable List<ReliableCollectionsRefArgs> reliableCollectionsRefs) {
            this.reliableCollectionsRefs = Output.ofNullable(reliableCollectionsRefs);
            return this;
        }
        public Builder reliableCollectionsRefs(ReliableCollectionsRefArgs... reliableCollectionsRefs) {
            return reliableCollectionsRefs(List.of(reliableCollectionsRefs));
        }
        public Builder resources(Output<ResourceRequirementsArgs> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(ResourceRequirementsArgs resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }
        public Builder settings(@Nullable Output<List<SettingArgs>> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable List<SettingArgs> settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }
        public Builder settings(SettingArgs... settings) {
            return settings(List.of(settings));
        }
        public Builder volumeRefs(@Nullable Output<List<VolumeReferenceArgs>> volumeRefs) {
            this.volumeRefs = volumeRefs;
            return this;
        }
        public Builder volumeRefs(@Nullable List<VolumeReferenceArgs> volumeRefs) {
            this.volumeRefs = Output.ofNullable(volumeRefs);
            return this;
        }
        public Builder volumeRefs(VolumeReferenceArgs... volumeRefs) {
            return volumeRefs(List.of(volumeRefs));
        }
        public Builder volumes(@Nullable Output<List<ApplicationScopedVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(@Nullable List<ApplicationScopedVolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public Builder volumes(ApplicationScopedVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }        public ContainerCodePackagePropertiesArgs build() {
            return new ContainerCodePackagePropertiesArgs(commands, diagnostics, endpoints, entrypoint, environmentVariables, image, imageRegistryCredential, labels, name, reliableCollectionsRefs, resources, settings, volumeRefs, volumes);
        }
    }
}
