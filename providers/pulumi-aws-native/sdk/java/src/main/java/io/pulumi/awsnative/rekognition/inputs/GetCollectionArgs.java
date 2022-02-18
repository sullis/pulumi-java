// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rekognition.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCollectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCollectionArgs Empty = new GetCollectionArgs();

    @InputImport(name="collectionId", required=true)
    private final String collectionId;

    public String getCollectionId() {
        return this.collectionId;
    }

    public GetCollectionArgs(String collectionId) {
        this.collectionId = Objects.requireNonNull(collectionId, "expected parameter 'collectionId' to be non-null");
    }

    private GetCollectionArgs() {
        this.collectionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionId = defaults.collectionId;
        }

        public Builder setCollectionId(String collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }

        public GetCollectionArgs build() {
            return new GetCollectionArgs(collectionId);
        }
    }
}
