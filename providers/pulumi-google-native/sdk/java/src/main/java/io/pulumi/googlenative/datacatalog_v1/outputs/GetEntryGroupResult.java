// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEntryGroupResult {
    /**
     * Timestamps of the entry group. Default value is empty.
     * 
     */
    private final GoogleCloudDatacatalogV1SystemTimestampsResponse dataCatalogTimestamps;
    /**
     * Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
     * 
     */
    private final String description;
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"dataCatalogTimestamps","description","displayName","name"})
    private GetEntryGroupResult(
        GoogleCloudDatacatalogV1SystemTimestampsResponse dataCatalogTimestamps,
        String description,
        String displayName,
        String name) {
        this.dataCatalogTimestamps = Objects.requireNonNull(dataCatalogTimestamps);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Timestamps of the entry group. Default value is empty.
     * 
    */
    public GoogleCloudDatacatalogV1SystemTimestampsResponse getDataCatalogTimestamps() {
        return this.dataCatalogTimestamps;
    }
    /**
     * Entry group description. Can consist of several sentences or paragraphs that describe the entry group contents. Default value is an empty string.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * A short name to identify the entry group, for example, "analytics data - jan 2011". Default value is an empty string.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the entry group in URL format. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1SystemTimestampsResponse dataCatalogTimestamps;
        private String description;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogTimestamps = defaults.dataCatalogTimestamps;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setDataCatalogTimestamps(GoogleCloudDatacatalogV1SystemTimestampsResponse dataCatalogTimestamps) {
            this.dataCatalogTimestamps = Objects.requireNonNull(dataCatalogTimestamps);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetEntryGroupResult build() {
            return new GetEntryGroupResult(dataCatalogTimestamps, description, displayName, name);
        }
    }
}