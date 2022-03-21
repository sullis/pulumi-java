// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rekognition;

import io.pulumi.awsnative.rekognition.inputs.CollectionTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CollectionArgs Empty = new CollectionArgs();

    @Import(name="collectionId", required=true)
      private final Output<String> collectionId;

    public Output<String> getCollectionId() {
        return this.collectionId;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<CollectionTagArgs>> tags;

    public Output<List<CollectionTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CollectionArgs(
        Output<String> collectionId,
        @Nullable Output<List<CollectionTagArgs>> tags) {
        this.collectionId = Objects.requireNonNull(collectionId, "expected parameter 'collectionId' to be non-null");
        this.tags = tags;
    }

    private CollectionArgs() {
        this.collectionId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> collectionId;
        private @Nullable Output<List<CollectionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionId = defaults.collectionId;
    	      this.tags = defaults.tags;
        }

        public Builder collectionId(Output<String> collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId);
            return this;
        }
        public Builder collectionId(String collectionId) {
            this.collectionId = Output.of(Objects.requireNonNull(collectionId));
            return this;
        }
        public Builder tags(@Nullable Output<List<CollectionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<CollectionTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(CollectionTagArgs... tags) {
            return tags(List.of(tags));
        }        public CollectionArgs build() {
            return new CollectionArgs(collectionId, tags);
        }
    }
}
