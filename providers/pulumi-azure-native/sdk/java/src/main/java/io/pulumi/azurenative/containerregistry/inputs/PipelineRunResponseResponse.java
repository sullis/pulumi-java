// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.ExportPipelineTargetPropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.ImportPipelineSourcePropertiesResponse;
import io.pulumi.azurenative.containerregistry.inputs.PipelineTriggerDescriptorResponse;
import io.pulumi.azurenative.containerregistry.inputs.ProgressPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The response properties returned for a pipeline run.
 * 
 */
public final class PipelineRunResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineRunResponseResponse Empty = new PipelineRunResponseResponse();

    /**
     * The digest of the tar used to transfer the artifacts.
     * 
     */
    @InputImport(name="catalogDigest")
    private final @Nullable String catalogDigest;

    public Optional<String> getCatalogDigest() {
        return this.catalogDigest == null ? Optional.empty() : Optional.ofNullable(this.catalogDigest);
    }

    /**
     * The time the pipeline run finished.
     * 
     */
    @InputImport(name="finishTime")
    private final @Nullable String finishTime;

    public Optional<String> getFinishTime() {
        return this.finishTime == null ? Optional.empty() : Optional.ofNullable(this.finishTime);
    }

    /**
     * The artifacts imported in the pipeline run.
     * 
     */
    @InputImport(name="importedArtifacts")
    private final @Nullable List<String> importedArtifacts;

    public List<String> getImportedArtifacts() {
        return this.importedArtifacts == null ? List.of() : this.importedArtifacts;
    }

    /**
     * The detailed error message for the pipeline run in the case of failure.
     * 
     */
    @InputImport(name="pipelineRunErrorMessage")
    private final @Nullable String pipelineRunErrorMessage;

    public Optional<String> getPipelineRunErrorMessage() {
        return this.pipelineRunErrorMessage == null ? Optional.empty() : Optional.ofNullable(this.pipelineRunErrorMessage);
    }

    /**
     * The current progress of the copy operation.
     * 
     */
    @InputImport(name="progress")
    private final @Nullable ProgressPropertiesResponse progress;

    public Optional<ProgressPropertiesResponse> getProgress() {
        return this.progress == null ? Optional.empty() : Optional.ofNullable(this.progress);
    }

    /**
     * The source of the pipeline run.
     * 
     */
    @InputImport(name="source")
    private final @Nullable ImportPipelineSourcePropertiesResponse source;

    public Optional<ImportPipelineSourcePropertiesResponse> getSource() {
        return this.source == null ? Optional.empty() : Optional.ofNullable(this.source);
    }

    /**
     * The time the pipeline run started.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * The current status of the pipeline run.
     * 
     */
    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The target of the pipeline run.
     * 
     */
    @InputImport(name="target")
    private final @Nullable ExportPipelineTargetPropertiesResponse target;

    public Optional<ExportPipelineTargetPropertiesResponse> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * The trigger that caused the pipeline run.
     * 
     */
    @InputImport(name="trigger")
    private final @Nullable PipelineTriggerDescriptorResponse trigger;

    public Optional<PipelineTriggerDescriptorResponse> getTrigger() {
        return this.trigger == null ? Optional.empty() : Optional.ofNullable(this.trigger);
    }

    public PipelineRunResponseResponse(
        @Nullable String catalogDigest,
        @Nullable String finishTime,
        @Nullable List<String> importedArtifacts,
        @Nullable String pipelineRunErrorMessage,
        @Nullable ProgressPropertiesResponse progress,
        @Nullable ImportPipelineSourcePropertiesResponse source,
        @Nullable String startTime,
        @Nullable String status,
        @Nullable ExportPipelineTargetPropertiesResponse target,
        @Nullable PipelineTriggerDescriptorResponse trigger) {
        this.catalogDigest = catalogDigest;
        this.finishTime = finishTime;
        this.importedArtifacts = importedArtifacts;
        this.pipelineRunErrorMessage = pipelineRunErrorMessage;
        this.progress = progress;
        this.source = source;
        this.startTime = startTime;
        this.status = status;
        this.target = target;
        this.trigger = trigger;
    }

    private PipelineRunResponseResponse() {
        this.catalogDigest = null;
        this.finishTime = null;
        this.importedArtifacts = List.of();
        this.pipelineRunErrorMessage = null;
        this.progress = null;
        this.source = null;
        this.startTime = null;
        this.status = null;
        this.target = null;
        this.trigger = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineRunResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogDigest;
        private @Nullable String finishTime;
        private @Nullable List<String> importedArtifacts;
        private @Nullable String pipelineRunErrorMessage;
        private @Nullable ProgressPropertiesResponse progress;
        private @Nullable ImportPipelineSourcePropertiesResponse source;
        private @Nullable String startTime;
        private @Nullable String status;
        private @Nullable ExportPipelineTargetPropertiesResponse target;
        private @Nullable PipelineTriggerDescriptorResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineRunResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogDigest = defaults.catalogDigest;
    	      this.finishTime = defaults.finishTime;
    	      this.importedArtifacts = defaults.importedArtifacts;
    	      this.pipelineRunErrorMessage = defaults.pipelineRunErrorMessage;
    	      this.progress = defaults.progress;
    	      this.source = defaults.source;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
    	      this.trigger = defaults.trigger;
        }

        public Builder setCatalogDigest(@Nullable String catalogDigest) {
            this.catalogDigest = catalogDigest;
            return this;
        }

        public Builder setFinishTime(@Nullable String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        public Builder setImportedArtifacts(@Nullable List<String> importedArtifacts) {
            this.importedArtifacts = importedArtifacts;
            return this;
        }

        public Builder setPipelineRunErrorMessage(@Nullable String pipelineRunErrorMessage) {
            this.pipelineRunErrorMessage = pipelineRunErrorMessage;
            return this;
        }

        public Builder setProgress(@Nullable ProgressPropertiesResponse progress) {
            this.progress = progress;
            return this;
        }

        public Builder setSource(@Nullable ImportPipelineSourcePropertiesResponse source) {
            this.source = source;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTarget(@Nullable ExportPipelineTargetPropertiesResponse target) {
            this.target = target;
            return this;
        }

        public Builder setTrigger(@Nullable PipelineTriggerDescriptorResponse trigger) {
            this.trigger = trigger;
            return this;
        }

        public PipelineRunResponseResponse build() {
            return new PipelineRunResponseResponse(catalogDigest, finishTime, importedArtifacts, pipelineRunErrorMessage, progress, source, startTime, status, target, trigger);
        }
    }
}
