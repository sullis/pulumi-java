// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.fsx.inputs.DataRepositoryAssociationS3Args;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataRepositoryAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataRepositoryAssociationArgs Empty = new DataRepositoryAssociationArgs();

    /**
     * Set to true to run an import data repository task to import metadata from the data repository to the file system after the data repository association is created. Defaults to `false`.
     * 
     */
    @Import(name="batchImportMetaDataOnCreate")
      private final @Nullable Output<Boolean> batchImportMetaDataOnCreate;

    public Output<Boolean> getBatchImportMetaDataOnCreate() {
        return this.batchImportMetaDataOnCreate == null ? Output.empty() : this.batchImportMetaDataOnCreate;
    }

    /**
     * The path to the Amazon S3 data repository that will be linked to the file system. The path must be an S3 bucket s3://myBucket/myPrefix/. This path specifies where in the S3 data repository files will be imported from or exported to. The same S3 bucket cannot be linked more than once to the same file system.
     * 
     */
    @Import(name="dataRepositoryPath", required=true)
      private final Output<String> dataRepositoryPath;

    public Output<String> getDataRepositoryPath() {
        return this.dataRepositoryPath;
    }

    /**
     * Set to true to delete files from the file system upon deleting this data repository association. Defaults to `false`.
     * 
     */
    @Import(name="deleteDataInFilesystem")
      private final @Nullable Output<Boolean> deleteDataInFilesystem;

    public Output<Boolean> getDeleteDataInFilesystem() {
        return this.deleteDataInFilesystem == null ? Output.empty() : this.deleteDataInFilesystem;
    }

    /**
     * The ID of the Amazon FSx file system to on which to create a data repository association.
     * 
     */
    @Import(name="fileSystemId", required=true)
      private final Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * A path on the file system that points to a high-level directory (such as `/ns1/`) or subdirectory (such as `/ns1/subdir/`) that will be mapped 1-1 with `data_repository_path`. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path `/ns1/`, then you cannot link another data repository with file system path `/ns1/ns2`. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
     * 
     */
    @Import(name="fileSystemPath", required=true)
      private final Output<String> fileSystemPath;

    public Output<String> getFileSystemPath() {
        return this.fileSystemPath;
    }

    /**
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system.
     * 
     */
    @Import(name="importedFileChunkSize")
      private final @Nullable Output<Integer> importedFileChunkSize;

    public Output<Integer> getImportedFileChunkSize() {
        return this.importedFileChunkSize == null ? Output.empty() : this.importedFileChunkSize;
    }

    /**
     * See the `s3` configuration block. Max of 1.
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
     * 
     */
    @Import(name="s3")
      private final @Nullable Output<DataRepositoryAssociationS3Args> s3;

    public Output<DataRepositoryAssociationS3Args> getS3() {
        return this.s3 == null ? Output.empty() : this.s3;
    }

    /**
     * A map of tags to assign to the data repository association. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public DataRepositoryAssociationArgs(
        @Nullable Output<Boolean> batchImportMetaDataOnCreate,
        Output<String> dataRepositoryPath,
        @Nullable Output<Boolean> deleteDataInFilesystem,
        Output<String> fileSystemId,
        Output<String> fileSystemPath,
        @Nullable Output<Integer> importedFileChunkSize,
        @Nullable Output<DataRepositoryAssociationS3Args> s3,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
        this.dataRepositoryPath = Objects.requireNonNull(dataRepositoryPath, "expected parameter 'dataRepositoryPath' to be non-null");
        this.deleteDataInFilesystem = deleteDataInFilesystem;
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.fileSystemPath = Objects.requireNonNull(fileSystemPath, "expected parameter 'fileSystemPath' to be non-null");
        this.importedFileChunkSize = importedFileChunkSize;
        this.s3 = s3;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DataRepositoryAssociationArgs() {
        this.batchImportMetaDataOnCreate = Output.empty();
        this.dataRepositoryPath = Output.empty();
        this.deleteDataInFilesystem = Output.empty();
        this.fileSystemId = Output.empty();
        this.fileSystemPath = Output.empty();
        this.importedFileChunkSize = Output.empty();
        this.s3 = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> batchImportMetaDataOnCreate;
        private Output<String> dataRepositoryPath;
        private @Nullable Output<Boolean> deleteDataInFilesystem;
        private Output<String> fileSystemId;
        private Output<String> fileSystemPath;
        private @Nullable Output<Integer> importedFileChunkSize;
        private @Nullable Output<DataRepositoryAssociationS3Args> s3;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchImportMetaDataOnCreate = defaults.batchImportMetaDataOnCreate;
    	      this.dataRepositoryPath = defaults.dataRepositoryPath;
    	      this.deleteDataInFilesystem = defaults.deleteDataInFilesystem;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.fileSystemPath = defaults.fileSystemPath;
    	      this.importedFileChunkSize = defaults.importedFileChunkSize;
    	      this.s3 = defaults.s3;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder batchImportMetaDataOnCreate(@Nullable Output<Boolean> batchImportMetaDataOnCreate) {
            this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
            return this;
        }
        public Builder batchImportMetaDataOnCreate(@Nullable Boolean batchImportMetaDataOnCreate) {
            this.batchImportMetaDataOnCreate = Output.ofNullable(batchImportMetaDataOnCreate);
            return this;
        }
        public Builder dataRepositoryPath(Output<String> dataRepositoryPath) {
            this.dataRepositoryPath = Objects.requireNonNull(dataRepositoryPath);
            return this;
        }
        public Builder dataRepositoryPath(String dataRepositoryPath) {
            this.dataRepositoryPath = Output.of(Objects.requireNonNull(dataRepositoryPath));
            return this;
        }
        public Builder deleteDataInFilesystem(@Nullable Output<Boolean> deleteDataInFilesystem) {
            this.deleteDataInFilesystem = deleteDataInFilesystem;
            return this;
        }
        public Builder deleteDataInFilesystem(@Nullable Boolean deleteDataInFilesystem) {
            this.deleteDataInFilesystem = Output.ofNullable(deleteDataInFilesystem);
            return this;
        }
        public Builder fileSystemId(Output<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Output.of(Objects.requireNonNull(fileSystemId));
            return this;
        }
        public Builder fileSystemPath(Output<String> fileSystemPath) {
            this.fileSystemPath = Objects.requireNonNull(fileSystemPath);
            return this;
        }
        public Builder fileSystemPath(String fileSystemPath) {
            this.fileSystemPath = Output.of(Objects.requireNonNull(fileSystemPath));
            return this;
        }
        public Builder importedFileChunkSize(@Nullable Output<Integer> importedFileChunkSize) {
            this.importedFileChunkSize = importedFileChunkSize;
            return this;
        }
        public Builder importedFileChunkSize(@Nullable Integer importedFileChunkSize) {
            this.importedFileChunkSize = Output.ofNullable(importedFileChunkSize);
            return this;
        }
        public Builder s3(@Nullable Output<DataRepositoryAssociationS3Args> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable DataRepositoryAssociationS3Args s3) {
            this.s3 = Output.ofNullable(s3);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public DataRepositoryAssociationArgs build() {
            return new DataRepositoryAssociationArgs(batchImportMetaDataOnCreate, dataRepositoryPath, deleteDataInFilesystem, fileSystemId, fileSystemPath, importedFileChunkSize, s3, tags, tagsAll);
        }
    }
}
