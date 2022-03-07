// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TableOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration to control jobs where the content being inspected is outside of Google Cloud Platform.
 * 
 */
public final class GooglePrivacyDlpV2HybridOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2HybridOptionsResponse Empty = new GooglePrivacyDlpV2HybridOptionsResponse();

    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
     * 
     */
    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * These are labels that each inspection request must include within their 'finding_labels' map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    @InputImport(name="requiredFindingLabelKeys", required=true)
      private final List<String> requiredFindingLabelKeys;

    public List<String> getRequiredFindingLabelKeys() {
        return this.requiredFindingLabelKeys;
    }

    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    @InputImport(name="tableOptions", required=true)
      private final GooglePrivacyDlpV2TableOptionsResponse tableOptions;

    public GooglePrivacyDlpV2TableOptionsResponse getTableOptions() {
        return this.tableOptions;
    }

    public GooglePrivacyDlpV2HybridOptionsResponse(
        String description,
        Map<String,String> labels,
        List<String> requiredFindingLabelKeys,
        GooglePrivacyDlpV2TableOptionsResponse tableOptions) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.requiredFindingLabelKeys = Objects.requireNonNull(requiredFindingLabelKeys, "expected parameter 'requiredFindingLabelKeys' to be non-null");
        this.tableOptions = Objects.requireNonNull(tableOptions, "expected parameter 'tableOptions' to be non-null");
    }

    private GooglePrivacyDlpV2HybridOptionsResponse() {
        this.description = null;
        this.labels = Map.of();
        this.requiredFindingLabelKeys = List.of();
        this.tableOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Map<String,String> labels;
        private List<String> requiredFindingLabelKeys;
        private GooglePrivacyDlpV2TableOptionsResponse tableOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.requiredFindingLabelKeys = defaults.requiredFindingLabelKeys;
    	      this.tableOptions = defaults.tableOptions;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setRequiredFindingLabelKeys(List<String> requiredFindingLabelKeys) {
            this.requiredFindingLabelKeys = Objects.requireNonNull(requiredFindingLabelKeys);
            return this;
        }

        public Builder setTableOptions(GooglePrivacyDlpV2TableOptionsResponse tableOptions) {
            this.tableOptions = Objects.requireNonNull(tableOptions);
            return this;
        }
        public GooglePrivacyDlpV2HybridOptionsResponse build() {
            return new GooglePrivacyDlpV2HybridOptionsResponse(description, labels, requiredFindingLabelKeys, tableOptions);
        }
    }
}