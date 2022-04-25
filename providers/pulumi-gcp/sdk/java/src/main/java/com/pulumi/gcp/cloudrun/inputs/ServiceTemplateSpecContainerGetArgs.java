// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromGetArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvGetArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerPortGetArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerResourcesGetArgs;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerVolumeMountGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerGetArgs Empty = new ServiceTemplateSpecContainerGetArgs();

    /**
     * Arguments to the entrypoint.
     * The docker image&#39;s CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Arguments to the entrypoint.
     * The docker image&#39;s CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image&#39;s ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="commands")
    private @Nullable Output<List<String>> commands;

    /**
     * @return Entrypoint array. Not executed within a shell.
     * The docker image&#39;s ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container&#39;s
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    public Optional<Output<List<String>>> commands() {
        return Optional.ofNullable(this.commands);
    }

    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="envFroms")
    private @Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms;

    /**
     * @return -
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    public Optional<Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>>> envFroms() {
        return Optional.ofNullable(this.envFroms);
    }

    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    @Import(name="envs")
    private @Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs;

    /**
     * @return List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecContainerEnvGetArgs>>> envs() {
        return Optional.ofNullable(this.envs);
    }

    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports;

    /**
     * @return List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecContainerPortGetArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources;

    /**
     * @return Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateSpecContainerResourcesGetArgs>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * Volume to mount into the container&#39;s filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    @Import(name="volumeMounts")
    private @Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts;

    /**
     * @return Volume to mount into the container&#39;s filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>>> volumeMounts() {
        return Optional.ofNullable(this.volumeMounts);
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Container&#39;s working directory.
     * If not specified, the container runtime&#39;s default will be used, which
     * might be configured in the container image.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    @Import(name="workingDir")
    private @Nullable Output<String> workingDir;

    /**
     * @return -
     * (Optional, Deprecated)
     * Container&#39;s working directory.
     * If not specified, the container runtime&#39;s default will be used, which
     * might be configured in the container image.
     * 
     * @deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
    @Deprecated /* Not supported by Cloud Run fully managed */
    public Optional<Output<String>> workingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    private ServiceTemplateSpecContainerGetArgs() {}

    private ServiceTemplateSpecContainerGetArgs(ServiceTemplateSpecContainerGetArgs $) {
        this.args = $.args;
        this.commands = $.commands;
        this.envFroms = $.envFroms;
        this.envs = $.envs;
        this.image = $.image;
        this.ports = $.ports;
        this.resources = $.resources;
        this.volumeMounts = $.volumeMounts;
        this.workingDir = $.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerGetArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerGetArgs();
        }

        public Builder(ServiceTemplateSpecContainerGetArgs defaults) {
            $ = new ServiceTemplateSpecContainerGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args Arguments to the entrypoint.
         * The docker image&#39;s CMD is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Arguments to the entrypoint.
         * The docker image&#39;s CMD is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Arguments to the entrypoint.
         * The docker image&#39;s CMD is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param commands Entrypoint array. Not executed within a shell.
         * The docker image&#39;s ENTRYPOINT is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder commands(@Nullable Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        /**
         * @param commands Entrypoint array. Not executed within a shell.
         * The docker image&#39;s ENTRYPOINT is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        /**
         * @param commands Entrypoint array. Not executed within a shell.
         * The docker image&#39;s ENTRYPOINT is used if this is not provided.
         * Variable references $(VAR_NAME) are expanded using the container&#39;s
         * environment. If a variable cannot be resolved, the reference in the input
         * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
         * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
         * regardless of whether the variable exists or not.
         * More info:
         * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
         * 
         * @return builder
         * 
         */
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        /**
         * @param envFroms -
         * (Optional, Deprecated)
         * List of sources to populate environment variables in the container.
         * All invalid keys will be reported as an event when the container is starting.
         * When a key exists in multiple sources, the value associated with the last source will
         * take precedence. Values defined by an Env with a duplicate key will take
         * precedence.
         * Structure is documented below.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder envFroms(@Nullable Output<List<ServiceTemplateSpecContainerEnvFromGetArgs>> envFroms) {
            $.envFroms = envFroms;
            return this;
        }

        /**
         * @param envFroms -
         * (Optional, Deprecated)
         * List of sources to populate environment variables in the container.
         * All invalid keys will be reported as an event when the container is starting.
         * When a key exists in multiple sources, the value associated with the last source will
         * take precedence. Values defined by an Env with a duplicate key will take
         * precedence.
         * Structure is documented below.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder envFroms(List<ServiceTemplateSpecContainerEnvFromGetArgs> envFroms) {
            return envFroms(Output.of(envFroms));
        }

        /**
         * @param envFroms -
         * (Optional, Deprecated)
         * List of sources to populate environment variables in the container.
         * All invalid keys will be reported as an event when the container is starting.
         * When a key exists in multiple sources, the value associated with the last source will
         * take precedence. Values defined by an Env with a duplicate key will take
         * precedence.
         * Structure is documented below.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder envFroms(ServiceTemplateSpecContainerEnvFromGetArgs... envFroms) {
            return envFroms(List.of(envFroms));
        }

        /**
         * @param envs List of environment variables to set in the container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder envs(@Nullable Output<List<ServiceTemplateSpecContainerEnvGetArgs>> envs) {
            $.envs = envs;
            return this;
        }

        /**
         * @param envs List of environment variables to set in the container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder envs(List<ServiceTemplateSpecContainerEnvGetArgs> envs) {
            return envs(Output.of(envs));
        }

        /**
         * @param envs List of environment variables to set in the container.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder envs(ServiceTemplateSpecContainerEnvGetArgs... envs) {
            return envs(List.of(envs));
        }

        /**
         * @param image Docker image name. This is most often a reference to a container located
         * in the container registry, such as gcr.io/cloudrun/hello
         * More info: https://kubernetes.io/docs/concepts/containers/images
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image name. This is most often a reference to a container located
         * in the container registry, such as gcr.io/cloudrun/hello
         * More info: https://kubernetes.io/docs/concepts/containers/images
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param ports List of open ports in the container.
         * More Info:
         * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<ServiceTemplateSpecContainerPortGetArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports List of open ports in the container.
         * More Info:
         * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<ServiceTemplateSpecContainerPortGetArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports List of open ports in the container.
         * More Info:
         * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ports(ServiceTemplateSpecContainerPortGetArgs... ports) {
            return ports(List.of(ports));
        }

        /**
         * @param resources Compute Resources required by this container. Used to set values such as max memory
         * More info:
         * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<ServiceTemplateSpecContainerResourcesGetArgs> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources Compute Resources required by this container. Used to set values such as max memory
         * More info:
         * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resources(ServiceTemplateSpecContainerResourcesGetArgs resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * Only supports SecretVolumeSources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(@Nullable Output<List<ServiceTemplateSpecContainerVolumeMountGetArgs>> volumeMounts) {
            $.volumeMounts = volumeMounts;
            return this;
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * Only supports SecretVolumeSources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(List<ServiceTemplateSpecContainerVolumeMountGetArgs> volumeMounts) {
            return volumeMounts(Output.of(volumeMounts));
        }

        /**
         * @param volumeMounts Volume to mount into the container&#39;s filesystem.
         * Only supports SecretVolumeSources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder volumeMounts(ServiceTemplateSpecContainerVolumeMountGetArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }

        /**
         * @param workingDir -
         * (Optional, Deprecated)
         * Container&#39;s working directory.
         * If not specified, the container runtime&#39;s default will be used, which
         * might be configured in the container image.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder workingDir(@Nullable Output<String> workingDir) {
            $.workingDir = workingDir;
            return this;
        }

        /**
         * @param workingDir -
         * (Optional, Deprecated)
         * Container&#39;s working directory.
         * If not specified, the container runtime&#39;s default will be used, which
         * might be configured in the container image.
         * 
         * @return builder
         * 
         * @deprecated
         * Not supported by Cloud Run fully managed
         * 
         */
        @Deprecated /* Not supported by Cloud Run fully managed */
        public Builder workingDir(String workingDir) {
            return workingDir(Output.of(workingDir));
        }

        public ServiceTemplateSpecContainerGetArgs build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            return $;
        }
    }

}
