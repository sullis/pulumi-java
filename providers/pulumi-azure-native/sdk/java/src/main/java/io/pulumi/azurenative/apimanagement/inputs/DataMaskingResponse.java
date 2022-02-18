// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.DataMaskingEntityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataMaskingResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataMaskingResponse Empty = new DataMaskingResponse();

    /**
     * Masking settings for headers
     * 
     */
    @InputImport(name="headers")
    private final @Nullable List<DataMaskingEntityResponse> headers;

    public List<DataMaskingEntityResponse> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    /**
     * Masking settings for Url query parameters
     * 
     */
    @InputImport(name="queryParams")
    private final @Nullable List<DataMaskingEntityResponse> queryParams;

    public List<DataMaskingEntityResponse> getQueryParams() {
        return this.queryParams == null ? List.of() : this.queryParams;
    }

    public DataMaskingResponse(
        @Nullable List<DataMaskingEntityResponse> headers,
        @Nullable List<DataMaskingEntityResponse> queryParams) {
        this.headers = headers;
        this.queryParams = queryParams;
    }

    private DataMaskingResponse() {
        this.headers = List.of();
        this.queryParams = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataMaskingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataMaskingEntityResponse> headers;
        private @Nullable List<DataMaskingEntityResponse> queryParams;

        public Builder() {
    	      // Empty
        }

        public Builder(DataMaskingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.queryParams = defaults.queryParams;
        }

        public Builder setHeaders(@Nullable List<DataMaskingEntityResponse> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setQueryParams(@Nullable List<DataMaskingEntityResponse> queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public DataMaskingResponse build() {
            return new DataMaskingResponse(headers, queryParams);
        }
    }
}
