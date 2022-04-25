// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs Empty = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs();

    /**
     * Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    @Import(name="bytesLimitPerFile")
    private @Nullable Output<Integer> bytesLimitPerFile;

    /**
     * @return Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
     * then the rest of the bytes are omitted.
     * 
     */
    public Optional<Output<Integer>> bytesLimitPerFile() {
        return Optional.ofNullable(this.bytesLimitPerFile);
    }

    /**
     * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @Import(name="bytesLimitPerFilePercent")
    private @Nullable Output<Integer> bytesLimitPerFilePercent;

    /**
     * @return Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Output<Integer>> bytesLimitPerFilePercent() {
        return Optional.ofNullable(this.bytesLimitPerFilePercent);
    }

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @Import(name="fileSet", required=true)
    private Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs> fileSet;

    /**
     * @return Set of files to scan.
     * Structure is documented below.
     * 
     */
    public Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs> fileSet() {
        return this.fileSet;
    }

    /**
     * List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    @Import(name="fileTypes")
    private @Nullable Output<List<String>> fileTypes;

    /**
     * @return List of file type groups to include in the scan. If empty, all files are scanned and available data
     * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
     * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
     * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
     * 
     */
    public Optional<Output<List<String>>> fileTypes() {
        return Optional.ofNullable(this.fileTypes);
    }

    /**
     * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    @Import(name="filesLimitPercent")
    private @Nullable Output<Integer> filesLimitPercent;

    /**
     * @return Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
     * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
     * 
     */
    public Optional<Output<Integer>> filesLimitPercent() {
        return Optional.ofNullable(this.filesLimitPercent);
    }

    /**
     * How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    @Import(name="sampleMethod")
    private @Nullable Output<String> sampleMethod;

    /**
     * @return How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
     * If not specified, scanning would start from the top.
     * Possible values are `TOP` and `RANDOM_START`.
     * 
     */
    public Optional<Output<String>> sampleMethod() {
        return Optional.ofNullable(this.sampleMethod);
    }

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs $) {
        this.bytesLimitPerFile = $.bytesLimitPerFile;
        this.bytesLimitPerFilePercent = $.bytesLimitPerFilePercent;
        this.fileSet = $.fileSet;
        this.fileTypes = $.fileTypes;
        this.filesLimitPercent = $.filesLimitPercent;
        this.sampleMethod = $.sampleMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bytesLimitPerFile Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
         * then the rest of the bytes are omitted.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFile(@Nullable Output<Integer> bytesLimitPerFile) {
            $.bytesLimitPerFile = bytesLimitPerFile;
            return this;
        }

        /**
         * @param bytesLimitPerFile Max number of bytes to scan from a file. If a scanned file&#39;s size is bigger than this value
         * then the rest of the bytes are omitted.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFile(Integer bytesLimitPerFile) {
            return bytesLimitPerFile(Output.of(bytesLimitPerFile));
        }

        /**
         * @param bytesLimitPerFilePercent Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
         * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFilePercent(@Nullable Output<Integer> bytesLimitPerFilePercent) {
            $.bytesLimitPerFilePercent = bytesLimitPerFilePercent;
            return this;
        }

        /**
         * @param bytesLimitPerFilePercent Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down.
         * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
         * 
         * @return builder
         * 
         */
        public Builder bytesLimitPerFilePercent(Integer bytesLimitPerFilePercent) {
            return bytesLimitPerFilePercent(Output.of(bytesLimitPerFilePercent));
        }

        /**
         * @param fileSet Set of files to scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fileSet(Output<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs> fileSet) {
            $.fileSet = fileSet;
            return this;
        }

        /**
         * @param fileSet Set of files to scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fileSet(PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsFileSetArgs fileSet) {
            return fileSet(Output.of(fileSet));
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data
         * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
         * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
         * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(@Nullable Output<List<String>> fileTypes) {
            $.fileTypes = fileTypes;
            return this;
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data
         * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
         * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
         * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(List<String> fileTypes) {
            return fileTypes(Output.of(fileTypes));
        }

        /**
         * @param fileTypes List of file type groups to include in the scan. If empty, all files are scanned and available data
         * format processors are applied. In addition, the binary content of the selected files is always scanned as well.
         * Images are scanned only as binary if the specified region does not support image inspection and no fileTypes were specified.
         * Each value may be one of `BINARY_FILE`, `TEXT_FILE`, `IMAGE`, `WORD`, `PDF`, `AVRO`, `CSV`, and `TSV`.
         * 
         * @return builder
         * 
         */
        public Builder fileTypes(String... fileTypes) {
            return fileTypes(List.of(fileTypes));
        }

        /**
         * @param filesLimitPercent Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
         * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
         * 
         * @return builder
         * 
         */
        public Builder filesLimitPercent(@Nullable Output<Integer> filesLimitPercent) {
            $.filesLimitPercent = filesLimitPercent;
            return this;
        }

        /**
         * @param filesLimitPercent Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down.
         * Must be between 0 and 100, inclusively. Both 0 and 100 means no limit.
         * 
         * @return builder
         * 
         */
        public Builder filesLimitPercent(Integer filesLimitPercent) {
            return filesLimitPercent(Output.of(filesLimitPercent));
        }

        /**
         * @param sampleMethod How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
         * If not specified, scanning would start from the top.
         * Possible values are `TOP` and `RANDOM_START`.
         * 
         * @return builder
         * 
         */
        public Builder sampleMethod(@Nullable Output<String> sampleMethod) {
            $.sampleMethod = sampleMethod;
            return this;
        }

        /**
         * @param sampleMethod How to sample bytes if not all bytes are scanned. Meaningful only when used in conjunction with bytesLimitPerFile.
         * If not specified, scanning would start from the top.
         * Possible values are `TOP` and `RANDOM_START`.
         * 
         * @return builder
         * 
         */
        public Builder sampleMethod(String sampleMethod) {
            return sampleMethod(Output.of(sampleMethod));
        }

        public PreventionJobTriggerInspectJobStorageConfigCloudStorageOptionsArgs build() {
            $.fileSet = Objects.requireNonNull($.fileSet, "expected parameter 'fileSet' to be non-null");
            return $;
        }
    }

}
