// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Databricks linked service.
 * 
 */
public final class AzureDatabricksLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksLinkedServiceArgs Empty = new AzureDatabricksLinkedServiceArgs();

    /**
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessToken() {
        return this.accessToken == null ? Output.empty() : this.accessToken;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Required to specify MSI, if using Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<Object> authentication;

    public Output<Object> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Output.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="domain", required=true)
      private final Output<Object> domain;

    public Output<Object> getDomain() {
        return this.domain;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * The id of an existing interactive cluster that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="existingClusterId")
      private final @Nullable Output<Object> existingClusterId;

    public Output<Object> getExistingClusterId() {
        return this.existingClusterId == null ? Output.empty() : this.existingClusterId;
    }

    /**
     * The id of an existing instance pool that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="instancePoolId")
      private final @Nullable Output<Object> instancePoolId;

    public Output<Object> getInstancePoolId() {
        return this.instancePoolId == null ? Output.empty() : this.instancePoolId;
    }

    /**
     * Additional tags for cluster resources. This property is ignored in instance pool configurations.
     * 
     */
    @Import(name="newClusterCustomTags")
      private final @Nullable Output<Map<String,Object>> newClusterCustomTags;

    public Output<Map<String,Object>> getNewClusterCustomTags() {
        return this.newClusterCustomTags == null ? Output.empty() : this.newClusterCustomTags;
    }

    /**
     * The driver node type for the new job cluster. This property is ignored in instance pool configurations. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="newClusterDriverNodeType")
      private final @Nullable Output<Object> newClusterDriverNodeType;

    public Output<Object> getNewClusterDriverNodeType() {
        return this.newClusterDriverNodeType == null ? Output.empty() : this.newClusterDriverNodeType;
    }

    /**
     * Enable the elastic disk on the new cluster. This property is now ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="newClusterEnableElasticDisk")
      private final @Nullable Output<Object> newClusterEnableElasticDisk;

    public Output<Object> getNewClusterEnableElasticDisk() {
        return this.newClusterEnableElasticDisk == null ? Output.empty() : this.newClusterEnableElasticDisk;
    }

    /**
     * User-defined initialization scripts for the new cluster. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="newClusterInitScripts")
      private final @Nullable Output<Object> newClusterInitScripts;

    public Output<Object> getNewClusterInitScripts() {
        return this.newClusterInitScripts == null ? Output.empty() : this.newClusterInitScripts;
    }

    /**
     * Specify a location to deliver Spark driver, worker, and event logs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="newClusterLogDestination")
      private final @Nullable Output<Object> newClusterLogDestination;

    public Output<Object> getNewClusterLogDestination() {
        return this.newClusterLogDestination == null ? Output.empty() : this.newClusterLogDestination;
    }

    /**
     * The node type of the new job cluster. This property is required if newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property is ignored. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="newClusterNodeType")
      private final @Nullable Output<Object> newClusterNodeType;

    public Output<Object> getNewClusterNodeType() {
        return this.newClusterNodeType == null ? Output.empty() : this.newClusterNodeType;
    }

    /**
     * If not using an existing interactive cluster, this specifies the number of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools, this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if newClusterVersion is specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="newClusterNumOfWorker")
      private final @Nullable Output<Object> newClusterNumOfWorker;

    public Output<Object> getNewClusterNumOfWorker() {
        return this.newClusterNumOfWorker == null ? Output.empty() : this.newClusterNumOfWorker;
    }

    /**
     * A set of optional, user-specified Spark configuration key-value pairs.
     * 
     */
    @Import(name="newClusterSparkConf")
      private final @Nullable Output<Map<String,Object>> newClusterSparkConf;

    public Output<Map<String,Object>> getNewClusterSparkConf() {
        return this.newClusterSparkConf == null ? Output.empty() : this.newClusterSparkConf;
    }

    /**
     * A set of optional, user-specified Spark environment variables key-value pairs.
     * 
     */
    @Import(name="newClusterSparkEnvVars")
      private final @Nullable Output<Map<String,Object>> newClusterSparkEnvVars;

    public Output<Map<String,Object>> getNewClusterSparkEnvVars() {
        return this.newClusterSparkEnvVars == null ? Output.empty() : this.newClusterSparkEnvVars;
    }

    /**
     * If not using an existing interactive cluster, this specifies the Spark version of a new job cluster or instance pool nodes created for each run of this activity. Required if instancePoolId is specified. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="newClusterVersion")
      private final @Nullable Output<Object> newClusterVersion;

    public Output<Object> getNewClusterVersion() {
        return this.newClusterVersion == null ? Output.empty() : this.newClusterVersion;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The policy id for limiting the ability to configure clusters based on a user defined set of rules. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<Object> policyId;

    public Output<Object> getPolicyId() {
        return this.policyId == null ? Output.empty() : this.policyId;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDatabricks'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable Output<Object> workspaceResourceId;

    public Output<Object> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Output.empty() : this.workspaceResourceId;
    }

    public AzureDatabricksLinkedServiceArgs(
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authentication,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<String> description,
        Output<Object> domain,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Object> existingClusterId,
        @Nullable Output<Object> instancePoolId,
        @Nullable Output<Map<String,Object>> newClusterCustomTags,
        @Nullable Output<Object> newClusterDriverNodeType,
        @Nullable Output<Object> newClusterEnableElasticDisk,
        @Nullable Output<Object> newClusterInitScripts,
        @Nullable Output<Object> newClusterLogDestination,
        @Nullable Output<Object> newClusterNodeType,
        @Nullable Output<Object> newClusterNumOfWorker,
        @Nullable Output<Map<String,Object>> newClusterSparkConf,
        @Nullable Output<Map<String,Object>> newClusterSparkEnvVars,
        @Nullable Output<Object> newClusterVersion,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> policyId,
        Output<String> type,
        @Nullable Output<Object> workspaceResourceId) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.encryptedCredential = encryptedCredential;
        this.existingClusterId = existingClusterId;
        this.instancePoolId = instancePoolId;
        this.newClusterCustomTags = newClusterCustomTags;
        this.newClusterDriverNodeType = newClusterDriverNodeType;
        this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
        this.newClusterInitScripts = newClusterInitScripts;
        this.newClusterLogDestination = newClusterLogDestination;
        this.newClusterNodeType = newClusterNodeType;
        this.newClusterNumOfWorker = newClusterNumOfWorker;
        this.newClusterSparkConf = newClusterSparkConf;
        this.newClusterSparkEnvVars = newClusterSparkEnvVars;
        this.newClusterVersion = newClusterVersion;
        this.parameters = parameters;
        this.policyId = policyId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private AzureDatabricksLinkedServiceArgs() {
        this.accessToken = Output.empty();
        this.annotations = Output.empty();
        this.authentication = Output.empty();
        this.connectVia = Output.empty();
        this.credential = Output.empty();
        this.description = Output.empty();
        this.domain = Output.empty();
        this.encryptedCredential = Output.empty();
        this.existingClusterId = Output.empty();
        this.instancePoolId = Output.empty();
        this.newClusterCustomTags = Output.empty();
        this.newClusterDriverNodeType = Output.empty();
        this.newClusterEnableElasticDisk = Output.empty();
        this.newClusterInitScripts = Output.empty();
        this.newClusterLogDestination = Output.empty();
        this.newClusterNodeType = Output.empty();
        this.newClusterNumOfWorker = Output.empty();
        this.newClusterSparkConf = Output.empty();
        this.newClusterSparkEnvVars = Output.empty();
        this.newClusterVersion = Output.empty();
        this.parameters = Output.empty();
        this.policyId = Output.empty();
        this.type = Output.empty();
        this.workspaceResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authentication;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<String> description;
        private Output<Object> domain;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Object> existingClusterId;
        private @Nullable Output<Object> instancePoolId;
        private @Nullable Output<Map<String,Object>> newClusterCustomTags;
        private @Nullable Output<Object> newClusterDriverNodeType;
        private @Nullable Output<Object> newClusterEnableElasticDisk;
        private @Nullable Output<Object> newClusterInitScripts;
        private @Nullable Output<Object> newClusterLogDestination;
        private @Nullable Output<Object> newClusterNodeType;
        private @Nullable Output<Object> newClusterNumOfWorker;
        private @Nullable Output<Map<String,Object>> newClusterSparkConf;
        private @Nullable Output<Map<String,Object>> newClusterSparkEnvVars;
        private @Nullable Output<Object> newClusterVersion;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> policyId;
        private Output<String> type;
        private @Nullable Output<Object> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.existingClusterId = defaults.existingClusterId;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.newClusterCustomTags = defaults.newClusterCustomTags;
    	      this.newClusterDriverNodeType = defaults.newClusterDriverNodeType;
    	      this.newClusterEnableElasticDisk = defaults.newClusterEnableElasticDisk;
    	      this.newClusterInitScripts = defaults.newClusterInitScripts;
    	      this.newClusterLogDestination = defaults.newClusterLogDestination;
    	      this.newClusterNodeType = defaults.newClusterNodeType;
    	      this.newClusterNumOfWorker = defaults.newClusterNumOfWorker;
    	      this.newClusterSparkConf = defaults.newClusterSparkConf;
    	      this.newClusterSparkEnvVars = defaults.newClusterSparkEnvVars;
    	      this.newClusterVersion = defaults.newClusterVersion;
    	      this.parameters = defaults.parameters;
    	      this.policyId = defaults.policyId;
    	      this.type = defaults.type;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder accessToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Output.ofNullable(accessToken);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authentication(@Nullable Output<Object> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable Object authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Output.ofNullable(credential);
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
        public Builder domain(Output<Object> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(Object domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }
        public Builder existingClusterId(@Nullable Output<Object> existingClusterId) {
            this.existingClusterId = existingClusterId;
            return this;
        }
        public Builder existingClusterId(@Nullable Object existingClusterId) {
            this.existingClusterId = Output.ofNullable(existingClusterId);
            return this;
        }
        public Builder instancePoolId(@Nullable Output<Object> instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }
        public Builder instancePoolId(@Nullable Object instancePoolId) {
            this.instancePoolId = Output.ofNullable(instancePoolId);
            return this;
        }
        public Builder newClusterCustomTags(@Nullable Output<Map<String,Object>> newClusterCustomTags) {
            this.newClusterCustomTags = newClusterCustomTags;
            return this;
        }
        public Builder newClusterCustomTags(@Nullable Map<String,Object> newClusterCustomTags) {
            this.newClusterCustomTags = Output.ofNullable(newClusterCustomTags);
            return this;
        }
        public Builder newClusterDriverNodeType(@Nullable Output<Object> newClusterDriverNodeType) {
            this.newClusterDriverNodeType = newClusterDriverNodeType;
            return this;
        }
        public Builder newClusterDriverNodeType(@Nullable Object newClusterDriverNodeType) {
            this.newClusterDriverNodeType = Output.ofNullable(newClusterDriverNodeType);
            return this;
        }
        public Builder newClusterEnableElasticDisk(@Nullable Output<Object> newClusterEnableElasticDisk) {
            this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
            return this;
        }
        public Builder newClusterEnableElasticDisk(@Nullable Object newClusterEnableElasticDisk) {
            this.newClusterEnableElasticDisk = Output.ofNullable(newClusterEnableElasticDisk);
            return this;
        }
        public Builder newClusterInitScripts(@Nullable Output<Object> newClusterInitScripts) {
            this.newClusterInitScripts = newClusterInitScripts;
            return this;
        }
        public Builder newClusterInitScripts(@Nullable Object newClusterInitScripts) {
            this.newClusterInitScripts = Output.ofNullable(newClusterInitScripts);
            return this;
        }
        public Builder newClusterLogDestination(@Nullable Output<Object> newClusterLogDestination) {
            this.newClusterLogDestination = newClusterLogDestination;
            return this;
        }
        public Builder newClusterLogDestination(@Nullable Object newClusterLogDestination) {
            this.newClusterLogDestination = Output.ofNullable(newClusterLogDestination);
            return this;
        }
        public Builder newClusterNodeType(@Nullable Output<Object> newClusterNodeType) {
            this.newClusterNodeType = newClusterNodeType;
            return this;
        }
        public Builder newClusterNodeType(@Nullable Object newClusterNodeType) {
            this.newClusterNodeType = Output.ofNullable(newClusterNodeType);
            return this;
        }
        public Builder newClusterNumOfWorker(@Nullable Output<Object> newClusterNumOfWorker) {
            this.newClusterNumOfWorker = newClusterNumOfWorker;
            return this;
        }
        public Builder newClusterNumOfWorker(@Nullable Object newClusterNumOfWorker) {
            this.newClusterNumOfWorker = Output.ofNullable(newClusterNumOfWorker);
            return this;
        }
        public Builder newClusterSparkConf(@Nullable Output<Map<String,Object>> newClusterSparkConf) {
            this.newClusterSparkConf = newClusterSparkConf;
            return this;
        }
        public Builder newClusterSparkConf(@Nullable Map<String,Object> newClusterSparkConf) {
            this.newClusterSparkConf = Output.ofNullable(newClusterSparkConf);
            return this;
        }
        public Builder newClusterSparkEnvVars(@Nullable Output<Map<String,Object>> newClusterSparkEnvVars) {
            this.newClusterSparkEnvVars = newClusterSparkEnvVars;
            return this;
        }
        public Builder newClusterSparkEnvVars(@Nullable Map<String,Object> newClusterSparkEnvVars) {
            this.newClusterSparkEnvVars = Output.ofNullable(newClusterSparkEnvVars);
            return this;
        }
        public Builder newClusterVersion(@Nullable Output<Object> newClusterVersion) {
            this.newClusterVersion = newClusterVersion;
            return this;
        }
        public Builder newClusterVersion(@Nullable Object newClusterVersion) {
            this.newClusterVersion = Output.ofNullable(newClusterVersion);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder policyId(@Nullable Output<Object> policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder policyId(@Nullable Object policyId) {
            this.policyId = Output.ofNullable(policyId);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder workspaceResourceId(@Nullable Output<Object> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public Builder workspaceResourceId(@Nullable Object workspaceResourceId) {
            this.workspaceResourceId = Output.ofNullable(workspaceResourceId);
            return this;
        }        public AzureDatabricksLinkedServiceArgs build() {
            return new AzureDatabricksLinkedServiceArgs(accessToken, annotations, authentication, connectVia, credential, description, domain, encryptedCredential, existingClusterId, instancePoolId, newClusterCustomTags, newClusterDriverNodeType, newClusterEnableElasticDisk, newClusterInitScripts, newClusterLogDestination, newClusterNodeType, newClusterNumOfWorker, newClusterSparkConf, newClusterSparkEnvVars, newClusterVersion, parameters, policyId, type, workspaceResourceId);
        }
    }
}
