// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__DiskConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents the configuration for a replica in a cluster.
 * 
 */
public final class GoogleCloudMlV1__ReplicaConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__ReplicaConfigResponse Empty = new GoogleCloudMlV1__ReplicaConfigResponse();

    /**
     * Represents the type and number of accelerators used by the replica. [Learn about restrictions on accelerator configurations for training.](/ai-platform/training/docs/using-gpus#compute-engine-machine-types-with-gpu)
     * 
     */
    @Import(name="acceleratorConfig", required=true)
      private final GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;

    public GoogleCloudMlV1__AcceleratorConfigResponse getAcceleratorConfig() {
        return this.acceleratorConfig;
    }

    /**
     * Arguments to the entrypoint command. The following rules apply for container_command and container_args: - If you do not supply command or args: The defaults defined in the Docker image are used. - If you supply a command but no args: The default EntryPoint and the default Cmd defined in the Docker image are ignored. Your command is run without any arguments. - If you supply only args: The default Entrypoint defined in the Docker image is run with the args that you supplied. - If you supply a command and args: The default Entrypoint and the default Cmd defined in the Docker image are ignored. Your command is run with your args. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    @Import(name="containerArgs", required=true)
      private final List<String> containerArgs;

    public List<String> getContainerArgs() {
        return this.containerArgs;
    }

    /**
     * The command with which the replica's custom container is run. If provided, it will override default ENTRYPOINT of the docker image. If not provided, the docker image's ENTRYPOINT is used. It cannot be set if custom container image is not provided. Note that this field and [TrainingInput.args] are mutually exclusive, i.e., both cannot be set at the same time.
     * 
     */
    @Import(name="containerCommand", required=true)
      private final List<String> containerCommand;

    public List<String> getContainerCommand() {
        return this.containerCommand;
    }

    /**
     * Represents the configuration of disk options.
     * 
     */
    @Import(name="diskConfig", required=true)
      private final GoogleCloudMlV1__DiskConfigResponse diskConfig;

    public GoogleCloudMlV1__DiskConfigResponse getDiskConfig() {
        return this.diskConfig;
    }

    /**
     * The Docker image to run on the replica. This image must be in Container Registry. Learn more about [configuring custom containers](/ai-platform/training/docs/distributed-training-containers).
     * 
     */
    @Import(name="imageUri", required=true)
      private final String imageUri;

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * The AI Platform runtime version that includes a TensorFlow version matching the one used in the custom container. This field is required if the replica is a TPU worker that uses a custom container. Otherwise, do not specify this field. This must be a [runtime version that currently supports training with TPUs](/ml-engine/docs/tensorflow/runtime-version-list#tpu-support). Note that the version of TensorFlow included in a runtime version may differ from the numbering of the runtime version itself, because it may have a different [patch version](https://www.tensorflow.org/guide/version_compat#semantic_versioning_20). In this field, you must specify the runtime version (TensorFlow minor version). For example, if your custom container runs TensorFlow `1.x.y`, specify `1.x`.
     * 
     */
    @Import(name="tpuTfVersion", required=true)
      private final String tpuTfVersion;

    public String getTpuTfVersion() {
        return this.tpuTfVersion;
    }

    public GoogleCloudMlV1__ReplicaConfigResponse(
        GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig,
        List<String> containerArgs,
        List<String> containerCommand,
        GoogleCloudMlV1__DiskConfigResponse diskConfig,
        String imageUri,
        String tpuTfVersion) {
        this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig, "expected parameter 'acceleratorConfig' to be non-null");
        this.containerArgs = Objects.requireNonNull(containerArgs, "expected parameter 'containerArgs' to be non-null");
        this.containerCommand = Objects.requireNonNull(containerCommand, "expected parameter 'containerCommand' to be non-null");
        this.diskConfig = Objects.requireNonNull(diskConfig, "expected parameter 'diskConfig' to be non-null");
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.tpuTfVersion = Objects.requireNonNull(tpuTfVersion, "expected parameter 'tpuTfVersion' to be non-null");
    }

    private GoogleCloudMlV1__ReplicaConfigResponse() {
        this.acceleratorConfig = null;
        this.containerArgs = List.of();
        this.containerCommand = List.of();
        this.diskConfig = null;
        this.imageUri = null;
        this.tpuTfVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ReplicaConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;
        private List<String> containerArgs;
        private List<String> containerCommand;
        private GoogleCloudMlV1__DiskConfigResponse diskConfig;
        private String imageUri;
        private String tpuTfVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ReplicaConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerArgs = defaults.containerArgs;
    	      this.containerCommand = defaults.containerCommand;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.tpuTfVersion = defaults.tpuTfVersion;
        }

        public Builder acceleratorConfig(GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder containerArgs(List<String> containerArgs) {
            this.containerArgs = Objects.requireNonNull(containerArgs);
            return this;
        }
        public Builder containerArgs(String... containerArgs) {
            return containerArgs(List.of(containerArgs));
        }
        public Builder containerCommand(List<String> containerCommand) {
            this.containerCommand = Objects.requireNonNull(containerCommand);
            return this;
        }
        public Builder containerCommand(String... containerCommand) {
            return containerCommand(List.of(containerCommand));
        }
        public Builder diskConfig(GoogleCloudMlV1__DiskConfigResponse diskConfig) {
            this.diskConfig = Objects.requireNonNull(diskConfig);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder tpuTfVersion(String tpuTfVersion) {
            this.tpuTfVersion = Objects.requireNonNull(tpuTfVersion);
            return this;
        }        public GoogleCloudMlV1__ReplicaConfigResponse build() {
            return new GoogleCloudMlV1__ReplicaConfigResponse(acceleratorConfig, containerArgs, containerCommand, diskConfig, imageUri, tpuTfVersion);
        }
    }
}
