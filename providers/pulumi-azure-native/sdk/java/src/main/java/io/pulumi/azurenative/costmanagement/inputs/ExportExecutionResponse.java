// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.CommonExportPropertiesResponse;
import io.pulumi.azurenative.costmanagement.inputs.ErrorDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An export execution.
 * 
 */
public final class ExportExecutionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportExecutionResponse Empty = new ExportExecutionResponse();

    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @InputImport(name="eTag")
    private final @Nullable String eTag;

    public Optional<String> getETag() {
        return this.eTag == null ? Optional.empty() : Optional.ofNullable(this.eTag);
    }

    /**
     * The details of any error.
     * 
     */
    @InputImport(name="error")
    private final @Nullable ErrorDetailsResponse error;

    public Optional<ErrorDetailsResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    /**
     * The type of the export execution.
     * 
     */
    @InputImport(name="executionType")
    private final @Nullable String executionType;

    public Optional<String> getExecutionType() {
        return this.executionType == null ? Optional.empty() : Optional.ofNullable(this.executionType);
    }

    /**
     * The name of the exported file.
     * 
     */
    @InputImport(name="fileName")
    private final @Nullable String fileName;

    public Optional<String> getFileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The time when the export execution finished.
     * 
     */
    @InputImport(name="processingEndTime")
    private final @Nullable String processingEndTime;

    public Optional<String> getProcessingEndTime() {
        return this.processingEndTime == null ? Optional.empty() : Optional.ofNullable(this.processingEndTime);
    }

    /**
     * The time when export was picked up to be executed.
     * 
     */
    @InputImport(name="processingStartTime")
    private final @Nullable String processingStartTime;

    public Optional<String> getProcessingStartTime() {
        return this.processingStartTime == null ? Optional.empty() : Optional.ofNullable(this.processingStartTime);
    }

    /**
     * The export settings that were in effect for this execution.
     * 
     */
    @InputImport(name="runSettings")
    private final @Nullable CommonExportPropertiesResponse runSettings;

    public Optional<CommonExportPropertiesResponse> getRunSettings() {
        return this.runSettings == null ? Optional.empty() : Optional.ofNullable(this.runSettings);
    }

    /**
     * The last known status of the export execution.
     * 
     */
    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The identifier for the entity that executed the export. For OnDemand executions it is the user email. For scheduled executions it is 'System'.
     * 
     */
    @InputImport(name="submittedBy")
    private final @Nullable String submittedBy;

    public Optional<String> getSubmittedBy() {
        return this.submittedBy == null ? Optional.empty() : Optional.ofNullable(this.submittedBy);
    }

    /**
     * The time when export was queued to be executed.
     * 
     */
    @InputImport(name="submittedTime")
    private final @Nullable String submittedTime;

    public Optional<String> getSubmittedTime() {
        return this.submittedTime == null ? Optional.empty() : Optional.ofNullable(this.submittedTime);
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ExportExecutionResponse(
        @Nullable String eTag,
        @Nullable ErrorDetailsResponse error,
        @Nullable String executionType,
        @Nullable String fileName,
        String id,
        String name,
        @Nullable String processingEndTime,
        @Nullable String processingStartTime,
        @Nullable CommonExportPropertiesResponse runSettings,
        @Nullable String status,
        @Nullable String submittedBy,
        @Nullable String submittedTime,
        String type) {
        this.eTag = eTag;
        this.error = error;
        this.executionType = executionType;
        this.fileName = fileName;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.processingEndTime = processingEndTime;
        this.processingStartTime = processingStartTime;
        this.runSettings = runSettings;
        this.status = status;
        this.submittedBy = submittedBy;
        this.submittedTime = submittedTime;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExportExecutionResponse() {
        this.eTag = null;
        this.error = null;
        this.executionType = null;
        this.fileName = null;
        this.id = null;
        this.name = null;
        this.processingEndTime = null;
        this.processingStartTime = null;
        this.runSettings = null;
        this.status = null;
        this.submittedBy = null;
        this.submittedTime = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private @Nullable ErrorDetailsResponse error;
        private @Nullable String executionType;
        private @Nullable String fileName;
        private String id;
        private String name;
        private @Nullable String processingEndTime;
        private @Nullable String processingStartTime;
        private @Nullable CommonExportPropertiesResponse runSettings;
        private @Nullable String status;
        private @Nullable String submittedBy;
        private @Nullable String submittedTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.error = defaults.error;
    	      this.executionType = defaults.executionType;
    	      this.fileName = defaults.fileName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.processingEndTime = defaults.processingEndTime;
    	      this.processingStartTime = defaults.processingStartTime;
    	      this.runSettings = defaults.runSettings;
    	      this.status = defaults.status;
    	      this.submittedBy = defaults.submittedBy;
    	      this.submittedTime = defaults.submittedTime;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setError(@Nullable ErrorDetailsResponse error) {
            this.error = error;
            return this;
        }

        public Builder setExecutionType(@Nullable String executionType) {
            this.executionType = executionType;
            return this;
        }

        public Builder setFileName(@Nullable String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProcessingEndTime(@Nullable String processingEndTime) {
            this.processingEndTime = processingEndTime;
            return this;
        }

        public Builder setProcessingStartTime(@Nullable String processingStartTime) {
            this.processingStartTime = processingStartTime;
            return this;
        }

        public Builder setRunSettings(@Nullable CommonExportPropertiesResponse runSettings) {
            this.runSettings = runSettings;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubmittedBy(@Nullable String submittedBy) {
            this.submittedBy = submittedBy;
            return this;
        }

        public Builder setSubmittedTime(@Nullable String submittedTime) {
            this.submittedTime = submittedTime;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ExportExecutionResponse build() {
            return new ExportExecutionResponse(eTag, error, executionType, fileName, id, name, processingEndTime, processingStartTime, runSettings, status, submittedBy, submittedTime, type);
        }
    }
}
