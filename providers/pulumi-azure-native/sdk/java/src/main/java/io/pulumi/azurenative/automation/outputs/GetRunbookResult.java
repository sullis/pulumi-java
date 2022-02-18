// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.RunbookDraftResponse;
import io.pulumi.azurenative.automation.outputs.RunbookParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRunbookResult {
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
     * Gets or sets the draft runbook properties.
     * 
     */
    private final @Nullable RunbookDraftResponse draft;
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
     * Gets or sets the job count of the runbook.
     * 
     */
    private final @Nullable Integer jobCount;
    /**
     * Gets or sets the last modified by.
     * 
     */
    private final @Nullable String lastModifiedBy;
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
     * Gets or sets the option to log activity trace of the runbook.
     * 
     */
    private final @Nullable Integer logActivityTrace;
    /**
     * Gets or sets progress log option.
     * 
     */
    private final @Nullable Boolean logProgress;
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
     * Gets or sets the runbook output types.
     * 
     */
    private final @Nullable List<String> outputTypes;
    /**
     * Gets or sets the runbook parameters.
     * 
     */
    private final @Nullable Map<String,RunbookParameterResponse> parameters;
    /**
     * Gets or sets the provisioning state of the runbook.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Gets or sets the published runbook content link.
     * 
     */
    private final @Nullable ContentLinkResponse publishContentLink;
    /**
     * Gets or sets the type of the runbook.
     * 
     */
    private final @Nullable String runbookType;
    /**
     * Gets or sets the state of the runbook.
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

    @OutputCustomType.Constructor({"creationTime","description","draft","etag","id","jobCount","lastModifiedBy","lastModifiedTime","location","logActivityTrace","logProgress","logVerbose","name","outputTypes","parameters","provisioningState","publishContentLink","runbookType","state","tags","type"})
    private GetRunbookResult(
        @Nullable String creationTime,
        @Nullable String description,
        @Nullable RunbookDraftResponse draft,
        @Nullable String etag,
        String id,
        @Nullable Integer jobCount,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedTime,
        @Nullable String location,
        @Nullable Integer logActivityTrace,
        @Nullable Boolean logProgress,
        @Nullable Boolean logVerbose,
        String name,
        @Nullable List<String> outputTypes,
        @Nullable Map<String,RunbookParameterResponse> parameters,
        @Nullable String provisioningState,
        @Nullable ContentLinkResponse publishContentLink,
        @Nullable String runbookType,
        @Nullable String state,
        @Nullable Map<String,String> tags,
        String type) {
        this.creationTime = creationTime;
        this.description = description;
        this.draft = draft;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.jobCount = jobCount;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.logActivityTrace = logActivityTrace;
        this.logProgress = logProgress;
        this.logVerbose = logVerbose;
        this.name = Objects.requireNonNull(name);
        this.outputTypes = outputTypes;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.publishContentLink = publishContentLink;
        this.runbookType = runbookType;
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
     * Gets or sets the draft runbook properties.
     * 
     */
    public Optional<RunbookDraftResponse> getDraft() {
        return Optional.ofNullable(this.draft);
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
     * Gets or sets the job count of the runbook.
     * 
     */
    public Optional<Integer> getJobCount() {
        return Optional.ofNullable(this.jobCount);
    }
    /**
     * Gets or sets the last modified by.
     * 
     */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
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
     * Gets or sets the option to log activity trace of the runbook.
     * 
     */
    public Optional<Integer> getLogActivityTrace() {
        return Optional.ofNullable(this.logActivityTrace);
    }
    /**
     * Gets or sets progress log option.
     * 
     */
    public Optional<Boolean> getLogProgress() {
        return Optional.ofNullable(this.logProgress);
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
     * Gets or sets the runbook output types.
     * 
     */
    public List<String> getOutputTypes() {
        return this.outputTypes == null ? List.of() : this.outputTypes;
    }
    /**
     * Gets or sets the runbook parameters.
     * 
     */
    public Map<String,RunbookParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Gets or sets the provisioning state of the runbook.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Gets or sets the published runbook content link.
     * 
     */
    public Optional<ContentLinkResponse> getPublishContentLink() {
        return Optional.ofNullable(this.publishContentLink);
    }
    /**
     * Gets or sets the type of the runbook.
     * 
     */
    public Optional<String> getRunbookType() {
        return Optional.ofNullable(this.runbookType);
    }
    /**
     * Gets or sets the state of the runbook.
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

    public static Builder builder(GetRunbookResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable RunbookDraftResponse draft;
        private @Nullable String etag;
        private String id;
        private @Nullable Integer jobCount;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedTime;
        private @Nullable String location;
        private @Nullable Integer logActivityTrace;
        private @Nullable Boolean logProgress;
        private @Nullable Boolean logVerbose;
        private String name;
        private @Nullable List<String> outputTypes;
        private @Nullable Map<String,RunbookParameterResponse> parameters;
        private @Nullable String provisioningState;
        private @Nullable ContentLinkResponse publishContentLink;
        private @Nullable String runbookType;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRunbookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.draft = defaults.draft;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.jobCount = defaults.jobCount;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.logActivityTrace = defaults.logActivityTrace;
    	      this.logProgress = defaults.logProgress;
    	      this.logVerbose = defaults.logVerbose;
    	      this.name = defaults.name;
    	      this.outputTypes = defaults.outputTypes;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishContentLink = defaults.publishContentLink;
    	      this.runbookType = defaults.runbookType;
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

        public Builder setDraft(@Nullable RunbookDraftResponse draft) {
            this.draft = draft;
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

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
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

        public Builder setLogActivityTrace(@Nullable Integer logActivityTrace) {
            this.logActivityTrace = logActivityTrace;
            return this;
        }

        public Builder setLogProgress(@Nullable Boolean logProgress) {
            this.logProgress = logProgress;
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

        public Builder setOutputTypes(@Nullable List<String> outputTypes) {
            this.outputTypes = outputTypes;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,RunbookParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setPublishContentLink(@Nullable ContentLinkResponse publishContentLink) {
            this.publishContentLink = publishContentLink;
            return this;
        }

        public Builder setRunbookType(@Nullable String runbookType) {
            this.runbookType = runbookType;
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

        public GetRunbookResult build() {
            return new GetRunbookResult(creationTime, description, draft, etag, id, jobCount, lastModifiedBy, lastModifiedTime, location, logActivityTrace, logProgress, logVerbose, name, outputTypes, parameters, provisioningState, publishContentLink, runbookType, state, tags, type);
        }
    }
}
