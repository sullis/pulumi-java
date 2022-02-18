// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda;

import io.pulumi.awsnative.lambda.enums.FunctionArchitecturesItem;
import io.pulumi.awsnative.lambda.enums.FunctionPackageType;
import io.pulumi.awsnative.lambda.inputs.FunctionCodeArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionDeadLetterConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionEnvironmentArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionFileSystemConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionImageConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionTagArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionTracingConfigArgs;
import io.pulumi.awsnative.lambda.inputs.FunctionVpcConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    @InputImport(name="architectures")
    private final @Nullable Input<List<FunctionArchitecturesItem>> architectures;

    public Input<List<FunctionArchitecturesItem>> getArchitectures() {
        return this.architectures == null ? Input.empty() : this.architectures;
    }

    /**
     * The code for the function.
     * 
     */
    @InputImport(name="code", required=true)
    private final Input<FunctionCodeArgs> code;

    public Input<FunctionCodeArgs> getCode() {
        return this.code;
    }

    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    @InputImport(name="codeSigningConfigArn")
    private final @Nullable Input<String> codeSigningConfigArn;

    public Input<String> getCodeSigningConfigArn() {
        return this.codeSigningConfigArn == null ? Input.empty() : this.codeSigningConfigArn;
    }

    /**
     * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing.
     * 
     */
    @InputImport(name="deadLetterConfig")
    private final @Nullable Input<FunctionDeadLetterConfigArgs> deadLetterConfig;

    public Input<FunctionDeadLetterConfigArgs> getDeadLetterConfig() {
        return this.deadLetterConfig == null ? Input.empty() : this.deadLetterConfig;
    }

    /**
     * A description of the function.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Environment variables that are accessible from function code during execution.
     * 
     */
    @InputImport(name="environment")
    private final @Nullable Input<FunctionEnvironmentArgs> environment;

    public Input<FunctionEnvironmentArgs> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * Connection settings for an Amazon EFS file system. To connect a function to a file system, a mount target must be available in every Availability Zone that your function connects to. If your template contains an AWS::EFS::MountTarget resource, you must also specify a DependsOn attribute to ensure that the mount target is created or updated before the function.
     * 
     */
    @InputImport(name="fileSystemConfigs")
    private final @Nullable Input<List<FunctionFileSystemConfigArgs>> fileSystemConfigs;

    public Input<List<FunctionFileSystemConfigArgs>> getFileSystemConfigs() {
        return this.fileSystemConfigs == null ? Input.empty() : this.fileSystemConfigs;
    }

    /**
     * The name of the Lambda function, up to 64 characters in length. If you don't specify a name, AWS CloudFormation generates one.
     * 
     */
    @InputImport(name="functionName")
    private final @Nullable Input<String> functionName;

    public Input<String> getFunctionName() {
        return this.functionName == null ? Input.empty() : this.functionName;
    }

    /**
     * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime
     * 
     */
    @InputImport(name="handler")
    private final @Nullable Input<String> handler;

    public Input<String> getHandler() {
        return this.handler == null ? Input.empty() : this.handler;
    }

    /**
     * ImageConfig
     * 
     */
    @InputImport(name="imageConfig")
    private final @Nullable Input<FunctionImageConfigArgs> imageConfig;

    public Input<FunctionImageConfigArgs> getImageConfig() {
        return this.imageConfig == null ? Input.empty() : this.imageConfig;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @InputImport(name="kmsKeyArn")
    private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
     * 
     */
    @InputImport(name="layers")
    private final @Nullable Input<List<String>> layers;

    public Input<List<String>> getLayers() {
        return this.layers == null ? Input.empty() : this.layers;
    }

    /**
     * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
     * 
     */
    @InputImport(name="memorySize")
    private final @Nullable Input<Integer> memorySize;

    public Input<Integer> getMemorySize() {
        return this.memorySize == null ? Input.empty() : this.memorySize;
    }

    /**
     * PackageType.
     * 
     */
    @InputImport(name="packageType")
    private final @Nullable Input<FunctionPackageType> packageType;

    public Input<FunctionPackageType> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    /**
     * The number of simultaneous executions to reserve for the function.
     * 
     */
    @InputImport(name="reservedConcurrentExecutions")
    private final @Nullable Input<Integer> reservedConcurrentExecutions;

    public Input<Integer> getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions == null ? Input.empty() : this.reservedConcurrentExecutions;
    }

    /**
     * The Amazon Resource Name (ARN) of the function's execution role.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * The identifier of the function's runtime.
     * 
     */
    @InputImport(name="runtime")
    private final @Nullable Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime == null ? Input.empty() : this.runtime;
    }

    /**
     * A list of tags to apply to the function.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<FunctionTagArgs>> tags;

    public Input<List<FunctionTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
     * 
     */
    @InputImport(name="tracingConfig")
    private final @Nullable Input<FunctionTracingConfigArgs> tracingConfig;

    public Input<FunctionTracingConfigArgs> getTracingConfig() {
        return this.tracingConfig == null ? Input.empty() : this.tracingConfig;
    }

    /**
     * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC.
     * 
     */
    @InputImport(name="vpcConfig")
    private final @Nullable Input<FunctionVpcConfigArgs> vpcConfig;

    public Input<FunctionVpcConfigArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public FunctionArgs(
        @Nullable Input<List<FunctionArchitecturesItem>> architectures,
        Input<FunctionCodeArgs> code,
        @Nullable Input<String> codeSigningConfigArn,
        @Nullable Input<FunctionDeadLetterConfigArgs> deadLetterConfig,
        @Nullable Input<String> description,
        @Nullable Input<FunctionEnvironmentArgs> environment,
        @Nullable Input<List<FunctionFileSystemConfigArgs>> fileSystemConfigs,
        @Nullable Input<String> functionName,
        @Nullable Input<String> handler,
        @Nullable Input<FunctionImageConfigArgs> imageConfig,
        @Nullable Input<String> kmsKeyArn,
        @Nullable Input<List<String>> layers,
        @Nullable Input<Integer> memorySize,
        @Nullable Input<FunctionPackageType> packageType,
        @Nullable Input<Integer> reservedConcurrentExecutions,
        Input<String> role,
        @Nullable Input<String> runtime,
        @Nullable Input<List<FunctionTagArgs>> tags,
        @Nullable Input<Integer> timeout,
        @Nullable Input<FunctionTracingConfigArgs> tracingConfig,
        @Nullable Input<FunctionVpcConfigArgs> vpcConfig) {
        this.architectures = architectures;
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.codeSigningConfigArn = codeSigningConfigArn;
        this.deadLetterConfig = deadLetterConfig;
        this.description = description;
        this.environment = environment;
        this.fileSystemConfigs = fileSystemConfigs;
        this.functionName = functionName;
        this.handler = handler;
        this.imageConfig = imageConfig;
        this.kmsKeyArn = kmsKeyArn;
        this.layers = layers;
        this.memorySize = memorySize;
        this.packageType = packageType;
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.runtime = runtime;
        this.tags = tags;
        this.timeout = timeout;
        this.tracingConfig = tracingConfig;
        this.vpcConfig = vpcConfig;
    }

    private FunctionArgs() {
        this.architectures = Input.empty();
        this.code = Input.empty();
        this.codeSigningConfigArn = Input.empty();
        this.deadLetterConfig = Input.empty();
        this.description = Input.empty();
        this.environment = Input.empty();
        this.fileSystemConfigs = Input.empty();
        this.functionName = Input.empty();
        this.handler = Input.empty();
        this.imageConfig = Input.empty();
        this.kmsKeyArn = Input.empty();
        this.layers = Input.empty();
        this.memorySize = Input.empty();
        this.packageType = Input.empty();
        this.reservedConcurrentExecutions = Input.empty();
        this.role = Input.empty();
        this.runtime = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
        this.tracingConfig = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FunctionArchitecturesItem>> architectures;
        private Input<FunctionCodeArgs> code;
        private @Nullable Input<String> codeSigningConfigArn;
        private @Nullable Input<FunctionDeadLetterConfigArgs> deadLetterConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<FunctionEnvironmentArgs> environment;
        private @Nullable Input<List<FunctionFileSystemConfigArgs>> fileSystemConfigs;
        private @Nullable Input<String> functionName;
        private @Nullable Input<String> handler;
        private @Nullable Input<FunctionImageConfigArgs> imageConfig;
        private @Nullable Input<String> kmsKeyArn;
        private @Nullable Input<List<String>> layers;
        private @Nullable Input<Integer> memorySize;
        private @Nullable Input<FunctionPackageType> packageType;
        private @Nullable Input<Integer> reservedConcurrentExecutions;
        private Input<String> role;
        private @Nullable Input<String> runtime;
        private @Nullable Input<List<FunctionTagArgs>> tags;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<FunctionTracingConfigArgs> tracingConfig;
        private @Nullable Input<FunctionVpcConfigArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.code = defaults.code;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfigs = defaults.fileSystemConfigs;
    	      this.functionName = defaults.functionName;
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

        public Builder setArchitectures(@Nullable Input<List<FunctionArchitecturesItem>> architectures) {
            this.architectures = architectures;
            return this;
        }

        public Builder setArchitectures(@Nullable List<FunctionArchitecturesItem> architectures) {
            this.architectures = Input.ofNullable(architectures);
            return this;
        }

        public Builder setCode(Input<FunctionCodeArgs> code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setCode(FunctionCodeArgs code) {
            this.code = Input.of(Objects.requireNonNull(code));
            return this;
        }

        public Builder setCodeSigningConfigArn(@Nullable Input<String> codeSigningConfigArn) {
            this.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        public Builder setCodeSigningConfigArn(@Nullable String codeSigningConfigArn) {
            this.codeSigningConfigArn = Input.ofNullable(codeSigningConfigArn);
            return this;
        }

        public Builder setDeadLetterConfig(@Nullable Input<FunctionDeadLetterConfigArgs> deadLetterConfig) {
            this.deadLetterConfig = deadLetterConfig;
            return this;
        }

        public Builder setDeadLetterConfig(@Nullable FunctionDeadLetterConfigArgs deadLetterConfig) {
            this.deadLetterConfig = Input.ofNullable(deadLetterConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnvironment(@Nullable Input<FunctionEnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable FunctionEnvironmentArgs environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setFileSystemConfigs(@Nullable Input<List<FunctionFileSystemConfigArgs>> fileSystemConfigs) {
            this.fileSystemConfigs = fileSystemConfigs;
            return this;
        }

        public Builder setFileSystemConfigs(@Nullable List<FunctionFileSystemConfigArgs> fileSystemConfigs) {
            this.fileSystemConfigs = Input.ofNullable(fileSystemConfigs);
            return this;
        }

        public Builder setFunctionName(@Nullable Input<String> functionName) {
            this.functionName = functionName;
            return this;
        }

        public Builder setFunctionName(@Nullable String functionName) {
            this.functionName = Input.ofNullable(functionName);
            return this;
        }

        public Builder setHandler(@Nullable Input<String> handler) {
            this.handler = handler;
            return this;
        }

        public Builder setHandler(@Nullable String handler) {
            this.handler = Input.ofNullable(handler);
            return this;
        }

        public Builder setImageConfig(@Nullable Input<FunctionImageConfigArgs> imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        public Builder setImageConfig(@Nullable FunctionImageConfigArgs imageConfig) {
            this.imageConfig = Input.ofNullable(imageConfig);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setLayers(@Nullable Input<List<String>> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setLayers(@Nullable List<String> layers) {
            this.layers = Input.ofNullable(layers);
            return this;
        }

        public Builder setMemorySize(@Nullable Input<Integer> memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        public Builder setMemorySize(@Nullable Integer memorySize) {
            this.memorySize = Input.ofNullable(memorySize);
            return this;
        }

        public Builder setPackageType(@Nullable Input<FunctionPackageType> packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setPackageType(@Nullable FunctionPackageType packageType) {
            this.packageType = Input.ofNullable(packageType);
            return this;
        }

        public Builder setReservedConcurrentExecutions(@Nullable Input<Integer> reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = reservedConcurrentExecutions;
            return this;
        }

        public Builder setReservedConcurrentExecutions(@Nullable Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = Input.ofNullable(reservedConcurrentExecutions);
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setRuntime(@Nullable Input<String> runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setRuntime(@Nullable String runtime) {
            this.runtime = Input.ofNullable(runtime);
            return this;
        }

        public Builder setTags(@Nullable Input<List<FunctionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FunctionTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setTracingConfig(@Nullable Input<FunctionTracingConfigArgs> tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }

        public Builder setTracingConfig(@Nullable FunctionTracingConfigArgs tracingConfig) {
            this.tracingConfig = Input.ofNullable(tracingConfig);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<FunctionVpcConfigArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable FunctionVpcConfigArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }

        public FunctionArgs build() {
            return new FunctionArgs(architectures, code, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfigs, functionName, handler, imageConfig, kmsKeyArn, layers, memorySize, packageType, reservedConcurrentExecutions, role, runtime, tags, timeout, tracingConfig, vpcConfig);
        }
    }
}
