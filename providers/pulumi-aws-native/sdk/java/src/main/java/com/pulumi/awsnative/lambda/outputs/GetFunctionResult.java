// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.outputs;

import com.pulumi.awsnative.lambda.enums.FunctionArchitecturesItem;
import com.pulumi.awsnative.lambda.enums.FunctionPackageType;
import com.pulumi.awsnative.lambda.outputs.FunctionDeadLetterConfig;
import com.pulumi.awsnative.lambda.outputs.FunctionEnvironment;
import com.pulumi.awsnative.lambda.outputs.FunctionFileSystemConfig;
import com.pulumi.awsnative.lambda.outputs.FunctionImageConfig;
import com.pulumi.awsnative.lambda.outputs.FunctionTag;
import com.pulumi.awsnative.lambda.outputs.FunctionTracingConfig;
import com.pulumi.awsnative.lambda.outputs.FunctionVpcConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionResult {
    private final @Nullable List<FunctionArchitecturesItem> architectures;
    /**
     * @return Unique identifier for function resources
     * 
     */
    private final @Nullable String arn;
    /**
     * @return A unique Arn for CodeSigningConfig resource
     * 
     */
    private final @Nullable String codeSigningConfigArn;
    /**
     * @return A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    private final @Nullable FunctionDeadLetterConfig deadLetterConfig;
    /**
     * @return A description of the function.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Environment variables that are accessible from function code during execution.
     * 
     */
    private final @Nullable FunctionEnvironment environment;
    /**
     * @return Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    private final @Nullable List<FunctionFileSystemConfig> fileSystemConfigs;
    /**
     * @return The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    private final @Nullable String handler;
    /**
     * @return ImageConfig
     * 
     */
    private final @Nullable FunctionImageConfig imageConfig;
    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return A list of function layers to add to the function&#39;s execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    private final @Nullable List<String> layers;
    /**
     * @return The amount of memory that your function has access to. Increasing the function&#39;s memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    private final @Nullable Integer memorySize;
    /**
     * @return PackageType.
     * 
     */
    private final @Nullable FunctionPackageType packageType;
    /**
     * @return The number of simultaneous executions to reserve for the function.
     * 
     */
    private final @Nullable Integer reservedConcurrentExecutions;
    /**
     * @return The Amazon Resource Name (ARN) of the function&#39;s execution role.
     * 
     */
    private final @Nullable String role;
    /**
     * @return The identifier of the function&#39;s runtime.
     * 
     */
    private final @Nullable String runtime;
    /**
     * @return A list of tags to apply to the function.
     * 
     */
    private final @Nullable List<FunctionTag> tags;
    /**
     * @return The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * @return Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    private final @Nullable FunctionTracingConfig tracingConfig;
    /**
     * @return For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    private final @Nullable FunctionVpcConfig vpcConfig;

    @CustomType.Constructor
    private GetFunctionResult(
        @CustomType.Parameter("architectures") @Nullable List<FunctionArchitecturesItem> architectures,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("codeSigningConfigArn") @Nullable String codeSigningConfigArn,
        @CustomType.Parameter("deadLetterConfig") @Nullable FunctionDeadLetterConfig deadLetterConfig,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("environment") @Nullable FunctionEnvironment environment,
        @CustomType.Parameter("fileSystemConfigs") @Nullable List<FunctionFileSystemConfig> fileSystemConfigs,
        @CustomType.Parameter("handler") @Nullable String handler,
        @CustomType.Parameter("imageConfig") @Nullable FunctionImageConfig imageConfig,
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("layers") @Nullable List<String> layers,
        @CustomType.Parameter("memorySize") @Nullable Integer memorySize,
        @CustomType.Parameter("packageType") @Nullable FunctionPackageType packageType,
        @CustomType.Parameter("reservedConcurrentExecutions") @Nullable Integer reservedConcurrentExecutions,
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("runtime") @Nullable String runtime,
        @CustomType.Parameter("tags") @Nullable List<FunctionTag> tags,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("tracingConfig") @Nullable FunctionTracingConfig tracingConfig,
        @CustomType.Parameter("vpcConfig") @Nullable FunctionVpcConfig vpcConfig) {
        this.architectures = architectures;
        this.arn = arn;
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfigs = fileSystemConfigs;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.kmsKeyArn = kmsKeyArn;
        this.layers = layers;
        this.memorySize = memorySize;
        this.packageType = packageType;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = role;
        this.runtime = runtime;
        this.tags = tags;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.vpcConfig = vpcConfig;
    }

    public List<FunctionArchitecturesItem> architectures() {
        return this.architectures == null ? List.of() : this.architectures;
    }
    /**
     * @return Unique identifier for function resources
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return A unique Arn for CodeSigningConfig resource
     * 
     */
    public Optional<String> codeSigningConfigArn() {
        return Optional.ofNullable(this.codeSigningConfigArn);
    }
    /**
     * @return A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    public Optional<FunctionDeadLetterConfig> deadLetterConfig() {
        return Optional.ofNullable(this.deadLetterConfig);
    }
    /**
     * @return A description of the function.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Environment variables that are accessible from function code during execution.
     * 
     */
    public Optional<FunctionEnvironment> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    public List<FunctionFileSystemConfig> fileSystemConfigs() {
        return this.fileSystemConfigs == null ? List.of() : this.fileSystemConfigs;
    }
    /**
     * @return The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    public Optional<String> handler() {
        return Optional.ofNullable(this.handler);
    }
    /**
     * @return ImageConfig
     * 
     */
    public Optional<FunctionImageConfig> imageConfig() {
        return Optional.ofNullable(this.imageConfig);
    }
    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return A list of function layers to add to the function&#39;s execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    public List<String> layers() {
        return this.layers == null ? List.of() : this.layers;
    }
    /**
     * @return The amount of memory that your function has access to. Increasing the function&#39;s memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    public Optional<Integer> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }
    /**
     * @return PackageType.
     * 
     */
    public Optional<FunctionPackageType> packageType() {
        return Optional.ofNullable(this.packageType);
    }
    /**
     * @return The number of simultaneous executions to reserve for the function.
     * 
     */
    public Optional<Integer> reservedConcurrentExecutions() {
        return Optional.ofNullable(this.reservedConcurrentExecutions);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the function&#39;s execution role.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return The identifier of the function&#39;s runtime.
     * 
     */
    public Optional<String> runtime() {
        return Optional.ofNullable(this.runtime);
    }
    /**
     * @return A list of tags to apply to the function.
     * 
     */
    public List<FunctionTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    public Optional<Integer> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    public Optional<FunctionTracingConfig> tracingConfig() {
        return Optional.ofNullable(this.tracingConfig);
    }
    /**
     * @return For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    public Optional<FunctionVpcConfig> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FunctionArchitecturesItem> architectures;
        private @Nullable String arn;
        private @Nullable String codeSigningConfigArn;
        private @Nullable FunctionDeadLetterConfig deadLetterConfig;
        private @Nullable String description;
        private @Nullable FunctionEnvironment environment;
        private @Nullable List<FunctionFileSystemConfig> fileSystemConfigs;
        private @Nullable String handler;
        private @Nullable FunctionImageConfig imageConfig;
        private @Nullable String kmsKeyArn;
        private @Nullable List<String> layers;
        private @Nullable Integer memorySize;
        private @Nullable FunctionPackageType packageType;
        private @Nullable Integer reservedConcurrentExecutions;
        private @Nullable String role;
        private @Nullable String runtime;
        private @Nullable List<FunctionTag> tags;
        private @Nullable Integer timeout;
        private @Nullable FunctionTracingConfig tracingConfig;
        private @Nullable FunctionVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.arn = defaults.arn;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfigs = defaults.fileSystemConfigs;
    	      this.handler = defaults.handler;
    	      this.imageConfig = defaults.imageConfig;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.packageType = defaults.packageType;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder architectures(@Nullable List<FunctionArchitecturesItem> architectures) {
            this.architectures = architectures;
            return this;
        }
        public Builder architectures(FunctionArchitecturesItem... architectures) {
            return architectures(List.of(architectures));
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder codeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }
        public Builder deadLetterConfig(@Nullable FunctionDeadLetterConfig deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder environment(@Nullable FunctionEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public Builder fileSystemConfigs(@Nullable List<FunctionFileSystemConfig> fileSystemConfigs) {
            this.fileSystemConfigs = fileSystemConfigs;
            return this;
        }
        public Builder fileSystemConfigs(FunctionFileSystemConfig... fileSystemConfigs) {
            return fileSystemConfigs(List.of(fileSystemConfigs));
        }
        public Builder handler(@Nullable String handler) {
            this.handler = handler;
            return this;
        }
        public Builder imageConfig(@Nullable FunctionImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder layers(@Nullable List<String> layers) {
            this.layers = layers;
            return this;
        }
        public Builder layers(String... layers) {
            return layers(List.of(layers));
        }
        public Builder memorySize(@Nullable Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Builder packageType(@Nullable FunctionPackageType packageType) {
            this.packageType = packageType;
            return this;
        }
        public Builder reservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder runtime(@Nullable String runtime) {
            this.runtime = runtime;
            return this;
        }
        public Builder tags(@Nullable List<FunctionTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(FunctionTag... tags) {
            return tags(List.of(tags));
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder tracingConfig(@Nullable FunctionTracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable FunctionVpcConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }        public GetFunctionResult build() {
            return new GetFunctionResult(architectures, arn, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfigs, handler, imageConfig, kmsKeyArn, layers, memorySize, packageType, reservedConcurrentExecutions, role, runtime, tags, timeout, tracingConfig, vpcConfig);
        }
    }
}
