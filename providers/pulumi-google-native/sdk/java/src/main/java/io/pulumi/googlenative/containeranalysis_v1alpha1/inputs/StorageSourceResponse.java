// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * StorageSource describes the location of the source in an archive file in Google Cloud Storage.
 * 
 */
public final class StorageSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageSourceResponse Empty = new StorageSourceResponse();

    /**
     * Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * Google Cloud Storage generation for the object.
     * 
     */
    @InputImport(name="generation", required=true)
      private final String generation;

    public String getGeneration() {
        return this.generation;
    }

    /**
     * Google Cloud Storage object containing source.
     * 
     */
    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public StorageSourceResponse(
        String bucket,
        String generation,
        String object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = Objects.requireNonNull(generation, "expected parameter 'generation' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private StorageSourceResponse() {
        this.bucket = null;
        this.generation = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setGeneration(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public StorageSourceResponse build() {
            return new StorageSourceResponse(bucket, generation, object);
        }
    }
}