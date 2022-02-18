// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.enums.RunbookTypeEnum;
import io.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import io.pulumi.azurenative.automation.inputs.RunbookDraftArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RunbookArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunbookArgs Empty = new RunbookArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
    private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the description of the runbook.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the draft runbook properties.
     * 
     */
    @InputImport(name="draft")
    private final @Nullable Input<RunbookDraftArgs> draft;

    public Input<RunbookDraftArgs> getDraft() {
        return this.draft == null ? Input.empty() : this.draft;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets the activity-level tracing options of the runbook.
     * 
     */
    @InputImport(name="logActivityTrace")
    private final @Nullable Input<Integer> logActivityTrace;

    public Input<Integer> getLogActivityTrace() {
        return this.logActivityTrace == null ? Input.empty() : this.logActivityTrace;
    }

    /**
     * Gets or sets progress log option.
     * 
     */
    @InputImport(name="logProgress")
    private final @Nullable Input<Boolean> logProgress;

    public Input<Boolean> getLogProgress() {
        return this.logProgress == null ? Input.empty() : this.logProgress;
    }

    /**
     * Gets or sets verbose log option.
     * 
     */
    @InputImport(name="logVerbose")
    private final @Nullable Input<Boolean> logVerbose;

    public Input<Boolean> getLogVerbose() {
        return this.logVerbose == null ? Input.empty() : this.logVerbose;
    }

    /**
     * Gets or sets the name of the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets or sets the published runbook content link.
     * 
     */
    @InputImport(name="publishContentLink")
    private final @Nullable Input<ContentLinkArgs> publishContentLink;

    public Input<ContentLinkArgs> getPublishContentLink() {
        return this.publishContentLink == null ? Input.empty() : this.publishContentLink;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The runbook name.
     * 
     */
    @InputImport(name="runbookName")
    private final @Nullable Input<String> runbookName;

    public Input<String> getRunbookName() {
        return this.runbookName == null ? Input.empty() : this.runbookName;
    }

    /**
     * Gets or sets the type of the runbook.
     * 
     */
    @InputImport(name="runbookType", required=true)
    private final Input<Either<String,RunbookTypeEnum>> runbookType;

    public Input<Either<String,RunbookTypeEnum>> getRunbookType() {
        return this.runbookType;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RunbookArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> description,
        @Nullable Input<RunbookDraftArgs> draft,
        @Nullable Input<String> location,
        @Nullable Input<Integer> logActivityTrace,
        @Nullable Input<Boolean> logProgress,
        @Nullable Input<Boolean> logVerbose,
        @Nullable Input<String> name,
        @Nullable Input<ContentLinkArgs> publishContentLink,
        Input<String> resourceGroupName,
        @Nullable Input<String> runbookName,
        Input<Either<String,RunbookTypeEnum>> runbookType,
        @Nullable Input<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.description = description;
        this.draft = draft;
        this.location = location;
        this.logActivityTrace = logActivityTrace;
        this.logProgress = logProgress;
        this.logVerbose = logVerbose;
        this.name = name;
        this.publishContentLink = publishContentLink;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runbookName = runbookName;
        this.runbookType = Objects.requireNonNull(runbookType, "expected parameter 'runbookType' to be non-null");
        this.tags = tags;
    }

    private RunbookArgs() {
        this.automationAccountName = Input.empty();
        this.description = Input.empty();
        this.draft = Input.empty();
        this.location = Input.empty();
        this.logActivityTrace = Input.empty();
        this.logProgress = Input.empty();
        this.logVerbose = Input.empty();
        this.name = Input.empty();
        this.publishContentLink = Input.empty();
        this.resourceGroupName = Input.empty();
        this.runbookName = Input.empty();
        this.runbookType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> description;
        private @Nullable Input<RunbookDraftArgs> draft;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> logActivityTrace;
        private @Nullable Input<Boolean> logProgress;
        private @Nullable Input<Boolean> logVerbose;
        private @Nullable Input<String> name;
        private @Nullable Input<ContentLinkArgs> publishContentLink;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> runbookName;
        private Input<Either<String,RunbookTypeEnum>> runbookType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.description = defaults.description;
    	      this.draft = defaults.draft;
    	      this.location = defaults.location;
    	      this.logActivityTrace = defaults.logActivityTrace;
    	      this.logProgress = defaults.logProgress;
    	      this.logVerbose = defaults.logVerbose;
    	      this.name = defaults.name;
    	      this.publishContentLink = defaults.publishContentLink;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runbookName = defaults.runbookName;
    	      this.runbookType = defaults.runbookType;
    	      this.tags = defaults.tags;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
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

        public Builder setDraft(@Nullable Input<RunbookDraftArgs> draft) {
            this.draft = draft;
            return this;
        }

        public Builder setDraft(@Nullable RunbookDraftArgs draft) {
            this.draft = Input.ofNullable(draft);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLogActivityTrace(@Nullable Input<Integer> logActivityTrace) {
            this.logActivityTrace = logActivityTrace;
            return this;
        }

        public Builder setLogActivityTrace(@Nullable Integer logActivityTrace) {
            this.logActivityTrace = Input.ofNullable(logActivityTrace);
            return this;
        }

        public Builder setLogProgress(@Nullable Input<Boolean> logProgress) {
            this.logProgress = logProgress;
            return this;
        }

        public Builder setLogProgress(@Nullable Boolean logProgress) {
            this.logProgress = Input.ofNullable(logProgress);
            return this;
        }

        public Builder setLogVerbose(@Nullable Input<Boolean> logVerbose) {
            this.logVerbose = logVerbose;
            return this;
        }

        public Builder setLogVerbose(@Nullable Boolean logVerbose) {
            this.logVerbose = Input.ofNullable(logVerbose);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPublishContentLink(@Nullable Input<ContentLinkArgs> publishContentLink) {
            this.publishContentLink = publishContentLink;
            return this;
        }

        public Builder setPublishContentLink(@Nullable ContentLinkArgs publishContentLink) {
            this.publishContentLink = Input.ofNullable(publishContentLink);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRunbookName(@Nullable Input<String> runbookName) {
            this.runbookName = runbookName;
            return this;
        }

        public Builder setRunbookName(@Nullable String runbookName) {
            this.runbookName = Input.ofNullable(runbookName);
            return this;
        }

        public Builder setRunbookType(Input<Either<String,RunbookTypeEnum>> runbookType) {
            this.runbookType = Objects.requireNonNull(runbookType);
            return this;
        }

        public Builder setRunbookType(Either<String,RunbookTypeEnum> runbookType) {
            this.runbookType = Input.of(Objects.requireNonNull(runbookType));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public RunbookArgs build() {
            return new RunbookArgs(automationAccountName, description, draft, location, logActivityTrace, logProgress, logVerbose, name, publishContentLink, resourceGroupName, runbookName, runbookType, tags);
        }
    }
}
