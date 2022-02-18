// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.SetValueResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters for a quick task run request.
 * 
 */
public final class EncodedTaskRunRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncodedTaskRunRequestResponse Empty = new EncodedTaskRunRequestResponse();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @InputImport(name="agentConfiguration")
    private final @Nullable AgentPropertiesResponse agentConfiguration;

    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return this.agentConfiguration == null ? Optional.empty() : Optional.ofNullable(this.agentConfiguration);
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @InputImport(name="agentPoolName")
    private final @Nullable String agentPoolName;

    public Optional<String> getAgentPoolName() {
        return this.agentPoolName == null ? Optional.empty() : Optional.ofNullable(this.agentPoolName);
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable CredentialsResponse credentials;

    public Optional<CredentialsResponse> getCredentials() {
        return this.credentials == null ? Optional.empty() : Optional.ofNullable(this.credentials);
    }

    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    @InputImport(name="encodedTaskContent", required=true)
    private final String encodedTaskContent;

    public String getEncodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    @InputImport(name="encodedValuesContent")
    private final @Nullable String encodedValuesContent;

    public Optional<String> getEncodedValuesContent() {
        return this.encodedValuesContent == null ? Optional.empty() : Optional.ofNullable(this.encodedValuesContent);
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @InputImport(name="isArchiveEnabled")
    private final @Nullable Boolean isArchiveEnabled;

    public Optional<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Optional.empty() : Optional.ofNullable(this.isArchiveEnabled);
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @InputImport(name="logTemplate")
    private final @Nullable String logTemplate;

    public Optional<String> getLogTemplate() {
        return this.logTemplate == null ? Optional.empty() : Optional.ofNullable(this.logTemplate);
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @InputImport(name="platform", required=true)
    private final PlatformPropertiesResponse platform;

    public PlatformPropertiesResponse getPlatform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @InputImport(name="sourceLocation")
    private final @Nullable String sourceLocation;

    public Optional<String> getSourceLocation() {
        return this.sourceLocation == null ? Optional.empty() : Optional.ofNullable(this.sourceLocation);
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Integer timeout;

    public Optional<Integer> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * The type of the run request.
     * Expected value is 'EncodedTaskRunRequest'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @InputImport(name="values")
    private final @Nullable List<SetValueResponse> values;

    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public EncodedTaskRunRequestResponse(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        @Nullable CredentialsResponse credentials,
        String encodedTaskContent,
        @Nullable String encodedValuesContent,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String logTemplate,
        PlatformPropertiesResponse platform,
        @Nullable String sourceLocation,
        @Nullable Integer timeout,
        String type,
        @Nullable List<SetValueResponse> values) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent, "expected parameter 'encodedTaskContent' to be non-null");
        this.encodedValuesContent = encodedValuesContent;
        this.isArchiveEnabled = isArchiveEnabled == null ? false : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.timeout = timeout == null ? 3600 : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private EncodedTaskRunRequestResponse() {
        this.agentConfiguration = null;
        this.agentPoolName = null;
        this.credentials = null;
        this.encodedTaskContent = null;
        this.encodedValuesContent = null;
        this.isArchiveEnabled = null;
        this.logTemplate = null;
        this.platform = null;
        this.sourceLocation = null;
        this.timeout = null;
        this.type = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable CredentialsResponse credentials;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private PlatformPropertiesResponse platform;
        private @Nullable String sourceLocation;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setEncodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setPlatform(PlatformPropertiesResponse platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public EncodedTaskRunRequestResponse build() {
            return new EncodedTaskRunRequestResponse(agentConfiguration, agentPoolName, credentials, encodedTaskContent, encodedValuesContent, isArchiveEnabled, logTemplate, platform, sourceLocation, timeout, type, values);
        }
    }
}
