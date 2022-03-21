// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.AvroFileFormatResponse;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.JsonFileFormatResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Google Cloud Storage destination configuration
 * 
 */
public final class GcsDestinationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GcsDestinationConfigResponse Empty = new GcsDestinationConfigResponse();

    /**
     * AVRO file format configuration.
     * 
     */
    @Import(name="avroFileFormat", required=true)
      private final AvroFileFormatResponse avroFileFormat;

    public AvroFileFormatResponse getAvroFileFormat() {
        return this.avroFileFormat;
    }

    /**
     * The maximum duration for which new events are added before a file is closed and a new file is created.
     * 
     */
    @Import(name="fileRotationInterval", required=true)
      private final String fileRotationInterval;

    public String getFileRotationInterval() {
        return this.fileRotationInterval;
    }

    /**
     * The maximum file size to be saved in the bucket.
     * 
     */
    @Import(name="fileRotationMb", required=true)
      private final Integer fileRotationMb;

    public Integer getFileRotationMb() {
        return this.fileRotationMb;
    }

    /**
     * JSON file format configuration.
     * 
     */
    @Import(name="jsonFileFormat", required=true)
      private final JsonFileFormatResponse jsonFileFormat;

    public JsonFileFormatResponse getJsonFileFormat() {
        return this.jsonFileFormat;
    }

    /**
     * Path inside the Cloud Storage bucket to write data to.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public GcsDestinationConfigResponse(
        AvroFileFormatResponse avroFileFormat,
        String fileRotationInterval,
        Integer fileRotationMb,
        JsonFileFormatResponse jsonFileFormat,
        String path) {
        this.avroFileFormat = Objects.requireNonNull(avroFileFormat, "expected parameter 'avroFileFormat' to be non-null");
        this.fileRotationInterval = Objects.requireNonNull(fileRotationInterval, "expected parameter 'fileRotationInterval' to be non-null");
        this.fileRotationMb = Objects.requireNonNull(fileRotationMb, "expected parameter 'fileRotationMb' to be non-null");
        this.jsonFileFormat = Objects.requireNonNull(jsonFileFormat, "expected parameter 'jsonFileFormat' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private GcsDestinationConfigResponse() {
        this.avroFileFormat = null;
        this.fileRotationInterval = null;
        this.fileRotationMb = null;
        this.jsonFileFormat = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsDestinationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvroFileFormatResponse avroFileFormat;
        private String fileRotationInterval;
        private Integer fileRotationMb;
        private JsonFileFormatResponse jsonFileFormat;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsDestinationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroFileFormat = defaults.avroFileFormat;
    	      this.fileRotationInterval = defaults.fileRotationInterval;
    	      this.fileRotationMb = defaults.fileRotationMb;
    	      this.jsonFileFormat = defaults.jsonFileFormat;
    	      this.path = defaults.path;
        }

        public Builder avroFileFormat(AvroFileFormatResponse avroFileFormat) {
            this.avroFileFormat = Objects.requireNonNull(avroFileFormat);
            return this;
        }
        public Builder fileRotationInterval(String fileRotationInterval) {
            this.fileRotationInterval = Objects.requireNonNull(fileRotationInterval);
            return this;
        }
        public Builder fileRotationMb(Integer fileRotationMb) {
            this.fileRotationMb = Objects.requireNonNull(fileRotationMb);
            return this;
        }
        public Builder jsonFileFormat(JsonFileFormatResponse jsonFileFormat) {
            this.jsonFileFormat = Objects.requireNonNull(jsonFileFormat);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public GcsDestinationConfigResponse build() {
            return new GcsDestinationConfigResponse(avroFileFormat, fileRotationInterval, fileRotationMb, jsonFileFormat, path);
        }
    }
}
