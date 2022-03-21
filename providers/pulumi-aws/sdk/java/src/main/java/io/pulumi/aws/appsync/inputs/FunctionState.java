// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.FunctionSyncConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionState extends io.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * The ID of the associated AppSync API.
     * 
     */
    @Import(name="apiId")
      private final @Nullable Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId == null ? Output.empty() : this.apiId;
    }

    /**
     * The ARN of the Function object.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The Function DataSource name.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Output<String> dataSource;

    public Output<String> getDataSource() {
        return this.dataSource == null ? Output.empty() : this.dataSource;
    }

    /**
     * The Function description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A unique ID representing the Function object.
     * 
     */
    @Import(name="functionId")
      private final @Nullable Output<String> functionId;

    public Output<String> getFunctionId() {
        return this.functionId == null ? Output.empty() : this.functionId;
    }

    /**
     * The version of the request mapping template. Currently the supported value is `2018-05-29`.
     * 
     */
    @Import(name="functionVersion")
      private final @Nullable Output<String> functionVersion;

    public Output<String> getFunctionVersion() {
        return this.functionVersion == null ? Output.empty() : this.functionVersion;
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @Import(name="maxBatchSize")
      private final @Nullable Output<Integer> maxBatchSize;

    public Output<Integer> getMaxBatchSize() {
        return this.maxBatchSize == null ? Output.empty() : this.maxBatchSize;
    }

    /**
     * The Function name. The function name does not have to be unique.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     * 
     */
    @Import(name="requestMappingTemplate")
      private final @Nullable Output<String> requestMappingTemplate;

    public Output<String> getRequestMappingTemplate() {
        return this.requestMappingTemplate == null ? Output.empty() : this.requestMappingTemplate;
    }

    /**
     * The Function response mapping template.
     * 
     */
    @Import(name="responseMappingTemplate")
      private final @Nullable Output<String> responseMappingTemplate;

    public Output<String> getResponseMappingTemplate() {
        return this.responseMappingTemplate == null ? Output.empty() : this.responseMappingTemplate;
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @Import(name="syncConfig")
      private final @Nullable Output<FunctionSyncConfigGetArgs> syncConfig;

    public Output<FunctionSyncConfigGetArgs> getSyncConfig() {
        return this.syncConfig == null ? Output.empty() : this.syncConfig;
    }

    public FunctionState(
        @Nullable Output<String> apiId,
        @Nullable Output<String> arn,
        @Nullable Output<String> dataSource,
        @Nullable Output<String> description,
        @Nullable Output<String> functionId,
        @Nullable Output<String> functionVersion,
        @Nullable Output<Integer> maxBatchSize,
        @Nullable Output<String> name,
        @Nullable Output<String> requestMappingTemplate,
        @Nullable Output<String> responseMappingTemplate,
        @Nullable Output<FunctionSyncConfigGetArgs> syncConfig) {
        this.apiId = apiId;
        this.arn = arn;
        this.dataSource = dataSource;
        this.description = description;
        this.functionId = functionId;
        this.functionVersion = functionVersion;
        this.maxBatchSize = maxBatchSize;
        this.name = name;
        this.requestMappingTemplate = requestMappingTemplate;
        this.responseMappingTemplate = responseMappingTemplate;
        this.syncConfig = syncConfig;
    }

    private FunctionState() {
        this.apiId = Output.empty();
        this.arn = Output.empty();
        this.dataSource = Output.empty();
        this.description = Output.empty();
        this.functionId = Output.empty();
        this.functionVersion = Output.empty();
        this.maxBatchSize = Output.empty();
        this.name = Output.empty();
        this.requestMappingTemplate = Output.empty();
        this.responseMappingTemplate = Output.empty();
        this.syncConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dataSource;
        private @Nullable Output<String> description;
        private @Nullable Output<String> functionId;
        private @Nullable Output<String> functionVersion;
        private @Nullable Output<Integer> maxBatchSize;
        private @Nullable Output<String> name;
        private @Nullable Output<String> requestMappingTemplate;
        private @Nullable Output<String> responseMappingTemplate;
        private @Nullable Output<FunctionSyncConfigGetArgs> syncConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.arn = defaults.arn;
    	      this.dataSource = defaults.dataSource;
    	      this.description = defaults.description;
    	      this.functionId = defaults.functionId;
    	      this.functionVersion = defaults.functionVersion;
    	      this.maxBatchSize = defaults.maxBatchSize;
    	      this.name = defaults.name;
    	      this.requestMappingTemplate = defaults.requestMappingTemplate;
    	      this.responseMappingTemplate = defaults.responseMappingTemplate;
    	      this.syncConfig = defaults.syncConfig;
        }

        public Builder apiId(@Nullable Output<String> apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = Output.ofNullable(apiId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder dataSource(@Nullable Output<String> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder dataSource(@Nullable String dataSource) {
            this.dataSource = Output.ofNullable(dataSource);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder functionId(@Nullable Output<String> functionId) {
            this.functionId = functionId;
            return this;
        }
        public Builder functionId(@Nullable String functionId) {
            this.functionId = Output.ofNullable(functionId);
            return this;
        }
        public Builder functionVersion(@Nullable Output<String> functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public Builder functionVersion(@Nullable String functionVersion) {
            this.functionVersion = Output.ofNullable(functionVersion);
            return this;
        }
        public Builder maxBatchSize(@Nullable Output<Integer> maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }
        public Builder maxBatchSize(@Nullable Integer maxBatchSize) {
            this.maxBatchSize = Output.ofNullable(maxBatchSize);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder requestMappingTemplate(@Nullable Output<String> requestMappingTemplate) {
            this.requestMappingTemplate = requestMappingTemplate;
            return this;
        }
        public Builder requestMappingTemplate(@Nullable String requestMappingTemplate) {
            this.requestMappingTemplate = Output.ofNullable(requestMappingTemplate);
            return this;
        }
        public Builder responseMappingTemplate(@Nullable Output<String> responseMappingTemplate) {
            this.responseMappingTemplate = responseMappingTemplate;
            return this;
        }
        public Builder responseMappingTemplate(@Nullable String responseMappingTemplate) {
            this.responseMappingTemplate = Output.ofNullable(responseMappingTemplate);
            return this;
        }
        public Builder syncConfig(@Nullable Output<FunctionSyncConfigGetArgs> syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }
        public Builder syncConfig(@Nullable FunctionSyncConfigGetArgs syncConfig) {
            this.syncConfig = Output.ofNullable(syncConfig);
            return this;
        }        public FunctionState build() {
            return new FunctionState(apiId, arn, dataSource, description, functionId, functionVersion, maxBatchSize, name, requestMappingTemplate, responseMappingTemplate, syncConfig);
        }
    }
}
