// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.aws.codebuild.inputs.ProjectEnvironmentEnvironmentVariableArgs;
import com.pulumi.aws.codebuild.inputs.ProjectEnvironmentRegistryCredentialArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentArgs Empty = new ProjectEnvironmentArgs();

    /**
     * ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    @Import(name="computeType", required=true)
    private Output<String> computeType;

    /**
     * @return Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
     * 
     */
    public Output<String> computeType() {
        return this.computeType;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<ProjectEnvironmentEnvironmentVariableArgs>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    @Import(name="image", required=true)
    private Output<String> image;

    /**
     * @return Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
     * 
     */
    public Output<String> image() {
        return this.image;
    }

    /**
     * Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    @Import(name="imagePullCredentialsType")
    private @Nullable Output<String> imagePullCredentialsType;

    /**
     * @return Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
     * 
     */
    public Optional<Output<String>> imagePullCredentialsType() {
        return Optional.ofNullable(this.imagePullCredentialsType);
    }

    /**
     * Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    @Import(name="privilegedMode")
    private @Nullable Output<Boolean> privilegedMode;

    /**
     * @return Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> privilegedMode() {
        return Optional.ofNullable(this.privilegedMode);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="registryCredential")
    private @Nullable Output<ProjectEnvironmentRegistryCredentialArgs> registryCredential;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<ProjectEnvironmentRegistryCredentialArgs>> registryCredential() {
        return Optional.ofNullable(this.registryCredential);
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ProjectEnvironmentArgs() {}

    private ProjectEnvironmentArgs(ProjectEnvironmentArgs $) {
        this.certificate = $.certificate;
        this.computeType = $.computeType;
        this.environmentVariables = $.environmentVariables;
        this.image = $.image;
        this.imagePullCredentialsType = $.imagePullCredentialsType;
        this.privilegedMode = $.privilegedMode;
        this.registryCredential = $.registryCredential;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectEnvironmentArgs $;

        public Builder() {
            $ = new ProjectEnvironmentArgs();
        }

        public Builder(ProjectEnvironmentArgs defaults) {
            $ = new ProjectEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate ARN of the S3 bucket, path prefix and object key that contains the PEM-encoded certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param computeType Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
         * 
         * @return builder
         * 
         */
        public Builder computeType(Output<String> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType Information about the compute resources the build project will use. Valid values: `BUILD_GENERAL1_SMALL`, `BUILD_GENERAL1_MEDIUM`, `BUILD_GENERAL1_LARGE`, `BUILD_GENERAL1_2XLARGE`. `BUILD_GENERAL1_SMALL` is only valid if `type` is set to `LINUX_CONTAINER`. When `type` is set to `LINUX_GPU_CONTAINER`, `compute_type` must be `BUILD_GENERAL1_LARGE`.
         * 
         * @return builder
         * 
         */
        public Builder computeType(String computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param environmentVariables Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<List<ProjectEnvironmentEnvironmentVariableArgs>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(List<ProjectEnvironmentEnvironmentVariableArgs> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param environmentVariables Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(ProjectEnvironmentEnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }

        /**
         * @param image Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
         * 
         * @return builder
         * 
         */
        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Docker image to use for this build project. Valid values include [Docker images provided by CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-available.html) (e.g `aws/codebuild/standard:2.0`), [Docker Hub images](https://hub.docker.com/) (e.g., `nginx/nginx:latest`), and full Docker repository URIs such as those for ECR (e.g., `137112412989.dkr.ecr.us-west-2.amazonaws.com/amazonlinux:latest`).
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param imagePullCredentialsType Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
         * 
         * @return builder
         * 
         */
        public Builder imagePullCredentialsType(@Nullable Output<String> imagePullCredentialsType) {
            $.imagePullCredentialsType = imagePullCredentialsType;
            return this;
        }

        /**
         * @param imagePullCredentialsType Type of credentials AWS CodeBuild uses to pull images in your build. Valid values: `CODEBUILD`, `SERVICE_ROLE`. When you use a cross-account or private registry image, you must use SERVICE_ROLE credentials. When you use an AWS CodeBuild curated image, you must use CodeBuild credentials. Defaults to `CODEBUILD`.
         * 
         * @return builder
         * 
         */
        public Builder imagePullCredentialsType(String imagePullCredentialsType) {
            return imagePullCredentialsType(Output.of(imagePullCredentialsType));
        }

        /**
         * @param privilegedMode Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder privilegedMode(@Nullable Output<Boolean> privilegedMode) {
            $.privilegedMode = privilegedMode;
            return this;
        }

        /**
         * @param privilegedMode Whether to enable running the Docker daemon inside a Docker container. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder privilegedMode(Boolean privilegedMode) {
            return privilegedMode(Output.of(privilegedMode));
        }

        /**
         * @param registryCredential Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder registryCredential(@Nullable Output<ProjectEnvironmentRegistryCredentialArgs> registryCredential) {
            $.registryCredential = registryCredential;
            return this;
        }

        /**
         * @param registryCredential Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder registryCredential(ProjectEnvironmentRegistryCredentialArgs registryCredential) {
            return registryCredential(Output.of(registryCredential));
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProjectEnvironmentArgs build() {
            $.computeType = Objects.requireNonNull($.computeType, "expected parameter 'computeType' to be non-null");
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
