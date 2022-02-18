// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.AgentPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.CredentialsArgs;
import io.pulumi.azurenative.containerregistry.inputs.PlatformPropertiesArgs;
import io.pulumi.azurenative.containerregistry.inputs.SetValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters for a quick task run request.
 * 
 */
public final class EncodedTaskRunRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncodedTaskRunRequestArgs Empty = new EncodedTaskRunRequestArgs();

    /**
     * The machine configuration of the run agent.
     * 
     */
    @InputImport(name="agentConfiguration")
    private final @Nullable Input<AgentPropertiesArgs> agentConfiguration;

    public Input<AgentPropertiesArgs> getAgentConfiguration() {
        return this.agentConfiguration == null ? Input.empty() : this.agentConfiguration;
    }

    /**
     * The dedicated agent pool for the run.
     * 
     */
    @InputImport(name="agentPoolName")
    private final @Nullable Input<String> agentPoolName;

    public Input<String> getAgentPoolName() {
        return this.agentPoolName == null ? Input.empty() : this.agentPoolName;
    }

    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable Input<CredentialsArgs> credentials;

    public Input<CredentialsArgs> getCredentials() {
        return this.credentials == null ? Input.empty() : this.credentials;
    }

    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    @InputImport(name="encodedTaskContent", required=true)
    private final Input<String> encodedTaskContent;

    public Input<String> getEncodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    @InputImport(name="encodedValuesContent")
    private final @Nullable Input<String> encodedValuesContent;

    public Input<String> getEncodedValuesContent() {
        return this.encodedValuesContent == null ? Input.empty() : this.encodedValuesContent;
    }

    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    @InputImport(name="isArchiveEnabled")
    private final @Nullable Input<Boolean> isArchiveEnabled;

    public Input<Boolean> getIsArchiveEnabled() {
        return this.isArchiveEnabled == null ? Input.empty() : this.isArchiveEnabled;
    }

    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @InputImport(name="logTemplate")
    private final @Nullable Input<String> logTemplate;

    public Input<String> getLogTemplate() {
        return this.logTemplate == null ? Input.empty() : this.logTemplate;
    }

    /**
     * The platform properties against which the run has to happen.
     * 
     */
    @InputImport(name="platform", required=true)
    private final Input<PlatformPropertiesArgs> platform;

    public Input<PlatformPropertiesArgs> getPlatform() {
        return this.platform;
    }

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    @InputImport(name="sourceLocation")
    private final @Nullable Input<String> sourceLocation;

    public Input<String> getSourceLocation() {
        return this.sourceLocation == null ? Input.empty() : this.sourceLocation;
    }

    /**
     * Run timeout in seconds.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The type of the run request.
     * Expected value is 'EncodedTaskRunRequest'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<SetValueArgs>> values;

    public Input<List<SetValueArgs>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public EncodedTaskRunRequestArgs(
        @Nullable Input<AgentPropertiesArgs> agentConfiguration,
        @Nullable Input<String> agentPoolName,
        @Nullable Input<CredentialsArgs> credentials,
        Input<String> encodedTaskContent,
        @Nullable Input<String> encodedValuesContent,
        @Nullable Input<Boolean> isArchiveEnabled,
        @Nullable Input<String> logTemplate,
        Input<PlatformPropertiesArgs> platform,
        @Nullable Input<String> sourceLocation,
        @Nullable Input<Integer> timeout,
        Input<String> type,
        @Nullable Input<List<SetValueArgs>> values) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent, "expected parameter 'encodedTaskContent' to be non-null");
        this.encodedValuesContent = encodedValuesContent;
        this.isArchiveEnabled = isArchiveEnabled == null ? Input.ofNullable(false) : isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.sourceLocation = sourceLocation;
        this.timeout = timeout == null ? Input.ofNullable(3600) : timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
    }

    private EncodedTaskRunRequestArgs() {
        this.agentConfiguration = Input.empty();
        this.agentPoolName = Input.empty();
        this.credentials = Input.empty();
        this.encodedTaskContent = Input.empty();
        this.encodedValuesContent = Input.empty();
        this.isArchiveEnabled = Input.empty();
        this.logTemplate = Input.empty();
        this.platform = Input.empty();
        this.sourceLocation = Input.empty();
        this.timeout = Input.empty();
        this.type = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AgentPropertiesArgs> agentConfiguration;
        private @Nullable Input<String> agentPoolName;
        private @Nullable Input<CredentialsArgs> credentials;
        private Input<String> encodedTaskContent;
        private @Nullable Input<String> encodedValuesContent;
        private @Nullable Input<Boolean> isArchiveEnabled;
        private @Nullable Input<String> logTemplate;
        private Input<PlatformPropertiesArgs> platform;
        private @Nullable Input<String> sourceLocation;
        private @Nullable Input<Integer> timeout;
        private Input<String> type;
        private @Nullable Input<List<SetValueArgs>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskRunRequestArgs defaults) {
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

        public Builder setAgentConfiguration(@Nullable Input<AgentPropertiesArgs> agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesArgs agentConfiguration) {
            this.agentConfiguration = Input.ofNullable(agentConfiguration);
            return this;
        }

        public Builder setAgentPoolName(@Nullable Input<String> agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = Input.ofNullable(agentPoolName);
            return this;
        }

        public Builder setCredentials(@Nullable Input<CredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsArgs credentials) {
            this.credentials = Input.ofNullable(credentials);
            return this;
        }

        public Builder setEncodedTaskContent(Input<String> encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder setEncodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Input.of(Objects.requireNonNull(encodedTaskContent));
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable Input<String> encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = Input.ofNullable(encodedValuesContent);
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Input<Boolean> isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = Input.ofNullable(isArchiveEnabled);
            return this;
        }

        public Builder setLogTemplate(@Nullable Input<String> logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = Input.ofNullable(logTemplate);
            return this;
        }

        public Builder setPlatform(Input<PlatformPropertiesArgs> platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setPlatform(PlatformPropertiesArgs platform) {
            this.platform = Input.of(Objects.requireNonNull(platform));
            return this;
        }

        public Builder setSourceLocation(@Nullable Input<String> sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = Input.ofNullable(sourceLocation);
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValues(@Nullable Input<List<SetValueArgs>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<SetValueArgs> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public EncodedTaskRunRequestArgs build() {
            return new EncodedTaskRunRequestArgs(agentConfiguration, agentPoolName, credentials, encodedTaskContent, encodedValuesContent, isArchiveEnabled, logTemplate, platform, sourceLocation, timeout, type, values);
        }
    }
}
