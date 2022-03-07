// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to an asset via its path in a job output.
 * 
 */
public final class OutputPathAssetReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutputPathAssetReferenceResponse Empty = new OutputPathAssetReferenceResponse();

    /**
     * ARM resource ID of the job.
     * 
     */
    @InputImport(name="jobId")
      private final @Nullable String jobId;

    public Optional<String> getJobId() {
        return this.jobId == null ? Optional.empty() : Optional.ofNullable(this.jobId);
    }

    /**
     * The path of the file/directory in the job output.
     * 
     */
    @InputImport(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'OutputPath'.
     * 
     */
    @InputImport(name="referenceType", required=true)
      private final String referenceType;

    public String getReferenceType() {
        return this.referenceType;
    }

    public OutputPathAssetReferenceResponse(
        @Nullable String jobId,
        @Nullable String path,
        String referenceType) {
        this.jobId = jobId;
        this.path = path;
        this.referenceType = Objects.requireNonNull(referenceType, "expected parameter 'referenceType' to be non-null");
    }

    private OutputPathAssetReferenceResponse() {
        this.jobId = null;
        this.path = null;
        this.referenceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputPathAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobId;
        private @Nullable String path;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputPathAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.path = defaults.path;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setJobId(@Nullable String jobId) {
            this.jobId = jobId;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public OutputPathAssetReferenceResponse build() {
            return new OutputPathAssetReferenceResponse(jobId, path, referenceType);
        }
    }
}