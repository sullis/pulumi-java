// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs {
    /**
     * @return Required. Bucket of the Cloud Storage object.
     * 
     */
    private final String bucket;
    /**
     * @return Generation number of the Cloud Storage object.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * @return Required. Name of the Cloud Storage object.
     * 
     */
    private final String object;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("generation") @Nullable Integer generation,
        @CustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    /**
     * @return Required. Bucket of the Cloud Storage object.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Generation number of the Cloud Storage object.
     * 
     */
    public Optional<Integer> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * @return Required. Name of the Cloud Storage object.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable Integer generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs(bucket, generation, object);
        }
    }
}
