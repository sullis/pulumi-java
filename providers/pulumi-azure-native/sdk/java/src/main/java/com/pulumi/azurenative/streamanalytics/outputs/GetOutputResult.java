// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import com.pulumi.azurenative.streamanalytics.outputs.AzureDataLakeStoreOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.AzureSqlDatabaseOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.AzureTableOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.BlobOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import com.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import com.pulumi.azurenative.streamanalytics.outputs.DocumentDbOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.EventHubOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import com.pulumi.azurenative.streamanalytics.outputs.PowerBIOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.ServiceBusQueueOutputDataSourceResponse;
import com.pulumi.azurenative.streamanalytics.outputs.ServiceBusTopicOutputDataSourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOutputResult {
    /**
     * @return Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object datasource;
    /**
     * @return Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    private final DiagnosticsResponse diagnostics;
    /**
     * @return The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource name
     * 
     */
    private final @Nullable String name;
    /**
     * @return Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object serialization;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetOutputResult(
        @CustomType.Parameter("datasource") @Nullable Object datasource,
        @CustomType.Parameter("diagnostics") DiagnosticsResponse diagnostics,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("serialization") @Nullable Object serialization,
        @CustomType.Parameter("type") String type) {
        this.datasource = datasource;
        this.diagnostics = diagnostics;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.serialization = serialization;
        this.type = type;
    }

    /**
     * @return Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Object> datasource() {
        return Optional.ofNullable(this.datasource);
    }
    /**
     * @return Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    public DiagnosticsResponse diagnostics() {
        return this.diagnostics;
    }
    /**
     * @return The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Object> serialization() {
        return Optional.ofNullable(this.serialization);
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutputResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private String id;
        private @Nullable String name;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutputResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder datasource(@Nullable Object datasource) {
            this.datasource = datasource;
            return this;
        }
        public Builder diagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder serialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetOutputResult build() {
            return new GetOutputResult(datasource, diagnostics, etag, id, name, serialization, type);
        }
    }
}
