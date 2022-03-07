// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreArgs Empty = new DicomStoreArgs();

    @InputImport(name="datasetId", required=true)
      private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="dicomStoreId")
      private final @Nullable Input<String> dicomStoreId;

    public Input<String> getDicomStoreId() {
        return this.dicomStoreId == null ? Input.empty() : this.dicomStoreId;
    }

    /**
     * User-supplied key-value pairs used to organize DICOM stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Notification destination for new DICOM instances. Supplied by the client.
     * 
     */
    @InputImport(name="notificationConfig")
      private final @Nullable Input<NotificationConfigArgs> notificationConfig;

    public Input<NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DicomStoreArgs(
        Input<String> datasetId,
        @Nullable Input<String> dicomStoreId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<NotificationConfigArgs> notificationConfig,
        @Nullable Input<String> project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.dicomStoreId = dicomStoreId;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.project = project;
    }

    private DicomStoreArgs() {
        this.datasetId = Input.empty();
        this.dicomStoreId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.notificationConfig = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private @Nullable Input<String> dicomStoreId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<NotificationConfigArgs> notificationConfig;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setDicomStoreId(@Nullable Input<String> dicomStoreId) {
            this.dicomStoreId = dicomStoreId;
            return this;
        }

        public Builder setDicomStoreId(@Nullable String dicomStoreId) {
            this.dicomStoreId = Input.ofNullable(dicomStoreId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DicomStoreArgs build() {
            return new DicomStoreArgs(datasetId, dicomStoreId, labels, location, name, notificationConfig, project);
        }
    }
}