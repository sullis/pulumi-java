// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataflow_v1b3.inputs.BigQueryIODetailsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.BigTableIODetailsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DatastoreIODetailsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.FileIODetailsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.PubSubIODetailsArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.SdkVersionArgs;
import io.pulumi.googlenative.dataflow_v1b3.inputs.SpannerIODetailsArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata available primarily for filtering jobs. Will be included in the ListJob response and Job SUMMARY view.
 * 
 */
public final class JobMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobMetadataArgs Empty = new JobMetadataArgs();

    /**
     * Identification of a Cloud Bigtable source used in the Dataflow job.
     * 
     */
    @Import(name="bigTableDetails")
      private final @Nullable Output<List<BigTableIODetailsArgs>> bigTableDetails;

    public Output<List<BigTableIODetailsArgs>> getBigTableDetails() {
        return this.bigTableDetails == null ? Output.empty() : this.bigTableDetails;
    }

    /**
     * Identification of a BigQuery source used in the Dataflow job.
     * 
     */
    @Import(name="bigqueryDetails")
      private final @Nullable Output<List<BigQueryIODetailsArgs>> bigqueryDetails;

    public Output<List<BigQueryIODetailsArgs>> getBigqueryDetails() {
        return this.bigqueryDetails == null ? Output.empty() : this.bigqueryDetails;
    }

    /**
     * Identification of a Datastore source used in the Dataflow job.
     * 
     */
    @Import(name="datastoreDetails")
      private final @Nullable Output<List<DatastoreIODetailsArgs>> datastoreDetails;

    public Output<List<DatastoreIODetailsArgs>> getDatastoreDetails() {
        return this.datastoreDetails == null ? Output.empty() : this.datastoreDetails;
    }

    /**
     * Identification of a File source used in the Dataflow job.
     * 
     */
    @Import(name="fileDetails")
      private final @Nullable Output<List<FileIODetailsArgs>> fileDetails;

    public Output<List<FileIODetailsArgs>> getFileDetails() {
        return this.fileDetails == null ? Output.empty() : this.fileDetails;
    }

    /**
     * Identification of a Pub/Sub source used in the Dataflow job.
     * 
     */
    @Import(name="pubsubDetails")
      private final @Nullable Output<List<PubSubIODetailsArgs>> pubsubDetails;

    public Output<List<PubSubIODetailsArgs>> getPubsubDetails() {
        return this.pubsubDetails == null ? Output.empty() : this.pubsubDetails;
    }

    /**
     * The SDK version used to run the job.
     * 
     */
    @Import(name="sdkVersion")
      private final @Nullable Output<SdkVersionArgs> sdkVersion;

    public Output<SdkVersionArgs> getSdkVersion() {
        return this.sdkVersion == null ? Output.empty() : this.sdkVersion;
    }

    /**
     * Identification of a Spanner source used in the Dataflow job.
     * 
     */
    @Import(name="spannerDetails")
      private final @Nullable Output<List<SpannerIODetailsArgs>> spannerDetails;

    public Output<List<SpannerIODetailsArgs>> getSpannerDetails() {
        return this.spannerDetails == null ? Output.empty() : this.spannerDetails;
    }

    public JobMetadataArgs(
        @Nullable Output<List<BigTableIODetailsArgs>> bigTableDetails,
        @Nullable Output<List<BigQueryIODetailsArgs>> bigqueryDetails,
        @Nullable Output<List<DatastoreIODetailsArgs>> datastoreDetails,
        @Nullable Output<List<FileIODetailsArgs>> fileDetails,
        @Nullable Output<List<PubSubIODetailsArgs>> pubsubDetails,
        @Nullable Output<SdkVersionArgs> sdkVersion,
        @Nullable Output<List<SpannerIODetailsArgs>> spannerDetails) {
        this.bigTableDetails = bigTableDetails;
        this.bigqueryDetails = bigqueryDetails;
        this.datastoreDetails = datastoreDetails;
        this.fileDetails = fileDetails;
        this.pubsubDetails = pubsubDetails;
        this.sdkVersion = sdkVersion;
        this.spannerDetails = spannerDetails;
    }

    private JobMetadataArgs() {
        this.bigTableDetails = Output.empty();
        this.bigqueryDetails = Output.empty();
        this.datastoreDetails = Output.empty();
        this.fileDetails = Output.empty();
        this.pubsubDetails = Output.empty();
        this.sdkVersion = Output.empty();
        this.spannerDetails = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BigTableIODetailsArgs>> bigTableDetails;
        private @Nullable Output<List<BigQueryIODetailsArgs>> bigqueryDetails;
        private @Nullable Output<List<DatastoreIODetailsArgs>> datastoreDetails;
        private @Nullable Output<List<FileIODetailsArgs>> fileDetails;
        private @Nullable Output<List<PubSubIODetailsArgs>> pubsubDetails;
        private @Nullable Output<SdkVersionArgs> sdkVersion;
        private @Nullable Output<List<SpannerIODetailsArgs>> spannerDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(JobMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigTableDetails = defaults.bigTableDetails;
    	      this.bigqueryDetails = defaults.bigqueryDetails;
    	      this.datastoreDetails = defaults.datastoreDetails;
    	      this.fileDetails = defaults.fileDetails;
    	      this.pubsubDetails = defaults.pubsubDetails;
    	      this.sdkVersion = defaults.sdkVersion;
    	      this.spannerDetails = defaults.spannerDetails;
        }

        public Builder bigTableDetails(@Nullable Output<List<BigTableIODetailsArgs>> bigTableDetails) {
            this.bigTableDetails = bigTableDetails;
            return this;
        }
        public Builder bigTableDetails(@Nullable List<BigTableIODetailsArgs> bigTableDetails) {
            this.bigTableDetails = Output.ofNullable(bigTableDetails);
            return this;
        }
        public Builder bigTableDetails(BigTableIODetailsArgs... bigTableDetails) {
            return bigTableDetails(List.of(bigTableDetails));
        }
        public Builder bigqueryDetails(@Nullable Output<List<BigQueryIODetailsArgs>> bigqueryDetails) {
            this.bigqueryDetails = bigqueryDetails;
            return this;
        }
        public Builder bigqueryDetails(@Nullable List<BigQueryIODetailsArgs> bigqueryDetails) {
            this.bigqueryDetails = Output.ofNullable(bigqueryDetails);
            return this;
        }
        public Builder bigqueryDetails(BigQueryIODetailsArgs... bigqueryDetails) {
            return bigqueryDetails(List.of(bigqueryDetails));
        }
        public Builder datastoreDetails(@Nullable Output<List<DatastoreIODetailsArgs>> datastoreDetails) {
            this.datastoreDetails = datastoreDetails;
            return this;
        }
        public Builder datastoreDetails(@Nullable List<DatastoreIODetailsArgs> datastoreDetails) {
            this.datastoreDetails = Output.ofNullable(datastoreDetails);
            return this;
        }
        public Builder datastoreDetails(DatastoreIODetailsArgs... datastoreDetails) {
            return datastoreDetails(List.of(datastoreDetails));
        }
        public Builder fileDetails(@Nullable Output<List<FileIODetailsArgs>> fileDetails) {
            this.fileDetails = fileDetails;
            return this;
        }
        public Builder fileDetails(@Nullable List<FileIODetailsArgs> fileDetails) {
            this.fileDetails = Output.ofNullable(fileDetails);
            return this;
        }
        public Builder fileDetails(FileIODetailsArgs... fileDetails) {
            return fileDetails(List.of(fileDetails));
        }
        public Builder pubsubDetails(@Nullable Output<List<PubSubIODetailsArgs>> pubsubDetails) {
            this.pubsubDetails = pubsubDetails;
            return this;
        }
        public Builder pubsubDetails(@Nullable List<PubSubIODetailsArgs> pubsubDetails) {
            this.pubsubDetails = Output.ofNullable(pubsubDetails);
            return this;
        }
        public Builder pubsubDetails(PubSubIODetailsArgs... pubsubDetails) {
            return pubsubDetails(List.of(pubsubDetails));
        }
        public Builder sdkVersion(@Nullable Output<SdkVersionArgs> sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public Builder sdkVersion(@Nullable SdkVersionArgs sdkVersion) {
            this.sdkVersion = Output.ofNullable(sdkVersion);
            return this;
        }
        public Builder spannerDetails(@Nullable Output<List<SpannerIODetailsArgs>> spannerDetails) {
            this.spannerDetails = spannerDetails;
            return this;
        }
        public Builder spannerDetails(@Nullable List<SpannerIODetailsArgs> spannerDetails) {
            this.spannerDetails = Output.ofNullable(spannerDetails);
            return this;
        }
        public Builder spannerDetails(SpannerIODetailsArgs... spannerDetails) {
            return spannerDetails(List.of(spannerDetails));
        }        public JobMetadataArgs build() {
            return new JobMetadataArgs(bigTableDetails, bigqueryDetails, datastoreDetails, fileDetails, pubsubDetails, sdkVersion, spannerDetails);
        }
    }
}
