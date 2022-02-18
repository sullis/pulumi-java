// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Databricks linked service.
 * 
 */
public final class AzureDatabricksLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDatabricksLinkedServiceResponse Empty = new AzureDatabricksLinkedServiceResponse();

    /**
     * Access token for databricks REST API. Refer to https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getAccessToken() {
        return this.accessToken == null ? null : this.accessToken;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Required to specify MSI, if using Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="authentication")
    private final @Nullable Object authentication;

    public Optional<Object> getAuthentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
    private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * <REGION>.azuredatabricks.net, domain name of your Databricks deployment. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="domain", required=true)
    private final Object domain;

    public Object getDomain() {
        return this.domain;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The id of an existing interactive cluster that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="existingClusterId")
    private final @Nullable Object existingClusterId;

    public Optional<Object> getExistingClusterId() {
        return this.existingClusterId == null ? Optional.empty() : Optional.ofNullable(this.existingClusterId);
    }

    /**
     * The id of an existing instance pool that will be used for all runs of this activity. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="instancePoolId")
    private final @Nullable Object instancePoolId;

    public Optional<Object> getInstancePoolId() {
        return this.instancePoolId == null ? Optional.empty() : Optional.ofNullable(this.instancePoolId);
    }

    /**
     * Additional tags for cluster resources. This property is ignored in instance pool configurations.
     * 
     */
    @InputImport(name="newClusterCustomTags")
    private final @Nullable Map<String,Object> newClusterCustomTags;

    public Map<String,Object> getNewClusterCustomTags() {
        return this.newClusterCustomTags == null ? Map.of() : this.newClusterCustomTags;
    }

    /**
     * The driver node type for the new job cluster. This property is ignored in instance pool configurations. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="newClusterDriverNodeType")
    private final @Nullable Object newClusterDriverNodeType;

    public Optional<Object> getNewClusterDriverNodeType() {
        return this.newClusterDriverNodeType == null ? Optional.empty() : Optional.ofNullable(this.newClusterDriverNodeType);
    }

    /**
     * Enable the elastic disk on the new cluster. This property is now ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="newClusterEnableElasticDisk")
    private final @Nullable Object newClusterEnableElasticDisk;

    public Optional<Object> getNewClusterEnableElasticDisk() {
        return this.newClusterEnableElasticDisk == null ? Optional.empty() : Optional.ofNullable(this.newClusterEnableElasticDisk);
    }

    /**
     * User-defined initialization scripts for the new cluster. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @InputImport(name="newClusterInitScripts")
    private final @Nullable Object newClusterInitScripts;

    public Optional<Object> getNewClusterInitScripts() {
        return this.newClusterInitScripts == null ? Optional.empty() : Optional.ofNullable(this.newClusterInitScripts);
    }

    /**
     * Specify a location to deliver Spark driver, worker, and event logs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="newClusterLogDestination")
    private final @Nullable Object newClusterLogDestination;

    public Optional<Object> getNewClusterLogDestination() {
        return this.newClusterLogDestination == null ? Optional.empty() : Optional.ofNullable(this.newClusterLogDestination);
    }

    /**
     * The node type of the new job cluster. This property is required if newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property is ignored. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="newClusterNodeType")
    private final @Nullable Object newClusterNodeType;

    public Optional<Object> getNewClusterNodeType() {
        return this.newClusterNodeType == null ? Optional.empty() : Optional.ofNullable(this.newClusterNodeType);
    }

    /**
     * If not using an existing interactive cluster, this specifies the number of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools, this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if newClusterVersion is specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="newClusterNumOfWorker")
    private final @Nullable Object newClusterNumOfWorker;

    public Optional<Object> getNewClusterNumOfWorker() {
        return this.newClusterNumOfWorker == null ? Optional.empty() : Optional.ofNullable(this.newClusterNumOfWorker);
    }

    /**
     * A set of optional, user-specified Spark configuration key-value pairs.
     * 
     */
    @InputImport(name="newClusterSparkConf")
    private final @Nullable Map<String,Object> newClusterSparkConf;

    public Map<String,Object> getNewClusterSparkConf() {
        return this.newClusterSparkConf == null ? Map.of() : this.newClusterSparkConf;
    }

    /**
     * A set of optional, user-specified Spark environment variables key-value pairs.
     * 
     */
    @InputImport(name="newClusterSparkEnvVars")
    private final @Nullable Map<String,Object> newClusterSparkEnvVars;

    public Map<String,Object> getNewClusterSparkEnvVars() {
        return this.newClusterSparkEnvVars == null ? Map.of() : this.newClusterSparkEnvVars;
    }

    /**
     * If not using an existing interactive cluster, this specifies the Spark version of a new job cluster or instance pool nodes created for each run of this activity. Required if instancePoolId is specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="newClusterVersion")
    private final @Nullable Object newClusterVersion;

    public Optional<Object> getNewClusterVersion() {
        return this.newClusterVersion == null ? Optional.empty() : Optional.ofNullable(this.newClusterVersion);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The policy id for limiting the ability to configure clusters based on a user defined set of rules. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Object policyId;

    public Optional<Object> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDatabricks'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Workspace resource id for databricks REST API. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="workspaceResourceId")
    private final @Nullable Object workspaceResourceId;

    public Optional<Object> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceResourceId);
    }

    public AzureDatabricksLinkedServiceResponse(
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken,
        @Nullable List<Object> annotations,
        @Nullable Object authentication,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        Object domain,
        @Nullable Object encryptedCredential,
        @Nullable Object existingClusterId,
        @Nullable Object instancePoolId,
        @Nullable Map<String,Object> newClusterCustomTags,
        @Nullable Object newClusterDriverNodeType,
        @Nullable Object newClusterEnableElasticDisk,
        @Nullable Object newClusterInitScripts,
        @Nullable Object newClusterLogDestination,
        @Nullable Object newClusterNodeType,
        @Nullable Object newClusterNumOfWorker,
        @Nullable Map<String,Object> newClusterSparkConf,
        @Nullable Map<String,Object> newClusterSparkEnvVars,
        @Nullable Object newClusterVersion,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object policyId,
        String type,
        @Nullable Object workspaceResourceId) {
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

    private AzureDatabricksLinkedServiceResponse() {
        this.accessToken = null;
        this.annotations = List.of();
        this.authentication = null;
        this.connectVia = null;
        this.credential = null;
        this.description = null;
        this.domain = null;
        this.encryptedCredential = null;
        this.existingClusterId = null;
        this.instancePoolId = null;
        this.newClusterCustomTags = Map.of();
        this.newClusterDriverNodeType = null;
        this.newClusterEnableElasticDisk = null;
        this.newClusterInitScripts = null;
        this.newClusterLogDestination = null;
        this.newClusterNodeType = null;
        this.newClusterNumOfWorker = null;
        this.newClusterSparkConf = Map.of();
        this.newClusterSparkEnvVars = Map.of();
        this.newClusterVersion = null;
        this.parameters = Map.of();
        this.policyId = null;
        this.type = null;
        this.workspaceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken;
        private @Nullable List<Object> annotations;
        private @Nullable Object authentication;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private Object domain;
        private @Nullable Object encryptedCredential;
        private @Nullable Object existingClusterId;
        private @Nullable Object instancePoolId;
        private @Nullable Map<String,Object> newClusterCustomTags;
        private @Nullable Object newClusterDriverNodeType;
        private @Nullable Object newClusterEnableElasticDisk;
        private @Nullable Object newClusterInitScripts;
        private @Nullable Object newClusterLogDestination;
        private @Nullable Object newClusterNodeType;
        private @Nullable Object newClusterNumOfWorker;
        private @Nullable Map<String,Object> newClusterSparkConf;
        private @Nullable Map<String,Object> newClusterSparkEnvVars;
        private @Nullable Object newClusterVersion;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object policyId;
        private String type;
        private @Nullable Object workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksLinkedServiceResponse defaults) {
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

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDomain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setExistingClusterId(@Nullable Object existingClusterId) {
            this.existingClusterId = existingClusterId;
            return this;
        }

        public Builder setInstancePoolId(@Nullable Object instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }

        public Builder setNewClusterCustomTags(@Nullable Map<String,Object> newClusterCustomTags) {
            this.newClusterCustomTags = newClusterCustomTags;
            return this;
        }

        public Builder setNewClusterDriverNodeType(@Nullable Object newClusterDriverNodeType) {
            this.newClusterDriverNodeType = newClusterDriverNodeType;
            return this;
        }

        public Builder setNewClusterEnableElasticDisk(@Nullable Object newClusterEnableElasticDisk) {
            this.newClusterEnableElasticDisk = newClusterEnableElasticDisk;
            return this;
        }

        public Builder setNewClusterInitScripts(@Nullable Object newClusterInitScripts) {
            this.newClusterInitScripts = newClusterInitScripts;
            return this;
        }

        public Builder setNewClusterLogDestination(@Nullable Object newClusterLogDestination) {
            this.newClusterLogDestination = newClusterLogDestination;
            return this;
        }

        public Builder setNewClusterNodeType(@Nullable Object newClusterNodeType) {
            this.newClusterNodeType = newClusterNodeType;
            return this;
        }

        public Builder setNewClusterNumOfWorker(@Nullable Object newClusterNumOfWorker) {
            this.newClusterNumOfWorker = newClusterNumOfWorker;
            return this;
        }

        public Builder setNewClusterSparkConf(@Nullable Map<String,Object> newClusterSparkConf) {
            this.newClusterSparkConf = newClusterSparkConf;
            return this;
        }

        public Builder setNewClusterSparkEnvVars(@Nullable Map<String,Object> newClusterSparkEnvVars) {
            this.newClusterSparkEnvVars = newClusterSparkEnvVars;
            return this;
        }

        public Builder setNewClusterVersion(@Nullable Object newClusterVersion) {
            this.newClusterVersion = newClusterVersion;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPolicyId(@Nullable Object policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Object workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public AzureDatabricksLinkedServiceResponse build() {
            return new AzureDatabricksLinkedServiceResponse(accessToken, annotations, authentication, connectVia, credential, description, domain, encryptedCredential, existingClusterId, instancePoolId, newClusterCustomTags, newClusterDriverNodeType, newClusterEnableElasticDisk, newClusterInitScripts, newClusterLogDestination, newClusterNodeType, newClusterNumOfWorker, newClusterSparkConf, newClusterSparkEnvVars, newClusterVersion, parameters, policyId, type, workspaceResourceId);
        }
    }
}
