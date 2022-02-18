// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentSourceResponse;
import io.pulumi.azurenative.automation.outputs.DscConfigurationParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDscConfigurationResult {
    /**
     * Gets or sets the creation time.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets the job count of the configuration.
     * 
     */
    private final @Nullable Integer jobCount;
    /**
     * Gets or sets the last modified time.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * The Azure Region where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * Gets or sets verbose log option.
     * 
     */
    private final @Nullable Boolean logVerbose;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets the number of compiled node configurations.
     * 
     */
    private final @Nullable Integer nodeConfigurationCount;
    /**
     * Gets or sets the configuration parameters.
     * 
     */
    private final @Nullable Map<String,DscConfigurationParameterResponse> parameters;
    /**
     * Gets or sets the provisioning state of the configuration.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Gets or sets the source.
     * 
     */
    private final @Nullable ContentSourceResponse source;
    /**
     * Gets or sets the state of the configuration.
     * 
     */
    private final @Nullable String state;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"creationTime","description","etag","id","jobCount","lastModifiedTime","location","logVerbose","name","nodeConfigurationCount","parameters","provisioningState","source","state","tags","type"})
    private GetDscConfigurationResult(
        @Nullable String creationTime,
        @Nullable String description,
        @Nullable String etag,
        String id,
        @Nullable Integer jobCount,
        @Nullable String lastModifiedTime,
        @Nullable String location,
        @Nullable Boolean logVerbose,
        String name,
        @Nullable Integer nodeConfigurationCount,
        @Nullable Map<String,DscConfigurationParameterResponse> parameters,
        @Nullable String provisioningState,
        @Nullable ContentSourceResponse source,
        @Nullable String state,
        @Nullable Map<String,String> tags,
        String type) {
        this.creationTime = creationTime;
        this.description = description;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.jobCount = jobCount;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.logVerbose = logVerbose;
        this.name = Objects.requireNonNull(name);
        this.nodeConfigurationCount = nodeConfigurationCount;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.source = source;
        this.state = state;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets or sets the creation time.
     * 
     */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * Gets or sets the description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets or sets the etag of the resource.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified resource Id for the resource
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the job count of the configuration.
     * 
     */
    public Optional<Integer> getJobCount() {
        return Optional.ofNullable(this.jobCount);
    }
    /**
     * Gets or sets the last modified time.
     * 
     */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * The Azure Region where the resource lives
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets or sets verbose log option.
     * 
     */
    public Optional<Boolean> getLogVerbose() {
        return Optional.ofNullable(this.logVerbose);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number of compiled node configurations.
     * 
     */
    public Optional<Integer> getNodeConfigurationCount() {
        return Optional.ofNullable(this.nodeConfigurationCount);
    }
    /**
     * Gets or sets the configuration parameters.
     * 
     */
    public Map<String,DscConfigurationParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Gets or sets the provisioning state of the configuration.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Gets or sets the source.
     * 
     */
    public Optional<ContentSourceResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * Gets or sets the state of the configuration.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDscConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String etag;
        private String id;
        private @Nullable Integer jobCount;
        private @Nullable String lastModifiedTime;
        private @Nullable String location;
        private @Nullable Boolean logVerbose;
        private String name;
        private @Nullable Integer nodeConfigurationCount;
        private @Nullable Map<String,DscConfigurationParameterResponse> parameters;
        private @Nullable String provisioningState;
        private @Nullable ContentSourceResponse source;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDscConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.jobCount = defaults.jobCount;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.logVerbose = defaults.logVerbose;
    	      this.name = defaults.name;
    	      this.nodeConfigurationCount = defaults.nodeConfigurationCount;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setJobCount(@Nullable Integer jobCount) {
            this.jobCount = jobCount;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setLogVerbose(@Nullable Boolean logVerbose) {
            this.logVerbose = logVerbose;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeConfigurationCount(@Nullable Integer nodeConfigurationCount) {
            this.nodeConfigurationCount = nodeConfigurationCount;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,DscConfigurationParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSource(@Nullable ContentSourceResponse source) {
            this.source = source;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDscConfigurationResult build() {
            return new GetDscConfigurationResult(creationTime, description, etag, id, jobCount, lastModifiedTime, location, logVerbose, name, nodeConfigurationCount, parameters, provisioningState, source, state, tags, type);
        }
    }
}
