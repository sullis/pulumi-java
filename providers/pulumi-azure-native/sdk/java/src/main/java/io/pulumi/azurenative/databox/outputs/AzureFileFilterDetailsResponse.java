// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFileFilterDetailsResponse {
    /**
     * List of full path of the files to be transferred.
     * 
     */
    private final @Nullable List<String> filePathList;
    /**
     * Prefix list of the Azure files to be transferred.
     * 
     */
    private final @Nullable List<String> filePrefixList;
    /**
     * List of file shares to be transferred.
     * 
     */
    private final @Nullable List<String> fileShareList;

    @OutputCustomType.Constructor({"filePathList","filePrefixList","fileShareList"})
    private AzureFileFilterDetailsResponse(
        @Nullable List<String> filePathList,
        @Nullable List<String> filePrefixList,
        @Nullable List<String> fileShareList) {
        this.filePathList = filePathList;
        this.filePrefixList = filePrefixList;
        this.fileShareList = fileShareList;
    }

    /**
     * List of full path of the files to be transferred.
     * 
    */
    public List<String> getFilePathList() {
        return this.filePathList == null ? List.of() : this.filePathList;
    }
    /**
     * Prefix list of the Azure files to be transferred.
     * 
    */
    public List<String> getFilePrefixList() {
        return this.filePrefixList == null ? List.of() : this.filePrefixList;
    }
    /**
     * List of file shares to be transferred.
     * 
    */
    public List<String> getFileShareList() {
        return this.fileShareList == null ? List.of() : this.fileShareList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filePathList;
        private @Nullable List<String> filePrefixList;
        private @Nullable List<String> fileShareList;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileFilterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePathList = defaults.filePathList;
    	      this.filePrefixList = defaults.filePrefixList;
    	      this.fileShareList = defaults.fileShareList;
        }

        public Builder setFilePathList(@Nullable List<String> filePathList) {
            this.filePathList = filePathList;
            return this;
        }

        public Builder setFilePrefixList(@Nullable List<String> filePrefixList) {
            this.filePrefixList = filePrefixList;
            return this;
        }

        public Builder setFileShareList(@Nullable List<String> fileShareList) {
            this.fileShareList = fileShareList;
            return this;
        }
        public AzureFileFilterDetailsResponse build() {
            return new AzureFileFilterDetailsResponse(filePathList, filePrefixList, fileShareList);
        }
    }
}