// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmazonS3CompatibleReadSettingsResponse {
    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object deleteFilesAfterCompletion;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    private final @Nullable Boolean enablePartitionDiscovery;
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileListPath;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeEnd;
    /**
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeStart;
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object partitionRootPath;
    /**
     * The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object prefix;
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object recursive;
    /**
     * The read setting type.
     * Expected value is 'AmazonS3CompatibleReadSettings'.
     * 
     */
    private final String type;
    /**
     * Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFileName;
    /**
     * Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object wildcardFolderPath;

    @OutputCustomType.Constructor({"deleteFilesAfterCompletion","disableMetricsCollection","enablePartitionDiscovery","fileListPath","maxConcurrentConnections","modifiedDatetimeEnd","modifiedDatetimeStart","partitionRootPath","prefix","recursive","type","wildcardFileName","wildcardFolderPath"})
    private AmazonS3CompatibleReadSettingsResponse(
        @Nullable Object deleteFilesAfterCompletion,
        @Nullable Object disableMetricsCollection,
        @Nullable Boolean enablePartitionDiscovery,
        @Nullable Object fileListPath,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object modifiedDatetimeEnd,
        @Nullable Object modifiedDatetimeStart,
        @Nullable Object partitionRootPath,
        @Nullable Object prefix,
        @Nullable Object recursive,
        String type,
        @Nullable Object wildcardFileName,
        @Nullable Object wildcardFolderPath) {
        this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
        this.disableMetricsCollection = disableMetricsCollection;
        this.enablePartitionDiscovery = enablePartitionDiscovery;
        this.fileListPath = fileListPath;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.partitionRootPath = partitionRootPath;
        this.prefix = prefix;
        this.recursive = recursive;
        this.type = Objects.requireNonNull(type);
        this.wildcardFileName = wildcardFileName;
        this.wildcardFolderPath = wildcardFolderPath;
    }

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDeleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    public Optional<Boolean> getEnablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }
    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getFileListPath() {
        return Optional.ofNullable(this.fileListPath);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The end of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getModifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }
    /**
     * The start of file's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getModifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }
    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPartitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }
    /**
     * The prefix filter for the S3 Compatible object name. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getRecursive() {
        return Optional.ofNullable(this.recursive);
    }
    /**
     * The read setting type.
     * Expected value is 'AmazonS3CompatibleReadSettings'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Amazon S3 Compatible wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getWildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }
    /**
     * Amazon S3 Compatible wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getWildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3CompatibleReadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object deleteFilesAfterCompletion;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Boolean enablePartitionDiscovery;
        private @Nullable Object fileListPath;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Object partitionRootPath;
        private @Nullable Object prefix;
        private @Nullable Object recursive;
        private String type;
        private @Nullable Object wildcardFileName;
        private @Nullable Object wildcardFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3CompatibleReadSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteFilesAfterCompletion = defaults.deleteFilesAfterCompletion;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.enablePartitionDiscovery = defaults.enablePartitionDiscovery;
    	      this.fileListPath = defaults.fileListPath;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.partitionRootPath = defaults.partitionRootPath;
    	      this.prefix = defaults.prefix;
    	      this.recursive = defaults.recursive;
    	      this.type = defaults.type;
    	      this.wildcardFileName = defaults.wildcardFileName;
    	      this.wildcardFolderPath = defaults.wildcardFolderPath;
        }

        public Builder setDeleteFilesAfterCompletion(@Nullable Object deleteFilesAfterCompletion) {
            this.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setEnablePartitionDiscovery(@Nullable Boolean enablePartitionDiscovery) {
            this.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        public Builder setFileListPath(@Nullable Object fileListPath) {
            this.fileListPath = fileListPath;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setModifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder setModifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder setPartitionRootPath(@Nullable Object partitionRootPath) {
            this.partitionRootPath = partitionRootPath;
            return this;
        }

        public Builder setPrefix(@Nullable Object prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setRecursive(@Nullable Object recursive) {
            this.recursive = recursive;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWildcardFileName(@Nullable Object wildcardFileName) {
            this.wildcardFileName = wildcardFileName;
            return this;
        }

        public Builder setWildcardFolderPath(@Nullable Object wildcardFolderPath) {
            this.wildcardFolderPath = wildcardFolderPath;
            return this;
        }

        public AmazonS3CompatibleReadSettingsResponse build() {
            return new AmazonS3CompatibleReadSettingsResponse(deleteFilesAfterCompletion, disableMetricsCollection, enablePartitionDiscovery, fileListPath, maxConcurrentConnections, modifiedDatetimeEnd, modifiedDatetimeStart, partitionRootPath, prefix, recursive, type, wildcardFileName, wildcardFolderPath);
        }
    }
}
