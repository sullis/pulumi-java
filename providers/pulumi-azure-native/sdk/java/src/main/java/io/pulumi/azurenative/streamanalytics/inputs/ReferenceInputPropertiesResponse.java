// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.inputs.BlobReferenceInputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.inputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.inputs.JsonSerializationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with an input containing reference data.
 * 
 */
public final class ReferenceInputPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReferenceInputPropertiesResponse Empty = new ReferenceInputPropertiesResponse();

    /**
     * Describes an input data source that contains reference data. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="datasource")
    private final @Nullable BlobReferenceInputDataSourceResponse datasource;

    public Optional<BlobReferenceInputDataSourceResponse> getDatasource() {
        return this.datasource == null ? Optional.empty() : Optional.ofNullable(this.datasource);
    }

    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    @InputImport(name="diagnostics", required=true)
    private final DiagnosticsResponse diagnostics;

    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * The current entity tag for the input. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serialization")
    private final @Nullable Object serialization;

    public Object getSerialization() {
        return this.serialization == null ? null : this.serialization;
    }

    /**
     * Indicates whether the input is a source of reference data or stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Reference'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ReferenceInputPropertiesResponse(
        @Nullable BlobReferenceInputDataSourceResponse datasource,
        DiagnosticsResponse diagnostics,
        String etag,
        @Nullable Object serialization,
        String type) {
        this.datasource = datasource;
        this.diagnostics = Objects.requireNonNull(diagnostics, "expected parameter 'diagnostics' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.serialization = serialization;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReferenceInputPropertiesResponse() {
        this.datasource = null;
        this.diagnostics = null;
        this.etag = null;
        this.serialization = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceInputPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BlobReferenceInputDataSourceResponse datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceInputPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder setDatasource(@Nullable BlobReferenceInputDataSourceResponse datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDiagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ReferenceInputPropertiesResponse build() {
            return new ReferenceInputPropertiesResponse(datasource, diagnostics, etag, serialization, type);
        }
    }
}
