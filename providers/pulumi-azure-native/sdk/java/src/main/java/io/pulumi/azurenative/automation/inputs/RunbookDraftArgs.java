// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import io.pulumi.azurenative.automation.inputs.RunbookParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RunbookDraftArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunbookDraftArgs Empty = new RunbookDraftArgs();

    /**
     * Gets or sets the creation time of the runbook draft.
     * 
     */
    @InputImport(name="creationTime")
    private final @Nullable Input<String> creationTime;

    public Input<String> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * Gets or sets the draft runbook content link.
     * 
     */
    @InputImport(name="draftContentLink")
    private final @Nullable Input<ContentLinkArgs> draftContentLink;

    public Input<ContentLinkArgs> getDraftContentLink() {
        return this.draftContentLink == null ? Input.empty() : this.draftContentLink;
    }

    /**
     * Gets or sets whether runbook is in edit mode.
     * 
     */
    @InputImport(name="inEdit")
    private final @Nullable Input<Boolean> inEdit;

    public Input<Boolean> getInEdit() {
        return this.inEdit == null ? Input.empty() : this.inEdit;
    }

    /**
     * Gets or sets the last modified time of the runbook draft.
     * 
     */
    @InputImport(name="lastModifiedTime")
    private final @Nullable Input<String> lastModifiedTime;

    public Input<String> getLastModifiedTime() {
        return this.lastModifiedTime == null ? Input.empty() : this.lastModifiedTime;
    }

    /**
     * Gets or sets the runbook output types.
     * 
     */
    @InputImport(name="outputTypes")
    private final @Nullable Input<List<String>> outputTypes;

    public Input<List<String>> getOutputTypes() {
        return this.outputTypes == null ? Input.empty() : this.outputTypes;
    }

    /**
     * Gets or sets the runbook draft parameters.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,RunbookParameterArgs>> parameters;

    public Input<Map<String,RunbookParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public RunbookDraftArgs(
        @Nullable Input<String> creationTime,
        @Nullable Input<ContentLinkArgs> draftContentLink,
        @Nullable Input<Boolean> inEdit,
        @Nullable Input<String> lastModifiedTime,
        @Nullable Input<List<String>> outputTypes,
        @Nullable Input<Map<String,RunbookParameterArgs>> parameters) {
        this.creationTime = creationTime;
        this.draftContentLink = draftContentLink;
        this.inEdit = inEdit;
        this.lastModifiedTime = lastModifiedTime;
        this.outputTypes = outputTypes;
        this.parameters = parameters;
    }

    private RunbookDraftArgs() {
        this.creationTime = Input.empty();
        this.draftContentLink = Input.empty();
        this.inEdit = Input.empty();
        this.lastModifiedTime = Input.empty();
        this.outputTypes = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookDraftArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTime;
        private @Nullable Input<ContentLinkArgs> draftContentLink;
        private @Nullable Input<Boolean> inEdit;
        private @Nullable Input<String> lastModifiedTime;
        private @Nullable Input<List<String>> outputTypes;
        private @Nullable Input<Map<String,RunbookParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookDraftArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.draftContentLink = defaults.draftContentLink;
    	      this.inEdit = defaults.inEdit;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.outputTypes = defaults.outputTypes;
    	      this.parameters = defaults.parameters;
        }

        public Builder setCreationTime(@Nullable Input<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setDraftContentLink(@Nullable Input<ContentLinkArgs> draftContentLink) {
            this.draftContentLink = draftContentLink;
            return this;
        }

        public Builder setDraftContentLink(@Nullable ContentLinkArgs draftContentLink) {
            this.draftContentLink = Input.ofNullable(draftContentLink);
            return this;
        }

        public Builder setInEdit(@Nullable Input<Boolean> inEdit) {
            this.inEdit = inEdit;
            return this;
        }

        public Builder setInEdit(@Nullable Boolean inEdit) {
            this.inEdit = Input.ofNullable(inEdit);
            return this;
        }

        public Builder setLastModifiedTime(@Nullable Input<String> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = Input.ofNullable(lastModifiedTime);
            return this;
        }

        public Builder setOutputTypes(@Nullable Input<List<String>> outputTypes) {
            this.outputTypes = outputTypes;
            return this;
        }

        public Builder setOutputTypes(@Nullable List<String> outputTypes) {
            this.outputTypes = Input.ofNullable(outputTypes);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,RunbookParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,RunbookParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public RunbookDraftArgs build() {
            return new RunbookDraftArgs(creationTime, draftContentLink, inEdit, lastModifiedTime, outputTypes, parameters);
        }
    }
}
