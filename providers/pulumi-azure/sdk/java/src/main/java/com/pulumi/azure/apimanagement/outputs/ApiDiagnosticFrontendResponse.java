// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.azure.apimanagement.outputs.ApiDiagnosticFrontendResponseDataMasking;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiDiagnosticFrontendResponse {
    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    private final @Nullable Integer bodyBytes;
    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    private final @Nullable ApiDiagnosticFrontendResponseDataMasking dataMasking;
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    private final @Nullable List<String> headersToLogs;

    @CustomType.Constructor
    private ApiDiagnosticFrontendResponse(
        @CustomType.Parameter("bodyBytes") @Nullable Integer bodyBytes,
        @CustomType.Parameter("dataMasking") @Nullable ApiDiagnosticFrontendResponseDataMasking dataMasking,
        @CustomType.Parameter("headersToLogs") @Nullable List<String> headersToLogs) {
        this.bodyBytes = bodyBytes;
        this.dataMasking = dataMasking;
        this.headersToLogs = headersToLogs;
    }

    /**
     * @return Number of payload bytes to log (up to 8192).
     * 
     */
    public Optional<Integer> bodyBytes() {
        return Optional.ofNullable(this.bodyBytes);
    }
    /**
     * @return A `data_masking` block as defined below.
     * 
     */
    public Optional<ApiDiagnosticFrontendResponseDataMasking> dataMasking() {
        return Optional.ofNullable(this.dataMasking);
    }
    /**
     * @return Specifies a list of headers to log.
     * 
     */
    public List<String> headersToLogs() {
        return this.headersToLogs == null ? List.of() : this.headersToLogs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticFrontendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bodyBytes;
        private @Nullable ApiDiagnosticFrontendResponseDataMasking dataMasking;
        private @Nullable List<String> headersToLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticFrontendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyBytes = defaults.bodyBytes;
    	      this.dataMasking = defaults.dataMasking;
    	      this.headersToLogs = defaults.headersToLogs;
        }

        public Builder bodyBytes(@Nullable Integer bodyBytes) {
            this.bodyBytes = bodyBytes;
            return this;
        }
        public Builder dataMasking(@Nullable ApiDiagnosticFrontendResponseDataMasking dataMasking) {
            this.dataMasking = dataMasking;
            return this;
        }
        public Builder headersToLogs(@Nullable List<String> headersToLogs) {
            this.headersToLogs = headersToLogs;
            return this;
        }
        public Builder headersToLogs(String... headersToLogs) {
            return headersToLogs(List.of(headersToLogs));
        }        public ApiDiagnosticFrontendResponse build() {
            return new ApiDiagnosticFrontendResponse(bodyBytes, dataMasking, headersToLogs);
        }
    }
}
