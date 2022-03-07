// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation.inputs;

import io.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudFormationTypeState extends io.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeState Empty = new CloudFormationTypeState();

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `type_arn`.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Identifier of the CloudFormation Type default version.
     * 
     */
    @InputImport(name="defaultVersionId")
      private final @Nullable Input<String> defaultVersionId;

    public Input<String> getDefaultVersionId() {
        return this.defaultVersionId == null ? Input.empty() : this.defaultVersionId;
    }

    /**
     * Deprecation status of the version.
     * 
     */
    @InputImport(name="deprecatedStatus")
      private final @Nullable Input<String> deprecatedStatus;

    public Input<String> getDeprecatedStatus() {
        return this.deprecatedStatus == null ? Input.empty() : this.deprecatedStatus;
    }

    /**
     * Description of the version.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * URL of the documentation for the CloudFormation Type.
     * 
     */
    @InputImport(name="documentationUrl")
      private final @Nullable Input<String> documentationUrl;

    public Input<String> getDocumentationUrl() {
        return this.documentationUrl == null ? Input.empty() : this.documentationUrl;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     * 
     */
    @InputImport(name="executionRoleArn")
      private final @Nullable Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Input.empty() : this.executionRoleArn;
    }

    /**
     * Whether the CloudFormation Type version is the default version.
     * 
     */
    @InputImport(name="isDefaultVersion")
      private final @Nullable Input<Boolean> isDefaultVersion;

    public Input<Boolean> getIsDefaultVersion() {
        return this.isDefaultVersion == null ? Input.empty() : this.isDefaultVersion;
    }

    /**
     * Configuration block containing logging configuration.
     * 
     */
    @InputImport(name="loggingConfig")
      private final @Nullable Input<CloudFormationTypeLoggingConfigGetArgs> loggingConfig;

    public Input<CloudFormationTypeLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
     */
    @InputImport(name="provisioningType")
      private final @Nullable Input<String> provisioningType;

    public Input<String> getProvisioningType() {
        return this.provisioningType == null ? Input.empty() : this.provisioningType;
    }

    /**
     * JSON document of the CloudFormation Type schema.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     * 
     */
    @InputImport(name="schemaHandlerPackage")
      private final @Nullable Input<String> schemaHandlerPackage;

    public Input<String> getSchemaHandlerPackage() {
        return this.schemaHandlerPackage == null ? Input.empty() : this.schemaHandlerPackage;
    }

    /**
     * URL of the source code for the CloudFormation Type.
     * 
     */
    @InputImport(name="sourceUrl")
      private final @Nullable Input<String> sourceUrl;

    public Input<String> getSourceUrl() {
        return this.sourceUrl == null ? Input.empty() : this.sourceUrl;
    }

    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     * 
     */
    @InputImport(name="typeArn")
      private final @Nullable Input<String> typeArn;

    public Input<String> getTypeArn() {
        return this.typeArn == null ? Input.empty() : this.typeArn;
    }

    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     * 
     */
    @InputImport(name="typeName")
      private final @Nullable Input<String> typeName;

    public Input<String> getTypeName() {
        return this.typeName == null ? Input.empty() : this.typeName;
    }

    /**
     * (Optional) Identifier of the CloudFormation Type version.
     * 
     */
    @InputImport(name="versionId")
      private final @Nullable Input<String> versionId;

    public Input<String> getVersionId() {
        return this.versionId == null ? Input.empty() : this.versionId;
    }

    /**
     * Scope of the CloudFormation Type.
     * 
     */
    @InputImport(name="visibility")
      private final @Nullable Input<String> visibility;

    public Input<String> getVisibility() {
        return this.visibility == null ? Input.empty() : this.visibility;
    }

    public CloudFormationTypeState(
        @Nullable Input<String> arn,
        @Nullable Input<String> defaultVersionId,
        @Nullable Input<String> deprecatedStatus,
        @Nullable Input<String> description,
        @Nullable Input<String> documentationUrl,
        @Nullable Input<String> executionRoleArn,
        @Nullable Input<Boolean> isDefaultVersion,
        @Nullable Input<CloudFormationTypeLoggingConfigGetArgs> loggingConfig,
        @Nullable Input<String> provisioningType,
        @Nullable Input<String> schema,
        @Nullable Input<String> schemaHandlerPackage,
        @Nullable Input<String> sourceUrl,
        @Nullable Input<String> type,
        @Nullable Input<String> typeArn,
        @Nullable Input<String> typeName,
        @Nullable Input<String> versionId,
        @Nullable Input<String> visibility) {
        this.arn = arn;
        this.defaultVersionId = defaultVersionId;
        this.deprecatedStatus = deprecatedStatus;
        this.description = description;
        this.documentationUrl = documentationUrl;
        this.executionRoleArn = executionRoleArn;
        this.isDefaultVersion = isDefaultVersion;
        this.loggingConfig = loggingConfig;
        this.provisioningType = provisioningType;
        this.schema = schema;
        this.schemaHandlerPackage = schemaHandlerPackage;
        this.sourceUrl = sourceUrl;
        this.type = type;
        this.typeArn = typeArn;
        this.typeName = typeName;
        this.versionId = versionId;
        this.visibility = visibility;
    }

    private CloudFormationTypeState() {
        this.arn = Input.empty();
        this.defaultVersionId = Input.empty();
        this.deprecatedStatus = Input.empty();
        this.description = Input.empty();
        this.documentationUrl = Input.empty();
        this.executionRoleArn = Input.empty();
        this.isDefaultVersion = Input.empty();
        this.loggingConfig = Input.empty();
        this.provisioningType = Input.empty();
        this.schema = Input.empty();
        this.schemaHandlerPackage = Input.empty();
        this.sourceUrl = Input.empty();
        this.type = Input.empty();
        this.typeArn = Input.empty();
        this.typeName = Input.empty();
        this.versionId = Input.empty();
        this.visibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> defaultVersionId;
        private @Nullable Input<String> deprecatedStatus;
        private @Nullable Input<String> description;
        private @Nullable Input<String> documentationUrl;
        private @Nullable Input<String> executionRoleArn;
        private @Nullable Input<Boolean> isDefaultVersion;
        private @Nullable Input<CloudFormationTypeLoggingConfigGetArgs> loggingConfig;
        private @Nullable Input<String> provisioningType;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> schemaHandlerPackage;
        private @Nullable Input<String> sourceUrl;
        private @Nullable Input<String> type;
        private @Nullable Input<String> typeArn;
        private @Nullable Input<String> typeName;
        private @Nullable Input<String> versionId;
        private @Nullable Input<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationTypeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultVersionId = defaults.defaultVersionId;
    	      this.deprecatedStatus = defaults.deprecatedStatus;
    	      this.description = defaults.description;
    	      this.documentationUrl = defaults.documentationUrl;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.isDefaultVersion = defaults.isDefaultVersion;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.provisioningType = defaults.provisioningType;
    	      this.schema = defaults.schema;
    	      this.schemaHandlerPackage = defaults.schemaHandlerPackage;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.type = defaults.type;
    	      this.typeArn = defaults.typeArn;
    	      this.typeName = defaults.typeName;
    	      this.versionId = defaults.versionId;
    	      this.visibility = defaults.visibility;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDefaultVersionId(@Nullable Input<String> defaultVersionId) {
            this.defaultVersionId = defaultVersionId;
            return this;
        }

        public Builder setDefaultVersionId(@Nullable String defaultVersionId) {
            this.defaultVersionId = Input.ofNullable(defaultVersionId);
            return this;
        }

        public Builder setDeprecatedStatus(@Nullable Input<String> deprecatedStatus) {
            this.deprecatedStatus = deprecatedStatus;
            return this;
        }

        public Builder setDeprecatedStatus(@Nullable String deprecatedStatus) {
            this.deprecatedStatus = Input.ofNullable(deprecatedStatus);
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

        public Builder setDocumentationUrl(@Nullable Input<String> documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }

        public Builder setDocumentationUrl(@Nullable String documentationUrl) {
            this.documentationUrl = Input.ofNullable(documentationUrl);
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable Input<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Input.ofNullable(executionRoleArn);
            return this;
        }

        public Builder setIsDefaultVersion(@Nullable Input<Boolean> isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }

        public Builder setIsDefaultVersion(@Nullable Boolean isDefaultVersion) {
            this.isDefaultVersion = Input.ofNullable(isDefaultVersion);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<CloudFormationTypeLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable CloudFormationTypeLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setProvisioningType(@Nullable Input<String> provisioningType) {
            this.provisioningType = provisioningType;
            return this;
        }

        public Builder setProvisioningType(@Nullable String provisioningType) {
            this.provisioningType = Input.ofNullable(provisioningType);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSchemaHandlerPackage(@Nullable Input<String> schemaHandlerPackage) {
            this.schemaHandlerPackage = schemaHandlerPackage;
            return this;
        }

        public Builder setSchemaHandlerPackage(@Nullable String schemaHandlerPackage) {
            this.schemaHandlerPackage = Input.ofNullable(schemaHandlerPackage);
            return this;
        }

        public Builder setSourceUrl(@Nullable Input<String> sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        public Builder setSourceUrl(@Nullable String sourceUrl) {
            this.sourceUrl = Input.ofNullable(sourceUrl);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setTypeArn(@Nullable Input<String> typeArn) {
            this.typeArn = typeArn;
            return this;
        }

        public Builder setTypeArn(@Nullable String typeArn) {
            this.typeArn = Input.ofNullable(typeArn);
            return this;
        }

        public Builder setTypeName(@Nullable Input<String> typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder setTypeName(@Nullable String typeName) {
            this.typeName = Input.ofNullable(typeName);
            return this;
        }

        public Builder setVersionId(@Nullable Input<String> versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = Input.ofNullable(versionId);
            return this;
        }

        public Builder setVisibility(@Nullable Input<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = Input.ofNullable(visibility);
            return this;
        }
        public CloudFormationTypeState build() {
            return new CloudFormationTypeState(arn, defaultVersionId, deprecatedStatus, description, documentationUrl, executionRoleArn, isDefaultVersion, loggingConfig, provisioningType, schema, schemaHandlerPackage, sourceUrl, type, typeArn, typeName, versionId, visibility);
        }
    }
}