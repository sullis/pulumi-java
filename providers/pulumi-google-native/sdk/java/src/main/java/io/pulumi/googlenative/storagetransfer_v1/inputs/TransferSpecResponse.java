// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AwsS3DataResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.AzureBlobStorageDataResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GcsDataResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.HttpDataResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.ObjectConditionsResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.PosixFilesystemResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.TransferManifestResponse;
import io.pulumi.googlenative.storagetransfer_v1.inputs.TransferOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for running a transfer.
 * 
 */
public final class TransferSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransferSpecResponse Empty = new TransferSpecResponse();

    /**
     * An AWS S3 data source.
     * 
     */
    @InputImport(name="awsS3DataSource", required=true)
      private final AwsS3DataResponse awsS3DataSource;

    public AwsS3DataResponse getAwsS3DataSource() {
        return this.awsS3DataSource;
    }

    /**
     * An Azure Blob Storage data source.
     * 
     */
    @InputImport(name="azureBlobStorageDataSource", required=true)
      private final AzureBlobStorageDataResponse azureBlobStorageDataSource;

    public AzureBlobStorageDataResponse getAzureBlobStorageDataSource() {
        return this.azureBlobStorageDataSource;
    }

    /**
     * A Cloud Storage data sink.
     * 
     */
    @InputImport(name="gcsDataSink", required=true)
      private final GcsDataResponse gcsDataSink;

    public GcsDataResponse getGcsDataSink() {
        return this.gcsDataSink;
    }

    /**
     * A Cloud Storage data source.
     * 
     */
    @InputImport(name="gcsDataSource", required=true)
      private final GcsDataResponse gcsDataSource;

    public GcsDataResponse getGcsDataSource() {
        return this.gcsDataSource;
    }

    /**
     * Cloud Storage intermediate data location.
     * 
     */
    @InputImport(name="gcsIntermediateDataLocation", required=true)
      private final GcsDataResponse gcsIntermediateDataLocation;

    public GcsDataResponse getGcsIntermediateDataLocation() {
        return this.gcsIntermediateDataLocation;
    }

    /**
     * An HTTP URL data source.
     * 
     */
    @InputImport(name="httpDataSource", required=true)
      private final HttpDataResponse httpDataSource;

    public HttpDataResponse getHttpDataSource() {
        return this.httpDataSource;
    }

    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not exclude objects in a data sink.
     * 
     */
    @InputImport(name="objectConditions", required=true)
      private final ObjectConditionsResponse objectConditions;

    public ObjectConditionsResponse getObjectConditions() {
        return this.objectConditions;
    }

    /**
     * A POSIX Filesystem data sink.
     * 
     */
    @InputImport(name="posixDataSink", required=true)
      private final PosixFilesystemResponse posixDataSink;

    public PosixFilesystemResponse getPosixDataSink() {
        return this.posixDataSink;
    }

    /**
     * A POSIX Filesystem data source.
     * 
     */
    @InputImport(name="posixDataSource", required=true)
      private final PosixFilesystemResponse posixDataSource;

    public PosixFilesystemResponse getPosixDataSource() {
        return this.posixDataSource;
    }

    /**
     * Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used.
     * 
     */
    @InputImport(name="sinkAgentPoolName", required=true)
      private final String sinkAgentPoolName;

    public String getSinkAgentPoolName() {
        return this.sinkAgentPoolName;
    }

    /**
     * Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used.
     * 
     */
    @InputImport(name="sourceAgentPoolName", required=true)
      private final String sourceAgentPoolName;

    public String getSourceAgentPoolName() {
        return this.sourceAgentPoolName;
    }

    /**
     * A manifest file provides a list of objects to be transferred from the data source. This field points to the location of the manifest file. Otherwise, the entire source bucket is used. ObjectConditions still apply.
     * 
     */
    @InputImport(name="transferManifest", required=true)
      private final TransferManifestResponse transferManifest;

    public TransferManifestResponse getTransferManifest() {
        return this.transferManifest;
    }

    /**
     * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT error.
     * 
     */
    @InputImport(name="transferOptions", required=true)
      private final TransferOptionsResponse transferOptions;

    public TransferOptionsResponse getTransferOptions() {
        return this.transferOptions;
    }

    public TransferSpecResponse(
        AwsS3DataResponse awsS3DataSource,
        AzureBlobStorageDataResponse azureBlobStorageDataSource,
        GcsDataResponse gcsDataSink,
        GcsDataResponse gcsDataSource,
        GcsDataResponse gcsIntermediateDataLocation,
        HttpDataResponse httpDataSource,
        ObjectConditionsResponse objectConditions,
        PosixFilesystemResponse posixDataSink,
        PosixFilesystemResponse posixDataSource,
        String sinkAgentPoolName,
        String sourceAgentPoolName,
        TransferManifestResponse transferManifest,
        TransferOptionsResponse transferOptions) {
        this.awsS3DataSource = Objects.requireNonNull(awsS3DataSource, "expected parameter 'awsS3DataSource' to be non-null");
        this.azureBlobStorageDataSource = Objects.requireNonNull(azureBlobStorageDataSource, "expected parameter 'azureBlobStorageDataSource' to be non-null");
        this.gcsDataSink = Objects.requireNonNull(gcsDataSink, "expected parameter 'gcsDataSink' to be non-null");
        this.gcsDataSource = Objects.requireNonNull(gcsDataSource, "expected parameter 'gcsDataSource' to be non-null");
        this.gcsIntermediateDataLocation = Objects.requireNonNull(gcsIntermediateDataLocation, "expected parameter 'gcsIntermediateDataLocation' to be non-null");
        this.httpDataSource = Objects.requireNonNull(httpDataSource, "expected parameter 'httpDataSource' to be non-null");
        this.objectConditions = Objects.requireNonNull(objectConditions, "expected parameter 'objectConditions' to be non-null");
        this.posixDataSink = Objects.requireNonNull(posixDataSink, "expected parameter 'posixDataSink' to be non-null");
        this.posixDataSource = Objects.requireNonNull(posixDataSource, "expected parameter 'posixDataSource' to be non-null");
        this.sinkAgentPoolName = Objects.requireNonNull(sinkAgentPoolName, "expected parameter 'sinkAgentPoolName' to be non-null");
        this.sourceAgentPoolName = Objects.requireNonNull(sourceAgentPoolName, "expected parameter 'sourceAgentPoolName' to be non-null");
        this.transferManifest = Objects.requireNonNull(transferManifest, "expected parameter 'transferManifest' to be non-null");
        this.transferOptions = Objects.requireNonNull(transferOptions, "expected parameter 'transferOptions' to be non-null");
    }

    private TransferSpecResponse() {
        this.awsS3DataSource = null;
        this.azureBlobStorageDataSource = null;
        this.gcsDataSink = null;
        this.gcsDataSource = null;
        this.gcsIntermediateDataLocation = null;
        this.httpDataSource = null;
        this.objectConditions = null;
        this.posixDataSink = null;
        this.posixDataSource = null;
        this.sinkAgentPoolName = null;
        this.sourceAgentPoolName = null;
        this.transferManifest = null;
        this.transferOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsS3DataResponse awsS3DataSource;
        private AzureBlobStorageDataResponse azureBlobStorageDataSource;
        private GcsDataResponse gcsDataSink;
        private GcsDataResponse gcsDataSource;
        private GcsDataResponse gcsIntermediateDataLocation;
        private HttpDataResponse httpDataSource;
        private ObjectConditionsResponse objectConditions;
        private PosixFilesystemResponse posixDataSink;
        private PosixFilesystemResponse posixDataSource;
        private String sinkAgentPoolName;
        private String sourceAgentPoolName;
        private TransferManifestResponse transferManifest;
        private TransferOptionsResponse transferOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsS3DataSource = defaults.awsS3DataSource;
    	      this.azureBlobStorageDataSource = defaults.azureBlobStorageDataSource;
    	      this.gcsDataSink = defaults.gcsDataSink;
    	      this.gcsDataSource = defaults.gcsDataSource;
    	      this.gcsIntermediateDataLocation = defaults.gcsIntermediateDataLocation;
    	      this.httpDataSource = defaults.httpDataSource;
    	      this.objectConditions = defaults.objectConditions;
    	      this.posixDataSink = defaults.posixDataSink;
    	      this.posixDataSource = defaults.posixDataSource;
    	      this.sinkAgentPoolName = defaults.sinkAgentPoolName;
    	      this.sourceAgentPoolName = defaults.sourceAgentPoolName;
    	      this.transferManifest = defaults.transferManifest;
    	      this.transferOptions = defaults.transferOptions;
        }

        public Builder setAwsS3DataSource(AwsS3DataResponse awsS3DataSource) {
            this.awsS3DataSource = Objects.requireNonNull(awsS3DataSource);
            return this;
        }

        public Builder setAzureBlobStorageDataSource(AzureBlobStorageDataResponse azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = Objects.requireNonNull(azureBlobStorageDataSource);
            return this;
        }

        public Builder setGcsDataSink(GcsDataResponse gcsDataSink) {
            this.gcsDataSink = Objects.requireNonNull(gcsDataSink);
            return this;
        }

        public Builder setGcsDataSource(GcsDataResponse gcsDataSource) {
            this.gcsDataSource = Objects.requireNonNull(gcsDataSource);
            return this;
        }

        public Builder setGcsIntermediateDataLocation(GcsDataResponse gcsIntermediateDataLocation) {
            this.gcsIntermediateDataLocation = Objects.requireNonNull(gcsIntermediateDataLocation);
            return this;
        }

        public Builder setHttpDataSource(HttpDataResponse httpDataSource) {
            this.httpDataSource = Objects.requireNonNull(httpDataSource);
            return this;
        }

        public Builder setObjectConditions(ObjectConditionsResponse objectConditions) {
            this.objectConditions = Objects.requireNonNull(objectConditions);
            return this;
        }

        public Builder setPosixDataSink(PosixFilesystemResponse posixDataSink) {
            this.posixDataSink = Objects.requireNonNull(posixDataSink);
            return this;
        }

        public Builder setPosixDataSource(PosixFilesystemResponse posixDataSource) {
            this.posixDataSource = Objects.requireNonNull(posixDataSource);
            return this;
        }

        public Builder setSinkAgentPoolName(String sinkAgentPoolName) {
            this.sinkAgentPoolName = Objects.requireNonNull(sinkAgentPoolName);
            return this;
        }

        public Builder setSourceAgentPoolName(String sourceAgentPoolName) {
            this.sourceAgentPoolName = Objects.requireNonNull(sourceAgentPoolName);
            return this;
        }

        public Builder setTransferManifest(TransferManifestResponse transferManifest) {
            this.transferManifest = Objects.requireNonNull(transferManifest);
            return this;
        }

        public Builder setTransferOptions(TransferOptionsResponse transferOptions) {
            this.transferOptions = Objects.requireNonNull(transferOptions);
            return this;
        }
        public TransferSpecResponse build() {
            return new TransferSpecResponse(awsS3DataSource, azureBlobStorageDataSource, gcsDataSink, gcsDataSource, gcsIntermediateDataLocation, httpDataSource, objectConditions, posixDataSink, posixDataSource, sinkAgentPoolName, sourceAgentPoolName, transferManifest, transferOptions);
        }
    }
}