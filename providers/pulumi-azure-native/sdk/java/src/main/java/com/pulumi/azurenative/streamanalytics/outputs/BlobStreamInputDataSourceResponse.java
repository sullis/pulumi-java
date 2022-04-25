// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.StorageAccountResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobStreamInputDataSourceResponse {
    /**
     * @return The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String container;
    /**
     * @return The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    private final @Nullable String dateFormat;
    /**
     * @return The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    private final @Nullable String pathPattern;
    /**
     * @return The partition count of the blob input data source. Range 1 - 256.
     * 
     */
    private final @Nullable Integer sourcePartitionCount;
    /**
     * @return A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable List<StorageAccountResponse> storageAccounts;
    /**
     * @return The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    private final @Nullable String timeFormat;
    /**
     * @return Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private BlobStreamInputDataSourceResponse(
        @CustomType.Parameter("container") @Nullable String container,
        @CustomType.Parameter("dateFormat") @Nullable String dateFormat,
        @CustomType.Parameter("pathPattern") @Nullable String pathPattern,
        @CustomType.Parameter("sourcePartitionCount") @Nullable Integer sourcePartitionCount,
        @CustomType.Parameter("storageAccounts") @Nullable List<StorageAccountResponse> storageAccounts,
        @CustomType.Parameter("timeFormat") @Nullable String timeFormat,
        @CustomType.Parameter("type") String type) {
        this.container = container;
        this.dateFormat = dateFormat;
        this.pathPattern = pathPattern;
        this.sourcePartitionCount = sourcePartitionCount;
        this.storageAccounts = storageAccounts;
        this.timeFormat = timeFormat;
        this.type = type;
    }

    /**
     * @return The name of a container within the associated Storage account. This container contains either the blob(s) to be read from or written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<String> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * @return The date format. Wherever {date} appears in pathPattern, the value of this property is used as the date format instead.
     * 
     */
    public Optional<String> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }
    /**
     * @return The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a more detailed explanation and example.
     * 
     */
    public Optional<String> pathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }
    /**
     * @return The partition count of the blob input data source. Range 1 - 256.
     * 
     */
    public Optional<Integer> sourcePartitionCount() {
        return Optional.ofNullable(this.sourcePartitionCount);
    }
    /**
     * @return A list of one or more Azure Storage accounts. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public List<StorageAccountResponse> storageAccounts() {
        return this.storageAccounts == null ? List.of() : this.storageAccounts;
    }
    /**
     * @return The time format. Wherever {time} appears in pathPattern, the value of this property is used as the time format instead.
     * 
     */
    public Optional<String> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }
    /**
     * @return Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Storage/Blob&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobStreamInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String container;
        private @Nullable String dateFormat;
        private @Nullable String pathPattern;
        private @Nullable Integer sourcePartitionCount;
        private @Nullable List<StorageAccountResponse> storageAccounts;
        private @Nullable String timeFormat;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobStreamInputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dateFormat = defaults.dateFormat;
    	      this.pathPattern = defaults.pathPattern;
    	      this.sourcePartitionCount = defaults.sourcePartitionCount;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.timeFormat = defaults.timeFormat;
    	      this.type = defaults.type;
        }

        public Builder container(@Nullable String container) {
            this.container = container;
            return this;
        }
        public Builder dateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }
        public Builder pathPattern(@Nullable String pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }
        public Builder sourcePartitionCount(@Nullable Integer sourcePartitionCount) {
            this.sourcePartitionCount = sourcePartitionCount;
            return this;
        }
        public Builder storageAccounts(@Nullable List<StorageAccountResponse> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }
        public Builder storageAccounts(StorageAccountResponse... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }
        public Builder timeFormat(@Nullable String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public BlobStreamInputDataSourceResponse build() {
            return new BlobStreamInputDataSourceResponse(container, dateFormat, pathPattern, sourcePartitionCount, storageAccounts, timeFormat, type);
        }
    }
}
