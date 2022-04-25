// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * File server read settings.
 * 
 */
public final class FileServerReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileServerReadSettingsArgs Empty = new FileServerReadSettingsArgs();

    /**
     * Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="deleteFilesAfterCompletion")
    private @Nullable Output<Object> deleteFilesAfterCompletion;

    /**
     * @return Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> deleteFilesAfterCompletion() {
        return Optional.ofNullable(this.deleteFilesAfterCompletion);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Indicates whether to enable partition discovery.
     * 
     */
    @Import(name="enablePartitionDiscovery")
    private @Nullable Output<Boolean> enablePartitionDiscovery;

    /**
     * @return Indicates whether to enable partition discovery.
     * 
     */
    public Optional<Output<Boolean>> enablePartitionDiscovery() {
        return Optional.ofNullable(this.enablePartitionDiscovery);
    }

    /**
     * Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileFilter")
    private @Nullable Output<Object> fileFilter;

    /**
     * @return Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileFilter() {
        return Optional.ofNullable(this.fileFilter);
    }

    /**
     * Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileListPath")
    private @Nullable Output<Object> fileListPath;

    /**
     * @return Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileListPath() {
        return Optional.ofNullable(this.fileListPath);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeEnd")
    private @Nullable Output<Object> modifiedDatetimeEnd;

    /**
     * @return The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> modifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    /**
     * The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="modifiedDatetimeStart")
    private @Nullable Output<Object> modifiedDatetimeStart;

    /**
     * @return The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> modifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
    }

    /**
     * Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="partitionRootPath")
    private @Nullable Output<Object> partitionRootPath;

    /**
     * @return Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> partitionRootPath() {
        return Optional.ofNullable(this.partitionRootPath);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
    private @Nullable Output<Object> recursive;

    /**
     * @return If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * The read setting type.
     * Expected value is &#39;FileServerReadSettings&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The read setting type.
     * Expected value is &#39;FileServerReadSettings&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * FileServer wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFileName")
    private @Nullable Output<Object> wildcardFileName;

    /**
     * @return FileServer wildcardFileName. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> wildcardFileName() {
        return Optional.ofNullable(this.wildcardFileName);
    }

    /**
     * FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="wildcardFolderPath")
    private @Nullable Output<Object> wildcardFolderPath;

    /**
     * @return FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> wildcardFolderPath() {
        return Optional.ofNullable(this.wildcardFolderPath);
    }

    private FileServerReadSettingsArgs() {}

    private FileServerReadSettingsArgs(FileServerReadSettingsArgs $) {
        this.deleteFilesAfterCompletion = $.deleteFilesAfterCompletion;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.enablePartitionDiscovery = $.enablePartitionDiscovery;
        this.fileFilter = $.fileFilter;
        this.fileListPath = $.fileListPath;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.modifiedDatetimeEnd = $.modifiedDatetimeEnd;
        this.modifiedDatetimeStart = $.modifiedDatetimeStart;
        this.partitionRootPath = $.partitionRootPath;
        this.recursive = $.recursive;
        this.type = $.type;
        this.wildcardFileName = $.wildcardFileName;
        this.wildcardFolderPath = $.wildcardFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileServerReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileServerReadSettingsArgs $;

        public Builder() {
            $ = new FileServerReadSettingsArgs();
        }

        public Builder(FileServerReadSettingsArgs defaults) {
            $ = new FileServerReadSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteFilesAfterCompletion Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder deleteFilesAfterCompletion(@Nullable Output<Object> deleteFilesAfterCompletion) {
            $.deleteFilesAfterCompletion = deleteFilesAfterCompletion;
            return this;
        }

        /**
         * @param deleteFilesAfterCompletion Indicates whether the source files need to be deleted after copy completion. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder deleteFilesAfterCompletion(Object deleteFilesAfterCompletion) {
            return deleteFilesAfterCompletion(Output.of(deleteFilesAfterCompletion));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param enablePartitionDiscovery Indicates whether to enable partition discovery.
         * 
         * @return builder
         * 
         */
        public Builder enablePartitionDiscovery(@Nullable Output<Boolean> enablePartitionDiscovery) {
            $.enablePartitionDiscovery = enablePartitionDiscovery;
            return this;
        }

        /**
         * @param enablePartitionDiscovery Indicates whether to enable partition discovery.
         * 
         * @return builder
         * 
         */
        public Builder enablePartitionDiscovery(Boolean enablePartitionDiscovery) {
            return enablePartitionDiscovery(Output.of(enablePartitionDiscovery));
        }

        /**
         * @param fileFilter Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileFilter(@Nullable Output<Object> fileFilter) {
            $.fileFilter = fileFilter;
            return this;
        }

        /**
         * @param fileFilter Specify a filter to be used to select a subset of files in the folderPath rather than all files. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileFilter(Object fileFilter) {
            return fileFilter(Output.of(fileFilter));
        }

        /**
         * @param fileListPath Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileListPath(@Nullable Output<Object> fileListPath) {
            $.fileListPath = fileListPath;
            return this;
        }

        /**
         * @param fileListPath Point to a text file that lists each file (relative path to the path configured in the dataset) that you want to copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileListPath(Object fileListPath) {
            return fileListPath(Output.of(fileListPath));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param modifiedDatetimeEnd The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(@Nullable Output<Object> modifiedDatetimeEnd) {
            $.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        /**
         * @param modifiedDatetimeEnd The end of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeEnd(Object modifiedDatetimeEnd) {
            return modifiedDatetimeEnd(Output.of(modifiedDatetimeEnd));
        }

        /**
         * @param modifiedDatetimeStart The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(@Nullable Output<Object> modifiedDatetimeStart) {
            $.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        /**
         * @param modifiedDatetimeStart The start of file&#39;s modified datetime. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder modifiedDatetimeStart(Object modifiedDatetimeStart) {
            return modifiedDatetimeStart(Output.of(modifiedDatetimeStart));
        }

        /**
         * @param partitionRootPath Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionRootPath(@Nullable Output<Object> partitionRootPath) {
            $.partitionRootPath = partitionRootPath;
            return this;
        }

        /**
         * @param partitionRootPath Specify the root path where partition discovery starts from. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder partitionRootPath(Object partitionRootPath) {
            return partitionRootPath(Output.of(partitionRootPath));
        }

        /**
         * @param recursive If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Output<Object> recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param recursive If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder recursive(Object recursive) {
            return recursive(Output.of(recursive));
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;FileServerReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The read setting type.
         * Expected value is &#39;FileServerReadSettings&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param wildcardFileName FileServer wildcardFileName. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFileName(@Nullable Output<Object> wildcardFileName) {
            $.wildcardFileName = wildcardFileName;
            return this;
        }

        /**
         * @param wildcardFileName FileServer wildcardFileName. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFileName(Object wildcardFileName) {
            return wildcardFileName(Output.of(wildcardFileName));
        }

        /**
         * @param wildcardFolderPath FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFolderPath(@Nullable Output<Object> wildcardFolderPath) {
            $.wildcardFolderPath = wildcardFolderPath;
            return this;
        }

        /**
         * @param wildcardFolderPath FileServer wildcardFolderPath. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder wildcardFolderPath(Object wildcardFolderPath) {
            return wildcardFolderPath(Output.of(wildcardFolderPath));
        }

        public FileServerReadSettingsArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
